package edu.ucsd.cse232b.project;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;


public class App {
	public static String prettyFormat(String input, int indent) {
	    try {
	        Source xmlInput = new StreamSource(new StringReader(input));
	        StringWriter stringWriter = new StringWriter();
	        StreamResult xmlOutput = new StreamResult(stringWriter);
	        TransformerFactory transformerFactory = TransformerFactory.newInstance();
	        transformerFactory.setAttribute("indent-number", indent);
	        Transformer transformer = transformerFactory.newTransformer(); 
	        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	        transformer.transform(xmlInput, xmlOutput);
	        return xmlOutput.getWriter().toString();
	    } catch (Exception e) {
	        throw new RuntimeException(e); // simple exception handling, please review it
	    }
	}
    public static void main( String[] args ) {
    	String input = null;
    	try {
			input = new String(Files.readAllBytes(Paths.get("input")));
		} catch (IOException e1) {
			e1.printStackTrace();
			return;
		}
    	ArrayList<Node> nodeList = new ArrayList<Node>();
    	XQueryCompiler compiler = new XQueryCompiler();
    	nodeList = compiler.parse(input);
    	try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder =  dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();
			Element rootElement = doc.createElement("result");
			if (nodeList != null) {
				for (Node node : nodeList) {
					Node newNode = node.cloneNode(true);
	    		    doc.adoptNode(newNode);
	    		    if (newNode instanceof Attr) {
	    		    	rootElement.setAttributeNode((Attr) newNode);
	    		    } else {
	    		    	rootElement.appendChild(newNode);
	    		    }
				}
			}
			/*Node newNode = nodeList.get(0).cloneNode(true);
			doc.adoptNode(newNode);
	        doc.appendChild(newNode);*/
			doc.appendChild(rootElement);
    		//TransformerFactory transformerFactory = TransformerFactory.newInstance();
    		//Transformer transformer = transformerFactory.newTransformer();
    		
    		Transformer transformer = TransformerFactory.newInstance().newTransformer();
    		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
    		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
    		
    		/*Transformer xformer = TransformerFactory.newInstance().newTransformer();
    	    xformer.setOutputProperty(OutputKeys.METHOD, "xml");
    	    xformer.setOutputProperty(OutputKeys.INDENT, "yes");
    	    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
    	    xformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");*/
    		
    		DOMSource source = new DOMSource(doc);
        	StreamResult result = new StreamResult(new File("output.xml"));
    		transformer.transform(source, result);
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
}