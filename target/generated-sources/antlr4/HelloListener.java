// Generated from Hello.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HelloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(HelloParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(HelloParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#compound}.
	 * @param ctx the parse tree
	 */
	void enterCompound(HelloParser.CompoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#compound}.
	 * @param ctx the parse tree
	 */
	void exitCompound(HelloParser.CompoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(HelloParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(HelloParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(HelloParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(HelloParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HelloParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HelloParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(HelloParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(HelloParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#class_field}.
	 * @param ctx the parse tree
	 */
	void enterClass_field(HelloParser.Class_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#class_field}.
	 * @param ctx the parse tree
	 */
	void exitClass_field(HelloParser.Class_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#class_field_decl}.
	 * @param ctx the parse tree
	 */
	void enterClass_field_decl(HelloParser.Class_field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#class_field_decl}.
	 * @param ctx the parse tree
	 */
	void exitClass_field_decl(HelloParser.Class_field_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#class_field_array_decl}.
	 * @param ctx the parse tree
	 */
	void enterClass_field_array_decl(HelloParser.Class_field_array_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#class_field_array_decl}.
	 * @param ctx the parse tree
	 */
	void exitClass_field_array_decl(HelloParser.Class_field_array_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expression_array}.
	 * @param ctx the parse tree
	 */
	void enterExpression_array(HelloParser.Expression_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expression_array}.
	 * @param ctx the parse tree
	 */
	void exitExpression_array(HelloParser.Expression_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#array_ident}.
	 * @param ctx the parse tree
	 */
	void enterArray_ident(HelloParser.Array_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#array_ident}.
	 * @param ctx the parse tree
	 */
	void exitArray_ident(HelloParser.Array_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#class_ident}.
	 * @param ctx the parse tree
	 */
	void enterClass_ident(HelloParser.Class_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#class_ident}.
	 * @param ctx the parse tree
	 */
	void exitClass_ident(HelloParser.Class_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(HelloParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(HelloParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(HelloParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(HelloParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(HelloParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(HelloParser.OpContext ctx);
}