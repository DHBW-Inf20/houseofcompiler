// Generated from C:/Users/lukas/Documents/Git-Repositories/houseofcompiler/HouseOfCompiler/src/main/java/parser\JavaSubset.g4 by ANTLR 4.9.2
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaSubsetLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AccessModifier=1, Void=2, Boolean=3, Char=4, Int=5, DotOperator=6, LineOperator=7, 
		ComparisonOperator=8, LogicalOpertor=9, Assign=10, Plus=11, Minus=12, 
		Mult=13, Div=14, Greater=15, Less=16, GreaterEqual=17, LessEqual=18, Equal=19, 
		NotEqual=20, And=21, Or=22, Dot=23, OpenRoundBracket=24, ClosedRoundBracket=25, 
		OpenCurlyBracket=26, ClosedCurlyBracket=27, Semicolon=28, Comma=29, Class=30, 
		This=31, While=32, If=33, Else=34, For=35, Return=36, New=37, Identifier=38, 
		BooleanValue=39, CharValue=40, IntValue=41, WS=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AccessModifier", "Void", "Boolean", "Char", "Int", "DotOperator", "LineOperator", 
			"ComparisonOperator", "LogicalOpertor", "Assign", "Plus", "Minus", "Mult", 
			"Div", "Greater", "Less", "GreaterEqual", "LessEqual", "Equal", "NotEqual", 
			"And", "Or", "Dot", "OpenRoundBracket", "ClosedRoundBracket", "OpenCurlyBracket", 
			"ClosedCurlyBracket", "Semicolon", "Comma", "Class", "This", "While", 
			"If", "Else", "For", "Return", "New", "Alpabetic", "Numeric", "ValidIdentSymbols", 
			"Identifier", "BooleanValue", "CharValue", "IntValue", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'void'", "'boolean'", "'char'", "'int'", null, null, null, 
			null, "'='", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'!='", "'&&'", "'||'", "'.'", "'('", "')'", "'{'", "'}'", "';'", 
			"','", "'class'", "'this'", "'while'", "'if'", "'else'", "'for'", "'return'", 
			"'new'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AccessModifier", "Void", "Boolean", "Char", "Int", "DotOperator", 
			"LineOperator", "ComparisonOperator", "LogicalOpertor", "Assign", "Plus", 
			"Minus", "Mult", "Div", "Greater", "Less", "GreaterEqual", "LessEqual", 
			"Equal", "NotEqual", "And", "Or", "Dot", "OpenRoundBracket", "ClosedRoundBracket", 
			"OpenCurlyBracket", "ClosedCurlyBracket", "Semicolon", "Comma", "Class", 
			"This", "While", "If", "Else", "For", "Return", "New", "Identifier", 
			"BooleanValue", "CharValue", "IntValue", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public JavaSubsetLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaSubset.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0121\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2t\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\5\7\u008e\n\7\3\b\3\b\5\b\u0092\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009a"+
		"\n\t\3\n\3\n\5\n\u009e\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$"+
		"\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\5)\u00fd"+
		"\n)\3*\3*\7*\u0101\n*\f*\16*\u0104\13*\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u010f"+
		"\n+\3,\3,\3-\5-\u0114\n-\3-\6-\u0117\n-\r-\16-\u0118\3.\6.\u011c\n.\r"+
		".\16.\u011d\3.\3.\2\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2O\2Q\2S(U)W*Y+[,\3\2\6\4\2C\\"+
		"c|\3\2\62;\4\2&&aa\5\2\13\f\17\17\"\"\2\u012e\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3s\3\2\2\2\5u"+
		"\3\2\2\2\7z\3\2\2\2\t\u0082\3\2\2\2\13\u0087\3\2\2\2\r\u008d\3\2\2\2\17"+
		"\u0091\3\2\2\2\21\u0099\3\2\2\2\23\u009d\3\2\2\2\25\u009f\3\2\2\2\27\u00a1"+
		"\3\2\2\2\31\u00a3\3\2\2\2\33\u00a5\3\2\2\2\35\u00a7\3\2\2\2\37\u00a9\3"+
		"\2\2\2!\u00ab\3\2\2\2#\u00ad\3\2\2\2%\u00b0\3\2\2\2\'\u00b3\3\2\2\2)\u00b6"+
		"\3\2\2\2+\u00b9\3\2\2\2-\u00bc\3\2\2\2/\u00bf\3\2\2\2\61\u00c1\3\2\2\2"+
		"\63\u00c3\3\2\2\2\65\u00c5\3\2\2\2\67\u00c7\3\2\2\29\u00c9\3\2\2\2;\u00cb"+
		"\3\2\2\2=\u00cd\3\2\2\2?\u00d3\3\2\2\2A\u00d8\3\2\2\2C\u00de\3\2\2\2E"+
		"\u00e1\3\2\2\2G\u00e6\3\2\2\2I\u00ea\3\2\2\2K\u00f1\3\2\2\2M\u00f5\3\2"+
		"\2\2O\u00f7\3\2\2\2Q\u00fc\3\2\2\2S\u00fe\3\2\2\2U\u010e\3\2\2\2W\u0110"+
		"\3\2\2\2Y\u0113\3\2\2\2[\u011b\3\2\2\2]^\7r\2\2^_\7w\2\2_`\7d\2\2`a\7"+
		"n\2\2ab\7k\2\2bt\7e\2\2cd\7r\2\2de\7t\2\2ef\7k\2\2fg\7x\2\2gh\7c\2\2h"+
		"i\7v\2\2it\7g\2\2jk\7r\2\2kl\7t\2\2lm\7q\2\2mn\7v\2\2no\7g\2\2op\7e\2"+
		"\2pq\7v\2\2qr\7g\2\2rt\7f\2\2s]\3\2\2\2sc\3\2\2\2sj\3\2\2\2t\4\3\2\2\2"+
		"uv\7x\2\2vw\7q\2\2wx\7k\2\2xy\7f\2\2y\6\3\2\2\2z{\7d\2\2{|\7q\2\2|}\7"+
		"q\2\2}~\7n\2\2~\177\7g\2\2\177\u0080\7c\2\2\u0080\u0081\7p\2\2\u0081\b"+
		"\3\2\2\2\u0082\u0083\7e\2\2\u0083\u0084\7j\2\2\u0084\u0085\7c\2\2\u0085"+
		"\u0086\7t\2\2\u0086\n\3\2\2\2\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2\u0089"+
		"\u008a\7v\2\2\u008a\f\3\2\2\2\u008b\u008e\5\33\16\2\u008c\u008e\5\35\17"+
		"\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\16\3\2\2\2\u008f\u0092"+
		"\5\27\f\2\u0090\u0092\5\31\r\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2"+
		"\u0092\20\3\2\2\2\u0093\u009a\5\37\20\2\u0094\u009a\5!\21\2\u0095\u009a"+
		"\5#\22\2\u0096\u009a\5%\23\2\u0097\u009a\5\'\24\2\u0098\u009a\5)\25\2"+
		"\u0099\u0093\3\2\2\2\u0099\u0094\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u0096"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\22\3\2\2\2\u009b"+
		"\u009e\5+\26\2\u009c\u009e\5-\27\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2"+
		"\2\2\u009e\24\3\2\2\2\u009f\u00a0\7?\2\2\u00a0\26\3\2\2\2\u00a1\u00a2"+
		"\7-\2\2\u00a2\30\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4\32\3\2\2\2\u00a5\u00a6"+
		"\7,\2\2\u00a6\34\3\2\2\2\u00a7\u00a8\7\61\2\2\u00a8\36\3\2\2\2\u00a9\u00aa"+
		"\7@\2\2\u00aa \3\2\2\2\u00ab\u00ac\7>\2\2\u00ac\"\3\2\2\2\u00ad\u00ae"+
		"\7@\2\2\u00ae\u00af\7?\2\2\u00af$\3\2\2\2\u00b0\u00b1\7>\2\2\u00b1\u00b2"+
		"\7?\2\2\u00b2&\3\2\2\2\u00b3\u00b4\7?\2\2\u00b4\u00b5\7?\2\2\u00b5(\3"+
		"\2\2\2\u00b6\u00b7\7#\2\2\u00b7\u00b8\7?\2\2\u00b8*\3\2\2\2\u00b9\u00ba"+
		"\7(\2\2\u00ba\u00bb\7(\2\2\u00bb,\3\2\2\2\u00bc\u00bd\7~\2\2\u00bd\u00be"+
		"\7~\2\2\u00be.\3\2\2\2\u00bf\u00c0\7\60\2\2\u00c0\60\3\2\2\2\u00c1\u00c2"+
		"\7*\2\2\u00c2\62\3\2\2\2\u00c3\u00c4\7+\2\2\u00c4\64\3\2\2\2\u00c5\u00c6"+
		"\7}\2\2\u00c6\66\3\2\2\2\u00c7\u00c8\7\177\2\2\u00c88\3\2\2\2\u00c9\u00ca"+
		"\7=\2\2\u00ca:\3\2\2\2\u00cb\u00cc\7.\2\2\u00cc<\3\2\2\2\u00cd\u00ce\7"+
		"e\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2"+
		"\7u\2\2\u00d2>\3\2\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7j\2\2\u00d5\u00d6"+
		"\7k\2\2\u00d6\u00d7\7u\2\2\u00d7@\3\2\2\2\u00d8\u00d9\7y\2\2\u00d9\u00da"+
		"\7j\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7g\2\2\u00dd"+
		"B\3\2\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7h\2\2\u00e0D\3\2\2\2\u00e1\u00e2"+
		"\7g\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7g\2\2\u00e5"+
		"F\3\2\2\2\u00e6\u00e7\7h\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7t\2\2\u00e9"+
		"H\3\2\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7v\2\2\u00ed"+
		"\u00ee\7w\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7p\2\2\u00f0J\3\2\2\2\u00f1"+
		"\u00f2\7p\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7y\2\2\u00f4L\3\2\2\2\u00f5"+
		"\u00f6\t\2\2\2\u00f6N\3\2\2\2\u00f7\u00f8\t\3\2\2\u00f8P\3\2\2\2\u00f9"+
		"\u00fd\5M\'\2\u00fa\u00fd\5O(\2\u00fb\u00fd\t\4\2\2\u00fc\u00f9\3\2\2"+
		"\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fdR\3\2\2\2\u00fe\u0102"+
		"\5M\'\2\u00ff\u0101\5Q)\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103T\3\2\2\2\u0104\u0102\3\2\2\2"+
		"\u0105\u0106\7v\2\2\u0106\u0107\7t\2\2\u0107\u0108\7w\2\2\u0108\u010f"+
		"\7g\2\2\u0109\u010a\7h\2\2\u010a\u010b\7c\2\2\u010b\u010c\7n\2\2\u010c"+
		"\u010d\7u\2\2\u010d\u010f\7g\2\2\u010e\u0105\3\2\2\2\u010e\u0109\3\2\2"+
		"\2\u010fV\3\2\2\2\u0110\u0111\5M\'\2\u0111X\3\2\2\2\u0112\u0114\5\31\r"+
		"\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0117"+
		"\5O(\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119Z\3\2\2\2\u011a\u011c\t\5\2\2\u011b\u011a\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u0120\b.\2\2\u0120\\\3\2\2\2\16\2s\u008d\u0091\u0099\u009d"+
		"\u00fc\u0102\u010e\u0113\u0118\u011d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}