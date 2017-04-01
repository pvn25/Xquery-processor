package edu.ucsd.cse232b.project;

import java.util.Set;

import edu.ucsd.cse232b.project.XQueryParser.VarEqContext;

public class Utility {
	public static String constructSubQuery(Partition partition) {
		String query = "";
		Set<String> forVars = partition.forList.keySet();
		query += "for ";
		for (String var : forVars) {
			query += (var + " in " + partition.forList.get(var) + ",\n");
		}
		query = query.substring(0, query.length() - 2);
		query += constructWhere(partition);
		query += constructReturn(partition);
		return query;
	}
	public static String constructWhere(Partition partition) {
		if (partition.whereList.isEmpty()) {
			return "";
		}
		String where = "\nwhere ";
		for (String clause : partition.whereList) {
			where += clause;
			where += ",\n";
		}
		return where.substring(0, where.length() - 2);
	}
	public static String constructReturn(Partition partition) {
		String returnClause = "\nreturn <tuple>{";
		Set<String> forVars = partition.forList.keySet();
		for (String var : forVars) {
			String tag = var.substring(1);
			returnClause += "<" + tag + ">{" + var + "}</" + tag + ">,\n";
		}
		returnClause = returnClause.substring(0, returnClause.length() - 2);
		returnClause += "}</tuple>";
		return returnClause;
	}
}
