package edu.ucsd.cse232b.project;

import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;

public class XQueryCompiler {
	public ArrayList<Node> parse(String queryAsString) {
		ArrayList<Node> nodeList = new ArrayList<Node>();
		try {
			ANTLRInputStream input = new ANTLRInputStream(queryAsString);
			XQueryLexer lexer = new XQueryLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);

			XQueryParser parser = new XQueryParser(tokens);
			parser.removeErrorListeners();
			ParseTree tree = parser.query();
			EvalQuery evalQuery = new EvalQuery();
			nodeList = evalQuery.visit(tree);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error: " + e.getMessage());
		}
		return nodeList;
	}
}
