// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
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
	 * Visit a parse tree produced by {@link HelloParser#postfixUnaryOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnaryOP(@NotNull HelloParser.PostfixUnaryOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#import_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_decl(@NotNull HelloParser.Import_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(@NotNull HelloParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(@NotNull HelloParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(@NotNull HelloParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(@NotNull HelloParser.DotContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(@NotNull HelloParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#assign_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_symbol(@NotNull HelloParser.Assign_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull HelloParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(@NotNull HelloParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#class_compound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_compound(@NotNull HelloParser.Class_compoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#class_field_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_field_decl(@NotNull HelloParser.Class_field_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#class_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_method(@NotNull HelloParser.Class_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(@NotNull HelloParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#implement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplement(@NotNull HelloParser.ImplementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#else_if_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_condition(@NotNull HelloParser.Else_if_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#package_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_decl(@NotNull HelloParser.Package_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#classSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSymbol(@NotNull HelloParser.ClassSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(@NotNull HelloParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#if_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condition(@NotNull HelloParser.If_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(@NotNull HelloParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(@NotNull HelloParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(@NotNull HelloParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#return_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_symbol(@NotNull HelloParser.Return_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull HelloParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#prefixUnaryOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnaryOP(@NotNull HelloParser.PrefixUnaryOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#interface_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_decl(@NotNull HelloParser.Interface_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#interface_compound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_compound(@NotNull HelloParser.Interface_compoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#class_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_field(@NotNull HelloParser.Class_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(@NotNull HelloParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#else_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_condition(@NotNull HelloParser.Else_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#compound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound(@NotNull HelloParser.CompoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#class_static_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_static_field(@NotNull HelloParser.Class_static_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#extend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtend(@NotNull HelloParser.ExtendContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(@NotNull HelloParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(@NotNull HelloParser.CommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(@NotNull HelloParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#interface_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_method(@NotNull HelloParser.Interface_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(@NotNull HelloParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#class_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_decl(@NotNull HelloParser.Class_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(@NotNull HelloParser.StmtContext ctx);
}