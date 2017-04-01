// Generated from edu/ucsd/cse232b/project/XQuery.g4 by ANTLR 4.3
package edu.ucsd.cse232b.project;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XQueryParser#varIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIn(@NotNull XQueryParser.VarInContext ctx);

	/**
	 * Visit a parse tree produced by the {@code equalFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualFilter(@NotNull XQueryParser.EqualFilterContext ctx);

	/**
	 * Visit a parse tree produced by {@link XQueryParser#optVarIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptVarIn(@NotNull XQueryParser.OptVarInContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqueryConcat}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryConcat(@NotNull XQueryParser.XqueryConcatContext ctx);

	/**
	 * Visit a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(@NotNull XQueryParser.WhereClauseContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqueryIs}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryIs(@NotNull XQueryParser.XqueryIsContext ctx);

	/**
	 * Visit a parse tree produced by the {@code optApath}
	 * labeled alternative in {@link XQueryParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptApath(@NotNull XQueryParser.OptApathContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqueryEq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryEq(@NotNull XQueryParser.XqueryEqContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xquerySatisfy}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXquerySatisfy(@NotNull XQueryParser.XquerySatisfyContext ctx);

	/**
	 * Visit a parse tree produced by the {@code singleVarEq}
	 * labeled alternative in {@link XQueryParser#varEq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleVarEq(@NotNull XQueryParser.SingleVarEqContext ctx);

	/**
	 * Visit a parse tree produced by the {@code multiVarEq}
	 * labeled alternative in {@link XQueryParser#varEq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiVarEq(@NotNull XQueryParser.MultiVarEqContext ctx);

	/**
	 * Visit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(@NotNull XQueryParser.LetClauseContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqueryForLoop}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryForLoop(@NotNull XQueryParser.XqueryForLoopContext ctx);

	/**
	 * Visit a parse tree produced by the {@code optCondAnd}
	 * labeled alternative in {@link XQueryParser#optCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptCondAnd(@NotNull XQueryParser.OptCondAndContext ctx);

	/**
	 * Visit a parse tree produced by the {@code relativePathConcat}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativePathConcat(@NotNull XQueryParser.RelativePathConcatContext ctx);

	/**
	 * Visit a parse tree produced by the {@code attrName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrName(@NotNull XQueryParser.AttrNameContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqueryTag}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryTag(@NotNull XQueryParser.XqueryTagContext ctx);

	/**
	 * Visit a parse tree produced by the {@code optVarPath}
	 * labeled alternative in {@link XQueryParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptVarPath(@NotNull XQueryParser.OptVarPathContext ctx);

	/**
	 * Visit a parse tree produced by the {@code andFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndFilter(@NotNull XQueryParser.AndFilterContext ctx);

	/**
	 * Visit a parse tree produced by the {@code getText}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetText(@NotNull XQueryParser.GetTextContext ctx);

	/**
	 * Visit a parse tree produced by {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(@NotNull XQueryParser.QueryContext ctx);

	/**
	 * Visit a parse tree produced by the {@code relativeDescendent}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeDescendent(@NotNull XQueryParser.RelativeDescendentContext ctx);

	/**
	 * Visit a parse tree produced by the {@code orFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrFilter(@NotNull XQueryParser.OrFilterContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqueryJoin}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryJoin(@NotNull XQueryParser.XqueryJoinContext ctx);

	/**
	 * Visit a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(@NotNull XQueryParser.ReturnClauseContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqueryDescendent}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryDescendent(@NotNull XQueryParser.XqueryDescendentContext ctx);

	/**
	 * Visit a parse tree produced by the {@code absoluteDescendent}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteDescendent(@NotNull XQueryParser.AbsoluteDescendentContext ctx);

	/**
	 * Visit a parse tree produced by the {@code relativeParen}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeParen(@NotNull XQueryParser.RelativeParenContext ctx);

	/**
	 * Visit a parse tree produced by {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(@NotNull XQueryParser.DocContext ctx);

	/**
	 * Visit a parse tree produced by the {@code rpFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpFilter(@NotNull XQueryParser.RpFilterContext ctx);

	/**
	 * Visit a parse tree produced by the {@code currentDir}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentDir(@NotNull XQueryParser.CurrentDirContext ctx);

	/**
	 * Visit a parse tree produced by the {@code optVarsEq}
	 * labeled alternative in {@link XQueryParser#optCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptVarsEq(@NotNull XQueryParser.OptVarsEqContext ctx);

	/**
	 * Visit a parse tree produced by the {@code relativeChild}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeChild(@NotNull XQueryParser.RelativeChildContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqueryParen}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryParen(@NotNull XQueryParser.XqueryParenContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqueryOr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryOr(@NotNull XQueryParser.XqueryOrContext ctx);

	/**
	 * Visit a parse tree produced by the {@code varXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarXQ(@NotNull XQueryParser.VarXQContext ctx);

	/**
	 * Visit a parse tree produced by the {@code relativeWithFilter}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeWithFilter(@NotNull XQueryParser.RelativeWithFilterContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqueryLetClause}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryLetClause(@NotNull XQueryParser.XqueryLetClauseContext ctx);

	/**
	 * Visit a parse tree produced by the {@code strConst}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrConst(@NotNull XQueryParser.StrConstContext ctx);

	/**
	 * Visit a parse tree produced by the {@code optVarStrEq}
	 * labeled alternative in {@link XQueryParser#optCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptVarStrEq(@NotNull XQueryParser.OptVarStrEqContext ctx);

	/**
	 * Visit a parse tree produced by the {@code absolutePath}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolutePath(@NotNull XQueryParser.AbsolutePathContext ctx);

	/**
	 * Visit a parse tree produced by {@link XQueryParser#optXq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptXq(@NotNull XQueryParser.OptXqContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqueryRelativePath}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryRelativePath(@NotNull XQueryParser.XqueryRelativePathContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqueryCondParen}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryCondParen(@NotNull XQueryParser.XqueryCondParenContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqueryEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryEmpty(@NotNull XQueryParser.XqueryEmptyContext ctx);

	/**
	 * Visit a parse tree produced by the {@code notFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFilter(@NotNull XQueryParser.NotFilterContext ctx);

	/**
	 * Visit a parse tree produced by the {@code parentDir}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentDir(@NotNull XQueryParser.ParentDirContext ctx);

	/**
	 * Visit a parse tree produced by the {@code selectAny}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAny(@NotNull XQueryParser.SelectAnyContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqueryNot}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryNot(@NotNull XQueryParser.XqueryNotContext ctx);

	/**
	 * Visit a parse tree produced by the {@code filterParen}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterParen(@NotNull XQueryParser.FilterParenContext ctx);

	/**
	 * Visit a parse tree produced by the {@code tagName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(@NotNull XQueryParser.TagNameContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqueryAnd}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryAnd(@NotNull XQueryParser.XqueryAndContext ctx);

	/**
	 * Visit a parse tree produced by {@link XQueryParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(@NotNull XQueryParser.VarListContext ctx);

	/**
	 * Visit a parse tree produced by the {@code absoluteChild}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteChild(@NotNull XQueryParser.AbsoluteChildContext ctx);

	/**
	 * Visit a parse tree produced by {@link XQueryParser#optReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptReturn(@NotNull XQueryParser.OptReturnContext ctx);

	/**
	 * Visit a parse tree produced by the {@code isFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsFilter(@NotNull XQueryParser.IsFilterContext ctx);

	/**
	 * Visit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(@NotNull XQueryParser.ForClauseContext ctx);

	/**
	 * Visit a parse tree produced by the {@code optStrsEq}
	 * labeled alternative in {@link XQueryParser#optCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptStrsEq(@NotNull XQueryParser.OptStrsEqContext ctx);
}