// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#postfixUnaryOP}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryOP(@NotNull HelloParser.PostfixUnaryOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#postfixUnaryOP}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryOP(@NotNull HelloParser.PostfixUnaryOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#import_decl}.
	 * @param ctx the parse tree
	 */
	void enterImport_decl(@NotNull HelloParser.Import_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#import_decl}.
	 * @param ctx the parse tree
	 */
	void exitImport_decl(@NotNull HelloParser.Import_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(@NotNull HelloParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(@NotNull HelloParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(@NotNull HelloParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(@NotNull HelloParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(@NotNull HelloParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(@NotNull HelloParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#dot}.
	 * @param ctx the parse tree
	 */
	void enterDot(@NotNull HelloParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#dot}.
	 * @param ctx the parse tree
	 */
	void exitDot(@NotNull HelloParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(@NotNull HelloParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(@NotNull HelloParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#assign_symbol}.
	 * @param ctx the parse tree
	 */
	void enterAssign_symbol(@NotNull HelloParser.Assign_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#assign_symbol}.
	 * @param ctx the parse tree
	 */
	void exitAssign_symbol(@NotNull HelloParser.Assign_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull HelloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull HelloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(@NotNull HelloParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(@NotNull HelloParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#class_compound}.
	 * @param ctx the parse tree
	 */
	void enterClass_compound(@NotNull HelloParser.Class_compoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#class_compound}.
	 * @param ctx the parse tree
	 */
	void exitClass_compound(@NotNull HelloParser.Class_compoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#class_field_decl}.
	 * @param ctx the parse tree
	 */
	void enterClass_field_decl(@NotNull HelloParser.Class_field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#class_field_decl}.
	 * @param ctx the parse tree
	 */
	void exitClass_field_decl(@NotNull HelloParser.Class_field_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#class_method}.
	 * @param ctx the parse tree
	 */
	void enterClass_method(@NotNull HelloParser.Class_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#class_method}.
	 * @param ctx the parse tree
	 */
	void exitClass_method(@NotNull HelloParser.Class_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(@NotNull HelloParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(@NotNull HelloParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#implement}.
	 * @param ctx the parse tree
	 */
	void enterImplement(@NotNull HelloParser.ImplementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#implement}.
	 * @param ctx the parse tree
	 */
	void exitImplement(@NotNull HelloParser.ImplementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#else_if_condition}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_condition(@NotNull HelloParser.Else_if_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#else_if_condition}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_condition(@NotNull HelloParser.Else_if_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#package_decl}.
	 * @param ctx the parse tree
	 */
	void enterPackage_decl(@NotNull HelloParser.Package_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#package_decl}.
	 * @param ctx the parse tree
	 */
	void exitPackage_decl(@NotNull HelloParser.Package_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#classSymbol}.
	 * @param ctx the parse tree
	 */
	void enterClassSymbol(@NotNull HelloParser.ClassSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#classSymbol}.
	 * @param ctx the parse tree
	 */
	void exitClassSymbol(@NotNull HelloParser.ClassSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(@NotNull HelloParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(@NotNull HelloParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void enterIf_condition(@NotNull HelloParser.If_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void exitIf_condition(@NotNull HelloParser.If_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(@NotNull HelloParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(@NotNull HelloParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(@NotNull HelloParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(@NotNull HelloParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(@NotNull HelloParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(@NotNull HelloParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#return_symbol}.
	 * @param ctx the parse tree
	 */
	void enterReturn_symbol(@NotNull HelloParser.Return_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#return_symbol}.
	 * @param ctx the parse tree
	 */
	void exitReturn_symbol(@NotNull HelloParser.Return_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull HelloParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull HelloParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#prefixUnaryOP}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryOP(@NotNull HelloParser.PrefixUnaryOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#prefixUnaryOP}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryOP(@NotNull HelloParser.PrefixUnaryOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#interface_decl}.
	 * @param ctx the parse tree
	 */
	void enterInterface_decl(@NotNull HelloParser.Interface_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#interface_decl}.
	 * @param ctx the parse tree
	 */
	void exitInterface_decl(@NotNull HelloParser.Interface_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#interface_compound}.
	 * @param ctx the parse tree
	 */
	void enterInterface_compound(@NotNull HelloParser.Interface_compoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#interface_compound}.
	 * @param ctx the parse tree
	 */
	void exitInterface_compound(@NotNull HelloParser.Interface_compoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#class_field}.
	 * @param ctx the parse tree
	 */
	void enterClass_field(@NotNull HelloParser.Class_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#class_field}.
	 * @param ctx the parse tree
	 */
	void exitClass_field(@NotNull HelloParser.Class_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(@NotNull HelloParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(@NotNull HelloParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#else_condition}.
	 * @param ctx the parse tree
	 */
	void enterElse_condition(@NotNull HelloParser.Else_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#else_condition}.
	 * @param ctx the parse tree
	 */
	void exitElse_condition(@NotNull HelloParser.Else_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#compound}.
	 * @param ctx the parse tree
	 */
	void enterCompound(@NotNull HelloParser.CompoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#compound}.
	 * @param ctx the parse tree
	 */
	void exitCompound(@NotNull HelloParser.CompoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#class_static_field}.
	 * @param ctx the parse tree
	 */
	void enterClass_static_field(@NotNull HelloParser.Class_static_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#class_static_field}.
	 * @param ctx the parse tree
	 */
	void exitClass_static_field(@NotNull HelloParser.Class_static_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#extend}.
	 * @param ctx the parse tree
	 */
	void enterExtend(@NotNull HelloParser.ExtendContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#extend}.
	 * @param ctx the parse tree
	 */
	void exitExtend(@NotNull HelloParser.ExtendContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(@NotNull HelloParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(@NotNull HelloParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(@NotNull HelloParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(@NotNull HelloParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(@NotNull HelloParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(@NotNull HelloParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#interface_method}.
	 * @param ctx the parse tree
	 */
	void enterInterface_method(@NotNull HelloParser.Interface_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#interface_method}.
	 * @param ctx the parse tree
	 */
	void exitInterface_method(@NotNull HelloParser.Interface_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(@NotNull HelloParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(@NotNull HelloParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#class_decl}.
	 * @param ctx the parse tree
	 */
	void enterClass_decl(@NotNull HelloParser.Class_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#class_decl}.
	 * @param ctx the parse tree
	 */
	void exitClass_decl(@NotNull HelloParser.Class_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull HelloParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull HelloParser.StmtContext ctx);
}