// Generated from XPath.g4 by ANTLR 4.4
package edu.ucsd.cse232b.project;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XPathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__20=1, T__19=2, T__18=3, T__17=4, T__16=5, T__15=6, T__14=7, T__13=8, 
		T__12=9, T__11=10, T__10=11, T__9=12, T__8=13, T__7=14, T__6=15, T__5=16, 
		T__4=17, T__3=18, T__2=19, T__1=20, T__0=21, NAME=22, WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'"
	};
	public static final String[] ruleNames = {
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "NAME", "WS"
	};


	public XPathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XPath.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\7\27"+
		"r\n\27\f\27\16\27u\13\27\3\30\6\30x\n\30\r\30\16\30y\3\30\3\30\2\2\31"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\5\5\2C\\aac|\7\2\60\60\62"+
		";C\\aac|\5\2\13\f\17\17\"\"~\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\79\3\2\2\2\t@\3"+
		"\2\2\2\13B\3\2\2\2\rE\3\2\2\2\17H\3\2\2\2\21K\3\2\2\2\23M\3\2\2\2\25O"+
		"\3\2\2\2\27R\3\2\2\2\31T\3\2\2\2\33W\3\2\2\2\35Z\3\2\2\2\37\\\3\2\2\2"+
		"!_\3\2\2\2#a\3\2\2\2%e\3\2\2\2\'g\3\2\2\2)k\3\2\2\2+m\3\2\2\2-o\3\2\2"+
		"\2/w\3\2\2\2\61\62\7\61\2\2\62\4\3\2\2\2\63\64\7f\2\2\64\65\7q\2\2\65"+
		"\66\7e\2\2\66\67\7*\2\2\678\7$\2\28\6\3\2\2\29:\7v\2\2:;\7g\2\2;<\7z\2"+
		"\2<=\7v\2\2=>\7*\2\2>?\7+\2\2?\b\3\2\2\2@A\7]\2\2A\n\3\2\2\2BC\7?\2\2"+
		"CD\7?\2\2D\f\3\2\2\2EF\7\60\2\2FG\7\60\2\2G\16\3\2\2\2HI\7\61\2\2IJ\7"+
		"\61\2\2J\20\3\2\2\2KL\7?\2\2L\22\3\2\2\2MN\7_\2\2N\24\3\2\2\2OP\7q\2\2"+
		"PQ\7t\2\2Q\26\3\2\2\2RS\7B\2\2S\30\3\2\2\2TU\7$\2\2UV\7+\2\2V\32\3\2\2"+
		"\2WX\7g\2\2XY\7s\2\2Y\34\3\2\2\2Z[\7*\2\2[\36\3\2\2\2\\]\7k\2\2]^\7u\2"+
		"\2^ \3\2\2\2_`\7+\2\2`\"\3\2\2\2ab\7c\2\2bc\7p\2\2cd\7f\2\2d$\3\2\2\2"+
		"ef\7,\2\2f&\3\2\2\2gh\7p\2\2hi\7q\2\2ij\7v\2\2j(\3\2\2\2kl\7.\2\2l*\3"+
		"\2\2\2mn\7\60\2\2n,\3\2\2\2os\t\2\2\2pr\t\3\2\2qp\3\2\2\2ru\3\2\2\2sq"+
		"\3\2\2\2st\3\2\2\2t.\3\2\2\2us\3\2\2\2vx\t\4\2\2wv\3\2\2\2xy\3\2\2\2y"+
		"w\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\b\30\2\2|\60\3\2\2\2\5\2sy\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}