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
		AccessModifier=1, Void=2, Boolean=3, Char=4, Int=5, DotOperator=6, LineOperator=7, 
		ComparisonOperator=8, LogicalOpertor=9, Assign=10, Plus=11, Minus=12, 
		Mult=13, Div=14, Greater=15, Less=16, GreaterEqual=17, LessEqual=18, Equal=19, 
		NotEqual=20, And=21, Or=22, Dot=23, OpenRoundBracket=24, ClosedRoundBracket=25, 
		OpenCurlyBracket=26, ClosedCurlyBracket=27, Semicolon=28, Comma=29, Class=30, 
		This=31, While=32, If=33, Else=34, For=35, Return=36, New=37, Identifier=38, 
		BooleanValue=39, CharValue=40, IntValue=41, WS=42;
	public static final int
		RULE_program = 0, RULE_classdecl = 1, RULE_constuctorDecl = 2, RULE_methodDecl = 3, 
		RULE_fieldDecl = 4, RULE_parameterList = 5, RULE_parameter = 6, RULE_argumentList = 7, 
		RULE_expression = 8, RULE_subExpression = 9, RULE_methodCall = 10, RULE_statement = 11, 
		RULE_stmtExpr = 12, RULE_instVar = 13, RULE_binaryExpr = 14, RULE_operator = 15, 
		RULE_returnStmt = 16, RULE_localVarDecl = 17, RULE_block = 18, RULE_whileStmt = 19, 
		RULE_ifElseStmt = 20, RULE_ifStmt = 21, RULE_elseIfStmt = 22, RULE_elseStmt = 23, 
		RULE_assign = 24, RULE_newDecl = 25, RULE_reciever = 26, RULE_type = 27, 
		RULE_value = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classdecl", "constuctorDecl", "methodDecl", "fieldDecl", 
			"parameterList", "parameter", "argumentList", "expression", "subExpression", 
			"methodCall", "statement", "stmtExpr", "instVar", "binaryExpr", "operator", 
			"returnStmt", "localVarDecl", "block", "whileStmt", "ifElseStmt", "ifStmt", 
			"elseIfStmt", "elseStmt", "assign", "newDecl", "reciever", "type", "value"
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
		public ClassdeclContext classdecl() {
			return getRuleContext(ClassdeclContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			classdecl();
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
			setState(60);
			match(Class);
			setState(61);
			match(Identifier);
			setState(62);
			match(OpenCurlyBracket);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AccessModifier) | (1L << Void) | (1L << Boolean) | (1L << Char) | (1L << Int) | (1L << Identifier))) != 0)) {
				{
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(63);
					constuctorDecl();
					}
					break;
				case 2:
					{
					setState(64);
					fieldDecl();
					}
					break;
				case 3:
					{
					setState(65);
					methodDecl();
					}
					break;
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(73);
				match(AccessModifier);
				}
			}

			setState(76);
			match(Identifier);
			setState(77);
			match(OpenRoundBracket);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Char) | (1L << Int))) != 0)) {
				{
				setState(78);
				parameterList();
				}
			}

			setState(81);
			match(ClosedRoundBracket);
			setState(82);
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
		public TerminalNode Identifier() { return getToken(JavaSubsetParser.Identifier, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JavaSubsetParser.OpenRoundBracket, 0); }
		public TerminalNode ClosedRoundBracket() { return getToken(JavaSubsetParser.ClosedRoundBracket, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(84);
				match(AccessModifier);
				}
			}

			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boolean:
			case Char:
			case Int:
				{
				setState(87);
				type();
				}
				break;
			case Void:
				{
				setState(88);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(91);
			match(Identifier);
			setState(92);
			match(OpenRoundBracket);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Char) | (1L << Int))) != 0)) {
				{
				setState(93);
				parameterList();
				}
			}

			setState(96);
			match(ClosedRoundBracket);
			setState(97);
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

	public static class FieldDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaSubsetParser.Identifier, 0); }
		public TerminalNode Semicolon() { return getToken(JavaSubsetParser.Semicolon, 0); }
		public TerminalNode AccessModifier() { return getToken(JavaSubsetParser.AccessModifier, 0); }
		public TerminalNode Equal() { return getToken(JavaSubsetParser.Equal, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(99);
				match(AccessModifier);
				}
			}

			setState(102);
			type();
			setState(103);
			match(Identifier);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(104);
				match(Equal);
				setState(105);
				expression();
				}
			}

			setState(108);
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
			setState(110);
			parameter();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(111);
				match(Comma);
				setState(112);
				parameter();
				}
				}
				setState(117);
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
			setState(118);
			type();
			setState(119);
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
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenRoundBracket) | (1L << This) | (1L << New) | (1L << Identifier) | (1L << BooleanValue) | (1L << CharValue) | (1L << IntValue))) != 0)) {
					{
					setState(121);
					expression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				expression();
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(125);
						match(Comma);
						setState(126);
						expression();
						}
						} 
					}
					setState(131);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				subExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
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
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				instVar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				stmtExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				match(OpenRoundBracket);
				setState(143);
				expression();
				setState(144);
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
		public List<TerminalNode> Identifier() { return getTokens(JavaSubsetParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaSubsetParser.Identifier, i);
		}
		public List<TerminalNode> OpenRoundBracket() { return getTokens(JavaSubsetParser.OpenRoundBracket); }
		public TerminalNode OpenRoundBracket(int i) {
			return getToken(JavaSubsetParser.OpenRoundBracket, i);
		}
		public List<ArgumentListContext> argumentList() {
			return getRuleContexts(ArgumentListContext.class);
		}
		public ArgumentListContext argumentList(int i) {
			return getRuleContext(ArgumentListContext.class,i);
		}
		public List<TerminalNode> ClosedRoundBracket() { return getTokens(JavaSubsetParser.ClosedRoundBracket); }
		public TerminalNode ClosedRoundBracket(int i) {
			return getToken(JavaSubsetParser.ClosedRoundBracket, i);
		}
		public RecieverContext reciever() {
			return getRuleContext(RecieverContext.class,0);
		}
		public List<TerminalNode> Dot() { return getTokens(JavaSubsetParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(JavaSubsetParser.Dot, i);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(148);
				reciever();
				}
				break;
			}
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					match(Identifier);
					setState(152);
					match(OpenRoundBracket);
					setState(153);
					argumentList();
					setState(154);
					match(ClosedRoundBracket);
					setState(155);
					match(Dot);
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(162);
			match(Identifier);
			setState(163);
			match(OpenRoundBracket);
			setState(164);
			argumentList();
			setState(165);
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
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Return:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				returnStmt();
				setState(168);
				match(Semicolon);
				}
				break;
			case Boolean:
			case Char:
			case Int:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				localVarDecl();
				setState(171);
				match(Semicolon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				block();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				whileStmt();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				ifElseStmt();
				}
				break;
			case This:
			case New:
			case Identifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(176);
				stmtExpr();
				setState(177);
				match(Semicolon);
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
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				newDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				methodCall();
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
		enterRule(_localctx, 26, RULE_instVar);
		int _la;
		try {
			int _alt;
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(This);
				setState(187);
				match(Dot);
				setState(188);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==This) {
					{
					setState(189);
					match(This);
					setState(190);
					match(Dot);
					}
				}

				setState(195); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(193);
						match(Identifier);
						setState(194);
						match(Dot);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(197); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(199);
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
		public SubExpressionContext subExpression() {
			return getRuleContext(SubExpressionContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 28, RULE_binaryExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			subExpression();
			setState(203);
			operator();
			setState(204);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode DotOperator() { return getToken(JavaSubsetParser.DotOperator, 0); }
		public TerminalNode LineOperator() { return getToken(JavaSubsetParser.LineOperator, 0); }
		public TerminalNode LogicalOpertor() { return getToken(JavaSubsetParser.LogicalOpertor, 0); }
		public TerminalNode ComparisonOperator() { return getToken(JavaSubsetParser.ComparisonOperator, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DotOperator) | (1L << LineOperator) | (1L << ComparisonOperator) | (1L << LogicalOpertor))) != 0)) ) {
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
		enterRule(_localctx, 32, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(Return);
			setState(209);
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
		enterRule(_localctx, 34, RULE_localVarDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			type();
			setState(212);
			match(Identifier);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(213);
				match(Assign);
				setState(214);
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
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(OpenCurlyBracket);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Char) | (1L << Int) | (1L << OpenCurlyBracket) | (1L << This) | (1L << While) | (1L << If) | (1L << Return) | (1L << New) | (1L << Identifier))) != 0)) {
				{
				{
				setState(218);
				statement();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
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
		enterRule(_localctx, 38, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(While);
			setState(227);
			match(OpenRoundBracket);
			setState(228);
			expression();
			setState(229);
			match(ClosedRoundBracket);
			setState(230);
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

	public static class IfElseStmtContext extends ParserRuleContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public List<ElseIfStmtContext> elseIfStmt() {
			return getRuleContexts(ElseIfStmtContext.class);
		}
		public ElseIfStmtContext elseIfStmt(int i) {
			return getRuleContext(ElseIfStmtContext.class,i);
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
		enterRule(_localctx, 40, RULE_ifElseStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			ifStmt();
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233);
					elseIfStmt();
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(239);
				elseStmt();
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(JavaSubsetParser.If, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JavaSubsetParser.OpenRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ClosedRoundBracket() { return getToken(JavaSubsetParser.ClosedRoundBracket, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 42, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(If);
			setState(243);
			match(OpenRoundBracket);
			setState(244);
			expression();
			setState(245);
			match(ClosedRoundBracket);
			setState(246);
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

	public static class ElseIfStmtContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(JavaSubsetParser.Else, 0); }
		public TerminalNode If() { return getToken(JavaSubsetParser.If, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JavaSubsetParser.OpenRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ClosedRoundBracket() { return getToken(JavaSubsetParser.ClosedRoundBracket, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterElseIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitElseIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitElseIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStmtContext elseIfStmt() throws RecognitionException {
		ElseIfStmtContext _localctx = new ElseIfStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elseIfStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(Else);
			setState(249);
			match(If);
			setState(250);
			match(OpenRoundBracket);
			setState(251);
			expression();
			setState(252);
			match(ClosedRoundBracket);
			setState(253);
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

	public static class ElseStmtContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(JavaSubsetParser.Else, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 46, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(Else);
			setState(256);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(JavaSubsetParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InstVarContext instVar() {
			return getRuleContext(InstVarContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaSubsetParser.Identifier, 0); }
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
		enterRule(_localctx, 48, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(258);
				instVar();
				}
				break;
			case 2:
				{
				setState(259);
				match(Identifier);
				}
				break;
			}
			setState(262);
			match(Assign);
			setState(263);
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
		enterRule(_localctx, 50, RULE_newDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(New);
			setState(266);
			match(Identifier);
			setState(267);
			match(OpenRoundBracket);
			setState(268);
			argumentList();
			setState(269);
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

	public static class RecieverContext extends ParserRuleContext {
		public InstVarContext instVar() {
			return getRuleContext(InstVarContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaSubsetParser.Identifier, 0); }
		public TerminalNode Dot() { return getToken(JavaSubsetParser.Dot, 0); }
		public RecieverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reciever; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterReciever(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitReciever(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitReciever(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecieverContext reciever() throws RecognitionException {
		RecieverContext _localctx = new RecieverContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_reciever);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(271);
				instVar();
				}
				break;
			case 2:
				{
				setState(272);
				match(Identifier);
				setState(273);
				match(Dot);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(JavaSubsetParser.Int, 0); }
		public TerminalNode Boolean() { return getToken(JavaSubsetParser.Boolean, 0); }
		public TerminalNode Char() { return getToken(JavaSubsetParser.Char, 0); }
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
		enterRule(_localctx, 54, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Char) | (1L << Int))) != 0)) ) {
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
		public TerminalNode CharValue() { return getToken(JavaSubsetParser.CharValue, 0); }
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
		enterRule(_localctx, 56, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanValue) | (1L << CharValue) | (1L << IntValue))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u011b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3E\n\3\f\3\16\3H\13\3\3\3\3\3\3\4\5\4M\n\4\3\4\3\4\3\4"+
		"\5\4R\n\4\3\4\3\4\3\4\3\5\5\5X\n\5\3\5\3\5\5\5\\\n\5\3\5\3\5\3\5\5\5a"+
		"\n\5\3\5\3\5\3\5\3\6\5\6g\n\6\3\6\3\6\3\6\3\6\5\6m\n\6\3\6\3\6\3\7\3\7"+
		"\3\7\7\7t\n\7\f\7\16\7w\13\7\3\b\3\b\3\b\3\t\5\t}\n\t\3\t\3\t\3\t\7\t"+
		"\u0082\n\t\f\t\16\t\u0085\13\t\5\t\u0087\n\t\3\n\3\n\5\n\u008b\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0095\n\13\3\f\5\f\u0098\n\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00a0\n\f\f\f\16\f\u00a3\13\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b6\n\r"+
		"\3\16\3\16\3\16\5\16\u00bb\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00c2\n"+
		"\17\3\17\3\17\6\17\u00c6\n\17\r\17\16\17\u00c7\3\17\5\17\u00cb\n\17\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00da"+
		"\n\23\3\24\3\24\7\24\u00de\n\24\f\24\16\24\u00e1\13\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u00ed\n\26\f\26\16\26\u00f0\13"+
		"\26\3\26\5\26\u00f3\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\5\32\u0107\n\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u0115\n\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\u0083\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:\2\5\3\2\b\13\3\2\5\7\3\2)+\2\u0122\2<\3\2\2"+
		"\2\4>\3\2\2\2\6L\3\2\2\2\bW\3\2\2\2\nf\3\2\2\2\fp\3\2\2\2\16x\3\2\2\2"+
		"\20\u0086\3\2\2\2\22\u008a\3\2\2\2\24\u0094\3\2\2\2\26\u0097\3\2\2\2\30"+
		"\u00b5\3\2\2\2\32\u00ba\3\2\2\2\34\u00ca\3\2\2\2\36\u00cc\3\2\2\2 \u00d0"+
		"\3\2\2\2\"\u00d2\3\2\2\2$\u00d5\3\2\2\2&\u00db\3\2\2\2(\u00e4\3\2\2\2"+
		"*\u00ea\3\2\2\2,\u00f4\3\2\2\2.\u00fa\3\2\2\2\60\u0101\3\2\2\2\62\u0106"+
		"\3\2\2\2\64\u010b\3\2\2\2\66\u0114\3\2\2\28\u0116\3\2\2\2:\u0118\3\2\2"+
		"\2<=\5\4\3\2=\3\3\2\2\2>?\7 \2\2?@\7(\2\2@F\7\34\2\2AE\5\6\4\2BE\5\n\6"+
		"\2CE\5\b\5\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2"+
		"\2GI\3\2\2\2HF\3\2\2\2IJ\7\35\2\2J\5\3\2\2\2KM\7\3\2\2LK\3\2\2\2LM\3\2"+
		"\2\2MN\3\2\2\2NO\7(\2\2OQ\7\32\2\2PR\5\f\7\2QP\3\2\2\2QR\3\2\2\2RS\3\2"+
		"\2\2ST\7\33\2\2TU\5&\24\2U\7\3\2\2\2VX\7\3\2\2WV\3\2\2\2WX\3\2\2\2X[\3"+
		"\2\2\2Y\\\58\35\2Z\\\7\4\2\2[Y\3\2\2\2[Z\3\2\2\2\\]\3\2\2\2]^\7(\2\2^"+
		"`\7\32\2\2_a\5\f\7\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\33\2\2cd\5&\24"+
		"\2d\t\3\2\2\2eg\7\3\2\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\58\35\2il\7(\2"+
		"\2jk\7\25\2\2km\5\22\n\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\36\2\2o\13"+
		"\3\2\2\2pu\5\16\b\2qr\7\37\2\2rt\5\16\b\2sq\3\2\2\2tw\3\2\2\2us\3\2\2"+
		"\2uv\3\2\2\2v\r\3\2\2\2wu\3\2\2\2xy\58\35\2yz\7(\2\2z\17\3\2\2\2{}\5\22"+
		"\n\2|{\3\2\2\2|}\3\2\2\2}\u0087\3\2\2\2~\u0083\5\22\n\2\177\u0080\7\37"+
		"\2\2\u0080\u0082\5\22\n\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086|\3\2\2\2\u0086~\3\2\2\2\u0087\21\3\2\2\2\u0088\u008b\5\24\13"+
		"\2\u0089\u008b\5\36\20\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\23\3\2\2\2\u008c\u0095\7(\2\2\u008d\u0095\5\34\17\2\u008e\u0095\5:\36"+
		"\2\u008f\u0095\5\32\16\2\u0090\u0091\7\32\2\2\u0091\u0092\5\22\n\2\u0092"+
		"\u0093\7\33\2\2\u0093\u0095\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u008d\3"+
		"\2\2\2\u0094\u008e\3\2\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0095"+
		"\25\3\2\2\2\u0096\u0098\5\66\34\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u00a1\3\2\2\2\u0099\u009a\7(\2\2\u009a\u009b\7\32\2\2\u009b"+
		"\u009c\5\20\t\2\u009c\u009d\7\33\2\2\u009d\u009e\7\31\2\2\u009e\u00a0"+
		"\3\2\2\2\u009f\u0099\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7("+
		"\2\2\u00a5\u00a6\7\32\2\2\u00a6\u00a7\5\20\t\2\u00a7\u00a8\7\33\2\2\u00a8"+
		"\27\3\2\2\2\u00a9\u00aa\5\"\22\2\u00aa\u00ab\7\36\2\2\u00ab\u00b6\3\2"+
		"\2\2\u00ac\u00ad\5$\23\2\u00ad\u00ae\7\36\2\2\u00ae\u00b6\3\2\2\2\u00af"+
		"\u00b6\5&\24\2\u00b0\u00b6\5(\25\2\u00b1\u00b6\5*\26\2\u00b2\u00b3\5\32"+
		"\16\2\u00b3\u00b4\7\36\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00a9\3\2\2\2\u00b5"+
		"\u00ac\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b1\3\2"+
		"\2\2\u00b5\u00b2\3\2\2\2\u00b6\31\3\2\2\2\u00b7\u00bb\5\62\32\2\u00b8"+
		"\u00bb\5\64\33\2\u00b9\u00bb\5\26\f\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\33\3\2\2\2\u00bc\u00bd\7!\2\2\u00bd"+
		"\u00be\7\31\2\2\u00be\u00cb\7(\2\2\u00bf\u00c0\7!\2\2\u00c0\u00c2\7\31"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3"+
		"\u00c4\7(\2\2\u00c4\u00c6\7\31\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\7(\2\2\u00ca\u00bc\3\2\2\2\u00ca\u00c1\3\2\2\2\u00cb\35\3\2\2\2"+
		"\u00cc\u00cd\5\24\13\2\u00cd\u00ce\5 \21\2\u00ce\u00cf\5\22\n\2\u00cf"+
		"\37\3\2\2\2\u00d0\u00d1\t\2\2\2\u00d1!\3\2\2\2\u00d2\u00d3\7&\2\2\u00d3"+
		"\u00d4\5\22\n\2\u00d4#\3\2\2\2\u00d5\u00d6\58\35\2\u00d6\u00d9\7(\2\2"+
		"\u00d7\u00d8\7\f\2\2\u00d8\u00da\5\22\n\2\u00d9\u00d7\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da%\3\2\2\2\u00db\u00df\7\34\2\2\u00dc\u00de\5\30\r\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7\35\2\2\u00e3"+
		"\'\3\2\2\2\u00e4\u00e5\7\"\2\2\u00e5\u00e6\7\32\2\2\u00e6\u00e7\5\22\n"+
		"\2\u00e7\u00e8\7\33\2\2\u00e8\u00e9\5&\24\2\u00e9)\3\2\2\2\u00ea\u00ee"+
		"\5,\27\2\u00eb\u00ed\5.\30\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f1\u00f3\5\60\31\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"+\3\2\2\2\u00f4\u00f5\7#\2\2\u00f5\u00f6\7\32\2\2\u00f6\u00f7\5\22\n\2"+
		"\u00f7\u00f8\7\33\2\2\u00f8\u00f9\5&\24\2\u00f9-\3\2\2\2\u00fa\u00fb\7"+
		"$\2\2\u00fb\u00fc\7#\2\2\u00fc\u00fd\7\32\2\2\u00fd\u00fe\5\22\n\2\u00fe"+
		"\u00ff\7\33\2\2\u00ff\u0100\5&\24\2\u0100/\3\2\2\2\u0101\u0102\7$\2\2"+
		"\u0102\u0103\5&\24\2\u0103\61\3\2\2\2\u0104\u0107\5\34\17\2\u0105\u0107"+
		"\7(\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\7\f\2\2\u0109\u010a\5\22\n\2\u010a\63\3\2\2\2\u010b\u010c\7\'\2"+
		"\2\u010c\u010d\7(\2\2\u010d\u010e\7\32\2\2\u010e\u010f\5\20\t\2\u010f"+
		"\u0110\7\33\2\2\u0110\65\3\2\2\2\u0111\u0115\5\34\17\2\u0112\u0113\7("+
		"\2\2\u0113\u0115\7\31\2\2\u0114\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\67\3\2\2\2\u0116\u0117\t\3\2\2\u01179\3\2\2\2\u0118\u0119\t\4\2\2\u0119"+
		";\3\2\2\2\36DFLQW[`flu|\u0083\u0086\u008a\u0094\u0097\u00a1\u00b5\u00ba"+
		"\u00c1\u00c7\u00ca\u00d9\u00df\u00ee\u00f2\u0106\u0114";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}