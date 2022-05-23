// Generated from C:/Users/lukas/Documents/Git-Repositories/houseofcompiler/HouseOfCompiler/src/main/java/parser/grammar\JavaSubset.g4 by ANTLR 4.9.2
package parser.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaSubsetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaSubsetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JavaSubsetParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#classdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdecl(JavaSubsetParser.ClassdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#constuctorDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstuctorDecl(JavaSubsetParser.ConstuctorDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(JavaSubsetParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(JavaSubsetParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(JavaSubsetParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(JavaSubsetParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(JavaSubsetParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaSubsetParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(JavaSubsetParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(JavaSubsetParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaSubsetParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#stmtExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtExpr(JavaSubsetParser.StmtExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(JavaSubsetParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#instVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstVar(JavaSubsetParser.InstVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#binaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(JavaSubsetParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#calcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcExpr(JavaSubsetParser.CalcExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#dotExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotExpr(JavaSubsetParser.DotExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#dotSubExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotSubExpr(JavaSubsetParser.DotSubExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#nonCalcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonCalcExpr(JavaSubsetParser.NonCalcExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#nonCalcOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonCalcOperator(JavaSubsetParser.NonCalcOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(JavaSubsetParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#localVarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVarDecl(JavaSubsetParser.LocalVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaSubsetParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(JavaSubsetParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#ifElseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStmt(JavaSubsetParser.IfElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(JavaSubsetParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(JavaSubsetParser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(JavaSubsetParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#newDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewDecl(JavaSubsetParser.NewDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#receiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiver(JavaSubsetParser.ReceiverContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#receivingMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceivingMethod(JavaSubsetParser.ReceivingMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JavaSubsetParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JavaSubsetParser.ValueContext ctx);
}