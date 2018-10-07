import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class JavaBytecodeVisitor extends HelloBaseVisitor<String>{
	Map<String, interfaceNode> interfaceList = new HashMap<>();
	Map<String, classNode> classList = new HashMap<>();
	
	class interfaceNode {
		private List<methodNode> abstractMethods;
		
		public interfaceNode() {
			this.abstractMethods = new ArrayList<>();
		}
		
		public List<methodNode> getAbstractMethods() {
			return this.abstractMethods;
		}
	}
	
	class classNode {
		private List<String> classVariables;
		private List<String> classStaticVariables;
		private List<methodNode> classMethods;
		
		public classNode() {
			this.classMethods = new ArrayList<>();
		}
		
		public List<String> getClassVariables() {
			return this.classVariables;
		}
		
		public List<methodNode> getClassMethods() {
			return this.classMethods;
		}
	}
	
	class methodNode {
		private String methodName;
		private int numOfParam;
		
		public methodNode(String methodName, int numOfParam) {
			this.methodName = methodName;
			this.numOfParam = numOfParam;
		}
		
		public String getMethodName() {
			return this.methodName;
		}
		
		public int getNumOfParam() {
			return this.numOfParam;
		}
	}
	
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
		System.out.print(str);
		super.visitPackage_decl(ctx);
		System.out.println(";");
		return "";
	}
	
	@Override
	public String visitComma(HelloParser.CommaContext ctx) {
		// TODO Auto-generated method stub
		System.out.print(", ");
		return super.visitComma(ctx);
	}

	@Override
	public String visitDot(HelloParser.DotContext ctx) {
		// TODO Auto-generated method stub
		System.out.print(".");
		return super.visitDot(ctx);
	}

	@Override
	public String visitImport_decl(HelloParser.Import_declContext ctx) {
		// TODO Auto-generated method stubs
		String str = "import ";
		System.out.print(str);
		super.visitImport_decl(ctx);
		System.out.println(";");
		
		return "";
	}
	
	@Override
	public String visitInterface_decl(HelloParser.Interface_declContext ctx) {
		// TODO Auto-generated method stub
		//System.out.println("\nInterface decl");
		String str = "interface ";
		System.out.print(str);
		interfaceNode emptyInterfaceNode = new interfaceNode();
		interfaceList.put(ctx.ident().getText(), emptyInterfaceNode);
		return super.visitInterface_decl(ctx);
	}

	@Override
	public String visitInterface_compound(HelloParser.Interface_compoundContext ctx) {
		// TODO Auto-generated method stub
		String str = ctx.getChild(0).getText();
		System.out.println("\n" + str);
		super.visitInterface_compound(ctx);
		System.out.println(ctx.getChild(ctx.getChildCount()-1).getText());
		return "";
	}
	
	@Override
	public String visitInterface_method(HelloParser.Interface_methodContext ctx) {
		// TODO Auto-generated method stub
		String str = "public Object ";
		System.out.print(str);
		
		//save abstract method information of interface
		saveMethodInfoOfInterface(ctx);
		
		visit(ctx.getChild(0)); //print out abstract method name
		System.out.print(ctx.getChild(1).getText()); // (
		

		if (hasParameters(ctx)) {
			declareParam(ctx);
		}
		
		str = ctx.getChild((ctx.getChildCount()-1)).getText();
		System.out.println(str+";");
		return "";
	}
	
	public void saveMethodInfoOfInterface(HelloParser.Interface_methodContext ctx) {
		/*
		 * Create a method node and store the information in the node.
		 */
		String methodName = getMethodName(ctx);
		int numOfParams = getNumOfParams(ctx);
		methodNode methodInfo = new methodNode(methodName, numOfParams);
		
		/* Add information 
		 * from the corresponding abstract method 
		 * to the existing interface information.*/
		String interfaceName = getInterfaceName(ctx);
		interfaceNode interfaceNode = gerInterfaceNode(interfaceName);
		List<methodNode> abstractMethods = interfaceNode.getAbstractMethods();
		abstractMethods.add(methodInfo);
		this.interfaceList.replace(interfaceName, interfaceNode);
	}
	
	public int getNumOfParams(HelloParser.Interface_methodContext ctx) {
		List<HelloParser.ParamContext> params = ctx.params().param();
		
		return params.size();
	}
	
	public boolean hasParameters(HelloParser.Interface_methodContext ctx) {
		return getNumOfParams(ctx) > 0;
	}
	
	public void declareParam(HelloParser.Interface_methodContext ctx) {
		List<HelloParser.ParamContext> params = ctx.params().param();
		
		for (int i=0; i<params.size(); i++) {
			System.out.print("Object ");
			visit(params.get(i));
			
			if (i != params.size()-1) {
				System.out.print(", ");
			}
		}
	}
	
	public String getInterfaceName(HelloParser.Interface_methodContext ctx) {
		HelloParser.Interface_declContext interface_decl 
			= (HelloParser.Interface_declContext) ctx.parent.parent;
		
		return interface_decl.ident().getText();
	}
	
	public String getMethodName(HelloParser.Interface_methodContext ctx) {
		return ctx.ident().getText();
	}
	
	public interfaceNode gerInterfaceNode(String interfaceName) {
		return this.interfaceList.get(interfaceName);
	}
	
	@Override
	public String visitExtend(HelloParser.ExtendContext ctx) {
		// TODO Auto-generated method stub
		
		/* 
		 * structToExtend can be a interface or class
		 */
		String structToExtend = ctx.ident().getText();
		
		if (isInterface(ctx)) { // The target is interface
			if (isNotExistingInterface(structToExtend)) {
				
			}
		}
		else { // The target is class
			
		}
		return super.visitExtend(ctx);
	}
	
	public boolean isInterface(HelloParser.ExtendContext ctx) {
		Object temp = ctx.parent.getClass();
		Object temp2 = HelloParser.Interface_declContext.class;
		
		return (ctx.parent.getClass() == HelloParser.Interface_declContext.class);
	}
	
	public boolean isNotExistingInterface(String interfaceName) {
		return !this.interfaceList.containsKey(interfaceName);
	}
	
	@Override
	public String visitParams(HelloParser.ParamsContext ctx) {
		// TODO Auto-generated method stub	
		return super.visitParams(ctx);
	}
	
	@Override
	public String visitParam(HelloParser.ParamContext ctx) {
		// TODO Auto-generated method stub
		return super.visitParam(ctx);
	}
	
	@Override
	public String visitClass_decl(HelloParser.Class_declContext ctx) {
		// TODO Auto-generated method stub
		//System.out.println("Class decl");
		String str = "public class ";
		System.out.print(str);
		
		String className = ctx.ident().getText();
		classList.put(className, null);
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
		
		str += " implements " + getImplementationClassList(ctx);		
		System.out.println(str);
		return "";
	}
	
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
		//변수테이블에서 변수 관리
//		super.visitClass_field(ctx);
		declaresVar(ctx);
		return "";
	}
	
	public void declaresVar(HelloParser.Class_fieldContext ctx) {
		//can't cast to HelloParser.Assignment_stmtContext;
//		HelloParser.Assignment_stmtContext assignCtx = (HelloParser.Assignment_stmtContext) ctx.getChild(0);
//		
//		if (assignValue(assignCtx)) {
//			
//		}
//		else { //declaration without assignment
//			
//		}
	}
	
	public boolean assignValue(HelloParser.Assignment_stmtContext ctx) {
		return (ctx.getChildCount() == 3);
	}
	
	@Override
	public String visitClass_field_decl(HelloParser.Class_field_declContext ctx) {
		// TODO Auto-generated method stub
		//System.out.print("Class field decl");
		return super.visitClass_field_decl(ctx);
	}
	
	public boolean classHasMultipleVar(HelloParser.Class_field_declContext ctx){
		return (ctx.getParent().getChildCount() > 3);
	}
	@Override
	public String visitAssignment_stmt(HelloParser.Assignment_stmtContext ctx) {
		// TODO Auto-generated method stub
//		return super.visitAssignment_stmt(ctx);
		return "";
	}
	
	@Override
	public String visitIdent(HelloParser.IdentContext ctx) {
		// TODO Auto-generated method stub
		System.out.print(ctx.getPayload().getText());
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
