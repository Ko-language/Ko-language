import org.antlr.v4.runtime.tree.ParseTree;

public class JavaBytecodeVisitor extends HelloBaseVisitor<String>{

	@Override
	public String visitProgram(HelloParser.ProgramContext ctx) {
		// TODO Auto-generated method stub
		
		return super.visitProgram(ctx);
	}
	
	@Override
	public String visitPostfixUnaryOP(HelloParser.PostfixUnaryOPContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPostfixUnaryOP(ctx);
	}

	@Override
	public String visitImport_decl(HelloParser.Import_declContext ctx) {
		// TODO Auto-generated method stub
		return super.visitImport_decl(ctx);
	}

	@Override
	public String visitIf_stmt(HelloParser.If_stmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIf_stmt(ctx);
	}

	@Override
	public String visitBoolean_literal(HelloParser.Boolean_literalContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBoolean_literal(ctx);
	}

	

	@Override
	public String visitMethod_call(HelloParser.Method_callContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMethod_call(ctx);
	}

	@Override
	public String visitClass_compound(HelloParser.Class_compoundContext ctx) {
		// TODO Auto-generated method stub
		return super.visitClass_compound(ctx);
	}

	@Override
	public String visitClass_field_decl(HelloParser.Class_field_declContext ctx) {
		// TODO Auto-generated method stub
		return super.visitClass_field_decl(ctx);
	}

	@Override
	public String visitClass_method(HelloParser.Class_methodContext ctx) {
		// TODO Auto-generated method stub
		return super.visitClass_method(ctx);
	}

	@Override
	public String visitParam(HelloParser.ParamContext ctx) {
		// TODO Auto-generated method stub
		return super.visitParam(ctx);
	}

	@Override
	public String visitImplement(HelloParser.ImplementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitImplement(ctx);
	}

	@Override
	public String visitElse_if_condition(HelloParser.Else_if_conditionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitElse_if_condition(ctx);
	}

	@Override
	public String visitPackage_decl(HelloParser.Package_declContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPackage_decl(ctx);
	}

	@Override
	public String visitClass_field_array_decl(HelloParser.Class_field_array_declContext ctx) {
		// TODO Auto-generated method stub
		return super.visitClass_field_array_decl(ctx);
	}

	@Override
	public String visitReturn_stmt(HelloParser.Return_stmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitReturn_stmt(ctx);
	}

	@Override
	public String visitIdents(HelloParser.IdentsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIdents(ctx);
	}

	@Override
	public String visitIf_condition(HelloParser.If_conditionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIf_condition(ctx);
	}

	@Override
	public String visitAssignment_stmt(HelloParser.Assignment_stmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAssignment_stmt(ctx);
	}

	@Override
	public String visitWhile_stmt(HelloParser.While_stmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWhile_stmt(ctx);
	}

	@Override
	public String visitOp(HelloParser.OpContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOp(ctx);
	}

	@Override
	public String visitExpression(HelloParser.ExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitExpression(ctx);
	}

	@Override
	public String visitPrefixUnaryOP(HelloParser.PrefixUnaryOPContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPrefixUnaryOP(ctx);
	}

	@Override
	public String visitInterface_decl(HelloParser.Interface_declContext ctx) {
		// TODO Auto-generated method stub
		return super.visitInterface_decl(ctx);
	}

	@Override
	public String visitThis_prefix(HelloParser.This_prefixContext ctx) {
		// TODO Auto-generated method stub
		return super.visitThis_prefix(ctx);
	}

	@Override
	public String visitSuper_prefix(HelloParser.Super_prefixContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSuper_prefix(ctx);
	}

	@Override
	public String visitInterface_compound(HelloParser.Interface_compoundContext ctx) {
		// TODO Auto-generated method stub
		return super.visitInterface_compound(ctx);
	}

	@Override
	public String visitClass_field(HelloParser.Class_fieldContext ctx) {
		// TODO Auto-generated method stub
		return super.visitClass_field(ctx);
	}

	@Override
	public String visitParams(HelloParser.ParamsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitParams(ctx);
	}

	@Override
	public String visitElse_condition(HelloParser.Else_conditionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitElse_condition(ctx);
	}

	@Override
	public String visitCompound(HelloParser.CompoundContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCompound(ctx);
	}

	@Override
	public String visitClass_static_field(HelloParser.Class_static_fieldContext ctx) {
		// TODO Auto-generated method stub
		return super.visitClass_static_field(ctx);
	}

	@Override
	public String visitExtend(HelloParser.ExtendContext ctx) {
		// TODO Auto-generated method stub
		return super.visitExtend(ctx);
	}

	@Override
	public String visitArgs(HelloParser.ArgsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitArgs(ctx);
	}

	@Override
	public String visitContinue_stmt(HelloParser.Continue_stmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitContinue_stmt(ctx);
	}

	@Override
	public String visitBreak_stmt(HelloParser.Break_stmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBreak_stmt(ctx);
	}

	@Override
	public String visitClass_decl(HelloParser.Class_declContext ctx) {
		// TODO Auto-generated method stub
		return super.visitClass_decl(ctx);
	}

	@Override
	public String visitStmt(HelloParser.StmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStmt(ctx);
	}

}
