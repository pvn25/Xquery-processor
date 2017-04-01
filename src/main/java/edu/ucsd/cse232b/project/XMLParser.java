package edu.ucsd.cse232b.project;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLParser {
	private String fileName;
	public XMLParser(String fn) {
		fileName = fn;
	}
	public Document parse() {
		Document doc = null;
		try {
    		File xmlFile = new File(fileName);
    		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			doc = builder.parse(xmlFile);
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
		return doc;
	}
}
