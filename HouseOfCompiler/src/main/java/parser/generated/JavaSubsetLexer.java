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
		BooleanValue=1, NullValue=2, AccessModifier=3, Void=4, Boolean=5, Char=6, 
		Int=7, DotOperator=8, LineOperator=9, ComparisonOperator=10, LogicalOpertor=11, 
		Assign=12, Plus=13, Minus=14, Mult=15, Div=16, Greater=17, Less=18, GreaterEqual=19, 
		LessEqual=20, Equal=21, NotEqual=22, Not=23, And=24, Or=25, Dot=26, OpenRoundBracket=27, 
		ClosedRoundBracket=28, OpenCurlyBracket=29, ClosedCurlyBracket=30, Semicolon=31, 
		Comma=32, Class=33, This=34, While=35, If=36, Else=37, For=38, Return=39, 
		New=40, Identifier=41, CharValue=42, IntValue=43, WS=44, InlineComment=45, 
		MultilineComment=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BooleanValue", "NullValue", "AccessModifier", "Void", "Boolean", "Char", 
			"Int", "DotOperator", "LineOperator", "ComparisonOperator", "LogicalOpertor", 
			"Assign", "Plus", "Minus", "Mult", "Div", "Greater", "Less", "GreaterEqual", 
			"LessEqual", "Equal", "NotEqual", "Not", "And", "Or", "Dot", "OpenRoundBracket", 
			"ClosedRoundBracket", "OpenCurlyBracket", "ClosedCurlyBracket", "Semicolon", 
			"Comma", "Class", "This", "While", "If", "Else", "For", "Return", "New", 
			"Alpabetic", "Numeric", "ValidIdentSymbols", "Identifier", "CharValue", 
			"IntValue", "WS", "InlineComment", "MultilineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'null'", null, "'void'", "'boolean'", "'char'", "'int'", 
			null, null, null, null, "'='", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", 
			"'>='", "'<='", "'=='", "'!='", "'!'", "'&&'", "'||'", "'.'", "'('", 
			"')'", "'{'", "'}'", "';'", "','", "'class'", "'this'", "'while'", "'if'", 
			"'else'", "'for'", "'return'", "'new'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BooleanValue", "NullValue", "AccessModifier", "Void", "Boolean", 
			"Char", "Int", "DotOperator", "LineOperator", "ComparisonOperator", "LogicalOpertor", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u014b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\5\2o\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\u008c\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u00a6\n\t\3\n\3\n\5\n\u00aa"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b2\n\13\3\f\3\f\5\f\u00b6\n"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3,\5,\u0117\n,\3-\3-\7-\u011b\n-\f-\16"+
		"-\u011e\13-\3.\3.\3.\3.\3/\5/\u0125\n/\3/\6/\u0128\n/\r/\16/\u0129\3\60"+
		"\6\60\u012d\n\60\r\60\16\60\u012e\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u0137"+
		"\n\61\f\61\16\61\u013a\13\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u0142"+
		"\n\62\f\62\16\62\u0145\13\62\3\62\3\62\3\62\3\62\3\62\3\u0143\2\63\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S\2U\2W\2Y+[,]-_.a/c\60\3\2\7\4\2C\\c|\3\2\62;\4\2"+
		"&&aa\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u015a\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_"+
		"\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3n\3\2\2\2\5p\3\2\2\2\7\u008b\3\2\2\2\t"+
		"\u008d\3\2\2\2\13\u0092\3\2\2\2\r\u009a\3\2\2\2\17\u009f\3\2\2\2\21\u00a5"+
		"\3\2\2\2\23\u00a9\3\2\2\2\25\u00b1\3\2\2\2\27\u00b5\3\2\2\2\31\u00b7\3"+
		"\2\2\2\33\u00b9\3\2\2\2\35\u00bb\3\2\2\2\37\u00bd\3\2\2\2!\u00bf\3\2\2"+
		"\2#\u00c1\3\2\2\2%\u00c3\3\2\2\2\'\u00c5\3\2\2\2)\u00c8\3\2\2\2+\u00cb"+
		"\3\2\2\2-\u00ce\3\2\2\2/\u00d1\3\2\2\2\61\u00d3\3\2\2\2\63\u00d6\3\2\2"+
		"\2\65\u00d9\3\2\2\2\67\u00db\3\2\2\29\u00dd\3\2\2\2;\u00df\3\2\2\2=\u00e1"+
		"\3\2\2\2?\u00e3\3\2\2\2A\u00e5\3\2\2\2C\u00e7\3\2\2\2E\u00ed\3\2\2\2G"+
		"\u00f2\3\2\2\2I\u00f8\3\2\2\2K\u00fb\3\2\2\2M\u0100\3\2\2\2O\u0104\3\2"+
		"\2\2Q\u010b\3\2\2\2S\u010f\3\2\2\2U\u0111\3\2\2\2W\u0116\3\2\2\2Y\u0118"+
		"\3\2\2\2[\u011f\3\2\2\2]\u0124\3\2\2\2_\u012c\3\2\2\2a\u0132\3\2\2\2c"+
		"\u013d\3\2\2\2ef\7v\2\2fg\7t\2\2gh\7w\2\2ho\7g\2\2ij\7h\2\2jk\7c\2\2k"+
		"l\7n\2\2lm\7u\2\2mo\7g\2\2ne\3\2\2\2ni\3\2\2\2o\4\3\2\2\2pq\7p\2\2qr\7"+
		"w\2\2rs\7n\2\2st\7n\2\2t\6\3\2\2\2uv\7r\2\2vw\7w\2\2wx\7d\2\2xy\7n\2\2"+
		"yz\7k\2\2z\u008c\7e\2\2{|\7r\2\2|}\7t\2\2}~\7k\2\2~\177\7x\2\2\177\u0080"+
		"\7c\2\2\u0080\u0081\7v\2\2\u0081\u008c\7g\2\2\u0082\u0083\7r\2\2\u0083"+
		"\u0084\7t\2\2\u0084\u0085\7q\2\2\u0085\u0086\7v\2\2\u0086\u0087\7g\2\2"+
		"\u0087\u0088\7e\2\2\u0088\u0089\7v\2\2\u0089\u008a\7g\2\2\u008a\u008c"+
		"\7f\2\2\u008bu\3\2\2\2\u008b{\3\2\2\2\u008b\u0082\3\2\2\2\u008c\b\3\2"+
		"\2\2\u008d\u008e\7x\2\2\u008e\u008f\7q\2\2\u008f\u0090\7k\2\2\u0090\u0091"+
		"\7f\2\2\u0091\n\3\2\2\2\u0092\u0093\7d\2\2\u0093\u0094\7q\2\2\u0094\u0095"+
		"\7q\2\2\u0095\u0096\7n\2\2\u0096\u0097\7g\2\2\u0097\u0098\7c\2\2\u0098"+
		"\u0099\7p\2\2\u0099\f\3\2\2\2\u009a\u009b\7e\2\2\u009b\u009c\7j\2\2\u009c"+
		"\u009d\7c\2\2\u009d\u009e\7t\2\2\u009e\16\3\2\2\2\u009f\u00a0\7k\2\2\u00a0"+
		"\u00a1\7p\2\2\u00a1\u00a2\7v\2\2\u00a2\20\3\2\2\2\u00a3\u00a6\5\37\20"+
		"\2\u00a4\u00a6\5!\21\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\22"+
		"\3\2\2\2\u00a7\u00aa\5\33\16\2\u00a8\u00aa\5\35\17\2\u00a9\u00a7\3\2\2"+
		"\2\u00a9\u00a8\3\2\2\2\u00aa\24\3\2\2\2\u00ab\u00b2\5#\22\2\u00ac\u00b2"+
		"\5%\23\2\u00ad\u00b2\5\'\24\2\u00ae\u00b2\5)\25\2\u00af\u00b2\5+\26\2"+
		"\u00b0\u00b2\5-\27\2\u00b1\u00ab\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00ad"+
		"\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\26\3\2\2\2\u00b3\u00b6\5\61\31\2\u00b4\u00b6\5\63\32\2\u00b5\u00b3\3"+
		"\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\30\3\2\2\2\u00b7\u00b8\7?\2\2\u00b8\32"+
		"\3\2\2\2\u00b9\u00ba\7-\2\2\u00ba\34\3\2\2\2\u00bb\u00bc\7/\2\2\u00bc"+
		"\36\3\2\2\2\u00bd\u00be\7,\2\2\u00be \3\2\2\2\u00bf\u00c0\7\61\2\2\u00c0"+
		"\"\3\2\2\2\u00c1\u00c2\7@\2\2\u00c2$\3\2\2\2\u00c3\u00c4\7>\2\2\u00c4"+
		"&\3\2\2\2\u00c5\u00c6\7@\2\2\u00c6\u00c7\7?\2\2\u00c7(\3\2\2\2\u00c8\u00c9"+
		"\7>\2\2\u00c9\u00ca\7?\2\2\u00ca*\3\2\2\2\u00cb\u00cc\7?\2\2\u00cc\u00cd"+
		"\7?\2\2\u00cd,\3\2\2\2\u00ce\u00cf\7#\2\2\u00cf\u00d0\7?\2\2\u00d0.\3"+
		"\2\2\2\u00d1\u00d2\7#\2\2\u00d2\60\3\2\2\2\u00d3\u00d4\7(\2\2\u00d4\u00d5"+
		"\7(\2\2\u00d5\62\3\2\2\2\u00d6\u00d7\7~\2\2\u00d7\u00d8\7~\2\2\u00d8\64"+
		"\3\2\2\2\u00d9\u00da\7\60\2\2\u00da\66\3\2\2\2\u00db\u00dc\7*\2\2\u00dc"+
		"8\3\2\2\2\u00dd\u00de\7+\2\2\u00de:\3\2\2\2\u00df\u00e0\7}\2\2\u00e0<"+
		"\3\2\2\2\u00e1\u00e2\7\177\2\2\u00e2>\3\2\2\2\u00e3\u00e4\7=\2\2\u00e4"+
		"@\3\2\2\2\u00e5\u00e6\7.\2\2\u00e6B\3\2\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9"+
		"\7n\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7u\2\2\u00ec"+
		"D\3\2\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7j\2\2\u00ef\u00f0\7k\2\2\u00f0"+
		"\u00f1\7u\2\2\u00f1F\3\2\2\2\u00f2\u00f3\7y\2\2\u00f3\u00f4\7j\2\2\u00f4"+
		"\u00f5\7k\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7g\2\2\u00f7H\3\2\2\2\u00f8"+
		"\u00f9\7k\2\2\u00f9\u00fa\7h\2\2\u00faJ\3\2\2\2\u00fb\u00fc\7g\2\2\u00fc"+
		"\u00fd\7n\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff\7g\2\2\u00ffL\3\2\2\2\u0100"+
		"\u0101\7h\2\2\u0101\u0102\7q\2\2\u0102\u0103\7t\2\2\u0103N\3\2\2\2\u0104"+
		"\u0105\7t\2\2\u0105\u0106\7g\2\2\u0106\u0107\7v\2\2\u0107\u0108\7w\2\2"+
		"\u0108\u0109\7t\2\2\u0109\u010a\7p\2\2\u010aP\3\2\2\2\u010b\u010c\7p\2"+
		"\2\u010c\u010d\7g\2\2\u010d\u010e\7y\2\2\u010eR\3\2\2\2\u010f\u0110\t"+
		"\2\2\2\u0110T\3\2\2\2\u0111\u0112\t\3\2\2\u0112V\3\2\2\2\u0113\u0117\5"+
		"S*\2\u0114\u0117\5U+\2\u0115\u0117\t\4\2\2\u0116\u0113\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0115\3\2\2\2\u0117X\3\2\2\2\u0118\u011c\5S*\2\u0119\u011b"+
		"\5W,\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011dZ\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7)\2\2\u0120"+
		"\u0121\5S*\2\u0121\u0122\7)\2\2\u0122\\\3\2\2\2\u0123\u0125\5\35\17\2"+
		"\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0128"+
		"\5U+\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a^\3\2\2\2\u012b\u012d\t\5\2\2\u012c\u012b\3\2\2\2"+
		"\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0131\b\60\2\2\u0131`\3\2\2\2\u0132\u0133\7\61\2\2\u0133"+
		"\u0134\7\61\2\2\u0134\u0138\3\2\2\2\u0135\u0137\n\6\2\2\u0136\u0135\3"+
		"\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\b\61\2\2\u013cb\3\2\2\2"+
		"\u013d\u013e\7\61\2\2\u013e\u013f\7,\2\2\u013f\u0143\3\2\2\2\u0140\u0142"+
		"\13\2\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0144\3\2\2\2"+
		"\u0143\u0141\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147"+
		"\7,\2\2\u0147\u0148\7\61\2\2\u0148\u0149\3\2\2\2\u0149\u014a\b\62\2\2"+
		"\u014ad\3\2\2\2\20\2n\u008b\u00a5\u00a9\u00b1\u00b5\u0116\u011c\u0124"+
		"\u0129\u012e\u0138\u0143\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}