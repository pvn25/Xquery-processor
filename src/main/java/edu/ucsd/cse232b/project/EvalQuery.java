package edu.ucsd.cse232b.project;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Hashtable;
import java.util.IllegalFormatCodePointException;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

import javax.print.Doc;
import javax.swing.border.LineBorder;
import javax.swing.text.AbstractDocument.ElementEdit;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.Tree;
import org.omg.CORBA.CurrentOperations;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.w3c.dom.css.ElementCSSInlineStyle;

import edu.ucsd.cse232b.project.XQueryParser.VarEqContext;

public class EvalQuery extends XQueryBaseVisitor<ArrayList<Node>>{
	private ArrayList<Node> currentNodeList;
	private Node condNode;
	
	private ArrayList<Hashtable<String, ArrayList<Node>>> forLoopContextList;
	
	private Stack<ArrayList<Hashtable<String, ArrayList<Node>>>> forLoopContextListStack;
	private Stack<Hashtable<String, ArrayList<Node>>> contextStack;
	
	private Hashtable<String, TreeNode> rootTree;
	private Hashtable<Integer, Partition> partitions;
	private String currentVar;
	private int partitionID;

	public EvalQuery() {
		currentNodeList = new ArrayList<Node>();
		
		forLoopContextList = new ArrayList<Hashtable<String, ArrayList<Node>>>();
		forLoopContextList.add(new Hashtable<String, ArrayList<Node>>());
		
		forLoopContextListStack = new Stack<ArrayList<Hashtable<String, ArrayList<Node>>>>();
		forLoopContextListStack.push(forLoopContextList);
		
		contextStack = new Stack<Hashtable<String, ArrayList<Node>>>();
		contextStack.push(new Hashtable<String, ArrayList<Node>>());
		
		rootTree = new Hashtable<String, TreeNode>();
		partitions = new Hashtable<Integer, Partition>();
		currentVar = null;
		partitionID = 0;
	}
	
	@Override public ArrayList<Node> visitXqueryJoin(@NotNull XQueryParser.XqueryJoinContext ctx) {
		ArrayList<Node> nodeList1 = visit(ctx.xq(0));		
		ArrayList<Node> nodeList2 = visit(ctx.xq(1));
		ArrayList<Node> returnList = new ArrayList<Node>();
		Hashtable<String, ArrayList<Node>> multiHash = new Hashtable<String, ArrayList<Node>>();
		for (Node node : nodeList1) {
			Element eNode = (Element) node;
			
			for (Node node2 : nodeList2) {
				Boolean flag = true;
				Element elementNode = (Element) node2;
				for (int i = 0; i < ctx.vars2.Var().size(); i++) {
					Node testNode0 = eNode.getElementsByTagName(ctx.vars1.Var(i).getText().substring(1)).item(0);
					Node testNode1 = elementNode.getElementsByTagName(ctx.vars2.Var(i).getText().substring(1)).item(0);
					if (testNode0.getChildNodes().getLength() != testNode1.getChildNodes().getLength()) {
						flag = false;
						break;
					}
					for (int ci = 0; ci < testNode0.getChildNodes().getLength(); ci++) {
						if (!testNode0.getChildNodes().item(ci).isEqualNode(testNode1.getChildNodes().item(ci))) {
							flag = false;
							break;
						}
					}
					if (!flag) {
						break;
					}
				}
				if (flag) {
					DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			        DocumentBuilder dBuilder = null;
					try {
						dBuilder = dbFactory.newDocumentBuilder();
						Document doc = dBuilder.newDocument();
						Element rootElement = doc.createElement("tuple");
						NodeList nl1 = node.getChildNodes();
						for (int i = 0; i < nl1.getLength(); i++) {
							Node newNode = nl1.item(i).cloneNode(true);
			    		    doc.adoptNode(newNode);
			    		    if (newNode instanceof Attr) {
			    		    	rootElement.setAttributeNode((Attr) newNode);
			    		    } else {
			    		    	rootElement.appendChild(newNode);
			    		    }
						}
						NodeList nl2 = node2.getChildNodes();
						for (int i = 0; i < nl2.getLength(); i++) {
							Node newNode = nl2.item(i).cloneNode(true);
			    		    doc.adoptNode(newNode);
							rootElement.appendChild(newNode);
						}
						returnList.add((Node) rootElement);
					} catch (ParserConfigurationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		/*for (Node node : nodeList1) {
			String key = "";
			Element elementNode = (Element) node;
			for (int i = 0; i < ctx.vars1.Var().size(); i++) {
				key += elementNode.getElementsByTagName(ctx.vars1.Var(i).getText().substring(1)).item(0).getTextContent();
			}
			if (multiHash.get(key) == null) {
				ArrayList<Node> nodeList = new ArrayList<Node>();
				nodeList.add(node);
				multiHash.put(key, nodeList);
			} else {
				multiHash.get(key).add(node);
			}
		}
		
		
		
		for (Node node : nodeList2) {
			Element elementNode = (Element) node;
			String key = "";
			if (multiHash.get(key) != null) {
				ArrayList<Node> storedList = multiHash.get(key);
				for (Node storedNode : storedList) {
					Element eNode = (Element) storedNode;
					boolean flag = true;
					for (int i = 0; i < ctx.vars2.Var().size(); i++) {
						
						Node testNode0 = eNode.getElementsByTagName(ctx.vars1.Var(i).getText().substring(1)).item(0);
						Node testNode1 = elementNode.getElementsByTagName(ctx.vars2.Var(i).getText().substring(1)).item(0);
						if (testNode0.getChildNodes().getLength() != testNode1.getChildNodes().getLength()) {
							flag = false;
							break;
						}
						for (int ci = 0; ci < testNode0.getChildNodes().getLength(); ci++) {
							if (!testNode0.getChildNodes().item(ci).isEqualNode(testNode1.getChildNodes().item(ci))) {
								flag = false;
								break;
							}
						}
						if (!flag) {
							break;
						}
					}
					if (flag) {
						DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				        DocumentBuilder dBuilder = null;
						try {
							dBuilder = dbFactory.newDocumentBuilder();
							Document doc = dBuilder.newDocument();
							Element rootElement = doc.createElement("tuple");
							NodeList nl1 = storedNode.getChildNodes();
							for (int i = 0; i < nl1.getLength(); i++) {
								Node newNode = nl1.item(i).cloneNode(true);
				    		    doc.adoptNode(newNode);
				    		    if (newNode instanceof Attr) {
				    		    	rootElement.setAttributeNode((Attr) newNode);
				    		    } else {
				    		    	rootElement.appendChild(newNode);
				    		    }
							}
							NodeList nl2 = node.getChildNodes();
							for (int i = 0; i < nl2.getLength(); i++) {
								Node newNode = nl2.item(i).cloneNode(true);
				    		    doc.adoptNode(newNode);
								rootElement.appendChild(newNode);
							}
							returnList.add((Node) rootElement);
						} catch (ParserConfigurationException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}*/
		}
		return returnList;
	}
	
	@Override public ArrayList<Node> visitOptVarIn(@NotNull XQueryParser.OptVarInContext ctx) {
		for (int i = 0; i < ctx.Var().size(); i++) {
			currentVar = ctx.Var(i).toString();
			visit(ctx.path(i));
		}
		return null;
	}
	
	@Override public ArrayList<Node> visitOptApath(@NotNull XQueryParser.OptApathContext ctx) {
		Partition partition =  new Partition();
		partition.forList.put(currentVar, ctx.getText());
		partitions.put(partitionID, partition);
		rootTree.put(currentVar, new TreeNode(null, partitionID));
		partitionID++;
		return null;
	}
	
	@Override public ArrayList<Node> visitOptCondAnd(@NotNull XQueryParser.OptCondAndContext ctx) {
		visit(ctx.optCond(0));
		visit(ctx.optCond(1));
		return null;
	}
	
	@Override public ArrayList<Node> visitOptVarPath(@NotNull XQueryParser.OptVarPathContext ctx) {
		TreeNode tNode = rootTree.get(ctx.Var().getText());
		tNode.children.add(currentVar);
		rootTree.put(currentVar, new TreeNode(ctx.Var().getText(), tNode.partitionID));
		
		Partition partition = partitions.get(tNode.partitionID);
		partition.forList.put(currentVar, ctx.getText());
		return null;
	}
	
	@Override public ArrayList<Node> visitOptVarsEq(@NotNull XQueryParser.OptVarsEqContext ctx) {
		String var1 = ctx.Var(0).getText();
		String var2 = ctx.Var(1).getText();
		int id1 = rootTree.get(var1).partitionID;
		int id2 = rootTree.get(var2).partitionID;
		
		if (id1 == id2) {
			partitions.get(id1).whereList.add(ctx.Var(0) + " = " + ctx.Var(1));
		} else {
			Partition partition1 = partitions.get(id1);
			Partition partition2 = partitions.get(id2);
			if (partition1.joinTable.get(id2) == null) {
				ArrayList<String> varList = new ArrayList<String>();
				varList.add(var1);
				partition1.joinTable.put(id2, varList);
			} else {
				partition1.joinTable.get(id2).add(var1);
			}
			if (partition2.joinTable.get(id1) == null) {
				ArrayList<String> varList = new ArrayList<String>();
				varList.add(var2);
				partition2.joinTable.put(id1, varList);
			} else {
				partition2.joinTable.get(id1).add(var2);
			}
		}
		return null;
	}
		
	@Override public ArrayList<Node> visitOptVarStrEq(@NotNull XQueryParser.OptVarStrEqContext ctx) {
		String var = ctx.Var().getText();
		int id = rootTree.get(var).partitionID;
		partitions.get(id).whereList.add(ctx.Var() + " = " + ctx.StringConstant());
		return null;
	}
	
	@Override public ArrayList<Node> visitOptStrsEq(@NotNull XQueryParser.OptStrsEqContext ctx) {
		partitions.get(0).whereList.add(ctx.StringConstant(0) + " = " + ctx.StringConstant(1));
		return null;
	}
	
	@Override public ArrayList<Node> visitOptXq(@NotNull XQueryParser.OptXqContext ctx) {
		visit(ctx.optVarIn());
		if (ctx.optCond() != null) {
			visit(ctx.optCond());
		}
		Set<Integer> keys = partitions.keySet();
		String query = Utility.constructSubQuery(partitions.get(0));
		int prevID = 0;
		int partitionNum = partitionID;
		System.out.println(partitionNum);
		for (int ID = 1; ID < partitionNum; ID++) {
			Partition prevPartition = partitions.get(prevID);
			Partition curPartition = partitions.get(ID);
			String firstArg = "";
			String secondArg = "";
			if (prevPartition.joinTable.get(ID) == null) {
				firstArg = secondArg = "[]";
			} else {
				firstArg = prevPartition.joinTable.get(ID).toString();
				secondArg = curPartition.joinTable.get(prevID).toString();
			}
			query = "join(" + query + "," + Utility.constructSubQuery(curPartition) + "," + firstArg + "," + secondArg + ")";
			Partition newPartition = new Partition();
			Set<Integer> prevKeys = prevPartition.joinTable.keySet();
			Set<Integer> curKeys = curPartition.joinTable.keySet();
			for (int prevKey : prevKeys) {
				if (prevKey > ID) {
					newPartition.joinTable.put(prevKey, prevPartition.joinTable.get(prevKey));
				}
			}
			for (int curKey : curKeys) {
				if (curKey > ID) {
					if (newPartition.joinTable.get(curKey) == null) {
						newPartition.joinTable.put(curKey, curPartition.joinTable.get(curKey));
					} else {
						newPartition.joinTable.get(curKey).addAll(curPartition.joinTable.get(curKey));
					}
				}
			}
			for (int i = ID + 1; i < partitionNum; i++) {
				Partition partition = partitions.get(i);
				ArrayList<String> varList = new ArrayList<String>();
				partition.joinTable.put(partitionID, varList);
				Set<Integer> IDSet = partition.joinTable.keySet();
				for (int joinID : IDSet) {
					if (joinID <= ID) {
						partition.joinTable.get(partitionID).addAll(partition.joinTable.get(joinID));
						partition.joinTable.remove(joinID);
					}
				}
			}
			partitions.put(partitionID, newPartition);
			prevID = partitionID;
			partitionID++;
		}
		String returnClause = ctx.optReturn().getText().replaceAll("\\$([_0-9a-zA-Z]*)", "\\$$1/\\*");
		query = "for $tuple in " + query + "\nreturn " + returnClause.replace("$", "$tuple/");
		System.out.println(query);
		XQueryCompiler compiler = new XQueryCompiler();
		ArrayList<Node> nodeList = compiler.parse(query);
		return nodeList;
	}
	
	@Override public ArrayList<Node> visitOptReturn(@NotNull XQueryParser.OptReturnContext ctx) { return visitChildren(ctx); }
		
	
	@Override public ArrayList<Node> visitXqueryConcat(@NotNull XQueryParser.XqueryConcatContext ctx) {
		ArrayList<Node> returnList = new ArrayList<Node>(visit(ctx.xq(0)));
		ArrayList<Node> nodeList1 = new ArrayList<Node>(visit(ctx.xq(1)));
		returnList.addAll(nodeList1);
		return returnList;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitWhereClause(@NotNull XQueryParser.WhereClauseContext ctx) {
		return visit(ctx.cond());
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitXqueryIs(@NotNull XQueryParser.XqueryIsContext ctx) {
		ArrayList<Node> nodeList1 = visit(ctx.xq(0));
		ArrayList<Node> nodeList2 = visit(ctx.xq(1));
		ArrayList<Node> resultList = new ArrayList<Node>();
		for (Node node1 : nodeList1) {
			for (Node node2 : nodeList2) {
				if (node1.isSameNode(node2)) {
					resultList.add(node1);
					return resultList;
				}
			}
		}
		return resultList;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitVarIn(@NotNull XQueryParser.VarInContext ctx) {
		Hashtable<String, ArrayList<Node>> currentContext = new Hashtable<String, ArrayList<Node>>(contextStack.peek());
		ArrayList<Hashtable<String, ArrayList<Node>>> contextList = new ArrayList<Hashtable<String, ArrayList<Node>>>();
		contextList.add(currentContext);
		for (int i = 0; i < ctx.Var().size(); i++) {
			ArrayList<Hashtable<String, ArrayList<Node>>> newContextList = new ArrayList<Hashtable<String, ArrayList<Node>>>();
			for (Hashtable<String, ArrayList<Node>> context : contextList) {
				contextStack.push(context);
				ArrayList<Node> nodeList = visit(ctx.xq().get(i));
				for (Node node : nodeList) {
					Hashtable<String, ArrayList<Node>> newContext = new Hashtable<String, ArrayList<Node>>(context);
					ArrayList<Node> newList = new ArrayList<Node>();
					newList.add(node);
					newContext.put(ctx.Var().get(i).getText(), newList);
					newContextList.add(newContext);
				}
				contextStack.pop();
			}
			contextList = newContextList;
		}
		forLoopContextListStack.push(contextList);
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitXqueryEq(@NotNull XQueryParser.XqueryEqContext ctx) {
		ArrayList<Node> nodeList1 = visit(ctx.xq(0));
		ArrayList<Node> nodeList2 = visit(ctx.xq(1));
		ArrayList<Node> resultList = new ArrayList<Node>();
		for (Node node1 : nodeList1) {
			for (Node node2 : nodeList2) {
				if (node1.isEqualNode(node2)) {
					resultList.add(node1);
					return resultList;
				}
			}
		}
		return resultList;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitXquerySatisfy(@NotNull XQueryParser.XquerySatisfyContext ctx) {
		forLoopContextListStack.push(new ArrayList<Hashtable<String, ArrayList<Node>>>(forLoopContextListStack.peek()));
		visit(ctx.varIn());
		ArrayList<Hashtable<String, ArrayList<Node>>> topContextList = new ArrayList<Hashtable<String, ArrayList<Node>>>(forLoopContextListStack.peek());
		for (Hashtable<String, ArrayList<Node>> context : topContextList) {
			contextStack.push(context);
			ArrayList<Node> nodeList = visit(ctx.cond());
			contextStack.pop();
			if (!nodeList.isEmpty()) {
				forLoopContextListStack.pop();
				return nodeList;
			}
		}
		forLoopContextListStack.pop();
		return new ArrayList<Node>();
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitSingleVarEq(@NotNull XQueryParser.SingleVarEqContext ctx) {
		ArrayList<Node> nodeList = visit(ctx.xq());
		if (nodeList != null) {
			contextStack.peek().put(ctx.Var().getText(), nodeList);
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitMultiVarEq(@NotNull XQueryParser.MultiVarEqContext ctx) {
		visit(ctx.varEq(0));
		visit(ctx.varEq(1));
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitLetClause(@NotNull XQueryParser.LetClauseContext ctx) {
		visit(ctx.varEq());
		return null;
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitXqueryTag(@NotNull XQueryParser.XqueryTagContext ctx) {
		ArrayList<Node> returnList = new ArrayList<Node>();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();
			Element rootElement = doc.createElement(ctx.NAME(0).toString());
			ArrayList<Node> nodeList = new ArrayList<Node>(visit(ctx.xq()));
			for (Node node : nodeList) {
				Node newNode = node.cloneNode(true);
    		    doc.adoptNode(newNode);
    		    if (newNode instanceof Attr) {
    		    	rootElement.setAttributeNode((Attr) newNode);
    		    } else {
    		    	rootElement.appendChild(newNode);
    		    }
			}
			returnList.add((Node) rootElement);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return returnList;
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitXqueryForLoop(@NotNull XQueryParser.XqueryForLoopContext ctx) {
		forLoopContextListStack.push(new ArrayList<Hashtable<String, ArrayList<Node>>> (forLoopContextListStack.peek()));
		visit(ctx.forClause());
		ArrayList<Node> nodeList = new ArrayList<Node>();
		
		ArrayList<Hashtable<String, ArrayList<Node>>> topContextList = new ArrayList<Hashtable<String, ArrayList<Node>>>(forLoopContextListStack.peek());
		for (Hashtable<String, ArrayList<Node>> context : topContextList) {
			contextStack.push(new Hashtable<String, ArrayList<Node>>(context));
			if (ctx.letClause() != null) {
				visit(ctx.letClause());
			}
			if (ctx.whereClause() != null && !visit(ctx.whereClause()).isEmpty()) {
				nodeList.addAll(visit(ctx.returnClause()));
			} else if (ctx.whereClause() == null) {
				ArrayList<Node> temp = visit(ctx.returnClause());
				nodeList.addAll(temp);
			}
			contextStack.pop();
		}
		forLoopContextListStack.pop();
		return nodeList;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitReturnClause(@NotNull XQueryParser.ReturnClauseContext ctx) {
		return visit(ctx.xq());
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitXqueryDescendent(@NotNull XQueryParser.XqueryDescendentContext ctx) {
		visit(ctx.xq());
		ArrayList<Node> nodeList = new ArrayList<Node>();
		for (Node node : currentNodeList) {
			nodeList.add(node);
			dfs(node, nodeList);
		}
		currentNodeList = (ArrayList<Node>) nodeList;
		ArrayList<Node> nodeListResult = visit(ctx.rp());
		Set<Node> nodeSet = new LinkedHashSet<Node>(nodeListResult);
		return new ArrayList<Node>(nodeSet);
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitXqueryParen(@NotNull XQueryParser.XqueryParenContext ctx) {
		ArrayList<Hashtable<String, ArrayList<Node>>> forLoopContextList = new ArrayList<Hashtable<String, ArrayList<Node>>>(forLoopContextListStack.peek());
		forLoopContextListStack.push(forLoopContextList);
		ArrayList<Node> nodeList = visit(ctx.xq());
		forLoopContextListStack.pop();
		return nodeList;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitXqueryOr(@NotNull XQueryParser.XqueryOrContext ctx) {
		ArrayList<Node> nodeList1 = visit(ctx.cond(0));
		ArrayList<Node> nodeList2 = visit(ctx.cond(1));
		if (!nodeList1.isEmpty() || !nodeList2.isEmpty()) {
			ArrayList<Node> returnList = new ArrayList<Node>();
			returnList.add(null);
			return returnList;
		}
		return new ArrayList<Node>();
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitVarXQ(@NotNull XQueryParser.VarXQContext ctx) {
		ArrayList<Node> nodeList = contextStack.peek().get(ctx.Var().getText());
		if (nodeList == null) {
			return new ArrayList<Node>();
		}
		currentNodeList = new ArrayList<Node>(nodeList);
		return nodeList;
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitXqueryLetClause(@NotNull XQueryParser.XqueryLetClauseContext ctx) {
		visit(ctx.letClause());
		return visit(ctx.xq());
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitStrConst(@NotNull XQueryParser.StrConstContext ctx) {
		ArrayList<Node> nodeList = new ArrayList<Node>();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();
			String text = ctx.StringConstant().getText();
			text = text.substring(1, text.length() - 1);
			Text textElement = doc.createTextNode(text);
			nodeList.add((Node) textElement);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		currentNodeList = nodeList;
		return currentNodeList;
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitXqueryRelativePath(@NotNull XQueryParser.XqueryRelativePathContext ctx) {
		visit(ctx.xq());
		currentNodeList = new ArrayList<Node>(visit(ctx.rp()));
		return new ArrayList<Node>(currentNodeList);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitXqueryCondParen(@NotNull XQueryParser.XqueryCondParenContext ctx) {
		return visit(ctx.cond());
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitXqueryEmpty(@NotNull XQueryParser.XqueryEmptyContext ctx) {
		ArrayList<Node> nodeList = visit(ctx.xq());
		if (nodeList.isEmpty()) {
			nodeList.add(null);
			return nodeList;
		}
		return new ArrayList<Node>();
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitXqueryNot(@NotNull XQueryParser.XqueryNotContext ctx) {
		ArrayList<Node> nodeList = visit(ctx.cond());
		if (nodeList.isEmpty()) {
			nodeList.add(null);
			return nodeList;
		}
		return new ArrayList<Node>();
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitXqueryAnd(@NotNull XQueryParser.XqueryAndContext ctx) {
		ArrayList<Node> nodeList1 = visit(ctx.cond(0));
		ArrayList<Node> nodeList2 = visit(ctx.cond(1));
		if (!nodeList1.isEmpty() && !nodeList2.isEmpty()) {
			return nodeList1;
		}
		return new ArrayList<Node>();
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitForClause(@NotNull XQueryParser.ForClauseContext ctx) {
		visit(ctx.varIn());
		return null;
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */

	@Override public ArrayList<Node> visitCurrentDir(@NotNull XQueryParser.CurrentDirContext ctx) {
		return currentNodeList;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */

	@Override public ArrayList<Node> visitParentDir(@NotNull XQueryParser.ParentDirContext ctx) {
		ArrayList<Node> nodeList = new ArrayList<Node>();
		for (Node node : currentNodeList) {
			nodeList.add(node.getParentNode());
		}
		currentNodeList = new ArrayList<Node>(nodeList);
		return currentNodeList;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */

	@Override public ArrayList<Node> visitRelativeChild(@NotNull XQueryParser.RelativeChildContext ctx) {
		visit(ctx.rp(0));
		ArrayList<Node> nodeList = visit(ctx.rp(1));
		Set<Node> nodeSet = new LinkedHashSet<Node>(nodeList);
		return new ArrayList<Node>(nodeSet);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */

	@Override public ArrayList<Node> visitGetText(@NotNull XQueryParser.GetTextContext ctx) {
		ArrayList<Node> nodeList = new ArrayList<Node>();
		if (currentNodeList == null) {
			return null;
		}
		for (Node node : currentNodeList) {
			NodeList children = node.getChildNodes();
			for (int i = 0; i < children.getLength(); i++) {
				if (children.item(i) instanceof Text) {
					nodeList.add(children.item(i));
				}
			}
		}
		currentNodeList = (ArrayList<Node>) nodeList;
		return nodeList;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitQuery(@NotNull XQueryParser.QueryContext ctx) {
		if (ctx.optXq() != null) {
			System.out.println("optxq");
			return visit(ctx.optXq());
		} else if (ctx.xq() != null) {
			System.out.println("xq");
			return visit(ctx.xq());
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */

	@Override public ArrayList<Node> visitSelectAny(@NotNull XQueryParser.SelectAnyContext ctx) {
		ArrayList<Node> nodeList = new ArrayList<Node>();
		for (Node node : currentNodeList) {
			NodeList nl = node.getChildNodes();
			for (int i = 0; i < nl.getLength(); i++) {
				if (nl.item(i).getNodeType() == node.TEXT_NODE ||
						nl.item(i).getNodeType() == node.ELEMENT_NODE) {
					nodeList.add(nl.item(i));
			    }
			}
		}
		currentNodeList = nodeList;
		return currentNodeList;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */

	@Override public ArrayList<Node> visitRelativeDescendent(@NotNull XQueryParser.RelativeDescendentContext ctx) {
		visit(ctx.rp(0));
		ArrayList<Node> nodeList = new ArrayList<Node>();
		for (Node node : currentNodeList) {
			nodeList.add(node);
			dfs(node, nodeList);
		}
		currentNodeList = (ArrayList<Node>) nodeList;
		ArrayList<Node> nodeListResult = visit(ctx.rp(1));
		Set<Node> nodeSet = new LinkedHashSet<Node>(nodeListResult);
		return new ArrayList<Node>(nodeSet);
	}
	
	public void dfs(Node node, ArrayList<Node> nodeList) {
		NodeList nl = node.getChildNodes();
		for (int i = 0; i < nl.getLength(); i++) {
			nodeList.add(nl.item(i));
			dfs(nl.item(i), nodeList);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitTagName(@NotNull XQueryParser.TagNameContext ctx) {
		String tag = ctx.NAME().getText();
		ArrayList<Node> nodeList = new ArrayList<Node>();
		
		for (Node node : currentNodeList) {
			NodeList children = node.getChildNodes();
			for (int i = 0; i < children.getLength(); i++) {
				Node nd = children.item(i);
				if (nd instanceof Element && ((Element) nd).getNodeName().equals(tag)) {
					nodeList.add(nd);
				}
			}
			
		}
		currentNodeList = new ArrayList<Node>(nodeList);
		return nodeList;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitRelativeWithFilter(@NotNull XQueryParser.RelativeWithFilterContext ctx) {
		ArrayList<Node> rpNodeList = visit(ctx.rp());
		ArrayList<Node> nodeList = new ArrayList<Node>();
		for (Node node : rpNodeList) {
			condNode = node;
			if (!visit(ctx.f()).isEmpty()) {
				nodeList.add(node);
			}
		}
		currentNodeList = new ArrayList<Node>(nodeList);
		return nodeList;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//Modified
	@Override public ArrayList<Node> visitAbsoluteDescendent(@NotNull XQueryParser.AbsoluteDescendentContext ctx) {
		String fileName = ctx.doc().NAME().getText();
		XMLParser xmlParser = new XMLParser(fileName);
    	Document doc = xmlParser.parse();
    	Node node = doc.getDocumentElement().getParentNode();
       	ArrayList<Node> nodeList = new ArrayList<Node>();
       	
       	dfs(node, nodeList);
       	currentNodeList = new ArrayList<Node>(nodeList);
    	ArrayList<Node> nodeListResult = visit(ctx.rp());
		Set<Node> nodeSet = new LinkedHashSet<Node>(nodeListResult);
		return new ArrayList<Node>(nodeSet);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitRelativeParen(@NotNull XQueryParser.RelativeParenContext ctx) {
		return visit(ctx.rp());
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitAbsoluteChild(@NotNull XQueryParser.AbsoluteChildContext ctx) {
		String fileName = ctx.doc().NAME().getText();
		XMLParser xmlParser = new XMLParser(fileName);
    	Document doc = xmlParser.parse();
    	Node node = doc.getDocumentElement().getParentNode();
       	ArrayList<Node> nodeList = new ArrayList<Node>();
    	nodeList.add(node);
    	currentNodeList = new ArrayList<Node>(nodeList);
    	return visit(ctx.rp());
    }
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitAbsolutePath(@NotNull XQueryParser.AbsolutePathContext ctx) {
		return visit(ctx.ap());
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitDoc(@NotNull XQueryParser.DocContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//Modified
	@Override public ArrayList<Node> visitRelativePathConcat(@NotNull XQueryParser.RelativePathConcatContext ctx) {
		ArrayList<Node> backupList = new ArrayList<Node> (currentNodeList);
		ArrayList<Node> nodeList1 = visit(ctx.rp(0));
		currentNodeList = new ArrayList<Node>(backupList);
		ArrayList<Node> nodeList2 = visit(ctx.rp(1));
		nodeList1.addAll(nodeList2);
		currentNodeList = new ArrayList<Node>(nodeList1);
		return nodeList1;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */

	@Override public ArrayList<Node> visitAttrName(@NotNull XQueryParser.AttrNameContext ctx) {
		ArrayList<Node> nodeList = new ArrayList<Node>();
		for (Node node : currentNodeList) {
			NamedNodeMap attrMap = node.getAttributes();
			if (attrMap != null) {
				for (int i = 0; i < attrMap.getLength(); i++) {
					if (attrMap.item(i).getNodeName().equals(ctx.NAME().getText())) {
						nodeList.add(attrMap.item(i));
					}
				}
			}
		}
		currentNodeList = (ArrayList<Node>) nodeList;
		return nodeList;
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitEqualFilter(@NotNull XQueryParser.EqualFilterContext ctx) {
		currentNodeList = new ArrayList<Node>();
		currentNodeList.add(condNode);
		ArrayList<Node> nodeList1 = visit(ctx.rp(0));
		
		currentNodeList = new ArrayList<Node>();
		currentNodeList.add(condNode);
		ArrayList<Node> nodeList2 = visit(ctx.rp(1));

		ArrayList<Node> nodeList = new ArrayList<Node>();
		for (Node node1 : nodeList1) {
			for (Node node2 : nodeList2) {
				if (node1.isEqualNode(node2)) {
					nodeList.add(node1);
					return nodeList;
				}
			}
		}
		return nodeList;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitNotFilter(@NotNull XQueryParser.NotFilterContext ctx) {
		ArrayList<Node> nodeList = visit(ctx.f());
		if (nodeList.isEmpty()) {
			ArrayList<Node> ndList = new ArrayList<Node>();
			Node d = null;
			ndList.add(d);
			return ndList;
		}
		return new ArrayList<Node>();
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitAndFilter(@NotNull XQueryParser.AndFilterContext ctx) {
		ArrayList<Node> nodeList1 = visit(ctx.f(0));
		ArrayList<Node> nodeList2 = visit(ctx.f(1));
		if (!nodeList1.isEmpty() && !nodeList2.isEmpty()) {
			return nodeList1;
		}
		return new ArrayList<Node>();
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitFilterParen(@NotNull XQueryParser.FilterParenContext ctx) {
		return visit(ctx.f());
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitOrFilter(@NotNull XQueryParser.OrFilterContext ctx) {
		ArrayList<Node> nodeList1 = visit(ctx.f(0));
		ArrayList<Node> nodeList2 = visit(ctx.f(1));
		if (!nodeList1.isEmpty() || !nodeList2.isEmpty()) {
			return nodeList1;
		}
		return new ArrayList<Node>();
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitIsFilter(@NotNull XQueryParser.IsFilterContext ctx) {
		currentNodeList = new ArrayList<Node>();
		currentNodeList.add(condNode);
		ArrayList<Node> nodeList1 = visit(ctx.rp(0));
		
		currentNodeList = new ArrayList<Node>();
		currentNodeList.add(condNode);
		ArrayList<Node> nodeList2 = visit(ctx.rp(1));
	
		ArrayList<Node> nodeList = new ArrayList<Node>();
		for (Node node1 : nodeList1) {
			for (Node node2 : nodeList2) {
				if (node1.isSameNode(node2)) {
					nodeList.add(node1);
					return nodeList;
				}
			}
		}
		return nodeList;
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList<Node> visitRpFilter(@NotNull XQueryParser.RpFilterContext ctx) {
		currentNodeList = new ArrayList<Node>();
		currentNodeList.add(condNode);
		ArrayList<Node> nodeList1 = visit(ctx.rp());
		return nodeList1;
	}
}
