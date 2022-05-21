// Generated from C:/Users/lukas/Documents/Git-Repositories/houseofcompiler/HouseOfCompiler/src/main/java/parser/grammar\JavaSubset.g4 by ANTLR 4.9.2
package parser.generated;
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
		BooleanValue=1, AccessModifier=2, Void=3, Boolean=4, Char=5, Int=6, DotOperator=7, 
		LineOperator=8, ComparisonOperator=9, LogicalOpertor=10, Assign=11, Plus=12, 
		Minus=13, Mult=14, Div=15, Greater=16, Less=17, GreaterEqual=18, LessEqual=19, 
		Equal=20, NotEqual=21, Not=22, And=23, Or=24, Dot=25, OpenRoundBracket=26, 
		ClosedRoundBracket=27, OpenCurlyBracket=28, ClosedCurlyBracket=29, Semicolon=30, 
		Comma=31, Class=32, This=33, While=34, If=35, Else=36, For=37, Return=38, 
		New=39, Identifier=40, CharValue=41, IntValue=42, WS=43, InlineComment=44, 
		MultilineComment=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BooleanValue", "AccessModifier", "Void", "Boolean", "Char", "Int", "DotOperator", 
			"LineOperator", "ComparisonOperator", "LogicalOpertor", "Assign", "Plus", 
			"Minus", "Mult", "Div", "Greater", "Less", "GreaterEqual", "LessEqual", 
			"Equal", "NotEqual", "Not", "And", "Or", "Dot", "OpenRoundBracket", "ClosedRoundBracket", 
			"OpenCurlyBracket", "ClosedCurlyBracket", "Semicolon", "Comma", "Class", 
			"This", "While", "If", "Else", "For", "Return", "New", "Alpabetic", "Numeric", 
			"ValidIdentSymbols", "Identifier", "CharValue", "IntValue", "WS", "InlineComment", 
			"MultilineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'void'", "'boolean'", "'char'", "'int'", null, null, 
			null, null, "'='", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", 
			"'<='", "'=='", "'!='", "'!'", "'&&'", "'||'", "'.'", "'('", "')'", "'{'", 
			"'}'", "';'", "','", "'class'", "'this'", "'while'", "'if'", "'else'", 
			"'for'", "'return'", "'new'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BooleanValue", "AccessModifier", "Void", "Boolean", "Char", "Int", 
			"DotOperator", "LineOperator", "ComparisonOperator", "LogicalOpertor", 
			"Assign", "Plus", "Minus", "Mult", "Div", "Greater", "Less", "GreaterEqual", 
			"LessEqual", "Equal", "NotEqual", "Not", "And", "Or", "Dot", "OpenRoundBracket", 
			"ClosedRoundBracket", "OpenCurlyBracket", "ClosedCurlyBracket", "Semicolon", 
			"Comma", "Class", "This", "While", "If", "Else", "For", "Return", "New", 
			"Identifier", "CharValue", "IntValue", "WS", "InlineComment", "MultilineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0144\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2m\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0085\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\5\b\u009f\n\b\3\t\3\t\5\t\u00a3\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00ab\n\n\3\13\3\13\5\13\u00af\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%"+
		"\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3+\5+\u0110\n+\3,\3,\7,\u0114\n,\f,\16,\u0117\13,\3-\3-\3-\3-\3.\5."+
		"\u011e\n.\3.\6.\u0121\n.\r.\16.\u0122\3/\6/\u0126\n/\r/\16/\u0127\3/\3"+
		"/\3\60\3\60\3\60\3\60\7\60\u0130\n\60\f\60\16\60\u0133\13\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\7\61\u013b\n\61\f\61\16\61\u013e\13\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\u013c\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q\2S\2U\2W*Y+[,]-_"+
		".a/\3\2\7\4\2C\\c|\3\2\62;\4\2&&aa\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2"+
		"\u0153\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3l\3\2\2\2\5\u0084"+
		"\3\2\2\2\7\u0086\3\2\2\2\t\u008b\3\2\2\2\13\u0093\3\2\2\2\r\u0098\3\2"+
		"\2\2\17\u009e\3\2\2\2\21\u00a2\3\2\2\2\23\u00aa\3\2\2\2\25\u00ae\3\2\2"+
		"\2\27\u00b0\3\2\2\2\31\u00b2\3\2\2\2\33\u00b4\3\2\2\2\35\u00b6\3\2\2\2"+
		"\37\u00b8\3\2\2\2!\u00ba\3\2\2\2#\u00bc\3\2\2\2%\u00be\3\2\2\2\'\u00c1"+
		"\3\2\2\2)\u00c4\3\2\2\2+\u00c7\3\2\2\2-\u00ca\3\2\2\2/\u00cc\3\2\2\2\61"+
		"\u00cf\3\2\2\2\63\u00d2\3\2\2\2\65\u00d4\3\2\2\2\67\u00d6\3\2\2\29\u00d8"+
		"\3\2\2\2;\u00da\3\2\2\2=\u00dc\3\2\2\2?\u00de\3\2\2\2A\u00e0\3\2\2\2C"+
		"\u00e6\3\2\2\2E\u00eb\3\2\2\2G\u00f1\3\2\2\2I\u00f4\3\2\2\2K\u00f9\3\2"+
		"\2\2M\u00fd\3\2\2\2O\u0104\3\2\2\2Q\u0108\3\2\2\2S\u010a\3\2\2\2U\u010f"+
		"\3\2\2\2W\u0111\3\2\2\2Y\u0118\3\2\2\2[\u011d\3\2\2\2]\u0125\3\2\2\2_"+
		"\u012b\3\2\2\2a\u0136\3\2\2\2cd\7v\2\2de\7t\2\2ef\7w\2\2fm\7g\2\2gh\7"+
		"h\2\2hi\7c\2\2ij\7n\2\2jk\7u\2\2km\7g\2\2lc\3\2\2\2lg\3\2\2\2m\4\3\2\2"+
		"\2no\7r\2\2op\7w\2\2pq\7d\2\2qr\7n\2\2rs\7k\2\2s\u0085\7e\2\2tu\7r\2\2"+
		"uv\7t\2\2vw\7k\2\2wx\7x\2\2xy\7c\2\2yz\7v\2\2z\u0085\7g\2\2{|\7r\2\2|"+
		"}\7t\2\2}~\7q\2\2~\177\7v\2\2\177\u0080\7g\2\2\u0080\u0081\7e\2\2\u0081"+
		"\u0082\7v\2\2\u0082\u0083\7g\2\2\u0083\u0085\7f\2\2\u0084n\3\2\2\2\u0084"+
		"t\3\2\2\2\u0084{\3\2\2\2\u0085\6\3\2\2\2\u0086\u0087\7x\2\2\u0087\u0088"+
		"\7q\2\2\u0088\u0089\7k\2\2\u0089\u008a\7f\2\2\u008a\b\3\2\2\2\u008b\u008c"+
		"\7d\2\2\u008c\u008d\7q\2\2\u008d\u008e\7q\2\2\u008e\u008f\7n\2\2\u008f"+
		"\u0090\7g\2\2\u0090\u0091\7c\2\2\u0091\u0092\7p\2\2\u0092\n\3\2\2\2\u0093"+
		"\u0094\7e\2\2\u0094\u0095\7j\2\2\u0095\u0096\7c\2\2\u0096\u0097\7t\2\2"+
		"\u0097\f\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a\7p\2\2\u009a\u009b\7v"+
		"\2\2\u009b\16\3\2\2\2\u009c\u009f\5\35\17\2\u009d\u009f\5\37\20\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\20\3\2\2\2\u00a0\u00a3\5\31\r"+
		"\2\u00a1\u00a3\5\33\16\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\22\3\2\2\2\u00a4\u00ab\5!\21\2\u00a5\u00ab\5#\22\2\u00a6\u00ab\5%\23"+
		"\2\u00a7\u00ab\5\'\24\2\u00a8\u00ab\5)\25\2\u00a9\u00ab\5+\26\2\u00aa"+
		"\u00a4\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a7\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\24\3\2\2\2\u00ac\u00af"+
		"\5/\30\2\u00ad\u00af\5\61\31\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2"+
		"\u00af\26\3\2\2\2\u00b0\u00b1\7?\2\2\u00b1\30\3\2\2\2\u00b2\u00b3\7-\2"+
		"\2\u00b3\32\3\2\2\2\u00b4\u00b5\7/\2\2\u00b5\34\3\2\2\2\u00b6\u00b7\7"+
		",\2\2\u00b7\36\3\2\2\2\u00b8\u00b9\7\61\2\2\u00b9 \3\2\2\2\u00ba\u00bb"+
		"\7@\2\2\u00bb\"\3\2\2\2\u00bc\u00bd\7>\2\2\u00bd$\3\2\2\2\u00be\u00bf"+
		"\7@\2\2\u00bf\u00c0\7?\2\2\u00c0&\3\2\2\2\u00c1\u00c2\7>\2\2\u00c2\u00c3"+
		"\7?\2\2\u00c3(\3\2\2\2\u00c4\u00c5\7?\2\2\u00c5\u00c6\7?\2\2\u00c6*\3"+
		"\2\2\2\u00c7\u00c8\7#\2\2\u00c8\u00c9\7?\2\2\u00c9,\3\2\2\2\u00ca\u00cb"+
		"\7#\2\2\u00cb.\3\2\2\2\u00cc\u00cd\7(\2\2\u00cd\u00ce\7(\2\2\u00ce\60"+
		"\3\2\2\2\u00cf\u00d0\7~\2\2\u00d0\u00d1\7~\2\2\u00d1\62\3\2\2\2\u00d2"+
		"\u00d3\7\60\2\2\u00d3\64\3\2\2\2\u00d4\u00d5\7*\2\2\u00d5\66\3\2\2\2\u00d6"+
		"\u00d7\7+\2\2\u00d78\3\2\2\2\u00d8\u00d9\7}\2\2\u00d9:\3\2\2\2\u00da\u00db"+
		"\7\177\2\2\u00db<\3\2\2\2\u00dc\u00dd\7=\2\2\u00dd>\3\2\2\2\u00de\u00df"+
		"\7.\2\2\u00df@\3\2\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3"+
		"\7c\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7u\2\2\u00e5B\3\2\2\2\u00e6\u00e7"+
		"\7v\2\2\u00e7\u00e8\7j\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7u\2\2\u00ea"+
		"D\3\2\2\2\u00eb\u00ec\7y\2\2\u00ec\u00ed\7j\2\2\u00ed\u00ee\7k\2\2\u00ee"+
		"\u00ef\7n\2\2\u00ef\u00f0\7g\2\2\u00f0F\3\2\2\2\u00f1\u00f2\7k\2\2\u00f2"+
		"\u00f3\7h\2\2\u00f3H\3\2\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7n\2\2\u00f6"+
		"\u00f7\7u\2\2\u00f7\u00f8\7g\2\2\u00f8J\3\2\2\2\u00f9\u00fa\7h\2\2\u00fa"+
		"\u00fb\7q\2\2\u00fb\u00fc\7t\2\2\u00fcL\3\2\2\2\u00fd\u00fe\7t\2\2\u00fe"+
		"\u00ff\7g\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7w\2\2\u0101\u0102\7t\2\2"+
		"\u0102\u0103\7p\2\2\u0103N\3\2\2\2\u0104\u0105\7p\2\2\u0105\u0106\7g\2"+
		"\2\u0106\u0107\7y\2\2\u0107P\3\2\2\2\u0108\u0109\t\2\2\2\u0109R\3\2\2"+
		"\2\u010a\u010b\t\3\2\2\u010bT\3\2\2\2\u010c\u0110\5Q)\2\u010d\u0110\5"+
		"S*\2\u010e\u0110\t\4\2\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u010e\3\2\2\2\u0110V\3\2\2\2\u0111\u0115\5Q)\2\u0112\u0114\5U+\2\u0113"+
		"\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116X\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7)\2\2\u0119\u011a"+
		"\5Q)\2\u011a\u011b\7)\2\2\u011bZ\3\2\2\2\u011c\u011e\5\33\16\2\u011d\u011c"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u0121\5S*\2\u0120"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\\\3\2\2\2\u0124\u0126\t\5\2\2\u0125\u0124\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012a\b/\2\2\u012a^\3\2\2\2\u012b\u012c\7\61\2\2\u012c\u012d\7\61\2\2"+
		"\u012d\u0131\3\2\2\2\u012e\u0130\n\6\2\2\u012f\u012e\3\2\2\2\u0130\u0133"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0135\b\60\2\2\u0135`\3\2\2\2\u0136\u0137\7\61\2"+
		"\2\u0137\u0138\7,\2\2\u0138\u013c\3\2\2\2\u0139\u013b\13\2\2\2\u013a\u0139"+
		"\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d"+
		"\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7,\2\2\u0140\u0141\7\61"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0143\b\61\2\2\u0143b\3\2\2\2\20\2l\u0084"+
		"\u009e\u00a2\u00aa\u00ae\u010f\u0115\u011d\u0122\u0127\u0131\u013c\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}