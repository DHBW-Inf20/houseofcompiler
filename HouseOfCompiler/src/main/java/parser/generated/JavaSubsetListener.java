// Generated from C:/Users/lukas/Documents/Git-Repositories/houseofcompiler/HouseOfCompiler/src/main/java/parser/grammar\JavaSubset.g4 by ANTLR 4.9.2
package parser.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaSubsetParser}.
 */
public interface JavaSubsetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JavaSubsetParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JavaSubsetParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#classdecl}.
	 * @param ctx the parse tree
	 */
	void enterClassdecl(JavaSubsetParser.ClassdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#classdecl}.
	 * @param ctx the parse tree
	 */
	void exitClassdecl(JavaSubsetParser.ClassdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#constuctorDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstuctorDecl(JavaSubsetParser.ConstuctorDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#constuctorDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstuctorDecl(JavaSubsetParser.ConstuctorDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(JavaSubsetParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(JavaSubsetParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(JavaSubsetParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(JavaSubsetParser.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(JavaSubsetParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(JavaSubsetParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(JavaSubsetParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(JavaSubsetParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(JavaSubsetParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(JavaSubsetParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaSubsetParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaSubsetParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(JavaSubsetParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(JavaSubsetParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(JavaSubsetParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(JavaSubsetParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaSubsetParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaSubsetParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#stmtExpr}.
	 * @param ctx the parse tree
	 */
	void enterStmtExpr(JavaSubsetParser.StmtExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#stmtExpr}.
	 * @param ctx the parse tree
	 */
	void exitStmtExpr(JavaSubsetParser.StmtExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(JavaSubsetParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(JavaSubsetParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#crementExpr}.
	 * @param ctx the parse tree
	 */
	void enterCrementExpr(JavaSubsetParser.CrementExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#crementExpr}.
	 * @param ctx the parse tree
	 */
	void exitCrementExpr(JavaSubsetParser.CrementExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#incExpr}.
	 * @param ctx the parse tree
	 */
	void enterIncExpr(JavaSubsetParser.IncExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#incExpr}.
	 * @param ctx the parse tree
	 */
	void exitIncExpr(JavaSubsetParser.IncExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#decExpr}.
	 * @param ctx the parse tree
	 */
	void enterDecExpr(JavaSubsetParser.DecExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#decExpr}.
	 * @param ctx the parse tree
	 */
	void exitDecExpr(JavaSubsetParser.DecExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#assignableExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignableExpr(JavaSubsetParser.AssignableExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#assignableExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignableExpr(JavaSubsetParser.AssignableExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#instVar}.
	 * @param ctx the parse tree
	 */
	void enterInstVar(JavaSubsetParser.InstVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#instVar}.
	 * @param ctx the parse tree
	 */
	void exitInstVar(JavaSubsetParser.InstVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#binaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(JavaSubsetParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#binaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(JavaSubsetParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void enterCalcExpr(JavaSubsetParser.CalcExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void exitCalcExpr(JavaSubsetParser.CalcExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#dotExpr}.
	 * @param ctx the parse tree
	 */
	void enterDotExpr(JavaSubsetParser.DotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#dotExpr}.
	 * @param ctx the parse tree
	 */
	void exitDotExpr(JavaSubsetParser.DotExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#dotSubExpr}.
	 * @param ctx the parse tree
	 */
	void enterDotSubExpr(JavaSubsetParser.DotSubExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#dotSubExpr}.
	 * @param ctx the parse tree
	 */
	void exitDotSubExpr(JavaSubsetParser.DotSubExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#nonCalcExpr}.
	 * @param ctx the parse tree
	 */
	void enterNonCalcExpr(JavaSubsetParser.NonCalcExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#nonCalcExpr}.
	 * @param ctx the parse tree
	 */
	void exitNonCalcExpr(JavaSubsetParser.NonCalcExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#nonCalcOperator}.
	 * @param ctx the parse tree
	 */
	void enterNonCalcOperator(JavaSubsetParser.NonCalcOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#nonCalcOperator}.
	 * @param ctx the parse tree
	 */
	void exitNonCalcOperator(JavaSubsetParser.NonCalcOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(JavaSubsetParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(JavaSubsetParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#localVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterLocalVarDecl(JavaSubsetParser.LocalVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#localVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitLocalVarDecl(JavaSubsetParser.LocalVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaSubsetParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaSubsetParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(JavaSubsetParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(JavaSubsetParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(JavaSubsetParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(JavaSubsetParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#ifElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStmt(JavaSubsetParser.IfElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#ifElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStmt(JavaSubsetParser.IfElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(JavaSubsetParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(JavaSubsetParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(JavaSubsetParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(JavaSubsetParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(JavaSubsetParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(JavaSubsetParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#newDecl}.
	 * @param ctx the parse tree
	 */
	void enterNewDecl(JavaSubsetParser.NewDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#newDecl}.
	 * @param ctx the parse tree
	 */
	void exitNewDecl(JavaSubsetParser.NewDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(JavaSubsetParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(JavaSubsetParser.ReceiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#receivingMethod}.
	 * @param ctx the parse tree
	 */
	void enterReceivingMethod(JavaSubsetParser.ReceivingMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#receivingMethod}.
	 * @param ctx the parse tree
	 */
	void exitReceivingMethod(JavaSubsetParser.ReceivingMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaSubsetParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaSubsetParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JavaSubsetParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JavaSubsetParser.ValueContext ctx);
}