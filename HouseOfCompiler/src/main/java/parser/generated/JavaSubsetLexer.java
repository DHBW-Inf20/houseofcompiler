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
		BooleanValue=1, NullValue=2, AccessModifier=3, MainMethodDecl=4, Void=5, 
		Boolean=6, Char=7, Int=8, DotOperator=9, LineOperator=10, ComparisonOperator=11, 
		LogicalOpertor=12, Assign=13, Plus=14, Minus=15, Mult=16, Modulo=17, Div=18, 
		Greater=19, Less=20, GreaterEqual=21, LessEqual=22, Equal=23, NotEqual=24, 
		Not=25, And=26, Or=27, Dot=28, OpenRoundBracket=29, ClosedRoundBracket=30, 
		OpenCurlyBracket=31, ClosedCurlyBracket=32, Semicolon=33, Comma=34, Class=35, 
		This=36, While=37, If=38, Else=39, For=40, Return=41, New=42, Identifier=43, 
		CharValue=44, StringValue=45, IntValue=46, WS=47, InlineComment=48, MultilineComment=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BooleanValue", "NullValue", "AccessModifier", "MainMethodDecl", "Void", 
			"Boolean", "Char", "Int", "DotOperator", "LineOperator", "ComparisonOperator", 
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
			null, null, "'null'", null, "'public static void main(String[] args)'", 
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
			null, "BooleanValue", "NullValue", "AccessModifier", "MainMethodDecl", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0186\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2u\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0092\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\5\n\u00d4\n\n\3\13\3\13\5\13\u00d8\n\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u00e0\n\f\3\r\3\r\5\r\u00e4\n\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3-\3"+
		"-\3.\3.\3.\5.\u0147\n.\3/\3/\7/\u014b\n/\f/\16/\u014e\13/\3\60\3\60\5"+
		"\60\u0152\n\60\3\60\3\60\3\61\3\61\7\61\u0158\n\61\f\61\16\61\u015b\13"+
		"\61\3\61\3\61\3\62\5\62\u0160\n\62\3\62\6\62\u0163\n\62\r\62\16\62\u0164"+
		"\3\63\6\63\u0168\n\63\r\63\16\63\u0169\3\63\3\63\3\64\3\64\3\64\3\64\7"+
		"\64\u0172\n\64\f\64\16\64\u0175\13\64\3\64\3\64\3\65\3\65\3\65\3\65\7"+
		"\65\u017d\n\65\f\65\16\65\u0180\13\65\3\65\3\65\3\65\3\65\3\65\3\u017e"+
		"\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W\2Y\2[\2]-_.a/c\60e\61g\62i\63\3\2\7"+
		"\4\2C\\c|\3\2\62;\4\2&&aa\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0198\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\3t\3\2\2\2\5v\3\2\2\2\7\u0091\3\2\2\2\t\u0093\3\2\2\2\13"+
		"\u00ba\3\2\2\2\r\u00bf\3\2\2\2\17\u00c7\3\2\2\2\21\u00cc\3\2\2\2\23\u00d3"+
		"\3\2\2\2\25\u00d7\3\2\2\2\27\u00df\3\2\2\2\31\u00e3\3\2\2\2\33\u00e5\3"+
		"\2\2\2\35\u00e7\3\2\2\2\37\u00e9\3\2\2\2!\u00eb\3\2\2\2#\u00ed\3\2\2\2"+
		"%\u00ef\3\2\2\2\'\u00f1\3\2\2\2)\u00f3\3\2\2\2+\u00f5\3\2\2\2-\u00f8\3"+
		"\2\2\2/\u00fb\3\2\2\2\61\u00fe\3\2\2\2\63\u0101\3\2\2\2\65\u0103\3\2\2"+
		"\2\67\u0106\3\2\2\29\u0109\3\2\2\2;\u010b\3\2\2\2=\u010d\3\2\2\2?\u010f"+
		"\3\2\2\2A\u0111\3\2\2\2C\u0113\3\2\2\2E\u0115\3\2\2\2G\u0117\3\2\2\2I"+
		"\u011d\3\2\2\2K\u0122\3\2\2\2M\u0128\3\2\2\2O\u012b\3\2\2\2Q\u0130\3\2"+
		"\2\2S\u0134\3\2\2\2U\u013b\3\2\2\2W\u013f\3\2\2\2Y\u0141\3\2\2\2[\u0146"+
		"\3\2\2\2]\u0148\3\2\2\2_\u014f\3\2\2\2a\u0155\3\2\2\2c\u015f\3\2\2\2e"+
		"\u0167\3\2\2\2g\u016d\3\2\2\2i\u0178\3\2\2\2kl\7v\2\2lm\7t\2\2mn\7w\2"+
		"\2nu\7g\2\2op\7h\2\2pq\7c\2\2qr\7n\2\2rs\7u\2\2su\7g\2\2tk\3\2\2\2to\3"+
		"\2\2\2u\4\3\2\2\2vw\7p\2\2wx\7w\2\2xy\7n\2\2yz\7n\2\2z\6\3\2\2\2{|\7r"+
		"\2\2|}\7w\2\2}~\7d\2\2~\177\7n\2\2\177\u0080\7k\2\2\u0080\u0092\7e\2\2"+
		"\u0081\u0082\7r\2\2\u0082\u0083\7t\2\2\u0083\u0084\7k\2\2\u0084\u0085"+
		"\7x\2\2\u0085\u0086\7c\2\2\u0086\u0087\7v\2\2\u0087\u0092\7g\2\2\u0088"+
		"\u0089\7r\2\2\u0089\u008a\7t\2\2\u008a\u008b\7q\2\2\u008b\u008c\7v\2\2"+
		"\u008c\u008d\7g\2\2\u008d\u008e\7e\2\2\u008e\u008f\7v\2\2\u008f\u0090"+
		"\7g\2\2\u0090\u0092\7f\2\2\u0091{\3\2\2\2\u0091\u0081\3\2\2\2\u0091\u0088"+
		"\3\2\2\2\u0092\b\3\2\2\2\u0093\u0094\7r\2\2\u0094\u0095\7w\2\2\u0095\u0096"+
		"\7d\2\2\u0096\u0097\7n\2\2\u0097\u0098\7k\2\2\u0098\u0099\7e\2\2\u0099"+
		"\u009a\7\"\2\2\u009a\u009b\7u\2\2\u009b\u009c\7v\2\2\u009c\u009d\7c\2"+
		"\2\u009d\u009e\7v\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1"+
		"\7\"\2\2\u00a1\u00a2\7x\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7k\2\2\u00a4"+
		"\u00a5\7f\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00a7\7o\2\2\u00a7\u00a8\7c\2"+
		"\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7*\2\2\u00ab\u00ac"+
		"\7U\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7k\2\2\u00af"+
		"\u00b0\7p\2\2\u00b0\u00b1\7i\2\2\u00b1\u00b2\7]\2\2\u00b2\u00b3\7_\2\2"+
		"\u00b3\u00b4\7\"\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7"+
		"\7i\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7+\2\2\u00b9\n\3\2\2\2\u00ba\u00bb"+
		"\7x\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7f\2\2\u00be"+
		"\f\3\2\2\2\u00bf\u00c0\7d\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7q\2\2\u00c2"+
		"\u00c3\7n\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7p\2\2"+
		"\u00c6\16\3\2\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7j\2\2\u00c9\u00ca\7"+
		"c\2\2\u00ca\u00cb\7t\2\2\u00cb\20\3\2\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce"+
		"\7p\2\2\u00ce\u00cf\7v\2\2\u00cf\22\3\2\2\2\u00d0\u00d4\5!\21\2\u00d1"+
		"\u00d4\5%\23\2\u00d2\u00d4\5#\22\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d2\3\2\2\2\u00d4\24\3\2\2\2\u00d5\u00d8\5\35\17\2\u00d6"+
		"\u00d8\5\37\20\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\26\3\2"+
		"\2\2\u00d9\u00e0\5\'\24\2\u00da\u00e0\5)\25\2\u00db\u00e0\5+\26\2\u00dc"+
		"\u00e0\5-\27\2\u00dd\u00e0\5/\30\2\u00de\u00e0\5\61\31\2\u00df\u00d9\3"+
		"\2\2\2\u00df\u00da\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\30\3\2\2\2\u00e1\u00e4\5\65\33"+
		"\2\u00e2\u00e4\5\67\34\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\32\3\2\2\2\u00e5\u00e6\7?\2\2\u00e6\34\3\2\2\2\u00e7\u00e8\7-\2\2\u00e8"+
		"\36\3\2\2\2\u00e9\u00ea\7/\2\2\u00ea \3\2\2\2\u00eb\u00ec\7,\2\2\u00ec"+
		"\"\3\2\2\2\u00ed\u00ee\7\'\2\2\u00ee$\3\2\2\2\u00ef\u00f0\7\61\2\2\u00f0"+
		"&\3\2\2\2\u00f1\u00f2\7@\2\2\u00f2(\3\2\2\2\u00f3\u00f4\7>\2\2\u00f4*"+
		"\3\2\2\2\u00f5\u00f6\7@\2\2\u00f6\u00f7\7?\2\2\u00f7,\3\2\2\2\u00f8\u00f9"+
		"\7>\2\2\u00f9\u00fa\7?\2\2\u00fa.\3\2\2\2\u00fb\u00fc\7?\2\2\u00fc\u00fd"+
		"\7?\2\2\u00fd\60\3\2\2\2\u00fe\u00ff\7#\2\2\u00ff\u0100\7?\2\2\u0100\62"+
		"\3\2\2\2\u0101\u0102\7#\2\2\u0102\64\3\2\2\2\u0103\u0104\7(\2\2\u0104"+
		"\u0105\7(\2\2\u0105\66\3\2\2\2\u0106\u0107\7~\2\2\u0107\u0108\7~\2\2\u0108"+
		"8\3\2\2\2\u0109\u010a\7\60\2\2\u010a:\3\2\2\2\u010b\u010c\7*\2\2\u010c"+
		"<\3\2\2\2\u010d\u010e\7+\2\2\u010e>\3\2\2\2\u010f\u0110\7}\2\2\u0110@"+
		"\3\2\2\2\u0111\u0112\7\177\2\2\u0112B\3\2\2\2\u0113\u0114\7=\2\2\u0114"+
		"D\3\2\2\2\u0115\u0116\7.\2\2\u0116F\3\2\2\2\u0117\u0118\7e\2\2\u0118\u0119"+
		"\7n\2\2\u0119\u011a\7c\2\2\u011a\u011b\7u\2\2\u011b\u011c\7u\2\2\u011c"+
		"H\3\2\2\2\u011d\u011e\7v\2\2\u011e\u011f\7j\2\2\u011f\u0120\7k\2\2\u0120"+
		"\u0121\7u\2\2\u0121J\3\2\2\2\u0122\u0123\7y\2\2\u0123\u0124\7j\2\2\u0124"+
		"\u0125\7k\2\2\u0125\u0126\7n\2\2\u0126\u0127\7g\2\2\u0127L\3\2\2\2\u0128"+
		"\u0129\7k\2\2\u0129\u012a\7h\2\2\u012aN\3\2\2\2\u012b\u012c\7g\2\2\u012c"+
		"\u012d\7n\2\2\u012d\u012e\7u\2\2\u012e\u012f\7g\2\2\u012fP\3\2\2\2\u0130"+
		"\u0131\7h\2\2\u0131\u0132\7q\2\2\u0132\u0133\7t\2\2\u0133R\3\2\2\2\u0134"+
		"\u0135\7t\2\2\u0135\u0136\7g\2\2\u0136\u0137\7v\2\2\u0137\u0138\7w\2\2"+
		"\u0138\u0139\7t\2\2\u0139\u013a\7p\2\2\u013aT\3\2\2\2\u013b\u013c\7p\2"+
		"\2\u013c\u013d\7g\2\2\u013d\u013e\7y\2\2\u013eV\3\2\2\2\u013f\u0140\t"+
		"\2\2\2\u0140X\3\2\2\2\u0141\u0142\t\3\2\2\u0142Z\3\2\2\2\u0143\u0147\5"+
		"W,\2\u0144\u0147\5Y-\2\u0145\u0147\t\4\2\2\u0146\u0143\3\2\2\2\u0146\u0144"+
		"\3\2\2\2\u0146\u0145\3\2\2\2\u0147\\\3\2\2\2\u0148\u014c\5W,\2\u0149\u014b"+
		"\5[.\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d^\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151\7)\2\2\u0150"+
		"\u0152\n\5\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\u0154\7)\2\2\u0154`\3\2\2\2\u0155\u0159\7$\2\2\u0156\u0158"+
		"\n\5\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\7$"+
		"\2\2\u015db\3\2\2\2\u015e\u0160\5\37\20\2\u015f\u015e\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u0163\5Y-\2\u0162\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165d\3\2\2\2"+
		"\u0166\u0168\t\6\2\2\u0167\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\b\63\2\2"+
		"\u016cf\3\2\2\2\u016d\u016e\7\61\2\2\u016e\u016f\7\61\2\2\u016f\u0173"+
		"\3\2\2\2\u0170\u0172\n\5\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0176\u0177\b\64\2\2\u0177h\3\2\2\2\u0178\u0179\7\61\2\2\u0179\u017a"+
		"\7,\2\2\u017a\u017e\3\2\2\2\u017b\u017d\13\2\2\2\u017c\u017b\3\2\2\2\u017d"+
		"\u0180\3\2\2\2\u017e\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0181\3\2"+
		"\2\2\u0180\u017e\3\2\2\2\u0181\u0182\7,\2\2\u0182\u0183\7\61\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0185\b\65\2\2\u0185j\3\2\2\2\22\2t\u0091\u00d3\u00d7"+
		"\u00df\u00e3\u0146\u014c\u0151\u0159\u015f\u0164\u0169\u0173\u017e\3\b"+
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