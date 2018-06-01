// Generated from Hello.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(HelloParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#compound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound(HelloParser.CompoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(HelloParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(HelloParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HelloParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(HelloParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#class_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_field(HelloParser.Class_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#class_field_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_field_decl(HelloParser.Class_field_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#class_field_array_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_field_array_decl(HelloParser.Class_field_array_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#expression_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_array(HelloParser.Expression_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#array_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_ident(HelloParser.Array_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#class_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_ident(HelloParser.Class_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(HelloParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(HelloParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(HelloParser.OpContext ctx);
}