package edu.ucsd.cse232b.project;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class Partition {
	public LinkedHashMap<String, String> forList;
	public ArrayList<String> whereList;
	public Hashtable<Integer, ArrayList<String>> joinTable;
	public Partition() {
		forList = new LinkedHashMap<String, String>();
		whereList = new ArrayList<String>();
		joinTable = new Hashtable<Integer, ArrayList<String>>();
	}
}
