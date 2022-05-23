// Generated from D:/Raqha/Dokumente/DHBW_Vorlesungen/TheoInf/CUM/HouseOfCompiler/src/main/java/parser/grammar\JavaSubset.g4 by ANTLR 4.9.2
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
		StringValue=44, IntValue=45, WS=46, InlineComment=47, MultilineComment=48;
	public static final int
		RULE_program = 0, RULE_classdecl = 1, RULE_constuctorDecl = 2, RULE_methodDecl = 3, 
		RULE_fieldDecl = 4, RULE_parameterList = 5, RULE_parameter = 6, RULE_argumentList = 7, 
		RULE_expression = 8, RULE_subExpression = 9, RULE_methodCall = 10, RULE_statement = 11, 
		RULE_stmtExpr = 12, RULE_unaryExpr = 13, RULE_instVar = 14, RULE_binaryExpr = 15, 
		RULE_operator = 16, RULE_returnStmt = 17, RULE_localVarDecl = 18, RULE_block = 19, 
		RULE_whileStmt = 20, RULE_ifElseStmt = 21, RULE_ifStmt = 22, RULE_elseStmt = 23, 
		RULE_assign = 24, RULE_newDecl = 25, RULE_receiver = 26, RULE_receivingMethod = 27, 
		RULE_type = 28, RULE_value = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classdecl", "constuctorDecl", "methodDecl", "fieldDecl", 
			"parameterList", "parameter", "argumentList", "expression", "subExpression", 
			"methodCall", "statement", "stmtExpr", "unaryExpr", "instVar", "binaryExpr", 
			"operator", "returnStmt", "localVarDecl", "block", "whileStmt", "ifElseStmt", 
			"ifStmt", "elseStmt", "assign", "newDecl", "receiver", "receivingMethod", 
			"type", "value"
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
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				classdecl();
				}
				}
				setState(63); 
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
			setState(65);
			match(Class);
			setState(66);
			match(Identifier);
			setState(67);
			match(OpenCurlyBracket);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AccessModifier) | (1L << Void) | (1L << Boolean) | (1L << Char) | (1L << Int) | (1L << Identifier))) != 0)) {
				{
				setState(71);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(68);
					constuctorDecl();
					}
					break;
				case 2:
					{
					setState(69);
					fieldDecl();
					}
					break;
				case 3:
					{
					setState(70);
					methodDecl();
					}
					break;
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
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
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(78);
				match(AccessModifier);
				}
			}

			setState(81);
			match(Identifier);
			setState(82);
			match(OpenRoundBracket);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Char) | (1L << Int) | (1L << Identifier))) != 0)) {
				{
				setState(83);
				parameterList();
				}
			}

			setState(86);
			match(ClosedRoundBracket);
			setState(87);
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
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(89);
				match(AccessModifier);
				}
			}

			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boolean:
			case Char:
			case Int:
			case Identifier:
				{
				setState(92);
				type();
				}
				break;
			case Void:
				{
				setState(93);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(96);
			match(Identifier);
			setState(97);
			match(OpenRoundBracket);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Char) | (1L << Int) | (1L << Identifier))) != 0)) {
				{
				setState(98);
				parameterList();
				}
			}

			setState(101);
			match(ClosedRoundBracket);
			setState(102);
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
			type();
			setState(108);
			match(Identifier);
			setState(109);
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
			setState(111);
			parameter();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(112);
				match(Comma);
				setState(113);
				parameter();
				}
				}
				setState(118);
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
			setState(119);
			type();
			setState(120);
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
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanValue) | (1L << NullValue) | (1L << Not) | (1L << OpenRoundBracket) | (1L << This) | (1L << New) | (1L << Identifier) | (1L << CharValue) | (1L << StringValue) | (1L << IntValue))) != 0)) {
					{
					setState(122);
					expression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				expression();
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(126);
						match(Comma);
						setState(127);
						expression();
						}
						} 
					}
					setState(132);
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
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				subExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(This);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				instVar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				stmtExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				unaryExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				match(OpenRoundBracket);
				setState(146);
				expression();
				setState(147);
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
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(151);
				receiver();
				}
				break;
			}
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					receivingMethod();
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(160);
			match(Identifier);
			setState(161);
			match(OpenRoundBracket);
			setState(162);
			argumentList();
			setState(163);
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
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				returnStmt();
				setState(166);
				match(Semicolon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				localVarDecl();
				setState(169);
				match(Semicolon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				whileStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				ifElseStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				stmtExpr();
				setState(175);
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
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				newDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
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
			setState(184);
			match(Not);
			setState(185);
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
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(This);
				setState(188);
				match(Dot);
				setState(189);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==This) {
					{
					setState(190);
					match(This);
					setState(191);
					match(Dot);
					}
				}

				setState(196); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(194);
						match(Identifier);
						setState(195);
						match(Dot);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(198); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(200);
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
		enterRule(_localctx, 30, RULE_binaryExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			subExpression();
			setState(204);
			operator();
			setState(205);
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
		public TerminalNode Not() { return getToken(JavaSubsetParser.Not, 0); }
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
		enterRule(_localctx, 32, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DotOperator) | (1L << LineOperator) | (1L << ComparisonOperator) | (1L << LogicalOpertor) | (1L << Not))) != 0)) ) {
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
		enterRule(_localctx, 34, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(Return);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanValue) | (1L << NullValue) | (1L << Not) | (1L << OpenRoundBracket) | (1L << This) | (1L << New) | (1L << Identifier) | (1L << CharValue) | (1L << StringValue) | (1L << IntValue))) != 0)) {
				{
				setState(210);
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
		enterRule(_localctx, 36, RULE_localVarDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			type();
			setState(214);
			match(Identifier);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(215);
				match(Assign);
				setState(216);
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
		enterRule(_localctx, 38, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(OpenCurlyBracket);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Char) | (1L << Int) | (1L << OpenCurlyBracket) | (1L << This) | (1L << While) | (1L << If) | (1L << Return) | (1L << New) | (1L << Identifier))) != 0)) {
				{
				{
				setState(220);
				statement();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
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
		enterRule(_localctx, 40, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(While);
			setState(229);
			match(OpenRoundBracket);
			setState(230);
			expression();
			setState(231);
			match(ClosedRoundBracket);
			setState(232);
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
		enterRule(_localctx, 42, RULE_ifElseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			ifStmt();
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(235);
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
		enterRule(_localctx, 44, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(If);
			setState(239);
			match(OpenRoundBracket);
			setState(240);
			expression();
			setState(241);
			match(ClosedRoundBracket);
			setState(242);
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
		enterRule(_localctx, 46, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(Else);
			setState(245);
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
		enterRule(_localctx, 48, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(247);
				instVar();
				}
				break;
			case 2:
				{
				setState(248);
				match(Identifier);
				}
				break;
			}
			setState(251);
			match(Assign);
			setState(252);
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
			setState(254);
			match(New);
			setState(255);
			match(Identifier);
			setState(256);
			match(OpenRoundBracket);
			setState(257);
			argumentList();
			setState(258);
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
		enterRule(_localctx, 52, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(260);
				match(This);
				}
				break;
			case 2:
				{
				setState(261);
				instVar();
				}
				break;
			case 3:
				{
				setState(262);
				newDecl();
				}
				break;
			case 4:
				{
				setState(263);
				match(Identifier);
				}
				break;
			}
			setState(266);
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
		enterRule(_localctx, 54, RULE_receivingMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(Identifier);
			setState(269);
			match(OpenRoundBracket);
			setState(270);
			argumentList();
			setState(271);
			match(ClosedRoundBracket);
			setState(272);
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
		enterRule(_localctx, 56, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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
		enterRule(_localctx, 58, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0119\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\6\2@"+
		"\n\2\r\2\16\2A\3\3\3\3\3\3\3\3\3\3\3\3\7\3J\n\3\f\3\16\3M\13\3\3\3\3\3"+
		"\3\4\5\4R\n\4\3\4\3\4\3\4\5\4W\n\4\3\4\3\4\3\4\3\5\5\5]\n\5\3\5\3\5\5"+
		"\5a\n\5\3\5\3\5\3\5\5\5f\n\5\3\5\3\5\3\5\3\6\5\6l\n\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\7\7u\n\7\f\7\16\7x\13\7\3\b\3\b\3\b\3\t\5\t~\n\t\3\t\3\t"+
		"\3\t\7\t\u0083\n\t\f\t\16\t\u0086\13\t\5\t\u0088\n\t\3\n\3\n\5\n\u008c"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0098\n\13"+
		"\3\f\5\f\u009b\n\f\3\f\7\f\u009e\n\f\f\f\16\f\u00a1\13\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b4\n\r\3"+
		"\16\3\16\3\16\5\16\u00b9\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00c3\n\20\3\20\3\20\6\20\u00c7\n\20\r\20\16\20\u00c8\3\20\5\20"+
		"\u00cc\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\5\23\u00d6\n\23\3"+
		"\24\3\24\3\24\3\24\5\24\u00dc\n\24\3\25\3\25\7\25\u00e0\n\25\f\25\16\25"+
		"\u00e3\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u00ef"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\5\32\u00fc"+
		"\n\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\5\34\u010b\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3\37\3\u0084\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<\2\5\4\2\n\r\32\32\4\2\7\t,,\4\2\3\4-/\2\u0123\2?\3\2\2"+
		"\2\4C\3\2\2\2\6Q\3\2\2\2\b\\\3\2\2\2\nk\3\2\2\2\fq\3\2\2\2\16y\3\2\2\2"+
		"\20\u0087\3\2\2\2\22\u008b\3\2\2\2\24\u0097\3\2\2\2\26\u009a\3\2\2\2\30"+
		"\u00b3\3\2\2\2\32\u00b8\3\2\2\2\34\u00ba\3\2\2\2\36\u00cb\3\2\2\2 \u00cd"+
		"\3\2\2\2\"\u00d1\3\2\2\2$\u00d3\3\2\2\2&\u00d7\3\2\2\2(\u00dd\3\2\2\2"+
		"*\u00e6\3\2\2\2,\u00ec\3\2\2\2.\u00f0\3\2\2\2\60\u00f6\3\2\2\2\62\u00fb"+
		"\3\2\2\2\64\u0100\3\2\2\2\66\u010a\3\2\2\28\u010e\3\2\2\2:\u0114\3\2\2"+
		"\2<\u0116\3\2\2\2>@\5\4\3\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3"+
		"\3\2\2\2CD\7$\2\2DE\7,\2\2EK\7 \2\2FJ\5\6\4\2GJ\5\n\6\2HJ\5\b\5\2IF\3"+
		"\2\2\2IG\3\2\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3"+
		"\2\2\2NO\7!\2\2O\5\3\2\2\2PR\7\5\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7"+
		",\2\2TV\7\36\2\2UW\5\f\7\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\37\2\2YZ"+
		"\5(\25\2Z\7\3\2\2\2[]\7\5\2\2\\[\3\2\2\2\\]\3\2\2\2]`\3\2\2\2^a\5:\36"+
		"\2_a\7\6\2\2`^\3\2\2\2`_\3\2\2\2ab\3\2\2\2bc\7,\2\2ce\7\36\2\2df\5\f\7"+
		"\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\37\2\2hi\5(\25\2i\t\3\2\2\2jl\7\5"+
		"\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\5:\36\2no\7,\2\2op\7\"\2\2p\13\3"+
		"\2\2\2qv\5\16\b\2rs\7#\2\2su\5\16\b\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw"+
		"\3\2\2\2w\r\3\2\2\2xv\3\2\2\2yz\5:\36\2z{\7,\2\2{\17\3\2\2\2|~\5\22\n"+
		"\2}|\3\2\2\2}~\3\2\2\2~\u0088\3\2\2\2\177\u0084\5\22\n\2\u0080\u0081\7"+
		"#\2\2\u0081\u0083\5\22\n\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087}\3\2\2\2\u0087\177\3\2\2\2\u0088\21\3\2\2\2\u0089\u008c\5\24"+
		"\13\2\u008a\u008c\5 \21\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\23\3\2\2\2\u008d\u0098\7%\2\2\u008e\u0098\7,\2\2\u008f\u0098\5\36\20"+
		"\2\u0090\u0098\5<\37\2\u0091\u0098\5\32\16\2\u0092\u0098\5\34\17\2\u0093"+
		"\u0094\7\36\2\2\u0094\u0095\5\22\n\2\u0095\u0096\7\37\2\2\u0096\u0098"+
		"\3\2\2\2\u0097\u008d\3\2\2\2\u0097\u008e\3\2\2\2\u0097\u008f\3\2\2\2\u0097"+
		"\u0090\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0093\3\2"+
		"\2\2\u0098\25\3\2\2\2\u0099\u009b\5\66\34\2\u009a\u0099\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009f\3\2\2\2\u009c\u009e\58\35\2\u009d\u009c\3\2"+
		"\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7,\2\2\u00a3\u00a4\7\36"+
		"\2\2\u00a4\u00a5\5\20\t\2\u00a5\u00a6\7\37\2\2\u00a6\27\3\2\2\2\u00a7"+
		"\u00a8\5$\23\2\u00a8\u00a9\7\"\2\2\u00a9\u00b4\3\2\2\2\u00aa\u00ab\5&"+
		"\24\2\u00ab\u00ac\7\"\2\2\u00ac\u00b4\3\2\2\2\u00ad\u00b4\5(\25\2\u00ae"+
		"\u00b4\5*\26\2\u00af\u00b4\5,\27\2\u00b0\u00b1\5\32\16\2\u00b1\u00b2\7"+
		"\"\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00a7\3\2\2\2\u00b3\u00aa\3\2\2\2\u00b3"+
		"\u00ad\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b0\3\2"+
		"\2\2\u00b4\31\3\2\2\2\u00b5\u00b9\5\62\32\2\u00b6\u00b9\5\64\33\2\u00b7"+
		"\u00b9\5\26\f\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3"+
		"\2\2\2\u00b9\33\3\2\2\2\u00ba\u00bb\7\32\2\2\u00bb\u00bc\5\22\n\2\u00bc"+
		"\35\3\2\2\2\u00bd\u00be\7%\2\2\u00be\u00bf\7\35\2\2\u00bf\u00cc\7,\2\2"+
		"\u00c0\u00c1\7%\2\2\u00c1\u00c3\7\35\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c5\7,\2\2\u00c5\u00c7\7\35\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\7,\2\2\u00cb\u00bd\3\2\2\2\u00cb"+
		"\u00c2\3\2\2\2\u00cc\37\3\2\2\2\u00cd\u00ce\5\24\13\2\u00ce\u00cf\5\""+
		"\22\2\u00cf\u00d0\5\22\n\2\u00d0!\3\2\2\2\u00d1\u00d2\t\2\2\2\u00d2#\3"+
		"\2\2\2\u00d3\u00d5\7*\2\2\u00d4\u00d6\5\22\n\2\u00d5\u00d4\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6%\3\2\2\2\u00d7\u00d8\5:\36\2\u00d8\u00db\7,\2\2\u00d9"+
		"\u00da\7\16\2\2\u00da\u00dc\5\22\n\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3"+
		"\2\2\2\u00dc\'\3\2\2\2\u00dd\u00e1\7 \2\2\u00de\u00e0\5\30\r\2\u00df\u00de"+
		"\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7!\2\2\u00e5)\3\2\2\2\u00e6"+
		"\u00e7\7&\2\2\u00e7\u00e8\7\36\2\2\u00e8\u00e9\5\22\n\2\u00e9\u00ea\7"+
		"\37\2\2\u00ea\u00eb\5(\25\2\u00eb+\3\2\2\2\u00ec\u00ee\5.\30\2\u00ed\u00ef"+
		"\5\60\31\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef-\3\2\2\2\u00f0"+
		"\u00f1\7\'\2\2\u00f1\u00f2\7\36\2\2\u00f2\u00f3\5\22\n\2\u00f3\u00f4\7"+
		"\37\2\2\u00f4\u00f5\5\30\r\2\u00f5/\3\2\2\2\u00f6\u00f7\7(\2\2\u00f7\u00f8"+
		"\5\30\r\2\u00f8\61\3\2\2\2\u00f9\u00fc\5\36\20\2\u00fa\u00fc\7,\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7\16"+
		"\2\2\u00fe\u00ff\5\22\n\2\u00ff\63\3\2\2\2\u0100\u0101\7+\2\2\u0101\u0102"+
		"\7,\2\2\u0102\u0103\7\36\2\2\u0103\u0104\5\20\t\2\u0104\u0105\7\37\2\2"+
		"\u0105\65\3\2\2\2\u0106\u010b\7%\2\2\u0107\u010b\5\36\20\2\u0108\u010b"+
		"\5\64\33\2\u0109\u010b\7,\2\2\u010a\u0106\3\2\2\2\u010a\u0107\3\2\2\2"+
		"\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d"+
		"\7\35\2\2\u010d\67\3\2\2\2\u010e\u010f\7,\2\2\u010f\u0110\7\36\2\2\u0110"+
		"\u0111\5\20\t\2\u0111\u0112\7\37\2\2\u0112\u0113\7\35\2\2\u01139\3\2\2"+
		"\2\u0114\u0115\t\3\2\2\u0115;\3\2\2\2\u0116\u0117\t\4\2\2\u0117=\3\2\2"+
		"\2\36AIKQV\\`ekv}\u0084\u0087\u008b\u0097\u009a\u009f\u00b3\u00b8\u00c2"+
		"\u00c8\u00cb\u00d5\u00db\u00e1\u00ee\u00fb\u010a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}