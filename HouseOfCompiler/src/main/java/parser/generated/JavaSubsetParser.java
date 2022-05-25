// Generated from C:/Users/lukas/Documents/Git-Repositories/houseofcompiler/HouseOfCompiler/src/main/java/parser/grammar\JavaSubset.g4 by ANTLR 4.9.2
package parser.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaSubsetParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_classdecl = 1, RULE_constuctorDecl = 2, RULE_methodDecl = 3, 
		RULE_fieldDecl = 4, RULE_parameterList = 5, RULE_parameter = 6, RULE_argumentList = 7, 
		RULE_expression = 8, RULE_subExpression = 9, RULE_methodCall = 10, RULE_statement = 11, 
		RULE_stmtExpr = 12, RULE_notExpr = 13, RULE_crementExpr = 14, RULE_incExpr = 15, 
		RULE_preIncExpr = 16, RULE_sufIncExpr = 17, RULE_decExpr = 18, RULE_preDecExpr = 19, 
		RULE_sufDecExpr = 20, RULE_assignableExpr = 21, RULE_instVar = 22, RULE_binaryExpr = 23, 
		RULE_calcExpr = 24, RULE_dotExpr = 25, RULE_dotSubExpr = 26, RULE_nonCalcExpr = 27, 
		RULE_nonCalcOperator = 28, RULE_returnStmt = 29, RULE_localVarDecl = 30, 
		RULE_block = 31, RULE_whileStmt = 32, RULE_forStmt = 33, RULE_ifElseStmt = 34, 
		RULE_ifStmt = 35, RULE_elseStmt = 36, RULE_assign = 37, RULE_newDecl = 38, 
		RULE_receiver = 39, RULE_receivingMethod = 40, RULE_type = 41, RULE_value = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classdecl", "constuctorDecl", "methodDecl", "fieldDecl", 
			"parameterList", "parameter", "argumentList", "expression", "subExpression", 
			"methodCall", "statement", "stmtExpr", "notExpr", "crementExpr", "incExpr", 
			"preIncExpr", "sufIncExpr", "decExpr", "preDecExpr", "sufDecExpr", "assignableExpr", 
			"instVar", "binaryExpr", "calcExpr", "dotExpr", "dotSubExpr", "nonCalcExpr", 
			"nonCalcOperator", "returnStmt", "localVarDecl", "block", "whileStmt", 
			"forStmt", "ifElseStmt", "ifStmt", "elseStmt", "assign", "newDecl", "receiver", 
			"receivingMethod", "type", "value"
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

	@Override
	public String getGrammarFileName() { return "JavaSubset.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaSubsetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<ClassdeclContext> classdecl() {
			return getRuleContexts(ClassdeclContext.class);
		}
		public ClassdeclContext classdecl(int i) {
			return getRuleContext(ClassdeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				classdecl();
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Class );
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

	public static class ClassdeclContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(JavaSubsetParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(JavaSubsetParser.Identifier, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(JavaSubsetParser.OpenCurlyBracket, 0); }
		public TerminalNode ClosedCurlyBracket() { return getToken(JavaSubsetParser.ClosedCurlyBracket, 0); }
		public List<ConstuctorDeclContext> constuctorDecl() {
			return getRuleContexts(ConstuctorDeclContext.class);
		}
		public ConstuctorDeclContext constuctorDecl(int i) {
			return getRuleContext(ConstuctorDeclContext.class,i);
		}
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ClassdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterClassdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitClassdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitClassdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdeclContext classdecl() throws RecognitionException {
		ClassdeclContext _localctx = new ClassdeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(Class);
			setState(92);
			match(Identifier);
			setState(93);
			match(OpenCurlyBracket);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AccessModifier) | (1L << MainMethodDecl) | (1L << Void) | (1L << Boolean) | (1L << Char) | (1L << Int) | (1L << Identifier))) != 0)) {
				{
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(94);
					constuctorDecl();
					}
					break;
				case 2:
					{
					setState(95);
					fieldDecl();
					}
					break;
				case 3:
					{
					setState(96);
					methodDecl();
					}
					break;
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(ClosedCurlyBracket);
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

	public static class ConstuctorDeclContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaSubsetParser.Identifier, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JavaSubsetParser.OpenRoundBracket, 0); }
		public TerminalNode ClosedRoundBracket() { return getToken(JavaSubsetParser.ClosedRoundBracket, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode AccessModifier() { return getToken(JavaSubsetParser.AccessModifier, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ConstuctorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constuctorDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterConstuctorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitConstuctorDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitConstuctorDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstuctorDeclContext constuctorDecl() throws RecognitionException {
		ConstuctorDeclContext _localctx = new ConstuctorDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constuctorDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(104);
				match(AccessModifier);
				}
			}

			setState(107);
			match(Identifier);
			setState(108);
			match(OpenRoundBracket);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Char) | (1L << Int) | (1L << Identifier))) != 0)) {
				{
				setState(109);
				parameterList();
				}
			}

			setState(112);
			match(ClosedRoundBracket);
			setState(113);
			block();
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

	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode MainMethodDecl() { return getToken(JavaSubsetParser.MainMethodDecl, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaSubsetParser.Identifier, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JavaSubsetParser.OpenRoundBracket, 0); }
		public TerminalNode ClosedRoundBracket() { return getToken(JavaSubsetParser.ClosedRoundBracket, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Void() { return getToken(JavaSubsetParser.Void, 0); }
		public TerminalNode AccessModifier() { return getToken(JavaSubsetParser.AccessModifier, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodDecl);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MainMethodDecl:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(MainMethodDecl);
				setState(116);
				block();
				}
				break;
			case AccessModifier:
			case Void:
			case Boolean:
			case Char:
			case Int:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AccessModifier) {
					{
					setState(117);
					match(AccessModifier);
					}
				}

				setState(122);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Boolean:
				case Char:
				case Int:
				case Identifier:
					{
					setState(120);
					type();
					}
					break;
				case Void:
					{
					setState(121);
					match(Void);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(124);
				match(Identifier);
				setState(125);
				match(OpenRoundBracket);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Char) | (1L << Int) | (1L << Identifier))) != 0)) {
					{
					setState(126);
					parameterList();
					}
				}

				setState(129);
				match(ClosedRoundBracket);
				setState(130);
				block();
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

	public static class FieldDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaSubsetParser.Identifier, 0); }
		public TerminalNode Semicolon() { return getToken(JavaSubsetParser.Semicolon, 0); }
		public TerminalNode AccessModifier() { return getToken(JavaSubsetParser.AccessModifier, 0); }
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(133);
				match(AccessModifier);
				}
			}

			setState(136);
			type();
			setState(137);
			match(Identifier);
			setState(138);
			match(Semicolon);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JavaSubsetParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaSubsetParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			parameter();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(141);
				match(Comma);
				setState(142);
				parameter();
				}
				}
				setState(147);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaSubsetParser.Identifier, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			type();
			setState(149);
			match(Identifier);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JavaSubsetParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaSubsetParser.Comma, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argumentList);
		int _la;
		try {
			int _alt;
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanValue) | (1L << NullValue) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << OpenRoundBracket) | (1L << This) | (1L << New) | (1L << Identifier) | (1L << CharValue) | (1L << StringValue) | (1L << IntValue))) != 0)) {
					{
					setState(151);
					expression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				expression();
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(155);
						match(Comma);
						setState(156);
						expression();
						}
						} 
					}
					setState(161);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
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

	public static class ExpressionContext extends ParserRuleContext {
		public SubExpressionContext subExpression() {
			return getRuleContext(SubExpressionContext.class,0);
		}
		public BinaryExprContext binaryExpr() {
			return getRuleContext(BinaryExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				subExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				binaryExpr();
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

	public static class SubExpressionContext extends ParserRuleContext {
		public TerminalNode This() { return getToken(JavaSubsetParser.This, 0); }
		public TerminalNode Identifier() { return getToken(JavaSubsetParser.Identifier, 0); }
		public InstVarContext instVar() {
			return getRuleContext(InstVarContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public StmtExprContext stmtExpr() {
			return getRuleContext(StmtExprContext.class,0);
		}
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(JavaSubsetParser.OpenRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ClosedRoundBracket() { return getToken(JavaSubsetParser.ClosedRoundBracket, 0); }
		public SubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubExpressionContext subExpression() throws RecognitionException {
		SubExpressionContext _localctx = new SubExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_subExpression);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(This);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				instVar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				stmtExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				notExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				match(OpenRoundBracket);
				setState(175);
				expression();
				setState(176);
				match(ClosedRoundBracket);
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaSubsetParser.Identifier, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JavaSubsetParser.OpenRoundBracket, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode ClosedRoundBracket() { return getToken(JavaSubsetParser.ClosedRoundBracket, 0); }
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public List<ReceivingMethodContext> receivingMethod() {
			return getRuleContexts(ReceivingMethodContext.class);
		}
		public ReceivingMethodContext receivingMethod(int i) {
			return getRuleContext(ReceivingMethodContext.class,i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(180);
				receiver();
				}
				break;
			}
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					receivingMethod();
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(189);
			match(Identifier);
			setState(190);
			match(OpenRoundBracket);
			setState(191);
			argumentList();
			setState(192);
			match(ClosedRoundBracket);
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

	public static class StatementContext extends ParserRuleContext {
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(JavaSubsetParser.Semicolon, 0); }
		public LocalVarDeclContext localVarDecl() {
			return getRuleContext(LocalVarDeclContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public IfElseStmtContext ifElseStmt() {
			return getRuleContext(IfElseStmtContext.class,0);
		}
		public StmtExprContext stmtExpr() {
			return getRuleContext(StmtExprContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				returnStmt();
				setState(195);
				match(Semicolon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				localVarDecl();
				setState(198);
				match(Semicolon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				whileStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				forStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				ifElseStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				stmtExpr();
				setState(205);
				match(Semicolon);
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

	public static class StmtExprContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public NewDeclContext newDecl() {
			return getRuleContext(NewDeclContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public CrementExprContext crementExpr() {
			return getRuleContext(CrementExprContext.class,0);
		}
		public StmtExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterStmtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitStmtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitStmtExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtExprContext stmtExpr() throws RecognitionException {
		StmtExprContext _localctx = new StmtExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stmtExpr);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				newDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				methodCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				crementExpr();
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

	public static class NotExprContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(JavaSubsetParser.Not, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExprContext notExpr() throws RecognitionException {
		NotExprContext _localctx = new NotExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_notExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(Not);
			setState(216);
			expression();
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

	public static class CrementExprContext extends ParserRuleContext {
		public IncExprContext incExpr() {
			return getRuleContext(IncExprContext.class,0);
		}
		public DecExprContext decExpr() {
			return getRuleContext(DecExprContext.class,0);
		}
		public CrementExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crementExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterCrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitCrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitCrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrementExprContext crementExpr() throws RecognitionException {
		CrementExprContext _localctx = new CrementExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_crementExpr);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				incExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				decExpr();
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

	public static class IncExprContext extends ParserRuleContext {
		public PreIncExprContext preIncExpr() {
			return getRuleContext(PreIncExprContext.class,0);
		}
		public SufIncExprContext sufIncExpr() {
			return getRuleContext(SufIncExprContext.class,0);
		}
		public IncExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterIncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitIncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitIncExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncExprContext incExpr() throws RecognitionException {
		IncExprContext _localctx = new IncExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_incExpr);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				preIncExpr();
				}
				break;
			case This:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				sufIncExpr();
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

	public static class PreIncExprContext extends ParserRuleContext {
		public List<TerminalNode> Plus() { return getTokens(JavaSubsetParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(JavaSubsetParser.Plus, i);
		}
		public AssignableExprContext assignableExpr() {
			return getRuleContext(AssignableExprContext.class,0);
		}
		public PreIncExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterPreIncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitPreIncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitPreIncExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreIncExprContext preIncExpr() throws RecognitionException {
		PreIncExprContext _localctx = new PreIncExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_preIncExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(Plus);
			setState(227);
			match(Plus);
			setState(228);
			assignableExpr();
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

	public static class SufIncExprContext extends ParserRuleContext {
		public AssignableExprContext assignableExpr() {
			return getRuleContext(AssignableExprContext.class,0);
		}
		public List<TerminalNode> Plus() { return getTokens(JavaSubsetParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(JavaSubsetParser.Plus, i);
		}
		public SufIncExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sufIncExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterSufIncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitSufIncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitSufIncExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SufIncExprContext sufIncExpr() throws RecognitionException {
		SufIncExprContext _localctx = new SufIncExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sufIncExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			assignableExpr();
			setState(231);
			match(Plus);
			setState(232);
			match(Plus);
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

	public static class DecExprContext extends ParserRuleContext {
		public PreDecExprContext preDecExpr() {
			return getRuleContext(PreDecExprContext.class,0);
		}
		public SufDecExprContext sufDecExpr() {
			return getRuleContext(SufDecExprContext.class,0);
		}
		public DecExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterDecExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitDecExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitDecExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecExprContext decExpr() throws RecognitionException {
		DecExprContext _localctx = new DecExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_decExpr);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Minus:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				preDecExpr();
				}
				break;
			case This:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				sufDecExpr();
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

	public static class PreDecExprContext extends ParserRuleContext {
		public List<TerminalNode> Minus() { return getTokens(JavaSubsetParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(JavaSubsetParser.Minus, i);
		}
		public AssignableExprContext assignableExpr() {
			return getRuleContext(AssignableExprContext.class,0);
		}
		public PreDecExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterPreDecExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitPreDecExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitPreDecExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreDecExprContext preDecExpr() throws RecognitionException {
		PreDecExprContext _localctx = new PreDecExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_preDecExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(Minus);
			setState(239);
			match(Minus);
			setState(240);
			assignableExpr();
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

	public static class SufDecExprContext extends ParserRuleContext {
		public AssignableExprContext assignableExpr() {
			return getRuleContext(AssignableExprContext.class,0);
		}
		public List<TerminalNode> Minus() { return getTokens(JavaSubsetParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(JavaSubsetParser.Minus, i);
		}
		public SufDecExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sufDecExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterSufDecExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitSufDecExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitSufDecExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SufDecExprContext sufDecExpr() throws RecognitionException {
		SufDecExprContext _localctx = new SufDecExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sufDecExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			assignableExpr();
			setState(243);
			match(Minus);
			setState(244);
			match(Minus);
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

	public static class AssignableExprContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaSubsetParser.Identifier, 0); }
		public InstVarContext instVar() {
			return getRuleContext(InstVarContext.class,0);
		}
		public AssignableExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignableExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterAssignableExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitAssignableExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitAssignableExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableExprContext assignableExpr() throws RecognitionException {
		AssignableExprContext _localctx = new AssignableExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignableExpr);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				instVar();
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

	public static class InstVarContext extends ParserRuleContext {
		public TerminalNode This() { return getToken(JavaSubsetParser.This, 0); }
		public List<TerminalNode> Dot() { return getTokens(JavaSubsetParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(JavaSubsetParser.Dot, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(JavaSubsetParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaSubsetParser.Identifier, i);
		}
		public InstVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterInstVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitInstVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitInstVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstVarContext instVar() throws RecognitionException {
		InstVarContext _localctx = new InstVarContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_instVar);
		int _la;
		try {
			int _alt;
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(This);
				setState(251);
				match(Dot);
				setState(252);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==This) {
					{
					setState(253);
					match(This);
					setState(254);
					match(Dot);
					}
				}

				setState(259); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(257);
						match(Identifier);
						setState(258);
						match(Dot);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(261); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(263);
				match(Identifier);
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

	public static class BinaryExprContext extends ParserRuleContext {
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public NonCalcExprContext nonCalcExpr() {
			return getRuleContext(NonCalcExprContext.class,0);
		}
		public BinaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExprContext binaryExpr() throws RecognitionException {
		BinaryExprContext _localctx = new BinaryExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_binaryExpr);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				calcExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				nonCalcExpr();
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

	public static class CalcExprContext extends ParserRuleContext {
		public DotExprContext dotExpr() {
			return getRuleContext(DotExprContext.class,0);
		}
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public TerminalNode LineOperator() { return getToken(JavaSubsetParser.LineOperator, 0); }
		public CalcExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterCalcExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitCalcExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitCalcExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcExprContext calcExpr() throws RecognitionException {
		return calcExpr(0);
	}

	private CalcExprContext calcExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CalcExprContext _localctx = new CalcExprContext(_ctx, _parentState);
		CalcExprContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_calcExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(271);
			dotExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CalcExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
					setState(273);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(274);
					match(LineOperator);
					setState(275);
					dotExpr(0);
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class DotExprContext extends ParserRuleContext {
		public DotSubExprContext dotSubExpr() {
			return getRuleContext(DotSubExprContext.class,0);
		}
		public DotExprContext dotExpr() {
			return getRuleContext(DotExprContext.class,0);
		}
		public TerminalNode DotOperator() { return getToken(JavaSubsetParser.DotOperator, 0); }
		public DotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterDotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitDotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitDotExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotExprContext dotExpr() throws RecognitionException {
		return dotExpr(0);
	}

	private DotExprContext dotExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DotExprContext _localctx = new DotExprContext(_ctx, _parentState);
		DotExprContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_dotExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(282);
			dotSubExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DotExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dotExpr);
					setState(284);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(285);
					match(DotOperator);
					setState(286);
					dotSubExpr();
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class DotSubExprContext extends ParserRuleContext {
		public TerminalNode IntValue() { return getToken(JavaSubsetParser.IntValue, 0); }
		public TerminalNode Identifier() { return getToken(JavaSubsetParser.Identifier, 0); }
		public InstVarContext instVar() {
			return getRuleContext(InstVarContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(JavaSubsetParser.OpenRoundBracket, 0); }
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public TerminalNode ClosedRoundBracket() { return getToken(JavaSubsetParser.ClosedRoundBracket, 0); }
		public DotSubExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotSubExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterDotSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitDotSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitDotSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotSubExprContext dotSubExpr() throws RecognitionException {
		DotSubExprContext _localctx = new DotSubExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dotSubExpr);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(IntValue);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				instVar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				methodCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				match(OpenRoundBracket);
				setState(297);
				calcExpr(0);
				setState(298);
				match(ClosedRoundBracket);
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

	public static class NonCalcExprContext extends ParserRuleContext {
		public SubExpressionContext subExpression() {
			return getRuleContext(SubExpressionContext.class,0);
		}
		public NonCalcOperatorContext nonCalcOperator() {
			return getRuleContext(NonCalcOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NonCalcExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonCalcExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterNonCalcExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitNonCalcExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitNonCalcExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonCalcExprContext nonCalcExpr() throws RecognitionException {
		NonCalcExprContext _localctx = new NonCalcExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_nonCalcExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			subExpression();
			setState(303);
			nonCalcOperator();
			setState(304);
			expression();
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

	public static class NonCalcOperatorContext extends ParserRuleContext {
		public TerminalNode LogicalOpertor() { return getToken(JavaSubsetParser.LogicalOpertor, 0); }
		public TerminalNode ComparisonOperator() { return getToken(JavaSubsetParser.ComparisonOperator, 0); }
		public NonCalcOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonCalcOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterNonCalcOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitNonCalcOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitNonCalcOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonCalcOperatorContext nonCalcOperator() throws RecognitionException {
		NonCalcOperatorContext _localctx = new NonCalcOperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_nonCalcOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !(_la==ComparisonOperator || _la==LogicalOpertor) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(JavaSubsetParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(Return);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanValue) | (1L << NullValue) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << OpenRoundBracket) | (1L << This) | (1L << New) | (1L << Identifier) | (1L << CharValue) | (1L << StringValue) | (1L << IntValue))) != 0)) {
				{
				setState(309);
				expression();
				}
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

	public static class LocalVarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaSubsetParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(JavaSubsetParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LocalVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVarDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterLocalVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitLocalVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitLocalVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVarDeclContext localVarDecl() throws RecognitionException {
		LocalVarDeclContext _localctx = new LocalVarDeclContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_localVarDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			type();
			setState(313);
			match(Identifier);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(314);
				match(Assign);
				setState(315);
				expression();
				}
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(JavaSubsetParser.OpenCurlyBracket, 0); }
		public TerminalNode ClosedCurlyBracket() { return getToken(JavaSubsetParser.ClosedCurlyBracket, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(OpenCurlyBracket);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Char) | (1L << Int) | (1L << Plus) | (1L << Minus) | (1L << OpenCurlyBracket) | (1L << This) | (1L << While) | (1L << If) | (1L << For) | (1L << Return) | (1L << New) | (1L << Identifier))) != 0)) {
				{
				{
				setState(319);
				statement();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			match(ClosedCurlyBracket);
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

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(JavaSubsetParser.While, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JavaSubsetParser.OpenRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ClosedRoundBracket() { return getToken(JavaSubsetParser.ClosedRoundBracket, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(While);
			setState(328);
			match(OpenRoundBracket);
			setState(329);
			expression();
			setState(330);
			match(ClosedRoundBracket);
			setState(331);
			block();
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

	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(JavaSubsetParser.For, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JavaSubsetParser.OpenRoundBracket, 0); }
		public List<TerminalNode> Semicolon() { return getTokens(JavaSubsetParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(JavaSubsetParser.Semicolon, i);
		}
		public TerminalNode ClosedRoundBracket() { return getToken(JavaSubsetParser.ClosedRoundBracket, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<StmtExprContext> stmtExpr() {
			return getRuleContexts(StmtExprContext.class);
		}
		public StmtExprContext stmtExpr(int i) {
			return getRuleContext(StmtExprContext.class,i);
		}
		public LocalVarDeclContext localVarDecl() {
			return getRuleContext(LocalVarDeclContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(For);
			setState(334);
			match(OpenRoundBracket);
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(335);
				stmtExpr();
				}
				break;
			case 2:
				{
				setState(336);
				localVarDecl();
				}
				break;
			}
			setState(339);
			match(Semicolon);
			{
			setState(340);
			expression();
			}
			setState(341);
			match(Semicolon);
			{
			setState(342);
			stmtExpr();
			}
			setState(343);
			match(ClosedRoundBracket);
			setState(344);
			statement();
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

	public static class IfElseStmtContext extends ParserRuleContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public IfElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterIfElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitIfElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitIfElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseStmtContext ifElseStmt() throws RecognitionException {
		IfElseStmtContext _localctx = new IfElseStmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ifElseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			ifStmt();
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(347);
				elseStmt();
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(JavaSubsetParser.If, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JavaSubsetParser.OpenRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ClosedRoundBracket() { return getToken(JavaSubsetParser.ClosedRoundBracket, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(If);
			setState(351);
			match(OpenRoundBracket);
			setState(352);
			expression();
			setState(353);
			match(ClosedRoundBracket);
			setState(354);
			statement();
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

	public static class ElseStmtContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(JavaSubsetParser.Else, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(Else);
			setState(357);
			statement();
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

	public static class AssignContext extends ParserRuleContext {
		public AssignableExprContext assignableExpr() {
			return getRuleContext(AssignableExprContext.class,0);
		}
		public TerminalNode Assign() { return getToken(JavaSubsetParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			assignableExpr();
			setState(360);
			match(Assign);
			setState(361);
			expression();
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

	public static class NewDeclContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(JavaSubsetParser.New, 0); }
		public TerminalNode Identifier() { return getToken(JavaSubsetParser.Identifier, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JavaSubsetParser.OpenRoundBracket, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode ClosedRoundBracket() { return getToken(JavaSubsetParser.ClosedRoundBracket, 0); }
		public NewDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterNewDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitNewDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitNewDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewDeclContext newDecl() throws RecognitionException {
		NewDeclContext _localctx = new NewDeclContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_newDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(New);
			setState(364);
			match(Identifier);
			setState(365);
			match(OpenRoundBracket);
			setState(366);
			argumentList();
			setState(367);
			match(ClosedRoundBracket);
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

	public static class ReceiverContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(JavaSubsetParser.Dot, 0); }
		public TerminalNode This() { return getToken(JavaSubsetParser.This, 0); }
		public InstVarContext instVar() {
			return getRuleContext(InstVarContext.class,0);
		}
		public NewDeclContext newDecl() {
			return getRuleContext(NewDeclContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaSubsetParser.Identifier, 0); }
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(369);
				match(This);
				}
				break;
			case 2:
				{
				setState(370);
				instVar();
				}
				break;
			case 3:
				{
				setState(371);
				newDecl();
				}
				break;
			case 4:
				{
				setState(372);
				match(Identifier);
				}
				break;
			}
			setState(375);
			match(Dot);
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

	public static class ReceivingMethodContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaSubsetParser.Identifier, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JavaSubsetParser.OpenRoundBracket, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode ClosedRoundBracket() { return getToken(JavaSubsetParser.ClosedRoundBracket, 0); }
		public TerminalNode Dot() { return getToken(JavaSubsetParser.Dot, 0); }
		public ReceivingMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receivingMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterReceivingMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitReceivingMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitReceivingMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceivingMethodContext receivingMethod() throws RecognitionException {
		ReceivingMethodContext _localctx = new ReceivingMethodContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_receivingMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(Identifier);
			setState(378);
			match(OpenRoundBracket);
			setState(379);
			argumentList();
			setState(380);
			match(ClosedRoundBracket);
			setState(381);
			match(Dot);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(JavaSubsetParser.Int, 0); }
		public TerminalNode Boolean() { return getToken(JavaSubsetParser.Boolean, 0); }
		public TerminalNode Char() { return getToken(JavaSubsetParser.Char, 0); }
		public TerminalNode Identifier() { return getToken(JavaSubsetParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Char) | (1L << Int) | (1L << Identifier))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode IntValue() { return getToken(JavaSubsetParser.IntValue, 0); }
		public TerminalNode BooleanValue() { return getToken(JavaSubsetParser.BooleanValue, 0); }
		public TerminalNode StringValue() { return getToken(JavaSubsetParser.StringValue, 0); }
		public TerminalNode CharValue() { return getToken(JavaSubsetParser.CharValue, 0); }
		public TerminalNode NullValue() { return getToken(JavaSubsetParser.NullValue, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanValue) | (1L << NullValue) | (1L << CharValue) | (1L << StringValue) | (1L << IntValue))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return calcExpr_sempred((CalcExprContext)_localctx, predIndex);
		case 25:
			return dotExpr_sempred((DotExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean calcExpr_sempred(CalcExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean dotExpr_sempred(DotExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0186\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\6\2Z\n\2\r\2\16\2[\3\3\3\3\3\3\3\3\3\3\3\3\7\3d\n\3\f\3\16\3"+
		"g\13\3\3\3\3\3\3\4\5\4l\n\4\3\4\3\4\3\4\5\4q\n\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\5\5y\n\5\3\5\3\5\5\5}\n\5\3\5\3\5\3\5\5\5\u0082\n\5\3\5\3\5\5\5\u0086"+
		"\n\5\3\6\5\6\u0089\n\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u0092\n\7\f\7\16"+
		"\7\u0095\13\7\3\b\3\b\3\b\3\t\5\t\u009b\n\t\3\t\3\t\3\t\7\t\u00a0\n\t"+
		"\f\t\16\t\u00a3\13\t\5\t\u00a5\n\t\3\n\3\n\5\n\u00a9\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b5\n\13\3\f\5\f\u00b8\n\f"+
		"\3\f\7\f\u00bb\n\f\f\f\16\f\u00be\13\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d2\n\r\3\16\3\16\3\16"+
		"\3\16\5\16\u00d8\n\16\3\17\3\17\3\17\3\20\3\20\5\20\u00df\n\20\3\21\3"+
		"\21\5\21\u00e3\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\5\24\u00ef\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\5\27"+
		"\u00fb\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u0102\n\30\3\30\3\30\6\30\u0106"+
		"\n\30\r\30\16\30\u0107\3\30\5\30\u010b\n\30\3\31\3\31\5\31\u010f\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0117\n\32\f\32\16\32\u011a\13\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0122\n\33\f\33\16\33\u0125\13\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u012f\n\34\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\5\37\u0139\n\37\3 \3 \3 \3 \5 \u013f\n \3!\3"+
		"!\7!\u0143\n!\f!\16!\u0146\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#"+
		"\3#\5#\u0154\n#\3#\3#\3#\3#\3#\3#\3#\3$\3$\5$\u015f\n$\3%\3%\3%\3%\3%"+
		"\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\5)\u0178\n"+
		")\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3,\3,\3,\3\u00a1\4\62\64-\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\5\3"+
		"\2\r\16\4\2\b\n--\4\2\3\4.\60\2\u0191\2Y\3\2\2\2\4]\3\2\2\2\6k\3\2\2\2"+
		"\b\u0085\3\2\2\2\n\u0088\3\2\2\2\f\u008e\3\2\2\2\16\u0096\3\2\2\2\20\u00a4"+
		"\3\2\2\2\22\u00a8\3\2\2\2\24\u00b4\3\2\2\2\26\u00b7\3\2\2\2\30\u00d1\3"+
		"\2\2\2\32\u00d7\3\2\2\2\34\u00d9\3\2\2\2\36\u00de\3\2\2\2 \u00e2\3\2\2"+
		"\2\"\u00e4\3\2\2\2$\u00e8\3\2\2\2&\u00ee\3\2\2\2(\u00f0\3\2\2\2*\u00f4"+
		"\3\2\2\2,\u00fa\3\2\2\2.\u010a\3\2\2\2\60\u010e\3\2\2\2\62\u0110\3\2\2"+
		"\2\64\u011b\3\2\2\2\66\u012e\3\2\2\28\u0130\3\2\2\2:\u0134\3\2\2\2<\u0136"+
		"\3\2\2\2>\u013a\3\2\2\2@\u0140\3\2\2\2B\u0149\3\2\2\2D\u014f\3\2\2\2F"+
		"\u015c\3\2\2\2H\u0160\3\2\2\2J\u0166\3\2\2\2L\u0169\3\2\2\2N\u016d\3\2"+
		"\2\2P\u0177\3\2\2\2R\u017b\3\2\2\2T\u0181\3\2\2\2V\u0183\3\2\2\2XZ\5\4"+
		"\3\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\3\3\2\2\2]^\7%\2\2^_\7"+
		"-\2\2_e\7!\2\2`d\5\6\4\2ad\5\n\6\2bd\5\b\5\2c`\3\2\2\2ca\3\2\2\2cb\3\2"+
		"\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\"\2\2i\5\3"+
		"\2\2\2jl\7\5\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7-\2\2np\7\37\2\2oq\5"+
		"\f\7\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7 \2\2st\5@!\2t\7\3\2\2\2uv\7\6"+
		"\2\2v\u0086\5@!\2wy\7\5\2\2xw\3\2\2\2xy\3\2\2\2y|\3\2\2\2z}\5T+\2{}\7"+
		"\7\2\2|z\3\2\2\2|{\3\2\2\2}~\3\2\2\2~\177\7-\2\2\177\u0081\7\37\2\2\u0080"+
		"\u0082\5\f\7\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2"+
		"\2\2\u0083\u0084\7 \2\2\u0084\u0086\5@!\2\u0085u\3\2\2\2\u0085x\3\2\2"+
		"\2\u0086\t\3\2\2\2\u0087\u0089\7\5\2\2\u0088\u0087\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\5T+\2\u008b\u008c\7-\2\2\u008c"+
		"\u008d\7#\2\2\u008d\13\3\2\2\2\u008e\u0093\5\16\b\2\u008f\u0090\7$\2\2"+
		"\u0090\u0092\5\16\b\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\r\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0097\5T+\2\u0097\u0098\7-\2\2\u0098\17\3\2\2\2\u0099\u009b\5\22\n\2"+
		"\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a5\3\2\2\2\u009c\u00a1"+
		"\5\22\n\2\u009d\u009e\7$\2\2\u009e\u00a0\5\22\n\2\u009f\u009d\3\2\2\2"+
		"\u00a0\u00a3\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a5"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u009a\3\2\2\2\u00a4\u009c\3\2\2\2\u00a5"+
		"\21\3\2\2\2\u00a6\u00a9\5\24\13\2\u00a7\u00a9\5\60\31\2\u00a8\u00a6\3"+
		"\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\23\3\2\2\2\u00aa\u00b5\7&\2\2\u00ab\u00b5"+
		"\7-\2\2\u00ac\u00b5\5.\30\2\u00ad\u00b5\5V,\2\u00ae\u00b5\5\32\16\2\u00af"+
		"\u00b5\5\34\17\2\u00b0\u00b1\7\37\2\2\u00b1\u00b2\5\22\n\2\u00b2\u00b3"+
		"\7 \2\2\u00b3\u00b5\3\2\2\2\u00b4\u00aa\3\2\2\2\u00b4\u00ab\3\2\2\2\u00b4"+
		"\u00ac\3\2\2\2\u00b4\u00ad\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00af\3\2"+
		"\2\2\u00b4\u00b0\3\2\2\2\u00b5\25\3\2\2\2\u00b6\u00b8\5P)\2\u00b7\u00b6"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bc\3\2\2\2\u00b9\u00bb\5R*\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7-\2\2\u00c0"+
		"\u00c1\7\37\2\2\u00c1\u00c2\5\20\t\2\u00c2\u00c3\7 \2\2\u00c3\27\3\2\2"+
		"\2\u00c4\u00c5\5<\37\2\u00c5\u00c6\7#\2\2\u00c6\u00d2\3\2\2\2\u00c7\u00c8"+
		"\5> \2\u00c8\u00c9\7#\2\2\u00c9\u00d2\3\2\2\2\u00ca\u00d2\5@!\2\u00cb"+
		"\u00d2\5B\"\2\u00cc\u00d2\5D#\2\u00cd\u00d2\5F$\2\u00ce\u00cf\5\32\16"+
		"\2\u00cf\u00d0\7#\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00c4\3\2\2\2\u00d1\u00c7"+
		"\3\2\2\2\u00d1\u00ca\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d1"+
		"\u00cd\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2\31\3\2\2\2\u00d3\u00d8\5L\'\2"+
		"\u00d4\u00d8\5N(\2\u00d5\u00d8\5\26\f\2\u00d6\u00d8\5\36\20\2\u00d7\u00d3"+
		"\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"\33\3\2\2\2\u00d9\u00da\7\33\2\2\u00da\u00db\5\22\n\2\u00db\35\3\2\2\2"+
		"\u00dc\u00df\5 \21\2\u00dd\u00df\5&\24\2\u00de\u00dc\3\2\2\2\u00de\u00dd"+
		"\3\2\2\2\u00df\37\3\2\2\2\u00e0\u00e3\5\"\22\2\u00e1\u00e3\5$\23\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3!\3\2\2\2\u00e4\u00e5\7\20\2\2"+
		"\u00e5\u00e6\7\20\2\2\u00e6\u00e7\5,\27\2\u00e7#\3\2\2\2\u00e8\u00e9\5"+
		",\27\2\u00e9\u00ea\7\20\2\2\u00ea\u00eb\7\20\2\2\u00eb%\3\2\2\2\u00ec"+
		"\u00ef\5(\25\2\u00ed\u00ef\5*\26\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2"+
		"\2\2\u00ef\'\3\2\2\2\u00f0\u00f1\7\21\2\2\u00f1\u00f2\7\21\2\2\u00f2\u00f3"+
		"\5,\27\2\u00f3)\3\2\2\2\u00f4\u00f5\5,\27\2\u00f5\u00f6\7\21\2\2\u00f6"+
		"\u00f7\7\21\2\2\u00f7+\3\2\2\2\u00f8\u00fb\7-\2\2\u00f9\u00fb\5.\30\2"+
		"\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb-\3\2\2\2\u00fc\u00fd\7"+
		"&\2\2\u00fd\u00fe\7\36\2\2\u00fe\u010b\7-\2\2\u00ff\u0100\7&\2\2\u0100"+
		"\u0102\7\36\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0105\3"+
		"\2\2\2\u0103\u0104\7-\2\2\u0104\u0106\7\36\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\u010b\7-\2\2\u010a\u00fc\3\2\2\2\u010a\u0101\3\2\2\2\u010b"+
		"/\3\2\2\2\u010c\u010f\5\62\32\2\u010d\u010f\58\35\2\u010e\u010c\3\2\2"+
		"\2\u010e\u010d\3\2\2\2\u010f\61\3\2\2\2\u0110\u0111\b\32\1\2\u0111\u0112"+
		"\5\64\33\2\u0112\u0118\3\2\2\2\u0113\u0114\f\4\2\2\u0114\u0115\7\f\2\2"+
		"\u0115\u0117\5\64\33\2\u0116\u0113\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\63\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"\u011c\b\33\1\2\u011c\u011d\5\66\34\2\u011d\u0123\3\2\2\2\u011e\u011f"+
		"\f\4\2\2\u011f\u0120\7\13\2\2\u0120\u0122\5\66\34\2\u0121\u011e\3\2\2"+
		"\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\65"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u012f\7\60\2\2\u0127\u012f\7-\2\2\u0128"+
		"\u012f\5.\30\2\u0129\u012f\5\26\f\2\u012a\u012b\7\37\2\2\u012b\u012c\5"+
		"\62\32\2\u012c\u012d\7 \2\2\u012d\u012f\3\2\2\2\u012e\u0126\3\2\2\2\u012e"+
		"\u0127\3\2\2\2\u012e\u0128\3\2\2\2\u012e\u0129\3\2\2\2\u012e\u012a\3\2"+
		"\2\2\u012f\67\3\2\2\2\u0130\u0131\5\24\13\2\u0131\u0132\5:\36\2\u0132"+
		"\u0133\5\22\n\2\u01339\3\2\2\2\u0134\u0135\t\2\2\2\u0135;\3\2\2\2\u0136"+
		"\u0138\7+\2\2\u0137\u0139\5\22\n\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139=\3\2\2\2\u013a\u013b\5T+\2\u013b\u013e\7-\2\2\u013c\u013d\7"+
		"\17\2\2\u013d\u013f\5\22\n\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"?\3\2\2\2\u0140\u0144\7!\2\2\u0141\u0143\5\30\r\2\u0142\u0141\3\2\2\2"+
		"\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7\"\2\2\u0148A\3\2\2\2\u0149"+
		"\u014a\7\'\2\2\u014a\u014b\7\37\2\2\u014b\u014c\5\22\n\2\u014c\u014d\7"+
		" \2\2\u014d\u014e\5@!\2\u014eC\3\2\2\2\u014f\u0150\7*\2\2\u0150\u0153"+
		"\7\37\2\2\u0151\u0154\5\32\16\2\u0152\u0154\5> \2\u0153\u0151\3\2\2\2"+
		"\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7#\2\2\u0156\u0157"+
		"\5\22\n\2\u0157\u0158\7#\2\2\u0158\u0159\5\32\16\2\u0159\u015a\7 \2\2"+
		"\u015a\u015b\5\30\r\2\u015bE\3\2\2\2\u015c\u015e\5H%\2\u015d\u015f\5J"+
		"&\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015fG\3\2\2\2\u0160\u0161"+
		"\7(\2\2\u0161\u0162\7\37\2\2\u0162\u0163\5\22\n\2\u0163\u0164\7 \2\2\u0164"+
		"\u0165\5\30\r\2\u0165I\3\2\2\2\u0166\u0167\7)\2\2\u0167\u0168\5\30\r\2"+
		"\u0168K\3\2\2\2\u0169\u016a\5,\27\2\u016a\u016b\7\17\2\2\u016b\u016c\5"+
		"\22\n\2\u016cM\3\2\2\2\u016d\u016e\7,\2\2\u016e\u016f\7-\2\2\u016f\u0170"+
		"\7\37\2\2\u0170\u0171\5\20\t\2\u0171\u0172\7 \2\2\u0172O\3\2\2\2\u0173"+
		"\u0178\7&\2\2\u0174\u0178\5.\30\2\u0175\u0178\5N(\2\u0176\u0178\7-\2\2"+
		"\u0177\u0173\3\2\2\2\u0177\u0174\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0176"+
		"\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7\36\2\2\u017aQ\3\2\2\2\u017b"+
		"\u017c\7-\2\2\u017c\u017d\7\37\2\2\u017d\u017e\5\20\t\2\u017e\u017f\7"+
		" \2\2\u017f\u0180\7\36\2\2\u0180S\3\2\2\2\u0181\u0182\t\3\2\2\u0182U\3"+
		"\2\2\2\u0183\u0184\t\4\2\2\u0184W\3\2\2\2\'[cekpx|\u0081\u0085\u0088\u0093"+
		"\u009a\u00a1\u00a4\u00a8\u00b4\u00b7\u00bc\u00d1\u00d7\u00de\u00e2\u00ee"+
		"\u00fa\u0101\u0107\u010a\u010e\u0118\u0123\u012e\u0138\u013e\u0144\u0153"+
		"\u015e\u0177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}