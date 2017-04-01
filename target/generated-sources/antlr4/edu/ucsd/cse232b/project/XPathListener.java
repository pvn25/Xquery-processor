// Generated from XPath.g4 by ANTLR 4.4
package edu.ucsd.cse232b.project;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XPathParser}.
 */
public interface XPathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code equalFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterEqualFilter(@NotNull XPathParser.EqualFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitEqualFilter(@NotNull XPathParser.EqualFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterNotFilter(@NotNull XPathParser.NotFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitNotFilter(@NotNull XPathParser.NotFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentDir}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterCurrentDir(@NotNull XPathParser.CurrentDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentDir}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitCurrentDir(@NotNull XPathParser.CurrentDirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterAndFilter(@NotNull XPathParser.AndFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitAndFilter(@NotNull XPathParser.AndFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentDir}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParentDir(@NotNull XPathParser.ParentDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentDir}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParentDir(@NotNull XPathParser.ParentDirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relativeChild}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRelativeChild(@NotNull XPathParser.RelativeChildContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relativeChild}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRelativeChild(@NotNull XPathParser.RelativeChildContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getText}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterGetText(@NotNull XPathParser.GetTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getText}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitGetText(@NotNull XPathParser.GetTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(@NotNull XPathParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(@NotNull XPathParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectAny}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterSelectAny(@NotNull XPathParser.SelectAnyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectAny}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitSelectAny(@NotNull XPathParser.SelectAnyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relativeDescendent}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRelativeDescendent(@NotNull XPathParser.RelativeDescendentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relativeDescendent}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRelativeDescendent(@NotNull XPathParser.RelativeDescendentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterParen}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterParen(@NotNull XPathParser.FilterParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterParen}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterParen(@NotNull XPathParser.FilterParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagName}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTagName(@NotNull XPathParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagName}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTagName(@NotNull XPathParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relativeWithFilter}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRelativeWithFilter(@NotNull XPathParser.RelativeWithFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relativeWithFilter}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRelativeWithFilter(@NotNull XPathParser.RelativeWithFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterOrFilter(@NotNull XPathParser.OrFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitOrFilter(@NotNull XPathParser.OrFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code file}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull XPathParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code file}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull XPathParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code absoluteDescendent}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteDescendent(@NotNull XPathParser.AbsoluteDescendentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absoluteDescendent}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteDescendent(@NotNull XPathParser.AbsoluteDescendentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relativeParen}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRelativeParen(@NotNull XPathParser.RelativeParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relativeParen}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRelativeParen(@NotNull XPathParser.RelativeParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code absoluteChild}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteChild(@NotNull XPathParser.AbsoluteChildContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absoluteChild}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteChild(@NotNull XPathParser.AbsoluteChildContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterIsFilter(@NotNull XPathParser.IsFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitIsFilter(@NotNull XPathParser.IsFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code absolutePath}
	 * labeled alternative in {@link XPathParser#xpath}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePath(@NotNull XPathParser.AbsolutePathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absolutePath}
	 * labeled alternative in {@link XPathParser#xpath}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePath(@NotNull XPathParser.AbsolutePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(@NotNull XPathParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(@NotNull XPathParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterRpFilter(@NotNull XPathParser.RpFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitRpFilter(@NotNull XPathParser.RpFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relativePathConcat}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRelativePathConcat(@NotNull XPathParser.RelativePathConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relativePathConcat}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRelativePathConcat(@NotNull XPathParser.RelativePathConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrName}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttrName(@NotNull XPathParser.AttrNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrName}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttrName(@NotNull XPathParser.AttrNameContext ctx);
}