import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class JavaBytecodeVisitor extends HelloBaseVisitor<String>{
	
	@Override
	public String visitProgram(HelloParser.ProgramContext ctx) {
		// TODO Auto-generated method stub
		System.out.println();
		return super.visitProgram(ctx);
	}
	
	@Override
	public String visitPackage_decl(HelloParser.Package_declContext ctx) {
		// TODO Auto-generated method stub
		//Add "�ٷ���" to print out
		String str = "package ";
		super.visitPackage_decl(ctx);
		System.out.println(str + ";");
		return "";
	}
	
	@Override
	public String visitDot(HelloParser.DotContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDot(ctx);
	}

	@Override
	public String visitImport_decl(HelloParser.Import_declContext ctx) {
		// TODO Auto-generated method stubs
		String str = "import ";
		for (int i=1; i<ctx.getChildCount(); i++) {
			str += ctx.getChild(i).getText();
		}
		System.out.println(str+";");
		
		return super.visitImport_decl(ctx);
	}
	
	@Override
	public String visitInterface_decl(HelloParser.Interface_declContext ctx) {
		// TODO Auto-generated method stub
		//System.out.println("\nInterface decl");
		String str = "interface " + ctx.getChild(2).getText();
//		buf.append(str);
		System.out.println(str);
		return super.visitInterface_decl(ctx);
	}
	
	@Override
	public String visitInterface_compound(HelloParser.Interface_compoundContext ctx) {
		// TODO Auto-generated method stub
		String str = ctx.getChild(0).getText();
//		buf.append(str);
		System.out.println(str);
		super.visitInterface_compound(ctx);
		System.out.println(ctx.getChild(ctx.getChildCount()-1).getText());
		return "";
	}
	
	@Override
	public String visitInterface_method(HelloParser.Interface_methodContext ctx) {
		// TODO Auto-generated method stub
//		System.out.println("Interface method");
		String str = "public Object " 
					+ ctx.getChild(0).getText()
					+ ctx.getChild(1).getText();
		System.out.print(str);
		super.visitInterface_method(ctx);
		str = ctx.getChild((ctx.getChildCount()-1)).getText();
		System.out.println(str+";");
		return "";
	}

	@Override
	public String visitExtend(HelloParser.ExtendContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("Extend");
		return super.visitExtend(ctx);
	}
	
	@Override
	public String visitParams(HelloParser.ParamsContext ctx) {
		// TODO Auto-generated method stub
//		System.out.println("Params");
		int numOfOffspring = ctx.getChildCount();
		
		System.out.print(ctx.getChild(0).getText());
		
		//multiple parameters
		if (numOfOffspring != 1) {
			for (int i=2; i<ctx.getChildCount(); i=i+2) {
				System.out.print(", ");
				visit(ctx.getChild(i));
			}
		}
		return "";
	}
	
	@Override
	public String visitParam(HelloParser.ParamContext ctx) {
		// TODO Auto-generated method stub
		System.out.print(ctx.getChild(0).getText());
		return super.visitParam(ctx);
	}
	
	@Override
	public String visitClass_decl(HelloParser.Class_declContext ctx) {
		// TODO Auto-generated method stub
		//System.out.println("Class decl");
		String str = "public class " + ctx.getChild(2).getText();
		System.out.print(str + " ");
		
		return super.visitClass_decl(ctx);
	}
	
	@Override
	public String visitImplement(HelloParser.ImplementContext ctx) {
		// TODO Auto-generated method stub
		//System.out.println("Implement");
		String str = "";
//		if (afterExtends(ctx)) {
//			str += ", ";
//		}
		
		str += "implements " + getImplementationClassList(ctx);		
		System.out.println(str);
		return super.visitImplement(ctx);
	}
	
//	public boolean afterExtends(HelloParser.ImplementContext ctx) {
//		return (ctx.getChild(0).getText() == ",");
//	}
	
	public String getImplementationClassList(HelloParser.ImplementContext ctx) {
		//trim strings excepts class names
		String str = ctx.getPayload().getText();
		String list = str.split("]")[0];
		list = list.substring(1, list.length());

		return list + " ";
	}
	@Override
	public String visitClass_compound(HelloParser.Class_compoundContext ctx) {
		// TODO Auto-generated method stub
		System.out.println(ctx.getChild(0).getText());
		super.visitClass_compound(ctx);
		System.out.println(ctx.getChild((ctx.getChildCount()-1)).getText());
		return "";
	}
	
	@Override
	public String visitClass_field(HelloParser.Class_fieldContext ctx) {
		// TODO Auto-generated method stub
		System.out.print(ctx.getChild(0).getText());
		super.visitClass_field(ctx);
		System.out.print(ctx.getChild((ctx.getChildCount()-1)).getText());
		return "";
	}
	
	@Override
	public String visitClass_field_decl(HelloParser.Class_field_declContext ctx) {
		// TODO Auto-generated method stub
		//System.out.print("Class field decl");
		if (classHasMultipleVar(ctx)) {
			System.out.print(",");
		}
		return super.visitClass_field_decl(ctx);
	}
	
	public boolean classHasMultipleVar(HelloParser.Class_field_declContext ctx){
		return (ctx.getParent().getChildCount() > 3);
	}
	@Override
	public String visitAssignment_stmt(HelloParser.Assignment_stmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAssignment_stmt(ctx);
	}
	
	@Override
	public String visitIdent(HelloParser.IdentContext ctx) {
		// TODO Auto-generated method stub
		//System.out.print(ctx.getPayload().getText());
		return super.visitIdent(ctx);
	}

	@Override
	public String visitNum(HelloParser.NumContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNum(ctx);
	}

	@Override
	public String visitAssign_symbol(HelloParser.Assign_symbolContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAssign_symbol(ctx);
	}

	@Override
	public String visitReturn_symbol(HelloParser.Return_symbolContext ctx) {
		// TODO Auto-generated method stub
		return super.visitReturn_symbol(ctx);
	}

	public boolean assignsVal(HelloParser.Assignment_stmtContext ctx) {
		return (ctx.getChildCount() > 3);
	}
	@Override
	public String visitExpression(HelloParser.ExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitExpression(ctx);
	}
	
	@Override
	public String visitPostfixUnaryOP(HelloParser.PostfixUnaryOPContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPostfixUnaryOP(ctx);
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
	public String visitClass_method(HelloParser.Class_methodContext ctx) {
		// TODO Auto-generated method stub
		return super.visitClass_method(ctx);
	}

	@Override
	public String visitElse_if_condition(HelloParser.Else_if_conditionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitElse_if_condition(ctx);
	}

	@Override
	public String visitReturn_stmt(HelloParser.Return_stmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitReturn_stmt(ctx);
	}

	@Override
	public String visitIf_condition(HelloParser.If_conditionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIf_condition(ctx);
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
	public String visitPrefixUnaryOP(HelloParser.PrefixUnaryOPContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPrefixUnaryOP(ctx);
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
	public String visitStmt(HelloParser.StmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStmt(ctx);
	}

}
