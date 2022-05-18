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
		AccessModifier=1, Void=2, Boolean=3, Char=4, Int=5, DotOperator=6, LineOperator=7, 
		ComparisonOperator=8, LogicalOpertor=9, Assign=10, Plus=11, Minus=12, 
		Mult=13, Div=14, Greater=15, Less=16, GreaterEqual=17, LessEqual=18, Equal=19, 
		NotEqual=20, Not=21, And=22, Or=23, Dot=24, OpenRoundBracket=25, ClosedRoundBracket=26, 
		OpenCurlyBracket=27, ClosedCurlyBracket=28, Semicolon=29, Comma=30, Class=31, 
		This=32, While=33, If=34, Else=35, For=36, Return=37, New=38, Identifier=39, 
		BooleanValue=40, CharValue=41, IntValue=42, WS=43, InlineComment=44, MultilineComment=45;
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
			"Not", "And", "Or", "Dot", "OpenRoundBracket", "ClosedRoundBracket", 
			"OpenCurlyBracket", "ClosedCurlyBracket", "Semicolon", "Comma", "Class", 
			"This", "While", "If", "Else", "For", "Return", "New", "Alpabetic", "Numeric", 
			"ValidIdentSymbols", "Identifier", "BooleanValue", "CharValue", "IntValue", 
			"WS", "InlineComment", "MultilineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'void'", "'boolean'", "'char'", "'int'", null, null, null, 
			null, "'='", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'!='", "'!'", "'&&'", "'||'", "'.'", "'('", "')'", "'{'", "'}'", 
			"';'", "','", "'class'", "'this'", "'while'", "'if'", "'else'", "'for'", 
			"'return'", "'new'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AccessModifier", "Void", "Boolean", "Char", "Int", "DotOperator", 
			"LineOperator", "ComparisonOperator", "LogicalOpertor", "Assign", "Plus", 
			"Minus", "Mult", "Div", "Greater", "Less", "GreaterEqual", "LessEqual", 
			"Equal", "NotEqual", "Not", "And", "Or", "Dot", "OpenRoundBracket", "ClosedRoundBracket", 
			"OpenCurlyBracket", "ClosedCurlyBracket", "Semicolon", "Comma", "Class", 
			"This", "While", "If", "Else", "For", "Return", "New", "Identifier", 
			"BooleanValue", "CharValue", "IntValue", "WS", "InlineComment", "MultilineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0142\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2z\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7\u0094\n\7\3\b\3\b\5\b\u0098\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u00a0\n\t\3\n\3\n\5\n\u00a4\n\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3*\5*\u0105\n*\3+\3+\7+\u0109\n+\f+\16+\u010c\13+\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0117\n,\3-\3-\3.\5.\u011c\n.\3.\6.\u011f"+
		"\n.\r.\16.\u0120\3/\6/\u0124\n/\r/\16/\u0125\3/\3/\3\60\3\60\3\60\3\60"+
		"\7\60\u012e\n\60\f\60\16\60\u0131\13\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\7\61\u0139\n\61\f\61\16\61\u013c\13\61\3\61\3\61\3\61\3\61\3\61\3\u013a"+
		"\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O\2Q\2S\2U)W*Y+[,]-_.a/\3\2\7\4\2C\\c|\3\2\62"+
		";\4\2&&aa\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0151\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\3y\3\2\2\2\5{\3\2\2\2\7\u0080\3\2\2\2\t\u0088\3\2"+
		"\2\2\13\u008d\3\2\2\2\r\u0093\3\2\2\2\17\u0097\3\2\2\2\21\u009f\3\2\2"+
		"\2\23\u00a3\3\2\2\2\25\u00a5\3\2\2\2\27\u00a7\3\2\2\2\31\u00a9\3\2\2\2"+
		"\33\u00ab\3\2\2\2\35\u00ad\3\2\2\2\37\u00af\3\2\2\2!\u00b1\3\2\2\2#\u00b3"+
		"\3\2\2\2%\u00b6\3\2\2\2\'\u00b9\3\2\2\2)\u00bc\3\2\2\2+\u00bf\3\2\2\2"+
		"-\u00c1\3\2\2\2/\u00c4\3\2\2\2\61\u00c7\3\2\2\2\63\u00c9\3\2\2\2\65\u00cb"+
		"\3\2\2\2\67\u00cd\3\2\2\29\u00cf\3\2\2\2;\u00d1\3\2\2\2=\u00d3\3\2\2\2"+
		"?\u00d5\3\2\2\2A\u00db\3\2\2\2C\u00e0\3\2\2\2E\u00e6\3\2\2\2G\u00e9\3"+
		"\2\2\2I\u00ee\3\2\2\2K\u00f2\3\2\2\2M\u00f9\3\2\2\2O\u00fd\3\2\2\2Q\u00ff"+
		"\3\2\2\2S\u0104\3\2\2\2U\u0106\3\2\2\2W\u0116\3\2\2\2Y\u0118\3\2\2\2["+
		"\u011b\3\2\2\2]\u0123\3\2\2\2_\u0129\3\2\2\2a\u0134\3\2\2\2cd\7r\2\2d"+
		"e\7w\2\2ef\7d\2\2fg\7n\2\2gh\7k\2\2hz\7e\2\2ij\7r\2\2jk\7t\2\2kl\7k\2"+
		"\2lm\7x\2\2mn\7c\2\2no\7v\2\2oz\7g\2\2pq\7r\2\2qr\7t\2\2rs\7q\2\2st\7"+
		"v\2\2tu\7g\2\2uv\7e\2\2vw\7v\2\2wx\7g\2\2xz\7f\2\2yc\3\2\2\2yi\3\2\2\2"+
		"yp\3\2\2\2z\4\3\2\2\2{|\7x\2\2|}\7q\2\2}~\7k\2\2~\177\7f\2\2\177\6\3\2"+
		"\2\2\u0080\u0081\7d\2\2\u0081\u0082\7q\2\2\u0082\u0083\7q\2\2\u0083\u0084"+
		"\7n\2\2\u0084\u0085\7g\2\2\u0085\u0086\7c\2\2\u0086\u0087\7p\2\2\u0087"+
		"\b\3\2\2\2\u0088\u0089\7e\2\2\u0089\u008a\7j\2\2\u008a\u008b\7c\2\2\u008b"+
		"\u008c\7t\2\2\u008c\n\3\2\2\2\u008d\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f"+
		"\u0090\7v\2\2\u0090\f\3\2\2\2\u0091\u0094\5\33\16\2\u0092\u0094\5\35\17"+
		"\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\16\3\2\2\2\u0095\u0098"+
		"\5\27\f\2\u0096\u0098\5\31\r\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2"+
		"\u0098\20\3\2\2\2\u0099\u00a0\5\37\20\2\u009a\u00a0\5!\21\2\u009b\u00a0"+
		"\5#\22\2\u009c\u00a0\5%\23\2\u009d\u00a0\5\'\24\2\u009e\u00a0\5)\25\2"+
		"\u009f\u0099\3\2\2\2\u009f\u009a\3\2\2\2\u009f\u009b\3\2\2\2\u009f\u009c"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\22\3\2\2\2\u00a1"+
		"\u00a4\5-\27\2\u00a2\u00a4\5/\30\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2"+
		"\2\2\u00a4\24\3\2\2\2\u00a5\u00a6\7?\2\2\u00a6\26\3\2\2\2\u00a7\u00a8"+
		"\7-\2\2\u00a8\30\3\2\2\2\u00a9\u00aa\7/\2\2\u00aa\32\3\2\2\2\u00ab\u00ac"+
		"\7,\2\2\u00ac\34\3\2\2\2\u00ad\u00ae\7\61\2\2\u00ae\36\3\2\2\2\u00af\u00b0"+
		"\7@\2\2\u00b0 \3\2\2\2\u00b1\u00b2\7>\2\2\u00b2\"\3\2\2\2\u00b3\u00b4"+
		"\7@\2\2\u00b4\u00b5\7?\2\2\u00b5$\3\2\2\2\u00b6\u00b7\7>\2\2\u00b7\u00b8"+
		"\7?\2\2\u00b8&\3\2\2\2\u00b9\u00ba\7?\2\2\u00ba\u00bb\7?\2\2\u00bb(\3"+
		"\2\2\2\u00bc\u00bd\7#\2\2\u00bd\u00be\7?\2\2\u00be*\3\2\2\2\u00bf\u00c0"+
		"\7#\2\2\u00c0,\3\2\2\2\u00c1\u00c2\7(\2\2\u00c2\u00c3\7(\2\2\u00c3.\3"+
		"\2\2\2\u00c4\u00c5\7~\2\2\u00c5\u00c6\7~\2\2\u00c6\60\3\2\2\2\u00c7\u00c8"+
		"\7\60\2\2\u00c8\62\3\2\2\2\u00c9\u00ca\7*\2\2\u00ca\64\3\2\2\2\u00cb\u00cc"+
		"\7+\2\2\u00cc\66\3\2\2\2\u00cd\u00ce\7}\2\2\u00ce8\3\2\2\2\u00cf\u00d0"+
		"\7\177\2\2\u00d0:\3\2\2\2\u00d1\u00d2\7=\2\2\u00d2<\3\2\2\2\u00d3\u00d4"+
		"\7.\2\2\u00d4>\3\2\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8"+
		"\7c\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7u\2\2\u00da@\3\2\2\2\u00db\u00dc"+
		"\7v\2\2\u00dc\u00dd\7j\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7u\2\2\u00df"+
		"B\3\2\2\2\u00e0\u00e1\7y\2\2\u00e1\u00e2\7j\2\2\u00e2\u00e3\7k\2\2\u00e3"+
		"\u00e4\7n\2\2\u00e4\u00e5\7g\2\2\u00e5D\3\2\2\2\u00e6\u00e7\7k\2\2\u00e7"+
		"\u00e8\7h\2\2\u00e8F\3\2\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7n\2\2\u00eb"+
		"\u00ec\7u\2\2\u00ec\u00ed\7g\2\2\u00edH\3\2\2\2\u00ee\u00ef\7h\2\2\u00ef"+
		"\u00f0\7q\2\2\u00f0\u00f1\7t\2\2\u00f1J\3\2\2\2\u00f2\u00f3\7t\2\2\u00f3"+
		"\u00f4\7g\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7t\2\2"+
		"\u00f7\u00f8\7p\2\2\u00f8L\3\2\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7g\2"+
		"\2\u00fb\u00fc\7y\2\2\u00fcN\3\2\2\2\u00fd\u00fe\t\2\2\2\u00feP\3\2\2"+
		"\2\u00ff\u0100\t\3\2\2\u0100R\3\2\2\2\u0101\u0105\5O(\2\u0102\u0105\5"+
		"Q)\2\u0103\u0105\t\4\2\2\u0104\u0101\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0103\3\2\2\2\u0105T\3\2\2\2\u0106\u010a\5O(\2\u0107\u0109\5S*\2\u0108"+
		"\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010bV\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7v\2\2\u010e\u010f"+
		"\7t\2\2\u010f\u0110\7w\2\2\u0110\u0117\7g\2\2\u0111\u0112\7h\2\2\u0112"+
		"\u0113\7c\2\2\u0113\u0114\7n\2\2\u0114\u0115\7u\2\2\u0115\u0117\7g\2\2"+
		"\u0116\u010d\3\2\2\2\u0116\u0111\3\2\2\2\u0117X\3\2\2\2\u0118\u0119\5"+
		"O(\2\u0119Z\3\2\2\2\u011a\u011c\5\31\r\2\u011b\u011a\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011f\5Q)\2\u011e\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\\\3\2\2\2"+
		"\u0122\u0124\t\5\2\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\b/\2\2\u0128"+
		"^\3\2\2\2\u0129\u012a\7\61\2\2\u012a\u012b\7\61\2\2\u012b\u012f\3\2\2"+
		"\2\u012c\u012e\n\6\2\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132"+
		"\u0133\b\60\2\2\u0133`\3\2\2\2\u0134\u0135\7\61\2\2\u0135\u0136\7,\2\2"+
		"\u0136\u013a\3\2\2\2\u0137\u0139\13\2\2\2\u0138\u0137\3\2\2\2\u0139\u013c"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013d\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013d\u013e\7,\2\2\u013e\u013f\7\61\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0141\b\61\2\2\u0141b\3\2\2\2\20\2y\u0093\u0097\u009f\u00a3"+
		"\u0104\u010a\u0116\u011b\u0120\u0125\u012f\u013a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}