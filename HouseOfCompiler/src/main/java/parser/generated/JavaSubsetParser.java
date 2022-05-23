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
		BooleanValue=1, NullValue=2, AccessModifier=3, Void=4, Boolean=5, Char=6, 
		Int=7, DotOperator=8, LineOperator=9, ComparisonOperator=10, LogicalOpertor=11, 
		Assign=12, Plus=13, Minus=14, Mult=15, Modulo=16, Div=17, Greater=18, 
		Less=19, GreaterEqual=20, LessEqual=21, Equal=22, NotEqual=23, Not=24, 
		And=25, Or=26, Dot=27, OpenRoundBracket=28, ClosedRoundBracket=29, OpenCurlyBracket=30, 
		ClosedCurlyBracket=31, Semicolon=32, Comma=33, Class=34, This=35, While=36, 
		If=37, Else=38, For=39, Return=40, New=41, Identifier=42, CharValue=43, 
		IntValue=44, WS=45, InlineComment=46, MultilineComment=47;
	public static final int
		RULE_program = 0, RULE_classdecl = 1, RULE_constuctorDecl = 2, RULE_methodDecl = 3, 
		RULE_fieldDecl = 4, RULE_parameterList = 5, RULE_parameter = 6, RULE_argumentList = 7, 
		RULE_expression = 8, RULE_subExpression = 9, RULE_methodCall = 10, RULE_statement = 11, 
		RULE_stmtExpr = 12, RULE_unaryExpr = 13, RULE_instVar = 14, RULE_binaryExpr = 15, 
		RULE_calcExpr = 16, RULE_dotExpr = 17, RULE_dotSubExpr = 18, RULE_nonCalcExpr = 19, 
		RULE_nonCalcOperator = 20, RULE_returnStmt = 21, RULE_localVarDecl = 22, 
		RULE_block = 23, RULE_whileStmt = 24, RULE_ifElseStmt = 25, RULE_ifStmt = 26, 
		RULE_elseStmt = 27, RULE_assign = 28, RULE_newDecl = 29, RULE_receiver = 30, 
		RULE_receivingMethod = 31, RULE_type = 32, RULE_value = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classdecl", "constuctorDecl", "methodDecl", "fieldDecl", 
			"parameterList", "parameter", "argumentList", "expression", "subExpression", 
			"methodCall", "statement", "stmtExpr", "unaryExpr", "instVar", "binaryExpr", 
			"calcExpr", "dotExpr", "dotSubExpr", "nonCalcExpr", "nonCalcOperator", 
			"returnStmt", "localVarDecl", "block", "whileStmt", "ifElseStmt", "ifStmt", 
			"elseStmt", "assign", "newDecl", "receiver", "receivingMethod", "type", 
			"value"
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
			"If", "Else", "For", "Return", "New", "Identifier", "CharValue", "IntValue", 
			"WS", "InlineComment", "MultilineComment"
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
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				classdecl();
				}
				}
				setState(71); 
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
			setState(73);
			match(Class);
			setState(74);
			match(Identifier);
			setState(75);
			match(OpenCurlyBracket);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AccessModifier) | (1L << Void) | (1L << Boolean) | (1L << Char) | (1L << Int) | (1L << Identifier))) != 0)) {
				{
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(76);
					constuctorDecl();
					}
					break;
				case 2:
					{
					setState(77);
					fieldDecl();
					}
					break;
				case 3:
					{
					setState(78);
					methodDecl();
					}
					break;
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(86);
				match(AccessModifier);
				}
			}

			setState(89);
			match(Identifier);
			setState(90);
			match(OpenRoundBracket);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Char) | (1L << Int) | (1L << Identifier))) != 0)) {
				{
				setState(91);
				parameterList();
				}
			}

			setState(94);
			match(ClosedRoundBracket);
			setState(95);
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
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(97);
				match(AccessModifier);
				}
			}

			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boolean:
			case Char:
			case Int:
			case Identifier:
				{
				setState(100);
				type();
				}
				break;
			case Void:
				{
				setState(101);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(104);
			match(Identifier);
			setState(105);
			match(OpenRoundBracket);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Char) | (1L << Int) | (1L << Identifier))) != 0)) {
				{
				setState(106);
				parameterList();
				}
			}

			setState(109);
			match(ClosedRoundBracket);
			setState(110);
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
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(112);
				match(AccessModifier);
				}
			}

			setState(115);
			type();
			setState(116);
			match(Identifier);
			setState(117);
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
			setState(119);
			parameter();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(120);
				match(Comma);
				setState(121);
				parameter();
				}
				}
				setState(126);
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
			setState(127);
			type();
			setState(128);
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
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanValue) | (1L << NullValue) | (1L << Not) | (1L << OpenRoundBracket) | (1L << This) | (1L << New) | (1L << Identifier) | (1L << CharValue) | (1L << IntValue))) != 0)) {
					{
					setState(130);
					expression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				expression();
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(134);
						match(Comma);
						setState(135);
						expression();
						}
						} 
					}
					setState(140);
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
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				subExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
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
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
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
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(This);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				instVar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				stmtExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				unaryExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(153);
				match(OpenRoundBracket);
				setState(154);
				expression();
				setState(155);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(159);
				receiver();
				}
				break;
			}
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162);
					receivingMethod();
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(168);
			match(Identifier);
			setState(169);
			match(OpenRoundBracket);
			setState(170);
			argumentList();
			setState(171);
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
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				returnStmt();
				setState(174);
				match(Semicolon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				localVarDecl();
				setState(177);
				match(Semicolon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				whileStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				ifElseStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				stmtExpr();
				setState(183);
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
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				newDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
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

	public static class UnaryExprContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(JavaSubsetParser.Not, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unaryExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(Not);
			setState(193);
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
		enterRule(_localctx, 28, RULE_instVar);
		int _la;
		try {
			int _alt;
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(This);
				setState(196);
				match(Dot);
				setState(197);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==This) {
					{
					setState(198);
					match(This);
					setState(199);
					match(Dot);
					}
				}

				setState(204); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(202);
						match(Identifier);
						setState(203);
						match(Dot);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(206); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(208);
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
		enterRule(_localctx, 30, RULE_binaryExpr);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				calcExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_calcExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(216);
			dotExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CalcExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
					setState(218);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(219);
					match(LineOperator);
					setState(220);
					dotExpr(0);
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_dotExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(227);
			dotSubExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DotExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dotExpr);
					setState(229);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(230);
					match(DotOperator);
					setState(231);
					dotSubExpr();
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 36, RULE_dotSubExpr);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(IntValue);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				instVar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				methodCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				match(OpenRoundBracket);
				setState(242);
				calcExpr(0);
				setState(243);
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
		enterRule(_localctx, 38, RULE_nonCalcExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			subExpression();
			setState(248);
			nonCalcOperator();
			setState(249);
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
		enterRule(_localctx, 40, RULE_nonCalcOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
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
		enterRule(_localctx, 42, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(Return);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanValue) | (1L << NullValue) | (1L << Not) | (1L << OpenRoundBracket) | (1L << This) | (1L << New) | (1L << Identifier) | (1L << CharValue) | (1L << IntValue))) != 0)) {
				{
				setState(254);
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
		enterRule(_localctx, 44, RULE_localVarDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			type();
			setState(258);
			match(Identifier);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(259);
				match(Assign);
				setState(260);
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
		enterRule(_localctx, 46, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(OpenCurlyBracket);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Char) | (1L << Int) | (1L << OpenCurlyBracket) | (1L << This) | (1L << While) | (1L << If) | (1L << Return) | (1L << New) | (1L << Identifier))) != 0)) {
				{
				{
				setState(264);
				statement();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
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
		enterRule(_localctx, 48, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(While);
			setState(273);
			match(OpenRoundBracket);
			setState(274);
			expression();
			setState(275);
			match(ClosedRoundBracket);
			setState(276);
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
		enterRule(_localctx, 50, RULE_ifElseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			ifStmt();
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(279);
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
		enterRule(_localctx, 52, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(If);
			setState(283);
			match(OpenRoundBracket);
			setState(284);
			expression();
			setState(285);
			match(ClosedRoundBracket);
			setState(286);
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
		enterRule(_localctx, 54, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(Else);
			setState(289);
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
		enterRule(_localctx, 56, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(291);
				instVar();
				}
				break;
			case 2:
				{
				setState(292);
				match(Identifier);
				}
				break;
			}
			setState(295);
			match(Assign);
			setState(296);
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
		enterRule(_localctx, 58, RULE_newDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(New);
			setState(299);
			match(Identifier);
			setState(300);
			match(OpenRoundBracket);
			setState(301);
			argumentList();
			setState(302);
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
		enterRule(_localctx, 60, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(304);
				match(This);
				}
				break;
			case 2:
				{
				setState(305);
				instVar();
				}
				break;
			case 3:
				{
				setState(306);
				newDecl();
				}
				break;
			case 4:
				{
				setState(307);
				match(Identifier);
				}
				break;
			}
			setState(310);
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
		enterRule(_localctx, 62, RULE_receivingMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(Identifier);
			setState(313);
			match(OpenRoundBracket);
			setState(314);
			argumentList();
			setState(315);
			match(ClosedRoundBracket);
			setState(316);
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
		enterRule(_localctx, 64, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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
		enterRule(_localctx, 66, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanValue) | (1L << NullValue) | (1L << CharValue) | (1L << IntValue))) != 0)) ) {
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
		case 16:
			return calcExpr_sempred((CalcExprContext)_localctx, predIndex);
		case 17:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0145\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\6\2H\n\2\r\2\16\2I\3\3\3\3\3\3\3\3\3\3\3\3\7\3R"+
		"\n\3\f\3\16\3U\13\3\3\3\3\3\3\4\5\4Z\n\4\3\4\3\4\3\4\5\4_\n\4\3\4\3\4"+
		"\3\4\3\5\5\5e\n\5\3\5\3\5\5\5i\n\5\3\5\3\5\3\5\5\5n\n\5\3\5\3\5\3\5\3"+
		"\6\5\6t\n\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7}\n\7\f\7\16\7\u0080\13\7\3"+
		"\b\3\b\3\b\3\t\5\t\u0086\n\t\3\t\3\t\3\t\7\t\u008b\n\t\f\t\16\t\u008e"+
		"\13\t\5\t\u0090\n\t\3\n\3\n\5\n\u0094\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00a0\n\13\3\f\5\f\u00a3\n\f\3\f\7\f\u00a6\n"+
		"\f\f\f\16\f\u00a9\13\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00bc\n\r\3\16\3\16\3\16\5\16\u00c1\n\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u00cb\n\20\3\20\3\20\6\20\u00cf"+
		"\n\20\r\20\16\20\u00d0\3\20\5\20\u00d4\n\20\3\21\3\21\5\21\u00d8\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00e0\n\22\f\22\16\22\u00e3\13\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00eb\n\23\f\23\16\23\u00ee\13\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f8\n\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\5\27\u0102\n\27\3\30\3\30\3\30\3\30\5\30\u0108"+
		"\n\30\3\31\3\31\7\31\u010c\n\31\f\31\16\31\u010f\13\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\5\33\u011b\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\5\36\u0128\n\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \5 \u0137\n \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3#\3#\3#\3\u008c\4\"$$\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BD\2\5\3\2\f\r\4\2\7\t,,\4\2\3\4-.\2\u0152"+
		"\2G\3\2\2\2\4K\3\2\2\2\6Y\3\2\2\2\bd\3\2\2\2\ns\3\2\2\2\fy\3\2\2\2\16"+
		"\u0081\3\2\2\2\20\u008f\3\2\2\2\22\u0093\3\2\2\2\24\u009f\3\2\2\2\26\u00a2"+
		"\3\2\2\2\30\u00bb\3\2\2\2\32\u00c0\3\2\2\2\34\u00c2\3\2\2\2\36\u00d3\3"+
		"\2\2\2 \u00d7\3\2\2\2\"\u00d9\3\2\2\2$\u00e4\3\2\2\2&\u00f7\3\2\2\2(\u00f9"+
		"\3\2\2\2*\u00fd\3\2\2\2,\u00ff\3\2\2\2.\u0103\3\2\2\2\60\u0109\3\2\2\2"+
		"\62\u0112\3\2\2\2\64\u0118\3\2\2\2\66\u011c\3\2\2\28\u0122\3\2\2\2:\u0127"+
		"\3\2\2\2<\u012c\3\2\2\2>\u0136\3\2\2\2@\u013a\3\2\2\2B\u0140\3\2\2\2D"+
		"\u0142\3\2\2\2FH\5\4\3\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\3\3"+
		"\2\2\2KL\7$\2\2LM\7,\2\2MS\7 \2\2NR\5\6\4\2OR\5\n\6\2PR\5\b\5\2QN\3\2"+
		"\2\2QO\3\2\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2"+
		"\2\2VW\7!\2\2W\5\3\2\2\2XZ\7\5\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7"+
		",\2\2\\^\7\36\2\2]_\5\f\7\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\37\2\2a"+
		"b\5\60\31\2b\7\3\2\2\2ce\7\5\2\2dc\3\2\2\2de\3\2\2\2eh\3\2\2\2fi\5B\""+
		"\2gi\7\6\2\2hf\3\2\2\2hg\3\2\2\2ij\3\2\2\2jk\7,\2\2km\7\36\2\2ln\5\f\7"+
		"\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\37\2\2pq\5\60\31\2q\t\3\2\2\2rt\7"+
		"\5\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\5B\"\2vw\7,\2\2wx\7\"\2\2x\13\3"+
		"\2\2\2y~\5\16\b\2z{\7#\2\2{}\5\16\b\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2"+
		"\2~\177\3\2\2\2\177\r\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\5B\"\2\u0082"+
		"\u0083\7,\2\2\u0083\17\3\2\2\2\u0084\u0086\5\22\n\2\u0085\u0084\3\2\2"+
		"\2\u0085\u0086\3\2\2\2\u0086\u0090\3\2\2\2\u0087\u008c\5\22\n\2\u0088"+
		"\u0089\7#\2\2\u0089\u008b\5\22\n\2\u008a\u0088\3\2\2\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0085\3\2\2\2\u008f\u0087\3\2\2\2\u0090\21\3\2\2"+
		"\2\u0091\u0094\5\24\13\2\u0092\u0094\5 \21\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\23\3\2\2\2\u0095\u00a0\7%\2\2\u0096\u00a0\7,\2\2"+
		"\u0097\u00a0\5\36\20\2\u0098\u00a0\5D#\2\u0099\u00a0\5\32\16\2\u009a\u00a0"+
		"\5\34\17\2\u009b\u009c\7\36\2\2\u009c\u009d\5\22\n\2\u009d\u009e\7\37"+
		"\2\2\u009e\u00a0\3\2\2\2\u009f\u0095\3\2\2\2\u009f\u0096\3\2\2\2\u009f"+
		"\u0097\3\2\2\2\u009f\u0098\3\2\2\2\u009f\u0099\3\2\2\2\u009f\u009a\3\2"+
		"\2\2\u009f\u009b\3\2\2\2\u00a0\25\3\2\2\2\u00a1\u00a3\5> \2\u00a2\u00a1"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a7\3\2\2\2\u00a4\u00a6\5@!\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7,\2\2\u00ab"+
		"\u00ac\7\36\2\2\u00ac\u00ad\5\20\t\2\u00ad\u00ae\7\37\2\2\u00ae\27\3\2"+
		"\2\2\u00af\u00b0\5,\27\2\u00b0\u00b1\7\"\2\2\u00b1\u00bc\3\2\2\2\u00b2"+
		"\u00b3\5.\30\2\u00b3\u00b4\7\"\2\2\u00b4\u00bc\3\2\2\2\u00b5\u00bc\5\60"+
		"\31\2\u00b6\u00bc\5\62\32\2\u00b7\u00bc\5\64\33\2\u00b8\u00b9\5\32\16"+
		"\2\u00b9\u00ba\7\"\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00af\3\2\2\2\u00bb\u00b2"+
		"\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b6\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bb"+
		"\u00b8\3\2\2\2\u00bc\31\3\2\2\2\u00bd\u00c1\5:\36\2\u00be\u00c1\5<\37"+
		"\2\u00bf\u00c1\5\26\f\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\33\3\2\2\2\u00c2\u00c3\7\32\2\2\u00c3\u00c4\5\22"+
		"\n\2\u00c4\35\3\2\2\2\u00c5\u00c6\7%\2\2\u00c6\u00c7\7\35\2\2\u00c7\u00d4"+
		"\7,\2\2\u00c8\u00c9\7%\2\2\u00c9\u00cb\7\35\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00cd\7,\2\2\u00cd\u00cf\7\35"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\7,\2\2\u00d3\u00c5\3\2"+
		"\2\2\u00d3\u00ca\3\2\2\2\u00d4\37\3\2\2\2\u00d5\u00d8\5\"\22\2\u00d6\u00d8"+
		"\5(\25\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8!\3\2\2\2\u00d9"+
		"\u00da\b\22\1\2\u00da\u00db\5$\23\2\u00db\u00e1\3\2\2\2\u00dc\u00dd\f"+
		"\4\2\2\u00dd\u00de\7\13\2\2\u00de\u00e0\5$\23\2\u00df\u00dc\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2#\3\2\2\2"+
		"\u00e3\u00e1\3\2\2\2\u00e4\u00e5\b\23\1\2\u00e5\u00e6\5&\24\2\u00e6\u00ec"+
		"\3\2\2\2\u00e7\u00e8\f\4\2\2\u00e8\u00e9\7\n\2\2\u00e9\u00eb\5&\24\2\u00ea"+
		"\u00e7\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed%\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f8\7.\2\2\u00f0\u00f8"+
		"\7,\2\2\u00f1\u00f8\5\36\20\2\u00f2\u00f8\5\26\f\2\u00f3\u00f4\7\36\2"+
		"\2\u00f4\u00f5\5\"\22\2\u00f5\u00f6\7\37\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00ef\3\2\2\2\u00f7\u00f0\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f2\3\2"+
		"\2\2\u00f7\u00f3\3\2\2\2\u00f8\'\3\2\2\2\u00f9\u00fa\5\24\13\2\u00fa\u00fb"+
		"\5*\26\2\u00fb\u00fc\5\22\n\2\u00fc)\3\2\2\2\u00fd\u00fe\t\2\2\2\u00fe"+
		"+\3\2\2\2\u00ff\u0101\7*\2\2\u0100\u0102\5\22\n\2\u0101\u0100\3\2\2\2"+
		"\u0101\u0102\3\2\2\2\u0102-\3\2\2\2\u0103\u0104\5B\"\2\u0104\u0107\7,"+
		"\2\2\u0105\u0106\7\16\2\2\u0106\u0108\5\22\n\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108/\3\2\2\2\u0109\u010d\7 \2\2\u010a\u010c\5\30\r\2"+
		"\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\7!\2\2\u0111"+
		"\61\3\2\2\2\u0112\u0113\7&\2\2\u0113\u0114\7\36\2\2\u0114\u0115\5\22\n"+
		"\2\u0115\u0116\7\37\2\2\u0116\u0117\5\60\31\2\u0117\63\3\2\2\2\u0118\u011a"+
		"\5\66\34\2\u0119\u011b\58\35\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2"+
		"\u011b\65\3\2\2\2\u011c\u011d\7\'\2\2\u011d\u011e\7\36\2\2\u011e\u011f"+
		"\5\22\n\2\u011f\u0120\7\37\2\2\u0120\u0121\5\30\r\2\u0121\67\3\2\2\2\u0122"+
		"\u0123\7(\2\2\u0123\u0124\5\30\r\2\u01249\3\2\2\2\u0125\u0128\5\36\20"+
		"\2\u0126\u0128\7,\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u012a\7\16\2\2\u012a\u012b\5\22\n\2\u012b;\3\2\2\2\u012c"+
		"\u012d\7+\2\2\u012d\u012e\7,\2\2\u012e\u012f\7\36\2\2\u012f\u0130\5\20"+
		"\t\2\u0130\u0131\7\37\2\2\u0131=\3\2\2\2\u0132\u0137\7%\2\2\u0133\u0137"+
		"\5\36\20\2\u0134\u0137\5<\37\2\u0135\u0137\7,\2\2\u0136\u0132\3\2\2\2"+
		"\u0136\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\u0138"+
		"\3\2\2\2\u0138\u0139\7\35\2\2\u0139?\3\2\2\2\u013a\u013b\7,\2\2\u013b"+
		"\u013c\7\36\2\2\u013c\u013d\5\20\t\2\u013d\u013e\7\37\2\2\u013e\u013f"+
		"\7\35\2\2\u013fA\3\2\2\2\u0140\u0141\t\3\2\2\u0141C\3\2\2\2\u0142\u0143"+
		"\t\4\2\2\u0143E\3\2\2\2\"IQSY^dhms~\u0085\u008c\u008f\u0093\u009f\u00a2"+
		"\u00a7\u00bb\u00c0\u00ca\u00d0\u00d3\u00d7\u00e1\u00ec\u00f7\u0101\u0107"+
		"\u010d\u011a\u0127\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}