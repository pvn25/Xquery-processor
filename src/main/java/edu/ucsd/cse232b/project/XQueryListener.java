// Generated from edu/ucsd/cse232b/project/XQuery.g4 by ANTLR 4.3
package edu.ucsd.cse232b.project;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XQueryParser}.
 */
public interface XQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XQueryParser#varIn}.
	 * @param ctx the parse tree
	 */
	void enterVarIn(@NotNull XQueryParser.VarInContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#varIn}.
	 * @param ctx the parse tree
	 */
	void exitVarIn(@NotNull XQueryParser.VarInContext ctx);

	/**
	 * Enter a parse tree produced by the {@code equalFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterEqualFilter(@NotNull XQueryParser.EqualFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitEqualFilter(@NotNull XQueryParser.EqualFilterContext ctx);

	/**
	 * Enter a parse tree produced by {@link XQueryParser#optVarIn}.
	 * @param ctx the parse tree
	 */
	void enterOptVarIn(@NotNull XQueryParser.OptVarInContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#optVarIn}.
	 * @param ctx the parse tree
	 */
	void exitOptVarIn(@NotNull XQueryParser.OptVarInContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqueryConcat}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqueryConcat(@NotNull XQueryParser.XqueryConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqueryConcat}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqueryConcat(@NotNull XQueryParser.XqueryConcatContext ctx);

	/**
	 * Enter a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(@NotNull XQueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(@NotNull XQueryParser.WhereClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqueryIs}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXqueryIs(@NotNull XQueryParser.XqueryIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqueryIs}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXqueryIs(@NotNull XQueryParser.XqueryIsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code optApath}
	 * labeled alternative in {@link XQueryParser#path}.
	 * @param ctx the parse tree
	 */
	void enterOptApath(@NotNull XQueryParser.OptApathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optApath}
	 * labeled alternative in {@link XQueryParser#path}.
	 * @param ctx the parse tree
	 */
	void exitOptApath(@NotNull XQueryParser.OptApathContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqueryEq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXqueryEq(@NotNull XQueryParser.XqueryEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqueryEq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXqueryEq(@NotNull XQueryParser.XqueryEqContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xquerySatisfy}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXquerySatisfy(@NotNull XQueryParser.XquerySatisfyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xquerySatisfy}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXquerySatisfy(@NotNull XQueryParser.XquerySatisfyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code singleVarEq}
	 * labeled alternative in {@link XQueryParser#varEq}.
	 * @param ctx the parse tree
	 */
	void enterSingleVarEq(@NotNull XQueryParser.SingleVarEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleVarEq}
	 * labeled alternative in {@link XQueryParser#varEq}.
	 * @param ctx the parse tree
	 */
	void exitSingleVarEq(@NotNull XQueryParser.SingleVarEqContext ctx);

	/**
	 * Enter a parse tree produced by the {@code multiVarEq}
	 * labeled alternative in {@link XQueryParser#varEq}.
	 * @param ctx the parse tree
	 */
	void enterMultiVarEq(@NotNull XQueryParser.MultiVarEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiVarEq}
	 * labeled alternative in {@link XQueryParser#varEq}.
	 * @param ctx the parse tree
	 */
	void exitMultiVarEq(@NotNull XQueryParser.MultiVarEqContext ctx);

	/**
	 * Enter a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(@NotNull XQueryParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(@NotNull XQueryParser.LetClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqueryForLoop}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqueryForLoop(@NotNull XQueryParser.XqueryForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqueryForLoop}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqueryForLoop(@NotNull XQueryParser.XqueryForLoopContext ctx);

	/**
	 * Enter a parse tree produced by the {@code optCondAnd}
	 * labeled alternative in {@link XQueryParser#optCond}.
	 * @param ctx the parse tree
	 */
	void enterOptCondAnd(@NotNull XQueryParser.OptCondAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optCondAnd}
	 * labeled alternative in {@link XQueryParser#optCond}.
	 * @param ctx the parse tree
	 */
	void exitOptCondAnd(@NotNull XQueryParser.OptCondAndContext ctx);

	/**
	 * Enter a parse tree produced by the {@code relativePathConcat}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRelativePathConcat(@NotNull XQueryParser.RelativePathConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relativePathConcat}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRelativePathConcat(@NotNull XQueryParser.RelativePathConcatContext ctx);

	/**
	 * Enter a parse tree produced by the {@code attrName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttrName(@NotNull XQueryParser.AttrNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttrName(@NotNull XQueryParser.AttrNameContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqueryTag}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqueryTag(@NotNull XQueryParser.XqueryTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqueryTag}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqueryTag(@NotNull XQueryParser.XqueryTagContext ctx);

	/**
	 * Enter a parse tree produced by the {@code optVarPath}
	 * labeled alternative in {@link XQueryParser#path}.
	 * @param ctx the parse tree
	 */
	void enterOptVarPath(@NotNull XQueryParser.OptVarPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optVarPath}
	 * labeled alternative in {@link XQueryParser#path}.
	 * @param ctx the parse tree
	 */
	void exitOptVarPath(@NotNull XQueryParser.OptVarPathContext ctx);

	/**
	 * Enter a parse tree produced by the {@code andFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterAndFilter(@NotNull XQueryParser.AndFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitAndFilter(@NotNull XQueryParser.AndFilterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code getText}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterGetText(@NotNull XQueryParser.GetTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getText}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitGetText(@NotNull XQueryParser.GetTextContext ctx);

	/**
	 * Enter a parse tree produced by {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(@NotNull XQueryParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(@NotNull XQueryParser.QueryContext ctx);

	/**
	 * Enter a parse tree produced by the {@code relativeDescendent}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRelativeDescendent(@NotNull XQueryParser.RelativeDescendentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relativeDescendent}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRelativeDescendent(@NotNull XQueryParser.RelativeDescendentContext ctx);

	/**
	 * Enter a parse tree produced by the {@code orFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterOrFilter(@NotNull XQueryParser.OrFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitOrFilter(@NotNull XQueryParser.OrFilterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqueryJoin}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqueryJoin(@NotNull XQueryParser.XqueryJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqueryJoin}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqueryJoin(@NotNull XQueryParser.XqueryJoinContext ctx);

	/**
	 * Enter a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(@NotNull XQueryParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(@NotNull XQueryParser.ReturnClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqueryDescendent}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqueryDescendent(@NotNull XQueryParser.XqueryDescendentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqueryDescendent}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqueryDescendent(@NotNull XQueryParser.XqueryDescendentContext ctx);

	/**
	 * Enter a parse tree produced by the {@code absoluteDescendent}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteDescendent(@NotNull XQueryParser.AbsoluteDescendentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absoluteDescendent}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteDescendent(@NotNull XQueryParser.AbsoluteDescendentContext ctx);

	/**
	 * Enter a parse tree produced by the {@code relativeParen}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRelativeParen(@NotNull XQueryParser.RelativeParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relativeParen}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRelativeParen(@NotNull XQueryParser.RelativeParenContext ctx);

	/**
	 * Enter a parse tree produced by {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(@NotNull XQueryParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(@NotNull XQueryParser.DocContext ctx);

	/**
	 * Enter a parse tree produced by the {@code rpFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterRpFilter(@NotNull XQueryParser.RpFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitRpFilter(@NotNull XQueryParser.RpFilterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code currentDir}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterCurrentDir(@NotNull XQueryParser.CurrentDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentDir}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitCurrentDir(@NotNull XQueryParser.CurrentDirContext ctx);

	/**
	 * Enter a parse tree produced by the {@code optVarsEq}
	 * labeled alternative in {@link XQueryParser#optCond}.
	 * @param ctx the parse tree
	 */
	void enterOptVarsEq(@NotNull XQueryParser.OptVarsEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optVarsEq}
	 * labeled alternative in {@link XQueryParser#optCond}.
	 * @param ctx the parse tree
	 */
	void exitOptVarsEq(@NotNull XQueryParser.OptVarsEqContext ctx);

	/**
	 * Enter a parse tree produced by the {@code relativeChild}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRelativeChild(@NotNull XQueryParser.RelativeChildContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relativeChild}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRelativeChild(@NotNull XQueryParser.RelativeChildContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqueryParen}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqueryParen(@NotNull XQueryParser.XqueryParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqueryParen}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqueryParen(@NotNull XQueryParser.XqueryParenContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqueryOr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXqueryOr(@NotNull XQueryParser.XqueryOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqueryOr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXqueryOr(@NotNull XQueryParser.XqueryOrContext ctx);

	/**
	 * Enter a parse tree produced by the {@code varXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterVarXQ(@NotNull XQueryParser.VarXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitVarXQ(@NotNull XQueryParser.VarXQContext ctx);

	/**
	 * Enter a parse tree produced by the {@code relativeWithFilter}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRelativeWithFilter(@NotNull XQueryParser.RelativeWithFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relativeWithFilter}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRelativeWithFilter(@NotNull XQueryParser.RelativeWithFilterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqueryLetClause}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqueryLetClause(@NotNull XQueryParser.XqueryLetClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqueryLetClause}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqueryLetClause(@NotNull XQueryParser.XqueryLetClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code strConst}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterStrConst(@NotNull XQueryParser.StrConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strConst}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitStrConst(@NotNull XQueryParser.StrConstContext ctx);

	/**
	 * Enter a parse tree produced by the {@code optVarStrEq}
	 * labeled alternative in {@link XQueryParser#optCond}.
	 * @param ctx the parse tree
	 */
	void enterOptVarStrEq(@NotNull XQueryParser.OptVarStrEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optVarStrEq}
	 * labeled alternative in {@link XQueryParser#optCond}.
	 * @param ctx the parse tree
	 */
	void exitOptVarStrEq(@NotNull XQueryParser.OptVarStrEqContext ctx);

	/**
	 * Enter a parse tree produced by the {@code absolutePath}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePath(@NotNull XQueryParser.AbsolutePathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absolutePath}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePath(@NotNull XQueryParser.AbsolutePathContext ctx);

	/**
	 * Enter a parse tree produced by {@link XQueryParser#optXq}.
	 * @param ctx the parse tree
	 */
	void enterOptXq(@NotNull XQueryParser.OptXqContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#optXq}.
	 * @param ctx the parse tree
	 */
	void exitOptXq(@NotNull XQueryParser.OptXqContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqueryRelativePath}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqueryRelativePath(@NotNull XQueryParser.XqueryRelativePathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqueryRelativePath}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqueryRelativePath(@NotNull XQueryParser.XqueryRelativePathContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqueryCondParen}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXqueryCondParen(@NotNull XQueryParser.XqueryCondParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqueryCondParen}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXqueryCondParen(@NotNull XQueryParser.XqueryCondParenContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqueryEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXqueryEmpty(@NotNull XQueryParser.XqueryEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqueryEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXqueryEmpty(@NotNull XQueryParser.XqueryEmptyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code notFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterNotFilter(@NotNull XQueryParser.NotFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitNotFilter(@NotNull XQueryParser.NotFilterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code parentDir}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParentDir(@NotNull XQueryParser.ParentDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentDir}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParentDir(@NotNull XQueryParser.ParentDirContext ctx);

	/**
	 * Enter a parse tree produced by the {@code selectAny}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterSelectAny(@NotNull XQueryParser.SelectAnyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectAny}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitSelectAny(@NotNull XQueryParser.SelectAnyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqueryNot}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXqueryNot(@NotNull XQueryParser.XqueryNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqueryNot}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXqueryNot(@NotNull XQueryParser.XqueryNotContext ctx);

	/**
	 * Enter a parse tree produced by the {@code filterParen}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterParen(@NotNull XQueryParser.FilterParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterParen}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterParen(@NotNull XQueryParser.FilterParenContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tagName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTagName(@NotNull XQueryParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTagName(@NotNull XQueryParser.TagNameContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqueryAnd}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXqueryAnd(@NotNull XQueryParser.XqueryAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqueryAnd}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXqueryAnd(@NotNull XQueryParser.XqueryAndContext ctx);

	/**
	 * Enter a parse tree produced by {@link XQueryParser#varList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(@NotNull XQueryParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#varList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(@NotNull XQueryParser.VarListContext ctx);

	/**
	 * Enter a parse tree produced by the {@code absoluteChild}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteChild(@NotNull XQueryParser.AbsoluteChildContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absoluteChild}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteChild(@NotNull XQueryParser.AbsoluteChildContext ctx);

	/**
	 * Enter a parse tree produced by {@link XQueryParser#optReturn}.
	 * @param ctx the parse tree
	 */
	void enterOptReturn(@NotNull XQueryParser.OptReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#optReturn}.
	 * @param ctx the parse tree
	 */
	void exitOptReturn(@NotNull XQueryParser.OptReturnContext ctx);

	/**
	 * Enter a parse tree produced by the {@code isFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterIsFilter(@NotNull XQueryParser.IsFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitIsFilter(@NotNull XQueryParser.IsFilterContext ctx);

	/**
	 * Enter a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(@NotNull XQueryParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(@NotNull XQueryParser.ForClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code optStrsEq}
	 * labeled alternative in {@link XQueryParser#optCond}.
	 * @param ctx the parse tree
	 */
	void enterOptStrsEq(@NotNull XQueryParser.OptStrsEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optStrsEq}
	 * labeled alternative in {@link XQueryParser#optCond}.
	 * @param ctx the parse tree
	 */
	void exitOptStrsEq(@NotNull XQueryParser.OptStrsEqContext ctx);
}