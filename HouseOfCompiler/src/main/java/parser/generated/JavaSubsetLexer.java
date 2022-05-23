// Generated from D:/Raqha/Dokumente/DHBW_Vorlesungen/TheoInf/CUM/HouseOfCompiler/src/main/java/parser/grammar\JavaSubset.g4 by ANTLR 4.9.2
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
		Assign=12, Plus=13, Minus=14, Mult=15, Modulo=16, Div=17, Greater=18, 
		Less=19, GreaterEqual=20, LessEqual=21, Equal=22, NotEqual=23, Not=24, 
		And=25, Or=26, Dot=27, OpenRoundBracket=28, ClosedRoundBracket=29, OpenCurlyBracket=30, 
		ClosedCurlyBracket=31, Semicolon=32, Comma=33, Class=34, This=35, While=36, 
		If=37, Else=38, For=39, Return=40, New=41, Identifier=42, CharValue=43, 
		StringValue=44, IntValue=45, WS=46, InlineComment=47, MultilineComment=48;
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
			"Assign", "Plus", "Minus", "Mult", "Modulo", "Div", "Greater", "Less", 
			"GreaterEqual", "LessEqual", "Equal", "NotEqual", "Not", "And", "Or", 
			"Dot", "OpenRoundBracket", "ClosedRoundBracket", "OpenCurlyBracket", 
			"ClosedCurlyBracket", "Semicolon", "Comma", "Class", "This", "While", 
			"If", "Else", "For", "Return", "New", "Alpabetic", "Numeric", "ValidIdentSymbols", 
			"Identifier", "CharValue", "StringValue", "IntValue", "WS", "InlineComment", 
			"MultilineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'null'", null, "'void'", "'boolean'", "'char'", "'int'", 
			null, null, null, null, "'='", "'+'", "'-'", "'*'", "'%'", "'/'", "'>'", 
			"'<'", "'>='", "'<='", "'=='", "'!='", "'!'", "'&&'", "'||'", "'.'", 
			"'('", "')'", "'{'", "'}'", "';'", "','", "'class'", "'this'", "'while'", 
			"'if'", "'else'", "'for'", "'return'", "'new'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BooleanValue", "NullValue", "AccessModifier", "Void", "Boolean", 
			"Char", "Int", "DotOperator", "LineOperator", "ComparisonOperator", "LogicalOpertor", 
			"Assign", "Plus", "Minus", "Mult", "Modulo", "Div", "Greater", "Less", 
			"GreaterEqual", "LessEqual", "Equal", "NotEqual", "Not", "And", "Or", 
			"Dot", "OpenRoundBracket", "ClosedRoundBracket", "OpenCurlyBracket", 
			"ClosedCurlyBracket", "Semicolon", "Comma", "Class", "This", "While", 
			"If", "Else", "For", "Return", "New", "Identifier", "CharValue", "StringValue", 
			"IntValue", "WS", "InlineComment", "MultilineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u015d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2s\n\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4\u0090\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u00ab"+
		"\n\t\3\n\3\n\5\n\u00af\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b7\n"+
		"\13\3\f\3\f\5\f\u00bb\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3("+
		"\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3-\5-\u011e"+
		"\n-\3.\3.\7.\u0122\n.\f.\16.\u0125\13.\3/\3/\5/\u0129\n/\3/\3/\3\60\3"+
		"\60\7\60\u012f\n\60\f\60\16\60\u0132\13\60\3\60\3\60\3\61\5\61\u0137\n"+
		"\61\3\61\6\61\u013a\n\61\r\61\16\61\u013b\3\62\6\62\u013f\n\62\r\62\16"+
		"\62\u0140\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u0149\n\63\f\63\16\63\u014c"+
		"\13\63\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u0154\n\64\f\64\16\64\u0157"+
		"\13\64\3\64\3\64\3\64\3\64\3\64\3\u0155\2\65\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U\2W\2Y\2[,]-_.a/c\60e\61g\62\3\2\7\4\2C\\c|\3\2\62;\4\2&&aa\4\2\f\f"+
		"\17\17\5\2\13\f\17\17\"\"\2\u016f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3r\3\2\2\2\5t\3\2\2\2\7\u008f"+
		"\3\2\2\2\t\u0091\3\2\2\2\13\u0096\3\2\2\2\r\u009e\3\2\2\2\17\u00a3\3\2"+
		"\2\2\21\u00aa\3\2\2\2\23\u00ae\3\2\2\2\25\u00b6\3\2\2\2\27\u00ba\3\2\2"+
		"\2\31\u00bc\3\2\2\2\33\u00be\3\2\2\2\35\u00c0\3\2\2\2\37\u00c2\3\2\2\2"+
		"!\u00c4\3\2\2\2#\u00c6\3\2\2\2%\u00c8\3\2\2\2\'\u00ca\3\2\2\2)\u00cc\3"+
		"\2\2\2+\u00cf\3\2\2\2-\u00d2\3\2\2\2/\u00d5\3\2\2\2\61\u00d8\3\2\2\2\63"+
		"\u00da\3\2\2\2\65\u00dd\3\2\2\2\67\u00e0\3\2\2\29\u00e2\3\2\2\2;\u00e4"+
		"\3\2\2\2=\u00e6\3\2\2\2?\u00e8\3\2\2\2A\u00ea\3\2\2\2C\u00ec\3\2\2\2E"+
		"\u00ee\3\2\2\2G\u00f4\3\2\2\2I\u00f9\3\2\2\2K\u00ff\3\2\2\2M\u0102\3\2"+
		"\2\2O\u0107\3\2\2\2Q\u010b\3\2\2\2S\u0112\3\2\2\2U\u0116\3\2\2\2W\u0118"+
		"\3\2\2\2Y\u011d\3\2\2\2[\u011f\3\2\2\2]\u0126\3\2\2\2_\u012c\3\2\2\2a"+
		"\u0136\3\2\2\2c\u013e\3\2\2\2e\u0144\3\2\2\2g\u014f\3\2\2\2ij\7v\2\2j"+
		"k\7t\2\2kl\7w\2\2ls\7g\2\2mn\7h\2\2no\7c\2\2op\7n\2\2pq\7u\2\2qs\7g\2"+
		"\2ri\3\2\2\2rm\3\2\2\2s\4\3\2\2\2tu\7p\2\2uv\7w\2\2vw\7n\2\2wx\7n\2\2"+
		"x\6\3\2\2\2yz\7r\2\2z{\7w\2\2{|\7d\2\2|}\7n\2\2}~\7k\2\2~\u0090\7e\2\2"+
		"\177\u0080\7r\2\2\u0080\u0081\7t\2\2\u0081\u0082\7k\2\2\u0082\u0083\7"+
		"x\2\2\u0083\u0084\7c\2\2\u0084\u0085\7v\2\2\u0085\u0090\7g\2\2\u0086\u0087"+
		"\7r\2\2\u0087\u0088\7t\2\2\u0088\u0089\7q\2\2\u0089\u008a\7v\2\2\u008a"+
		"\u008b\7g\2\2\u008b\u008c\7e\2\2\u008c\u008d\7v\2\2\u008d\u008e\7g\2\2"+
		"\u008e\u0090\7f\2\2\u008fy\3\2\2\2\u008f\177\3\2\2\2\u008f\u0086\3\2\2"+
		"\2\u0090\b\3\2\2\2\u0091\u0092\7x\2\2\u0092\u0093\7q\2\2\u0093\u0094\7"+
		"k\2\2\u0094\u0095\7f\2\2\u0095\n\3\2\2\2\u0096\u0097\7d\2\2\u0097\u0098"+
		"\7q\2\2\u0098\u0099\7q\2\2\u0099\u009a\7n\2\2\u009a\u009b\7g\2\2\u009b"+
		"\u009c\7c\2\2\u009c\u009d\7p\2\2\u009d\f\3\2\2\2\u009e\u009f\7e\2\2\u009f"+
		"\u00a0\7j\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7t\2\2\u00a2\16\3\2\2\2\u00a3"+
		"\u00a4\7k\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7v\2\2\u00a6\20\3\2\2\2\u00a7"+
		"\u00ab\5\37\20\2\u00a8\u00ab\5#\22\2\u00a9\u00ab\5!\21\2\u00aa\u00a7\3"+
		"\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\22\3\2\2\2\u00ac"+
		"\u00af\5\33\16\2\u00ad\u00af\5\35\17\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad"+
		"\3\2\2\2\u00af\24\3\2\2\2\u00b0\u00b7\5%\23\2\u00b1\u00b7\5\'\24\2\u00b2"+
		"\u00b7\5)\25\2\u00b3\u00b7\5+\26\2\u00b4\u00b7\5-\27\2\u00b5\u00b7\5/"+
		"\30\2\u00b6\u00b0\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b6"+
		"\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\26\3\2\2"+
		"\2\u00b8\u00bb\5\63\32\2\u00b9\u00bb\5\65\33\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\30\3\2\2\2\u00bc\u00bd\7?\2\2\u00bd\32\3\2\2\2\u00be"+
		"\u00bf\7-\2\2\u00bf\34\3\2\2\2\u00c0\u00c1\7/\2\2\u00c1\36\3\2\2\2\u00c2"+
		"\u00c3\7,\2\2\u00c3 \3\2\2\2\u00c4\u00c5\7\'\2\2\u00c5\"\3\2\2\2\u00c6"+
		"\u00c7\7\61\2\2\u00c7$\3\2\2\2\u00c8\u00c9\7@\2\2\u00c9&\3\2\2\2\u00ca"+
		"\u00cb\7>\2\2\u00cb(\3\2\2\2\u00cc\u00cd\7@\2\2\u00cd\u00ce\7?\2\2\u00ce"+
		"*\3\2\2\2\u00cf\u00d0\7>\2\2\u00d0\u00d1\7?\2\2\u00d1,\3\2\2\2\u00d2\u00d3"+
		"\7?\2\2\u00d3\u00d4\7?\2\2\u00d4.\3\2\2\2\u00d5\u00d6\7#\2\2\u00d6\u00d7"+
		"\7?\2\2\u00d7\60\3\2\2\2\u00d8\u00d9\7#\2\2\u00d9\62\3\2\2\2\u00da\u00db"+
		"\7(\2\2\u00db\u00dc\7(\2\2\u00dc\64\3\2\2\2\u00dd\u00de\7~\2\2\u00de\u00df"+
		"\7~\2\2\u00df\66\3\2\2\2\u00e0\u00e1\7\60\2\2\u00e18\3\2\2\2\u00e2\u00e3"+
		"\7*\2\2\u00e3:\3\2\2\2\u00e4\u00e5\7+\2\2\u00e5<\3\2\2\2\u00e6\u00e7\7"+
		"}\2\2\u00e7>\3\2\2\2\u00e8\u00e9\7\177\2\2\u00e9@\3\2\2\2\u00ea\u00eb"+
		"\7=\2\2\u00ebB\3\2\2\2\u00ec\u00ed\7.\2\2\u00edD\3\2\2\2\u00ee\u00ef\7"+
		"e\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3"+
		"\7u\2\2\u00f3F\3\2\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7j\2\2\u00f6\u00f7"+
		"\7k\2\2\u00f7\u00f8\7u\2\2\u00f8H\3\2\2\2\u00f9\u00fa\7y\2\2\u00fa\u00fb"+
		"\7j\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7g\2\2\u00fe"+
		"J\3\2\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7h\2\2\u0101L\3\2\2\2\u0102\u0103"+
		"\7g\2\2\u0103\u0104\7n\2\2\u0104\u0105\7u\2\2\u0105\u0106\7g\2\2\u0106"+
		"N\3\2\2\2\u0107\u0108\7h\2\2\u0108\u0109\7q\2\2\u0109\u010a\7t\2\2\u010a"+
		"P\3\2\2\2\u010b\u010c\7t\2\2\u010c\u010d\7g\2\2\u010d\u010e\7v\2\2\u010e"+
		"\u010f\7w\2\2\u010f\u0110\7t\2\2\u0110\u0111\7p\2\2\u0111R\3\2\2\2\u0112"+
		"\u0113\7p\2\2\u0113\u0114\7g\2\2\u0114\u0115\7y\2\2\u0115T\3\2\2\2\u0116"+
		"\u0117\t\2\2\2\u0117V\3\2\2\2\u0118\u0119\t\3\2\2\u0119X\3\2\2\2\u011a"+
		"\u011e\5U+\2\u011b\u011e\5W,\2\u011c\u011e\t\4\2\2\u011d\u011a\3\2\2\2"+
		"\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011eZ\3\2\2\2\u011f\u0123\5"+
		"U+\2\u0120\u0122\5Y-\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\\\3\2\2\2\u0125\u0123\3\2\2\2\u0126"+
		"\u0128\7)\2\2\u0127\u0129\n\5\2\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012b\7)\2\2\u012b^\3\2\2\2\u012c\u0130"+
		"\7$\2\2\u012d\u012f\n\5\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0133\u0134\7$\2\2\u0134`\3\2\2\2\u0135\u0137\5\35\17\2\u0136\u0135"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u013a\5W,\2\u0139"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013cb\3\2\2\2\u013d\u013f\t\6\2\2\u013e\u013d\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0143\b\62\2\2\u0143d\3\2\2\2\u0144\u0145\7\61\2\2\u0145\u0146\7\61\2"+
		"\2\u0146\u014a\3\2\2\2\u0147\u0149\n\5\2\2\u0148\u0147\3\2\2\2\u0149\u014c"+
		"\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014d\u014e\b\63\2\2\u014ef\3\2\2\2\u014f\u0150\7\61\2"+
		"\2\u0150\u0151\7,\2\2\u0151\u0155\3\2\2\2\u0152\u0154\13\2\2\2\u0153\u0152"+
		"\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156"+
		"\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7,\2\2\u0159\u015a\7\61"+
		"\2\2\u015a\u015b\3\2\2\2\u015b\u015c\b\64\2\2\u015ch\3\2\2\2\22\2r\u008f"+
		"\u00aa\u00ae\u00b6\u00ba\u011d\u0123\u0128\u0130\u0136\u013b\u0140\u014a"+
		"\u0155\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}