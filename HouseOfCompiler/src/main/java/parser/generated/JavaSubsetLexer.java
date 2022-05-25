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
		T__0=1, T__1=2, BooleanValue=3, NullValue=4, AccessModifier=5, MainMethodDecl=6, 
		Void=7, Boolean=8, Char=9, Int=10, DotOperator=11, LineOperator=12, ComparisonOperator=13, 
		LogicalOpertor=14, Assign=15, Plus=16, Minus=17, Mult=18, Modulo=19, Div=20, 
		Greater=21, Less=22, GreaterEqual=23, LessEqual=24, Equal=25, NotEqual=26, 
		Not=27, And=28, Or=29, Dot=30, OpenRoundBracket=31, ClosedRoundBracket=32, 
		OpenCurlyBracket=33, ClosedCurlyBracket=34, Semicolon=35, Comma=36, Class=37, 
		This=38, While=39, If=40, Else=41, For=42, Return=43, New=44, Identifier=45, 
		CharValue=46, StringValue=47, IntValue=48, WS=49, InlineComment=50, MultilineComment=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "BooleanValue", "NullValue", "AccessModifier", "MainMethodDecl", 
			"Void", "Boolean", "Char", "Int", "DotOperator", "LineOperator", "ComparisonOperator", 
			"LogicalOpertor", "Assign", "Plus", "Minus", "Mult", "Modulo", "Div", 
			"Greater", "Less", "GreaterEqual", "LessEqual", "Equal", "NotEqual", 
			"Not", "And", "Or", "Dot", "OpenRoundBracket", "ClosedRoundBracket", 
			"OpenCurlyBracket", "ClosedCurlyBracket", "Semicolon", "Comma", "Class", 
			"This", "While", "If", "Else", "For", "Return", "New", "Alpabetic", "Numeric", 
			"ValidIdentSymbols", "Identifier", "CharValue", "StringValue", "IntValue", 
			"WS", "InlineComment", "MultilineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'++'", "'--'", null, "'null'", null, "'public static void main(String[] args)'", 
			"'void'", "'boolean'", "'char'", "'int'", null, null, null, null, "'='", 
			"'+'", "'-'", "'*'", "'%'", "'/'", "'>'", "'<'", "'>='", "'<='", "'=='", 
			"'!='", "'!'", "'&&'", "'||'", "'.'", "'('", "')'", "'{'", "'}'", "';'", 
			"','", "'class'", "'this'", "'while'", "'if'", "'else'", "'for'", "'return'", 
			"'new'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "BooleanValue", "NullValue", "AccessModifier", "MainMethodDecl", 
			"Void", "Boolean", "Char", "Int", "DotOperator", "LineOperator", "ComparisonOperator", 
			"LogicalOpertor", "Assign", "Plus", "Minus", "Mult", "Modulo", "Div", 
			"Greater", "Less", "GreaterEqual", "LessEqual", "Equal", "NotEqual", 
			"Not", "And", "Or", "Dot", "OpenRoundBracket", "ClosedRoundBracket", 
			"OpenCurlyBracket", "ClosedCurlyBracket", "Semicolon", "Comma", "Class", 
			"This", "While", "If", "Else", "For", "Return", "New", "Identifier", 
			"CharValue", "StringValue", "IntValue", "WS", "InlineComment", "MultilineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0190\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\177\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u009c\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\5\f\u00de\n\f\3\r\3\r\5\r\u00e2\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00ea\n\16\3\17\3\17\5\17\u00ee\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60"+
		"\5\60\u0151\n\60\3\61\3\61\7\61\u0155\n\61\f\61\16\61\u0158\13\61\3\62"+
		"\3\62\5\62\u015c\n\62\3\62\3\62\3\63\3\63\7\63\u0162\n\63\f\63\16\63\u0165"+
		"\13\63\3\63\3\63\3\64\5\64\u016a\n\64\3\64\6\64\u016d\n\64\r\64\16\64"+
		"\u016e\3\65\6\65\u0172\n\65\r\65\16\65\u0173\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\7\66\u017c\n\66\f\66\16\66\u017f\13\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\7\67\u0187\n\67\f\67\16\67\u018a\13\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\u0188\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[\2]\2_\2a/c\60e\61g\62i\63"+
		"k\64m\65\3\2\7\4\2C\\c|\3\2\62;\4\2&&aa\4\2\f\f\17\17\5\2\13\f\17\17\""+
		"\"\2\u01a2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5r\3\2\2\2"+
		"\7~\3\2\2\2\t\u0080\3\2\2\2\13\u009b\3\2\2\2\r\u009d\3\2\2\2\17\u00c4"+
		"\3\2\2\2\21\u00c9\3\2\2\2\23\u00d1\3\2\2\2\25\u00d6\3\2\2\2\27\u00dd\3"+
		"\2\2\2\31\u00e1\3\2\2\2\33\u00e9\3\2\2\2\35\u00ed\3\2\2\2\37\u00ef\3\2"+
		"\2\2!\u00f1\3\2\2\2#\u00f3\3\2\2\2%\u00f5\3\2\2\2\'\u00f7\3\2\2\2)\u00f9"+
		"\3\2\2\2+\u00fb\3\2\2\2-\u00fd\3\2\2\2/\u00ff\3\2\2\2\61\u0102\3\2\2\2"+
		"\63\u0105\3\2\2\2\65\u0108\3\2\2\2\67\u010b\3\2\2\29\u010d\3\2\2\2;\u0110"+
		"\3\2\2\2=\u0113\3\2\2\2?\u0115\3\2\2\2A\u0117\3\2\2\2C\u0119\3\2\2\2E"+
		"\u011b\3\2\2\2G\u011d\3\2\2\2I\u011f\3\2\2\2K\u0121\3\2\2\2M\u0127\3\2"+
		"\2\2O\u012c\3\2\2\2Q\u0132\3\2\2\2S\u0135\3\2\2\2U\u013a\3\2\2\2W\u013e"+
		"\3\2\2\2Y\u0145\3\2\2\2[\u0149\3\2\2\2]\u014b\3\2\2\2_\u0150\3\2\2\2a"+
		"\u0152\3\2\2\2c\u0159\3\2\2\2e\u015f\3\2\2\2g\u0169\3\2\2\2i\u0171\3\2"+
		"\2\2k\u0177\3\2\2\2m\u0182\3\2\2\2op\7-\2\2pq\7-\2\2q\4\3\2\2\2rs\7/\2"+
		"\2st\7/\2\2t\6\3\2\2\2uv\7v\2\2vw\7t\2\2wx\7w\2\2x\177\7g\2\2yz\7h\2\2"+
		"z{\7c\2\2{|\7n\2\2|}\7u\2\2}\177\7g\2\2~u\3\2\2\2~y\3\2\2\2\177\b\3\2"+
		"\2\2\u0080\u0081\7p\2\2\u0081\u0082\7w\2\2\u0082\u0083\7n\2\2\u0083\u0084"+
		"\7n\2\2\u0084\n\3\2\2\2\u0085\u0086\7r\2\2\u0086\u0087\7w\2\2\u0087\u0088"+
		"\7d\2\2\u0088\u0089\7n\2\2\u0089\u008a\7k\2\2\u008a\u009c\7e\2\2\u008b"+
		"\u008c\7r\2\2\u008c\u008d\7t\2\2\u008d\u008e\7k\2\2\u008e\u008f\7x\2\2"+
		"\u008f\u0090\7c\2\2\u0090\u0091\7v\2\2\u0091\u009c\7g\2\2\u0092\u0093"+
		"\7r\2\2\u0093\u0094\7t\2\2\u0094\u0095\7q\2\2\u0095\u0096\7v\2\2\u0096"+
		"\u0097\7g\2\2\u0097\u0098\7e\2\2\u0098\u0099\7v\2\2\u0099\u009a\7g\2\2"+
		"\u009a\u009c\7f\2\2\u009b\u0085\3\2\2\2\u009b\u008b\3\2\2\2\u009b\u0092"+
		"\3\2\2\2\u009c\f\3\2\2\2\u009d\u009e\7r\2\2\u009e\u009f\7w\2\2\u009f\u00a0"+
		"\7d\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7e\2\2\u00a3"+
		"\u00a4\7\"\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7c\2"+
		"\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7e\2\2\u00aa\u00ab"+
		"\7\"\2\2\u00ab\u00ac\7x\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7k\2\2\u00ae"+
		"\u00af\7f\2\2\u00af\u00b0\7\"\2\2\u00b0\u00b1\7o\2\2\u00b1\u00b2\7c\2"+
		"\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7*\2\2\u00b5\u00b6"+
		"\7U\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7k\2\2\u00b9"+
		"\u00ba\7p\2\2\u00ba\u00bb\7i\2\2\u00bb\u00bc\7]\2\2\u00bc\u00bd\7_\2\2"+
		"\u00bd\u00be\7\"\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1"+
		"\7i\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7+\2\2\u00c3\16\3\2\2\2\u00c4\u00c5"+
		"\7x\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7f\2\2\u00c8"+
		"\20\3\2\2\2\u00c9\u00ca\7d\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7q\2\2\u00cc"+
		"\u00cd\7n\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7p\2\2"+
		"\u00d0\22\3\2\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7j\2\2\u00d3\u00d4\7"+
		"c\2\2\u00d4\u00d5\7t\2\2\u00d5\24\3\2\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8"+
		"\7p\2\2\u00d8\u00d9\7v\2\2\u00d9\26\3\2\2\2\u00da\u00de\5%\23\2\u00db"+
		"\u00de\5)\25\2\u00dc\u00de\5\'\24\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3"+
		"\2\2\2\u00dd\u00dc\3\2\2\2\u00de\30\3\2\2\2\u00df\u00e2\5!\21\2\u00e0"+
		"\u00e2\5#\22\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\32\3\2\2"+
		"\2\u00e3\u00ea\5+\26\2\u00e4\u00ea\5-\27\2\u00e5\u00ea\5/\30\2\u00e6\u00ea"+
		"\5\61\31\2\u00e7\u00ea\5\63\32\2\u00e8\u00ea\5\65\33\2\u00e9\u00e3\3\2"+
		"\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\34\3\2\2\2\u00eb\u00ee\59\35"+
		"\2\u00ec\u00ee\5;\36\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\36"+
		"\3\2\2\2\u00ef\u00f0\7?\2\2\u00f0 \3\2\2\2\u00f1\u00f2\7-\2\2\u00f2\""+
		"\3\2\2\2\u00f3\u00f4\7/\2\2\u00f4$\3\2\2\2\u00f5\u00f6\7,\2\2\u00f6&\3"+
		"\2\2\2\u00f7\u00f8\7\'\2\2\u00f8(\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa*"+
		"\3\2\2\2\u00fb\u00fc\7@\2\2\u00fc,\3\2\2\2\u00fd\u00fe\7>\2\2\u00fe.\3"+
		"\2\2\2\u00ff\u0100\7@\2\2\u0100\u0101\7?\2\2\u0101\60\3\2\2\2\u0102\u0103"+
		"\7>\2\2\u0103\u0104\7?\2\2\u0104\62\3\2\2\2\u0105\u0106\7?\2\2\u0106\u0107"+
		"\7?\2\2\u0107\64\3\2\2\2\u0108\u0109\7#\2\2\u0109\u010a\7?\2\2\u010a\66"+
		"\3\2\2\2\u010b\u010c\7#\2\2\u010c8\3\2\2\2\u010d\u010e\7(\2\2\u010e\u010f"+
		"\7(\2\2\u010f:\3\2\2\2\u0110\u0111\7~\2\2\u0111\u0112\7~\2\2\u0112<\3"+
		"\2\2\2\u0113\u0114\7\60\2\2\u0114>\3\2\2\2\u0115\u0116\7*\2\2\u0116@\3"+
		"\2\2\2\u0117\u0118\7+\2\2\u0118B\3\2\2\2\u0119\u011a\7}\2\2\u011aD\3\2"+
		"\2\2\u011b\u011c\7\177\2\2\u011cF\3\2\2\2\u011d\u011e\7=\2\2\u011eH\3"+
		"\2\2\2\u011f\u0120\7.\2\2\u0120J\3\2\2\2\u0121\u0122\7e\2\2\u0122\u0123"+
		"\7n\2\2\u0123\u0124\7c\2\2\u0124\u0125\7u\2\2\u0125\u0126\7u\2\2\u0126"+
		"L\3\2\2\2\u0127\u0128\7v\2\2\u0128\u0129\7j\2\2\u0129\u012a\7k\2\2\u012a"+
		"\u012b\7u\2\2\u012bN\3\2\2\2\u012c\u012d\7y\2\2\u012d\u012e\7j\2\2\u012e"+
		"\u012f\7k\2\2\u012f\u0130\7n\2\2\u0130\u0131\7g\2\2\u0131P\3\2\2\2\u0132"+
		"\u0133\7k\2\2\u0133\u0134\7h\2\2\u0134R\3\2\2\2\u0135\u0136\7g\2\2\u0136"+
		"\u0137\7n\2\2\u0137\u0138\7u\2\2\u0138\u0139\7g\2\2\u0139T\3\2\2\2\u013a"+
		"\u013b\7h\2\2\u013b\u013c\7q\2\2\u013c\u013d\7t\2\2\u013dV\3\2\2\2\u013e"+
		"\u013f\7t\2\2\u013f\u0140\7g\2\2\u0140\u0141\7v\2\2\u0141\u0142\7w\2\2"+
		"\u0142\u0143\7t\2\2\u0143\u0144\7p\2\2\u0144X\3\2\2\2\u0145\u0146\7p\2"+
		"\2\u0146\u0147\7g\2\2\u0147\u0148\7y\2\2\u0148Z\3\2\2\2\u0149\u014a\t"+
		"\2\2\2\u014a\\\3\2\2\2\u014b\u014c\t\3\2\2\u014c^\3\2\2\2\u014d\u0151"+
		"\5[.\2\u014e\u0151\5]/\2\u014f\u0151\t\4\2\2\u0150\u014d\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151`\3\2\2\2\u0152\u0156\5[.\2\u0153"+
		"\u0155\5_\60\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0156\u0157\3\2\2\2\u0157b\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015b"+
		"\7)\2\2\u015a\u015c\n\5\2\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015e\7)\2\2\u015ed\3\2\2\2\u015f\u0163\7$\2\2\u0160"+
		"\u0162\n\5\2\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2"+
		"\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166"+
		"\u0167\7$\2\2\u0167f\3\2\2\2\u0168\u016a\5#\22\2\u0169\u0168\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u016d\5]/\2\u016c\u016b\3\2\2"+
		"\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016fh"+
		"\3\2\2\2\u0170\u0172\t\6\2\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\b\65"+
		"\2\2\u0176j\3\2\2\2\u0177\u0178\7\61\2\2\u0178\u0179\7\61\2\2\u0179\u017d"+
		"\3\2\2\2\u017a\u017c\n\5\2\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d\3\2"+
		"\2\2\u0180\u0181\b\66\2\2\u0181l\3\2\2\2\u0182\u0183\7\61\2\2\u0183\u0184"+
		"\7,\2\2\u0184\u0188\3\2\2\2\u0185\u0187\13\2\2\2\u0186\u0185\3\2\2\2\u0187"+
		"\u018a\3\2\2\2\u0188\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018b\3\2"+
		"\2\2\u018a\u0188\3\2\2\2\u018b\u018c\7,\2\2\u018c\u018d\7\61\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u018f\b\67\2\2\u018fn\3\2\2\2\22\2~\u009b\u00dd\u00e1"+
		"\u00e9\u00ed\u0150\u0156\u015b\u0163\u0169\u016e\u0173\u017d\u0188\3\b"+
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