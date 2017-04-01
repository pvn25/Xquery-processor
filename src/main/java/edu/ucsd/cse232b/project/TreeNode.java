package edu.ucsd.cse232b.project;

import java.util.ArrayList;

public class TreeNode {
	public String parent;
	public ArrayList<String> children;
	public int partitionID;
	public TreeNode(String name, int id) {
		parent = name;
		children = new ArrayList<String>();
		partitionID = id;
	}
}
