// Generated from XPath.g4 by ANTLR 4.4
package edu.ucsd.cse232b.project;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XPathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__20=1, T__19=2, T__18=3, T__17=4, T__16=5, T__15=6, T__14=7, T__13=8, 
		T__12=9, T__11=10, T__10=11, T__9=12, T__8=13, T__7=14, T__6=15, T__5=16, 
		T__4=17, T__3=18, T__2=19, T__1=20, T__0=21, NAME=22, WS=23;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'doc(\"'", "'text()'", "'['", "'=='", "'..'", "'//'", 
		"'='", "']'", "'or'", "'@'", "'\")'", "'eq'", "'('", "'is'", "')'", "'and'", 
		"'*'", "'not'", "','", "'.'", "NAME", "WS"
	};
	public static final int
		RULE_query = 0, RULE_xpath = 1, RULE_ap = 2, RULE_rp = 3, RULE_f = 4, 
		RULE_doc = 5;
	public static final String[] ruleNames = {
		"query", "xpath", "ap", "rp", "f", "doc"
	};

	@Override
	public String getGrammarFileName() { return "XPath.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XPathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public XpathContext xpath() {
			return getRuleContext(XpathContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); xpath();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XpathContext extends ParserRuleContext {
		public XpathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xpath; }
	 
		public XpathContext() { }
		public void copyFrom(XpathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AbsolutePathContext extends XpathContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public AbsolutePathContext(XpathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterAbsolutePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitAbsolutePath(this);
		}
	}

	public final XpathContext xpath() throws RecognitionException {
		XpathContext _localctx = new XpathContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_xpath);
		try {
			_localctx = new AbsolutePathContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(14); ap();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FileContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public FileContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitFile(this);
		}
	}
	public static class AbsoluteDescendentContext extends ApContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public AbsoluteDescendentContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterAbsoluteDescendent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitAbsoluteDescendent(this);
		}
	}
	public static class AbsoluteChildContext extends ApContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public AbsoluteChildContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterAbsoluteChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitAbsoluteChild(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ap);
		try {
			setState(25);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new AbsoluteChildContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(16); doc();
				setState(17); match(T__20);
				setState(18); rp(0);
				}
				break;
			case 2:
				_localctx = new AbsoluteDescendentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20); doc();
				setState(21); match(T__14);
				setState(22); rp(0);
				}
				break;
			case 3:
				_localctx = new FileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(24); doc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CurrentDirContext extends RpContext {
		public CurrentDirContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterCurrentDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitCurrentDir(this);
		}
	}
	public static class RelativeParenContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RelativeParenContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterRelativeParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitRelativeParen(this);
		}
	}
	public static class ParentDirContext extends RpContext {
		public ParentDirContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterParentDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitParentDir(this);
		}
	}
	public static class RelativeChildContext extends RpContext {
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RelativeChildContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterRelativeChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitRelativeChild(this);
		}
	}
	public static class GetTextContext extends RpContext {
		public GetTextContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterGetText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitGetText(this);
		}
	}
	public static class SelectAnyContext extends RpContext {
		public SelectAnyContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterSelectAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitSelectAny(this);
		}
	}
	public static class RelativeDescendentContext extends RpContext {
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RelativeDescendentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterRelativeDescendent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitRelativeDescendent(this);
		}
	}
	public static class TagNameContext extends RpContext {
		public TerminalNode NAME() { return getToken(XPathParser.NAME, 0); }
		public TagNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitTagName(this);
		}
	}
	public static class RelativePathConcatContext extends RpContext {
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RelativePathConcatContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterRelativePathConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitRelativePathConcat(this);
		}
	}
	public static class RelativeWithFilterContext extends RpContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RelativeWithFilterContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterRelativeWithFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitRelativeWithFilter(this);
		}
	}
	public static class AttrNameContext extends RpContext {
		public TerminalNode NAME() { return getToken(XPathParser.NAME, 0); }
		public AttrNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterAttrName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitAttrName(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new TagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(28); match(NAME);
				}
				break;
			case T__3:
				{
				_localctx = new SelectAnyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29); match(T__3);
				}
				break;
			case T__0:
				{
				_localctx = new CurrentDirContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30); match(T__0);
				}
				break;
			case T__15:
				{
				_localctx = new ParentDirContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31); match(T__15);
				}
				break;
			case T__18:
				{
				_localctx = new GetTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32); match(T__18);
				}
				break;
			case T__10:
				{
				_localctx = new AttrNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33); match(T__10);
				setState(34); match(NAME);
				}
				break;
			case T__7:
				{
				_localctx = new RelativeParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35); match(T__7);
				setState(36); rp(0);
				setState(37); match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(55);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new RelativeChildContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(41);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(42); match(T__20);
						setState(43); rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RelativeDescendentContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(44);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(45); match(T__14);
						setState(46); rp(4);
						}
						break;
					case 3:
						{
						_localctx = new RelativePathConcatContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(47);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(48); match(T__1);
						setState(49); rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RelativeWithFilterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(50);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(51); match(T__17);
						setState(52); f(0);
						setState(53); match(T__12);
						}
						break;
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FContext extends ParserRuleContext {
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
	 
		public FContext() { }
		public void copyFrom(FContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualFilterContext extends FContext {
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public EqualFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterEqualFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitEqualFilter(this);
		}
	}
	public static class NotFilterContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public NotFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterNotFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitNotFilter(this);
		}
	}
	public static class AndFilterContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public AndFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterAndFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitAndFilter(this);
		}
	}
	public static class IsFilterContext extends FContext {
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public IsFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterIsFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitIsFilter(this);
		}
	}
	public static class FilterParenContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FilterParenContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterFilterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitFilterParen(this);
		}
	}
	public static class RpFilterContext extends FContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RpFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterRpFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitRpFilter(this);
		}
	}
	public static class OrFilterContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public OrFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterOrFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitOrFilter(this);
		}
	}

	public final FContext f() throws RecognitionException {
		return f(0);
	}

	private FContext f(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FContext _localctx = new FContext(_ctx, _parentState);
		FContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_f, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new NotFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(61); match(T__2);
				setState(62); f(1);
				}
				break;
			case 2:
				{
				_localctx = new RpFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63); rp(0);
				}
				break;
			case 3:
				{
				_localctx = new EqualFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64); rp(0);
				setState(65); match(T__13);
				setState(66); rp(0);
				}
				break;
			case 4:
				{
				_localctx = new EqualFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68); rp(0);
				setState(69); match(T__8);
				setState(70); rp(0);
				}
				break;
			case 5:
				{
				_localctx = new IsFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72); rp(0);
				setState(73); match(T__16);
				setState(74); rp(0);
				}
				break;
			case 6:
				{
				_localctx = new IsFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76); rp(0);
				setState(77); match(T__6);
				setState(78); rp(0);
				}
				break;
			case 7:
				{
				_localctx = new FilterParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80); match(T__7);
				setState(81); f(0);
				setState(82); match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(92);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new AndFilterContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(86);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(87); match(T__4);
						setState(88); f(4);
						}
						break;
					case 2:
						{
						_localctx = new OrFilterContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(89);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(90); match(T__11);
						setState(91); f(3);
						}
						break;
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DocContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XPathParser.NAME, 0); }
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitDoc(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_doc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(T__19);
			setState(98); match(NAME);
			setState(99); match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3: return rp_sempred((RpContext)_localctx, predIndex);
		case 4: return f_sempred((FContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 3);
		case 5: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);
		case 1: return precpred(_ctx, 3);
		case 2: return precpred(_ctx, 1);
		case 3: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4\34\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5*\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5:\n\5\f\5\16\5=\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6W\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6_\n\6\f\6\16\6b\13\6\3\7\3\7\3\7\3\7\3\7\2\4\b\n\b"+
		"\2\4\6\b\n\f\2\2u\2\16\3\2\2\2\4\20\3\2\2\2\6\33\3\2\2\2\b)\3\2\2\2\n"+
		"V\3\2\2\2\fc\3\2\2\2\16\17\5\4\3\2\17\3\3\2\2\2\20\21\5\6\4\2\21\5\3\2"+
		"\2\2\22\23\5\f\7\2\23\24\7\3\2\2\24\25\5\b\5\2\25\34\3\2\2\2\26\27\5\f"+
		"\7\2\27\30\7\t\2\2\30\31\5\b\5\2\31\34\3\2\2\2\32\34\5\f\7\2\33\22\3\2"+
		"\2\2\33\26\3\2\2\2\33\32\3\2\2\2\34\7\3\2\2\2\35\36\b\5\1\2\36*\7\30\2"+
		"\2\37*\7\24\2\2 *\7\27\2\2!*\7\b\2\2\"*\7\5\2\2#$\7\r\2\2$*\7\30\2\2%"+
		"&\7\20\2\2&\'\5\b\5\2\'(\7\22\2\2(*\3\2\2\2)\35\3\2\2\2)\37\3\2\2\2) "+
		"\3\2\2\2)!\3\2\2\2)\"\3\2\2\2)#\3\2\2\2)%\3\2\2\2*;\3\2\2\2+,\f\6\2\2"+
		",-\7\3\2\2-:\5\b\5\7./\f\5\2\2/\60\7\t\2\2\60:\5\b\5\6\61\62\f\3\2\2\62"+
		"\63\7\26\2\2\63:\5\b\5\4\64\65\f\4\2\2\65\66\7\6\2\2\66\67\5\n\6\2\67"+
		"8\7\13\2\28:\3\2\2\29+\3\2\2\29.\3\2\2\29\61\3\2\2\29\64\3\2\2\2:=\3\2"+
		"\2\2;9\3\2\2\2;<\3\2\2\2<\t\3\2\2\2=;\3\2\2\2>?\b\6\1\2?@\7\25\2\2@W\5"+
		"\n\6\3AW\5\b\5\2BC\5\b\5\2CD\7\n\2\2DE\5\b\5\2EW\3\2\2\2FG\5\b\5\2GH\7"+
		"\17\2\2HI\5\b\5\2IW\3\2\2\2JK\5\b\5\2KL\7\7\2\2LM\5\b\5\2MW\3\2\2\2NO"+
		"\5\b\5\2OP\7\21\2\2PQ\5\b\5\2QW\3\2\2\2RS\7\20\2\2ST\5\n\6\2TU\7\22\2"+
		"\2UW\3\2\2\2V>\3\2\2\2VA\3\2\2\2VB\3\2\2\2VF\3\2\2\2VJ\3\2\2\2VN\3\2\2"+
		"\2VR\3\2\2\2W`\3\2\2\2XY\f\5\2\2YZ\7\23\2\2Z_\5\n\6\6[\\\f\4\2\2\\]\7"+
		"\f\2\2]_\5\n\6\5^X\3\2\2\2^[\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\13"+
		"\3\2\2\2b`\3\2\2\2cd\7\4\2\2de\7\30\2\2ef\7\16\2\2f\r\3\2\2\2\t\33)9;"+
		"V^`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}