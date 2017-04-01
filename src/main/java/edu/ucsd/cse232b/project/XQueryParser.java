// Generated from edu/ucsd/cse232b/project/XQuery.g4 by ANTLR 4.3
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
public class XQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__36=1, T__35=2, T__34=3, T__33=4, T__32=5, T__31=6, T__30=7, T__29=8, 
		T__28=9, T__27=10, T__26=11, T__25=12, T__24=13, T__23=14, T__22=15, T__21=16, 
		T__20=17, T__19=18, T__18=19, T__17=20, T__16=21, T__15=22, T__14=23, 
		T__13=24, T__12=25, T__11=26, T__10=27, T__9=28, T__8=29, T__7=30, T__6=31, 
		T__5=32, T__4=33, T__3=34, T__2=35, T__1=36, T__0=37, NAME=38, Var=39, 
		StringConstant=40, WS=41;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'some'", "'text()'", "'return'", "'(\"'", "'{'", 
		"'..'", "'}'", "'='", "'for'", "':='", "'\")'", "'satisfies'", "'eq'", 
		"'('", "'is'", "'*'", "','", "'.'", "'join'", "'</'", "'['", "'=='", "'<'", 
		"'//'", "']'", "'>'", "'@'", "'or'", "'let'", "'where'", "'in'", "')'", 
		"'and'", "'doc'", "'not'", "'empty'", "NAME", "Var", "StringConstant", 
		"WS"
	};
	public static final int
		RULE_query = 0, RULE_optXq = 1, RULE_optCond = 2, RULE_path = 3, RULE_optVarIn = 4, 
		RULE_optReturn = 5, RULE_xq = 6, RULE_varList = 7, RULE_forClause = 8, 
		RULE_varIn = 9, RULE_letClause = 10, RULE_varEq = 11, RULE_whereClause = 12, 
		RULE_returnClause = 13, RULE_cond = 14, RULE_ap = 15, RULE_rp = 16, RULE_f = 17, 
		RULE_doc = 18;
	public static final String[] ruleNames = {
		"query", "optXq", "optCond", "path", "optVarIn", "optReturn", "xq", "varList", 
		"forClause", "varIn", "letClause", "varEq", "whereClause", "returnClause", 
		"cond", "ap", "rp", "f", "doc"
	};

	@Override
	public String getGrammarFileName() { return "XQuery.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public OptXqContext optXq() {
			return getRuleContext(OptXqContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(38); optXq();
				}
				break;

			case 2:
				{
				setState(39); xq(0);
				}
				break;
			}
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

	public static class OptXqContext extends ParserRuleContext {
		public OptReturnContext optReturn() {
			return getRuleContext(OptReturnContext.class,0);
		}
		public OptCondContext optCond() {
			return getRuleContext(OptCondContext.class,0);
		}
		public OptVarInContext optVarIn() {
			return getRuleContext(OptVarInContext.class,0);
		}
		public OptXqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optXq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterOptXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitOptXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitOptXq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptXqContext optXq() throws RecognitionException {
		OptXqContext _localctx = new OptXqContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_optXq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(T__27);
			setState(43); optVarIn();
			setState(47);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(44); match(T__6);
				setState(45); optCond(0);
				}
				break;
			case T__33:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(49); match(T__33);
			setState(50); optReturn(0);
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

	public static class OptCondContext extends ParserRuleContext {
		public OptCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optCond; }
	 
		public OptCondContext() { }
		public void copyFrom(OptCondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OptVarsEqContext extends OptCondContext {
		public TerminalNode Var(int i) {
			return getToken(XQueryParser.Var, i);
		}
		public List<TerminalNode> Var() { return getTokens(XQueryParser.Var); }
		public OptVarsEqContext(OptCondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterOptVarsEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitOptVarsEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitOptVarsEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptVarStrEqContext extends OptCondContext {
		public TerminalNode StringConstant() { return getToken(XQueryParser.StringConstant, 0); }
		public TerminalNode Var() { return getToken(XQueryParser.Var, 0); }
		public OptVarStrEqContext(OptCondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterOptVarStrEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitOptVarStrEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitOptVarStrEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptCondAndContext extends OptCondContext {
		public OptCondContext optCond(int i) {
			return getRuleContext(OptCondContext.class,i);
		}
		public List<OptCondContext> optCond() {
			return getRuleContexts(OptCondContext.class);
		}
		public OptCondAndContext(OptCondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterOptCondAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitOptCondAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitOptCondAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptStrsEqContext extends OptCondContext {
		public List<TerminalNode> StringConstant() { return getTokens(XQueryParser.StringConstant); }
		public TerminalNode StringConstant(int i) {
			return getToken(XQueryParser.StringConstant, i);
		}
		public OptStrsEqContext(OptCondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterOptStrsEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitOptStrsEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitOptStrsEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptCondContext optCond() throws RecognitionException {
		return optCond(0);
	}

	private OptCondContext optCond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OptCondContext _localctx = new OptCondContext(_ctx, _parentState);
		OptCondContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_optCond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new OptVarsEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(53); match(Var);
				setState(54);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(55); match(Var);
				}
				break;

			case 2:
				{
				_localctx = new OptStrsEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56); match(StringConstant);
				setState(57);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(58); match(StringConstant);
				}
				break;

			case 3:
				{
				_localctx = new OptVarStrEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59); match(Var);
				setState(60);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(61); match(StringConstant);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OptCondAndContext(new OptCondContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_optCond);
					setState(64);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(65); match(T__3);
					setState(66); optCond(2);
					}
					} 
				}
				setState(71);
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

	public static class PathContext extends ParserRuleContext {
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
	 
		public PathContext() { }
		public void copyFrom(PathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OptVarPathContext extends PathContext {
		public TerminalNode NAME(int i) {
			return getToken(XQueryParser.NAME, i);
		}
		public List<TerminalNode> NAME() { return getTokens(XQueryParser.NAME); }
		public TerminalNode Var() { return getToken(XQueryParser.Var, 0); }
		public OptVarPathContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterOptVarPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitOptVarPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitOptVarPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptApathContext extends PathContext {
		public TerminalNode NAME(int i) {
			return getToken(XQueryParser.NAME, i);
		}
		public List<TerminalNode> NAME() { return getTokens(XQueryParser.NAME); }
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public OptApathContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterOptApath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitOptApath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitOptApath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_path);
		int _la;
		try {
			int _alt;
			setState(96);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new OptApathContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72); doc();
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(73);
						_la = _input.LA(1);
						if ( !(_la==T__36 || _la==T__12) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(74); match(NAME);
						}
						} 
					}
					setState(79);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(82);
				_la = _input.LA(1);
				if (_la==T__36 || _la==T__12) {
					{
					setState(80);
					_la = _input.LA(1);
					if ( !(_la==T__36 || _la==T__12) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(81); match(T__34);
					}
				}

				}
				break;
			case Var:
				_localctx = new OptVarPathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84); match(Var);
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(85);
						_la = _input.LA(1);
						if ( !(_la==T__36 || _la==T__12) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(86); match(NAME);
						}
						} 
					}
					setState(91);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(94);
				_la = _input.LA(1);
				if (_la==T__36 || _la==T__12) {
					{
					setState(92);
					_la = _input.LA(1);
					if ( !(_la==T__36 || _la==T__12) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(93); match(T__34);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OptVarInContext extends ParserRuleContext {
		public PathContext path(int i) {
			return getRuleContext(PathContext.class,i);
		}
		public TerminalNode Var(int i) {
			return getToken(XQueryParser.Var, i);
		}
		public List<TerminalNode> Var() { return getTokens(XQueryParser.Var); }
		public List<PathContext> path() {
			return getRuleContexts(PathContext.class);
		}
		public OptVarInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optVarIn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterOptVarIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitOptVarIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitOptVarIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptVarInContext optVarIn() throws RecognitionException {
		OptVarInContext _localctx = new OptVarInContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_optVarIn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(Var);
			setState(99); match(T__5);
			setState(100); path();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(101); match(T__19);
				setState(102); match(Var);
				setState(103); match(T__5);
				setState(104); path();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class OptReturnContext extends ParserRuleContext {
		public TerminalNode NAME(int i) {
			return getToken(XQueryParser.NAME, i);
		}
		public OptReturnContext optReturn(int i) {
			return getRuleContext(OptReturnContext.class,i);
		}
		public List<TerminalNode> NAME() { return getTokens(XQueryParser.NAME); }
		public List<OptReturnContext> optReturn() {
			return getRuleContexts(OptReturnContext.class);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode Var() { return getToken(XQueryParser.Var, 0); }
		public OptReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterOptReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitOptReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitOptReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptReturnContext optReturn() throws RecognitionException {
		return optReturn(0);
	}

	private OptReturnContext optReturn(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OptReturnContext _localctx = new OptReturnContext(_ctx, _parentState);
		OptReturnContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_optReturn, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(111); match(Var);
				}
				break;

			case 2:
				{
				setState(112); match(T__13);
				setState(113); match(NAME);
				setState(114); match(T__10);
				setState(115); match(T__31);
				setState(116); optReturn(0);
				setState(117); match(T__29);
				setState(118); match(T__16);
				setState(119); match(NAME);
				setState(120); match(T__10);
				}
				break;

			case 3:
				{
				setState(122); xq(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OptReturnContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_optReturn);
					setState(125);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(126); match(T__19);
					setState(127); optReturn(4);
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XqueryTagContext extends XqContext {
		public TerminalNode NAME(int i) {
			return getToken(XQueryParser.NAME, i);
		}
		public List<TerminalNode> NAME() { return getTokens(XQueryParser.NAME); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XqueryTagContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqueryTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqueryTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqueryTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqueryConcatContext extends XqContext {
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqueryConcatContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqueryConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqueryConcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqueryConcat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrConstContext extends XqContext {
		public TerminalNode StringConstant() { return getToken(XQueryParser.StringConstant, 0); }
		public StrConstContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterStrConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitStrConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitStrConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqueryDescendentContext extends XqContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XqueryDescendentContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqueryDescendent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqueryDescendent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqueryDescendent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqueryParenContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XqueryParenContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqueryParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqueryParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqueryParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AbsolutePathContext extends XqContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public AbsolutePathContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAbsolutePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAbsolutePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAbsolutePath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqueryForLoopContext extends XqContext {
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqueryForLoopContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqueryForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqueryForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqueryForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarXQContext extends XqContext {
		public TerminalNode Var() { return getToken(XQueryParser.Var, 0); }
		public VarXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterVarXQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitVarXQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitVarXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqueryRelativePathContext extends XqContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XqueryRelativePathContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqueryRelativePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqueryRelativePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqueryRelativePath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqueryLetClauseContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqueryLetClauseContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqueryLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqueryLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqueryLetClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqueryJoinContext extends XqContext {
		public VarListContext vars1;
		public VarListContext vars2;
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public VarListContext varList(int i) {
			return getRuleContext(VarListContext.class,i);
		}
		public List<VarListContext> varList() {
			return getRuleContexts(VarListContext.class);
		}
		public XqueryJoinContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqueryJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqueryJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqueryJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_xq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			switch (_input.LA(1)) {
			case T__7:
				{
				_localctx = new XqueryLetClauseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(134); letClause();
				setState(135); xq(4);
				}
				break;
			case T__2:
				{
				_localctx = new AbsolutePathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137); ap();
				}
				break;
			case T__22:
				{
				_localctx = new XqueryParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138); match(T__22);
				setState(139); xq(0);
				setState(140); match(T__4);
				}
				break;
			case T__13:
				{
				_localctx = new XqueryTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142); match(T__13);
				setState(143); match(NAME);
				setState(144); match(T__10);
				setState(145); match(T__31);
				setState(146); xq(0);
				setState(147); match(T__29);
				setState(148); match(T__16);
				setState(149); match(NAME);
				setState(150); match(T__10);
				}
				break;
			case T__27:
				{
				_localctx = new XqueryForLoopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152); forClause();
				setState(155);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(153); letClause();
					}
					break;
				case T__33:
				case T__6:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(159);
				switch (_input.LA(1)) {
				case T__6:
					{
					setState(157); whereClause();
					}
					break;
				case T__33:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(161); returnClause();
				}
				break;
			case StringConstant:
				{
				_localctx = new StrConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163); match(StringConstant);
				}
				break;
			case T__17:
				{
				_localctx = new XqueryJoinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164); match(T__17);
				setState(165); match(T__22);
				setState(166); xq(0);
				setState(167); match(T__19);
				setState(168); xq(0);
				setState(169); match(T__19);
				setState(170); ((XqueryJoinContext)_localctx).vars1 = varList();
				setState(171); match(T__19);
				setState(172); ((XqueryJoinContext)_localctx).vars2 = varList();
				setState(173); match(T__4);
				}
				break;
			case Var:
				{
				_localctx = new VarXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175); match(Var);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(187);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new XqueryConcatContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(178);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(179); match(T__19);
						setState(180); xq(9);
						}
						break;

					case 2:
						{
						_localctx = new XqueryRelativePathContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(181);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(182); match(T__36);
						setState(183); rp(0);
						}
						break;

					case 3:
						{
						_localctx = new XqueryDescendentContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(184);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(185); match(T__12);
						setState(186); rp(0);
						}
						break;
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class VarListContext extends ParserRuleContext {
		public TerminalNode Var(int i) {
			return getToken(XQueryParser.Var, i);
		}
		public List<TerminalNode> Var() { return getTokens(XQueryParser.Var); }
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterVarList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitVarList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitVarList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); match(T__15);
			setState(194);
			_la = _input.LA(1);
			if (_la==Var) {
				{
				setState(193); match(Var);
				}
			}

			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(196); match(T__19);
				setState(197); match(Var);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203); match(T__11);
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

	public static class ForClauseContext extends ParserRuleContext {
		public VarInContext varIn() {
			return getRuleContext(VarInContext.class,0);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(T__27);
			setState(206); varIn();
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

	public static class VarInContext extends ParserRuleContext {
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode Var(int i) {
			return getToken(XQueryParser.Var, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public List<TerminalNode> Var() { return getTokens(XQueryParser.Var); }
		public VarInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varIn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterVarIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitVarIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitVarIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarInContext varIn() throws RecognitionException {
		VarInContext _localctx = new VarInContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varIn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); match(Var);
			setState(209); match(T__5);
			setState(210); xq(0);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(211); match(T__19);
				setState(212); match(Var);
				setState(213); match(T__5);
				setState(214); xq(0);
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class LetClauseContext extends ParserRuleContext {
		public VarEqContext varEq() {
			return getRuleContext(VarEqContext.class,0);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_letClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); match(T__7);
			setState(221); varEq(0);
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

	public static class VarEqContext extends ParserRuleContext {
		public VarEqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varEq; }
	 
		public VarEqContext() { }
		public void copyFrom(VarEqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleVarEqContext extends VarEqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode Var() { return getToken(XQueryParser.Var, 0); }
		public SingleVarEqContext(VarEqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterSingleVarEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitSingleVarEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitSingleVarEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiVarEqContext extends VarEqContext {
		public VarEqContext varEq(int i) {
			return getRuleContext(VarEqContext.class,i);
		}
		public List<VarEqContext> varEq() {
			return getRuleContexts(VarEqContext.class);
		}
		public MultiVarEqContext(VarEqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterMultiVarEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitMultiVarEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitMultiVarEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarEqContext varEq() throws RecognitionException {
		return varEq(0);
	}

	private VarEqContext varEq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarEqContext _localctx = new VarEqContext(_ctx, _parentState);
		VarEqContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_varEq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleVarEqContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(224); match(Var);
			setState(225); match(T__26);
			setState(226); xq(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiVarEqContext(new VarEqContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_varEq);
					setState(228);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(229); match(T__19);
					setState(230); varEq(2);
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); match(T__6);
			setState(237); cond(0);
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

	public static class ReturnClauseContext extends ParserRuleContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); match(T__33);
			setState(240); xq(0);
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

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XqueryCondParenContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public XqueryCondParenContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqueryCondParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqueryCondParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqueryCondParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqueryEmptyContext extends CondContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XqueryEmptyContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqueryEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqueryEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqueryEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqueryIsContext extends CondContext {
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqueryIsContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqueryIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqueryIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqueryIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqueryEqContext extends CondContext {
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqueryEqContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqueryEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqueryEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqueryEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XquerySatisfyContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public VarInContext varIn() {
			return getRuleContext(VarInContext.class,0);
		}
		public XquerySatisfyContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXquerySatisfy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXquerySatisfy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXquerySatisfy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqueryNotContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public XqueryNotContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqueryNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqueryNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqueryNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqueryOrContext extends CondContext {
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public XqueryOrContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqueryOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqueryOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqueryOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqueryAndContext extends CondContext {
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public XqueryAndContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqueryAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqueryAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqueryAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_cond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new XquerySatisfyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(243); match(T__35);
				setState(244); varIn();
				setState(245); match(T__24);
				setState(246); cond(5);
				}
				break;

			case 2:
				{
				_localctx = new XqueryNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248); match(T__1);
				setState(249); cond(1);
				}
				break;

			case 3:
				{
				_localctx = new XqueryEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250); xq(0);
				setState(251); match(T__28);
				setState(252); xq(0);
				}
				break;

			case 4:
				{
				_localctx = new XqueryEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254); xq(0);
				setState(255); match(T__23);
				setState(256); xq(0);
				}
				break;

			case 5:
				{
				_localctx = new XqueryIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258); xq(0);
				setState(259); match(T__14);
				setState(260); xq(0);
				}
				break;

			case 6:
				{
				_localctx = new XqueryIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262); xq(0);
				setState(263); match(T__21);
				setState(264); xq(0);
				}
				break;

			case 7:
				{
				_localctx = new XqueryEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266); match(T__0);
				setState(267); match(T__22);
				setState(268); xq(0);
				setState(269); match(T__4);
				}
				break;

			case 8:
				{
				_localctx = new XqueryCondParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271); match(T__22);
				setState(272); cond(0);
				setState(273); match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(283);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new XqueryAndContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(277);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(278); match(T__3);
						setState(279); cond(4);
						}
						break;

					case 2:
						{
						_localctx = new XqueryOrContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(280);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(281); match(T__8);
						setState(282); cond(3);
						}
						break;
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAbsoluteDescendent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAbsoluteDescendent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAbsoluteDescendent(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAbsoluteChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAbsoluteChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAbsoluteChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ap);
		try {
			setState(296);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new AbsoluteChildContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(288); doc();
				setState(289); match(T__36);
				setState(290); rp(0);
				}
				break;

			case 2:
				_localctx = new AbsoluteDescendentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(292); doc();
				setState(293); match(T__12);
				setState(294); rp(0);
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
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCurrentDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCurrentDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCurrentDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelativeParenContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RelativeParenContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRelativeParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRelativeParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRelativeParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentDirContext extends RpContext {
		public ParentDirContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterParentDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitParentDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitParentDir(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRelativeChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRelativeChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRelativeChild(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetTextContext extends RpContext {
		public GetTextContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterGetText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitGetText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitGetText(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectAnyContext extends RpContext {
		public SelectAnyContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterSelectAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitSelectAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitSelectAny(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRelativeDescendent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRelativeDescendent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRelativeDescendent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagNameContext extends RpContext {
		public TerminalNode NAME() { return getToken(XQueryParser.NAME, 0); }
		public TagNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRelativePathConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRelativePathConcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRelativePathConcat(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRelativeWithFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRelativeWithFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRelativeWithFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttrNameContext extends RpContext {
		public TerminalNode NAME() { return getToken(XQueryParser.NAME, 0); }
		public AttrNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAttrName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAttrName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAttrName(this);
			else return visitor.visitChildren(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new TagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(299); match(NAME);
				}
				break;
			case T__20:
				{
				_localctx = new SelectAnyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300); match(T__20);
				}
				break;
			case T__18:
				{
				_localctx = new CurrentDirContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301); match(T__18);
				}
				break;
			case T__30:
				{
				_localctx = new ParentDirContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302); match(T__30);
				}
				break;
			case T__34:
				{
				_localctx = new GetTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303); match(T__34);
				}
				break;
			case T__9:
				{
				_localctx = new AttrNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304); match(T__9);
				setState(305); match(NAME);
				}
				break;
			case T__22:
				{
				_localctx = new RelativeParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306); match(T__22);
				setState(307); rp(0);
				setState(308); match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(326);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new RelativeChildContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(312);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(313); match(T__36);
						setState(314); rp(5);
						}
						break;

					case 2:
						{
						_localctx = new RelativeDescendentContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(315);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(316); match(T__12);
						setState(317); rp(4);
						}
						break;

					case 3:
						{
						_localctx = new RelativePathConcatContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(318);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(319); match(T__19);
						setState(320); rp(2);
						}
						break;

					case 4:
						{
						_localctx = new RelativeWithFilterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(321);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(322); match(T__15);
						setState(323); f(0);
						setState(324); match(T__11);
						}
						break;
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterEqualFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitEqualFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitEqualFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotFilterContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public NotFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterNotFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitNotFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitNotFilter(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAndFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAndFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAndFilter(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterIsFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitIsFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitIsFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterParenContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FilterParenContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilterParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilterParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpFilterContext extends FContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RpFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpFilter(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterOrFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitOrFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitOrFilter(this);
			else return visitor.visitChildren(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_f, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				_localctx = new NotFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(332); match(T__1);
				setState(333); f(1);
				}
				break;

			case 2:
				{
				_localctx = new RpFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(334); rp(0);
				}
				break;

			case 3:
				{
				_localctx = new EqualFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(335); rp(0);
				setState(336); match(T__28);
				setState(337); rp(0);
				}
				break;

			case 4:
				{
				_localctx = new EqualFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(339); rp(0);
				setState(340); match(T__23);
				setState(341); rp(0);
				}
				break;

			case 5:
				{
				_localctx = new IsFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(343); rp(0);
				setState(344); match(T__14);
				setState(345); rp(0);
				}
				break;

			case 6:
				{
				_localctx = new IsFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(347); rp(0);
				setState(348); match(T__21);
				setState(349); rp(0);
				}
				break;

			case 7:
				{
				_localctx = new FilterParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(351); match(T__22);
				setState(352); f(0);
				setState(353); match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(363);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new AndFilterContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(357);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(358); match(T__3);
						setState(359); f(4);
						}
						break;

					case 2:
						{
						_localctx = new OrFilterContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(360);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(361); match(T__8);
						setState(362); f(3);
						}
						break;
					}
					} 
				}
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public TerminalNode NAME() { return getToken(XQueryParser.NAME, 0); }
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_doc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368); match(T__2);
			setState(369); match(T__32);
			setState(370); match(NAME);
			setState(371); match(T__25);
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
		case 2: return optCond_sempred((OptCondContext)_localctx, predIndex);

		case 5: return optReturn_sempred((OptReturnContext)_localctx, predIndex);

		case 6: return xq_sempred((XqContext)_localctx, predIndex);

		case 11: return varEq_sempred((VarEqContext)_localctx, predIndex);

		case 14: return cond_sempred((CondContext)_localctx, predIndex);

		case 16: return rp_sempred((RpContext)_localctx, predIndex);

		case 17: return f_sempred((FContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean optCond_sempred(OptCondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean optReturn_sempred(OptReturnContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12: return precpred(_ctx, 3);

		case 13: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 8);

		case 3: return precpred(_ctx, 9);

		case 4: return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return precpred(_ctx, 3);

		case 7: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return precpred(_ctx, 4);

		case 9: return precpred(_ctx, 3);

		case 10: return precpred(_ctx, 1);

		case 11: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean varEq_sempred(VarEqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u0178\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\5\2+\n\2\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\4\3\4\3"+
		"\4\7\4F\n\4\f\4\16\4I\13\4\3\5\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5\3\5\3\5"+
		"\5\5U\n\5\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\5\3\5\5\5a\n\5\5\5c\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7~\n\7\3\7\3\7\3\7\7\7\u0083\n"+
		"\7\f\7\16\7\u0086\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009e\n\b\3\b\3\b\5\b\u00a2"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b3"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00be\n\b\f\b\16\b\u00c1"+
		"\13\b\3\t\3\t\5\t\u00c5\n\t\3\t\3\t\7\t\u00c9\n\t\f\t\16\t\u00cc\13\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00da\n\13"+
		"\f\13\16\13\u00dd\13\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7"+
		"\r\u00ea\n\r\f\r\16\r\u00ed\13\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u0116\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u011e\n\20\f\20\16\20\u0121\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u012b\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0139\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u0149\n\22\f\22\16\22\u014c\13\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0166\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u016e\n\23\f\23\16\23\u0171\13\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\2\t\6\f\16\30\36\"$\25\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&\2\4\4\2\13\13\20\20\4\2\3\3\33\33\u019e\2*\3\2\2\2\4"+
		",\3\2\2\2\6@\3\2\2\2\bb\3\2\2\2\nd\3\2\2\2\f}\3\2\2\2\16\u00b2\3\2\2\2"+
		"\20\u00c2\3\2\2\2\22\u00cf\3\2\2\2\24\u00d2\3\2\2\2\26\u00de\3\2\2\2\30"+
		"\u00e1\3\2\2\2\32\u00ee\3\2\2\2\34\u00f1\3\2\2\2\36\u0115\3\2\2\2 \u012a"+
		"\3\2\2\2\"\u0138\3\2\2\2$\u0165\3\2\2\2&\u0172\3\2\2\2(+\5\4\3\2)+\5\16"+
		"\b\2*(\3\2\2\2*)\3\2\2\2+\3\3\2\2\2,-\7\f\2\2-\61\5\n\6\2./\7!\2\2/\62"+
		"\5\6\4\2\60\62\3\2\2\2\61.\3\2\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\64\7"+
		"\6\2\2\64\65\5\f\7\2\65\5\3\2\2\2\66\67\b\4\1\2\678\7)\2\289\t\2\2\29"+
		"A\7)\2\2:;\7*\2\2;<\t\2\2\2<A\7*\2\2=>\7)\2\2>?\t\2\2\2?A\7*\2\2@\66\3"+
		"\2\2\2@:\3\2\2\2@=\3\2\2\2AG\3\2\2\2BC\f\3\2\2CD\7$\2\2DF\5\6\4\4EB\3"+
		"\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\7\3\2\2\2IG\3\2\2\2JO\5&\24\2KL"+
		"\t\3\2\2LN\7(\2\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PT\3\2\2\2QO"+
		"\3\2\2\2RS\t\3\2\2SU\7\5\2\2TR\3\2\2\2TU\3\2\2\2Uc\3\2\2\2V[\7)\2\2WX"+
		"\t\3\2\2XZ\7(\2\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\`\3\2\2\2"+
		"][\3\2\2\2^_\t\3\2\2_a\7\5\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2bJ\3\2\2\2"+
		"bV\3\2\2\2c\t\3\2\2\2de\7)\2\2ef\7\"\2\2fm\5\b\5\2gh\7\24\2\2hi\7)\2\2"+
		"ij\7\"\2\2jl\5\b\5\2kg\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\13\3\2\2"+
		"\2om\3\2\2\2pq\b\7\1\2q~\7)\2\2rs\7\32\2\2st\7(\2\2tu\7\35\2\2uv\7\b\2"+
		"\2vw\5\f\7\2wx\7\n\2\2xy\7\27\2\2yz\7(\2\2z{\7\35\2\2{~\3\2\2\2|~\5\16"+
		"\b\2}p\3\2\2\2}r\3\2\2\2}|\3\2\2\2~\u0084\3\2\2\2\177\u0080\f\5\2\2\u0080"+
		"\u0081\7\24\2\2\u0081\u0083\5\f\7\6\u0082\177\3\2\2\2\u0083\u0086\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\r\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0087\u0088\b\b\1\2\u0088\u0089\5\26\f\2\u0089\u008a\5\16\b\6"+
		"\u008a\u00b3\3\2\2\2\u008b\u00b3\5 \21\2\u008c\u008d\7\21\2\2\u008d\u008e"+
		"\5\16\b\2\u008e\u008f\7#\2\2\u008f\u00b3\3\2\2\2\u0090\u0091\7\32\2\2"+
		"\u0091\u0092\7(\2\2\u0092\u0093\7\35\2\2\u0093\u0094\7\b\2\2\u0094\u0095"+
		"\5\16\b\2\u0095\u0096\7\n\2\2\u0096\u0097\7\27\2\2\u0097\u0098\7(\2\2"+
		"\u0098\u0099\7\35\2\2\u0099\u00b3\3\2\2\2\u009a\u009d\5\22\n\2\u009b\u009e"+
		"\5\26\f\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2"+
		"\u009e\u00a1\3\2\2\2\u009f\u00a2\5\32\16\2\u00a0\u00a2\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\5\34\17\2"+
		"\u00a4\u00b3\3\2\2\2\u00a5\u00b3\7*\2\2\u00a6\u00a7\7\26\2\2\u00a7\u00a8"+
		"\7\21\2\2\u00a8\u00a9\5\16\b\2\u00a9\u00aa\7\24\2\2\u00aa\u00ab\5\16\b"+
		"\2\u00ab\u00ac\7\24\2\2\u00ac\u00ad\5\20\t\2\u00ad\u00ae\7\24\2\2\u00ae"+
		"\u00af\5\20\t\2\u00af\u00b0\7#\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00b3\7)"+
		"\2\2\u00b2\u0087\3\2\2\2\u00b2\u008b\3\2\2\2\u00b2\u008c\3\2\2\2\u00b2"+
		"\u0090\3\2\2\2\u00b2\u009a\3\2\2\2\u00b2\u00a5\3\2\2\2\u00b2\u00a6\3\2"+
		"\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00bf\3\2\2\2\u00b4\u00b5\f\n\2\2\u00b5"+
		"\u00b6\7\24\2\2\u00b6\u00be\5\16\b\13\u00b7\u00b8\f\13\2\2\u00b8\u00b9"+
		"\7\3\2\2\u00b9\u00be\5\"\22\2\u00ba\u00bb\f\t\2\2\u00bb\u00bc\7\33\2\2"+
		"\u00bc\u00be\5\"\22\2\u00bd\u00b4\3\2\2\2\u00bd\u00b7\3\2\2\2\u00bd\u00ba"+
		"\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\17\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\7\30\2\2\u00c3\u00c5\7)\2"+
		"\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00ca\3\2\2\2\u00c6\u00c7"+
		"\7\24\2\2\u00c7\u00c9\7)\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cd\u00ce\7\34\2\2\u00ce\21\3\2\2\2\u00cf\u00d0\7\f\2\2\u00d0\u00d1"+
		"\5\24\13\2\u00d1\23\3\2\2\2\u00d2\u00d3\7)\2\2\u00d3\u00d4\7\"\2\2\u00d4"+
		"\u00db\5\16\b\2\u00d5\u00d6\7\24\2\2\u00d6\u00d7\7)\2\2\u00d7\u00d8\7"+
		"\"\2\2\u00d8\u00da\5\16\b\2\u00d9\u00d5\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\25\3\2\2\2\u00dd\u00db\3\2\2"+
		"\2\u00de\u00df\7 \2\2\u00df\u00e0\5\30\r\2\u00e0\27\3\2\2\2\u00e1\u00e2"+
		"\b\r\1\2\u00e2\u00e3\7)\2\2\u00e3\u00e4\7\r\2\2\u00e4\u00e5\5\16\b\2\u00e5"+
		"\u00eb\3\2\2\2\u00e6\u00e7\f\3\2\2\u00e7\u00e8\7\24\2\2\u00e8\u00ea\5"+
		"\30\r\4\u00e9\u00e6\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\31\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7!\2\2"+
		"\u00ef\u00f0\5\36\20\2\u00f0\33\3\2\2\2\u00f1\u00f2\7\6\2\2\u00f2\u00f3"+
		"\5\16\b\2\u00f3\35\3\2\2\2\u00f4\u00f5\b\20\1\2\u00f5\u00f6\7\4\2\2\u00f6"+
		"\u00f7\5\24\13\2\u00f7\u00f8\7\17\2\2\u00f8\u00f9\5\36\20\7\u00f9\u0116"+
		"\3\2\2\2\u00fa\u00fb\7&\2\2\u00fb\u0116\5\36\20\3\u00fc\u00fd\5\16\b\2"+
		"\u00fd\u00fe\7\13\2\2\u00fe\u00ff\5\16\b\2\u00ff\u0116\3\2\2\2\u0100\u0101"+
		"\5\16\b\2\u0101\u0102\7\20\2\2\u0102\u0103\5\16\b\2\u0103\u0116\3\2\2"+
		"\2\u0104\u0105\5\16\b\2\u0105\u0106\7\31\2\2\u0106\u0107\5\16\b\2\u0107"+
		"\u0116\3\2\2\2\u0108\u0109\5\16\b\2\u0109\u010a\7\22\2\2\u010a\u010b\5"+
		"\16\b\2\u010b\u0116\3\2\2\2\u010c\u010d\7\'\2\2\u010d\u010e\7\21\2\2\u010e"+
		"\u010f\5\16\b\2\u010f\u0110\7#\2\2\u0110\u0116\3\2\2\2\u0111\u0112\7\21"+
		"\2\2\u0112\u0113\5\36\20\2\u0113\u0114\7#\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u00f4\3\2\2\2\u0115\u00fa\3\2\2\2\u0115\u00fc\3\2\2\2\u0115\u0100\3\2"+
		"\2\2\u0115\u0104\3\2\2\2\u0115\u0108\3\2\2\2\u0115\u010c\3\2\2\2\u0115"+
		"\u0111\3\2\2\2\u0116\u011f\3\2\2\2\u0117\u0118\f\5\2\2\u0118\u0119\7$"+
		"\2\2\u0119\u011e\5\36\20\6\u011a\u011b\f\4\2\2\u011b\u011c\7\37\2\2\u011c"+
		"\u011e\5\36\20\5\u011d\u0117\3\2\2\2\u011d\u011a\3\2\2\2\u011e\u0121\3"+
		"\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\37\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0123\5&\24\2\u0123\u0124\7\3\2\2\u0124\u0125\5\""+
		"\22\2\u0125\u012b\3\2\2\2\u0126\u0127\5&\24\2\u0127\u0128\7\33\2\2\u0128"+
		"\u0129\5\"\22\2\u0129\u012b\3\2\2\2\u012a\u0122\3\2\2\2\u012a\u0126\3"+
		"\2\2\2\u012b!\3\2\2\2\u012c\u012d\b\22\1\2\u012d\u0139\7(\2\2\u012e\u0139"+
		"\7\23\2\2\u012f\u0139\7\25\2\2\u0130\u0139\7\t\2\2\u0131\u0139\7\5\2\2"+
		"\u0132\u0133\7\36\2\2\u0133\u0139\7(\2\2\u0134\u0135\7\21\2\2\u0135\u0136"+
		"\5\"\22\2\u0136\u0137\7#\2\2\u0137\u0139\3\2\2\2\u0138\u012c\3\2\2\2\u0138"+
		"\u012e\3\2\2\2\u0138\u012f\3\2\2\2\u0138\u0130\3\2\2\2\u0138\u0131\3\2"+
		"\2\2\u0138\u0132\3\2\2\2\u0138\u0134\3\2\2\2\u0139\u014a\3\2\2\2\u013a"+
		"\u013b\f\6\2\2\u013b\u013c\7\3\2\2\u013c\u0149\5\"\22\7\u013d\u013e\f"+
		"\5\2\2\u013e\u013f\7\33\2\2\u013f\u0149\5\"\22\6\u0140\u0141\f\3\2\2\u0141"+
		"\u0142\7\24\2\2\u0142\u0149\5\"\22\4\u0143\u0144\f\4\2\2\u0144\u0145\7"+
		"\30\2\2\u0145\u0146\5$\23\2\u0146\u0147\7\34\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u013a\3\2\2\2\u0148\u013d\3\2\2\2\u0148\u0140\3\2\2\2\u0148\u0143\3\2"+
		"\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"#\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\b\23\1\2\u014e\u014f\7&\2\2"+
		"\u014f\u0166\5$\23\3\u0150\u0166\5\"\22\2\u0151\u0152\5\"\22\2\u0152\u0153"+
		"\7\13\2\2\u0153\u0154\5\"\22\2\u0154\u0166\3\2\2\2\u0155\u0156\5\"\22"+
		"\2\u0156\u0157\7\20\2\2\u0157\u0158\5\"\22\2\u0158\u0166\3\2\2\2\u0159"+
		"\u015a\5\"\22\2\u015a\u015b\7\31\2\2\u015b\u015c\5\"\22\2\u015c\u0166"+
		"\3\2\2\2\u015d\u015e\5\"\22\2\u015e\u015f\7\22\2\2\u015f\u0160\5\"\22"+
		"\2\u0160\u0166\3\2\2\2\u0161\u0162\7\21\2\2\u0162\u0163\5$\23\2\u0163"+
		"\u0164\7#\2\2\u0164\u0166\3\2\2\2\u0165\u014d\3\2\2\2\u0165\u0150\3\2"+
		"\2\2\u0165\u0151\3\2\2\2\u0165\u0155\3\2\2\2\u0165\u0159\3\2\2\2\u0165"+
		"\u015d\3\2\2\2\u0165\u0161\3\2\2\2\u0166\u016f\3\2\2\2\u0167\u0168\f\5"+
		"\2\2\u0168\u0169\7$\2\2\u0169\u016e\5$\23\6\u016a\u016b\f\4\2\2\u016b"+
		"\u016c\7\37\2\2\u016c\u016e\5$\23\5\u016d\u0167\3\2\2\2\u016d\u016a\3"+
		"\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"%\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\7%\2\2\u0173\u0174\7\7\2\2\u0174"+
		"\u0175\7(\2\2\u0175\u0176\7\16\2\2\u0176\'\3\2\2\2!*\61@GOT[`bm}\u0084"+
		"\u009d\u00a1\u00b2\u00bd\u00bf\u00c4\u00ca\u00db\u00eb\u0115\u011d\u011f"+
		"\u012a\u0138\u0148\u014a\u0165\u016d\u016f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}