import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;

public class KoLangVisitor extends HelloBaseVisitor<String>{
	Procedure procedure = new ProcedureImpl();
	
	@Override
	public String visitProgram(HelloParser.ProgramContext ctx) {
		// TODO Auto-generated method stub
		return "";
	}
	
	@Override
	public String visitPackage_decl(HelloParser.Package_declContext ctx) {
		// TODO Auto-generated method stub
		//Add "�ٷ���" to print out
		return "";
	}
	
	@Override
	public String visitComma(HelloParser.CommaContext ctx) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String visitDot(HelloParser.DotContext ctx) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String visitImport_decl(HelloParser.Import_declContext ctx) {
		// TODO Auto-generated method stubs
		
		/* import하기 원하는 외부의 클래스 코드를 불러옴.
		 * storeCodesImported() 내부에서는 isExistingClass 등의 함수들을 사용해 코드 확인
		 * 
		 * @param
		 * @return void
		 */
		procedure.storeCodesImported();
		return "";
	}
	
	@Override
	public String visitInterface_decl(HelloParser.Interface_declContext ctx) {
		// TODO Auto-generated method stub
		
		/*
		 * Save new interface information with empty infoNode.
		 * (Just save the name of interface)
		 * 
		 * @param interfaceName name of interface to be initialized
		 * 
		 * or 
		 * 
		 * @param ctx 	Grammar context parameter(HelloParser.Interface_declContext)
		 * @return void
		 */
		procedure.initInterfaceInfo();
		return "";
	}

	@Override
	public String visitInterface_compound(HelloParser.Interface_compoundContext ctx) {
		// TODO Auto-generated method stub
		return "";
	}
	
	@Override
	public String visitInterface_method(HelloParser.Interface_methodContext ctx) {
		// TODO Auto-generated method stub
		
		/*
		 * This function returns number of parameter of interface's abstract method.
		 * 
		 * @param ctx 	Grammar context((HelloParser.Interface_methodContext)
		 * @return int 	This returns number of parameters
		 */
		int numOfParams = procedure.getNumOfParamsOfAbstractMethod(ctx);
		
		/*
		 * This function returns the name of interface's abstract method.
		 * 
		 * @param ctx grammar 	context((HelloParser.Interface_methodContext)
		 * @return String 	This returns the name of abstract method
		 */
		String abstractMethodName = procedure.getAbstractMethodName(ctx);
		
		
		/*
		 * Save the info(numOfParam, methodName) of abstract method.
		 * To save method information, 
		 * get the name of interface that the method is included.
		 * getInterfaceNameIncludingMethod() should be implemented to use in saveAbstractMethodInfo().
		 * 
		 */
		procedure.saveAbstractMethodInfo();
		return "";
	}
	
	@Override
	public String visitExtend(HelloParser.ExtendContext ctx) { 
		// TODO Auto-generated method stub
		
		/*
		 * This method checks the existence of class or interface to be extended.
		 * 'isInterface()' and 'isClass()' should be implemented 
		 * in this method to distinguish interface and class.
		 * 
		 * @param ctx	Grammar context (HelloParser.ExtendContext)
		 * @return boolean Returns true if the interface or class exists
		 */
		Boolean isExitsting = procedure.check_the_existence_of_class_Interface_to_be_extended(ctx);
		if(isExitsting) {
			
		}
		else {
			//에외처리
		}
		
		return "";
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
		
		/*
		 * Save new class information with empty infoNode.
		 * (Just save the name of interface)
		 * 
		 * @param className name of class to be initialized
		 * 
		 * or 
		 * 
		 * @param ctx 	Grammar context parameter(HelloParser.Class_declContext ctx)
		 * @return void
		 */
		procedure.initInterfaceInfo();
		return "";
	}
	
	@Override
	public String visitImplement(HelloParser.ImplementContext ctx) {
		// TODO Auto-generated method stub
		
		/*
		 * This method checks the existence of interface to be implemented.
		 * 
		 * @param ctx	Grammar context (HelloParser.ImplementContext)
		 * @return boolean Returns true if the interface exists
		 */
		List<String> interfaceListToBeImplemented 
						= procedure.getImplementationClassList(ctx);
		
		Boolean isExitsting = procedure.check_the_existence_of_Interface_to_be_implemented(interfaceListToBeImplemented);
		
		if(isExitsting) {
			
		}
		else {
			//에외처리
		}
		return "";
	}

//	@Override
//	public String visitPound(PoundContext ctx) {
//		// TODO Auto-generated method stub
//		return super.visitPound(ctx);
//	}

	@Override
	public String visitClassSymbol(HelloParser.ClassSymbolContext ctx) {
		// TODO Auto-generated method stub
		return super.visitClassSymbol(ctx);
	}

	@Override
	public String visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		return super.visitTerminal(node);
	}

	@Override
	public String visitClass_compound(HelloParser.Class_compoundContext ctx) {
		// TODO Auto-generated method stub
		return "";
	}
	
	@Override
	public String visitClass_static_field(HelloParser.Class_static_fieldContext ctx) {
		// TODO Auto-generated method stub
		
		/*
		 * Save static variable information to class table.
		 * The variables that have same name can't be declared twice.
		 * So isExistingVariable() has to be called to check duplication.
		 * 
		 * @param ctx Grammar context(HelloParser.Class_static_fieldContext)
		 * @return void
		 */
		procedure.saveStaticVariables(ctx);
//		printStaticvariables();
		return super.visitClass_static_field(ctx);
	}
	
	@Override
	public String visitClass_field(HelloParser.Class_fieldContext ctx) {
		// TODO Auto-generated method stub
		return "";
	}
	
	@Override
	public String visitClass_field_decl(HelloParser.Class_field_declContext ctx) {
		// TODO Auto-generated method stub
		
		/*
		 * Save variable information to class table.
		 * 
		 * @param ctx Grammar context(HelloParser.Class_static_fieldContext)
		 * @return void
		 */
		procedure.saveClassVariables();
//		printClassvariables();
		return "";
	}

	@Override
	public String visitClass_method(HelloParser.Class_methodContext ctx) {
		// TODO Auto-generated method stub
		
		/*
		 * This function returns number of parameter of class' method.
		 * 
		 * @param ctx 	Grammar context(HelloParser.Class_methodContext)
		 * @return int 	This returns number of parameters
		 */
		int numOfParams = procedure.getNumOfParamsOfClassMethod(ctx);
		
		/*
		 * This function returns the name of class' method.
		 * 
		 * @param ctx grammar 	context((HelloParser.Interface_methodContext)
		 * @return String 	This returns the name of abstract method
		 */
		String abstractMethodName = procedure.getCurrentMethodName(ctx);
		
		
		/*
		 * Save the info(numOfParam, methodName) of abstract method.
		 * To save method information, 
		 * get the name of interface that the method is included.
		 * getInterfaceNameIncludingMethod() should be implemented to use in saveAbstractMethodInfo().
		 * 
		 */
		procedure.saveClassMethodInfo();
		return super.visitClass_method(ctx);
	}
	
	@Override
	public String visitAssignment_stmt(HelloParser.Assignment_stmtContext ctx) {
		// TODO Auto-generated method stub
		
		/*
		 * isVariableDeclWithValueAssignment() method should be implemented in isValidAssignment
		 * to distinguish simple declaration and declarationWithAssignment.
		 * 
		 * In the value assignment statement(declaration with value assignment)(ex. a<-b),
		 * statement should check the validation of left-hand and right-hand.
		 * Integer value can't be a left-hand
		 * and the variables that have not been declared can't be a right-hand.
		 * 
		 * Declaration without value assignment,
		 * just print it.
		 * 
		 * @param ctx 	Grammar context(HelloParser.Assignment_stmtContex)
		 * @return boolean	True if the expression is valid
		 */
		Boolean isValidAssignment = procedure.isValidAssignment(ctx);
		
		if (isValidAssignment) {
			
		}
		else {
			//예외처리
		}
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
	public String visitReturn_stmt(HelloParser.Return_stmtContext ctx) {
		// TODO Auto-generated method stub
		
		/* This method checks that the target to be returned is valid.
		 * For example, in statement 'return a', a has not been declared before.
		 * 	
		 * @param ctx Grammar context(HelloParser.Return_stmtContext);
		 * @return void
		 */
		boolean returnTargetIsValid = procedure.returnTargetIsValid(ctx);
		if(returnTargetIsValid) {
			
		}
		else {
			//예외처리
		}
		return super.visitReturn_stmt(ctx);
	}
	
	@Override
	public String visitReturn_symbol(HelloParser.Return_symbolContext ctx) {
		// TODO Auto-generated method stub
		return super.visitReturn_symbol(ctx);
	}

//	public boolean assignsVal(HelloParser.Assignment_stmtContext ctx) {
//		return (ctx.getChildCount() > 3);
//	}
	
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
	public String visitIf_condition(HelloParser.If_conditionContext ctx) {
		// TODO Auto-generated method stub
		
		/*
		 * This method checks condition has boolean value or returns boolean value.
		 * 
		 * @param ctx	Grammar context(HelloParser.If_stmtContext)
		 * @return boolean True if variable is boolean value or method returns boolean value
		 */
		boolean conditionIsBooleanValue = procedure.conditionIsBooleanValue(ctx);
		if(!conditionIsBooleanValue) {
			//조건문이 boolean 값이 아닐 때의 예외처리
		}
		;
		return super.visitIf_condition(ctx);
	}
	
	@Override
	public String visitBoolean_literal(HelloParser.Boolean_literalContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBoolean_literal(ctx);
	}


	@Override
	public String visitMethod_call(HelloParser.Method_callContext ctx) {
		// TODO Auto-generated method stub
		String currentClassName = procedure.getCurrentClassName(ctx);
		String currentMethodName = procedure.getCurrentMethodName(ctx);
		
		/*
		 * To call method, check the existence of method
		 * and current class contains this method.
		 * 
		 * @param String,String		currentClassName, currentMethodName
		 * @return boolean		True if the method is existing in current class
		 */
		boolean isExistingMethod = procedure.isExistingMethod(currentClassName, currentMethodName);
		if (isExistingMethod) {
			
		}
		else {
			//예외처리
		}
		return super.visitMethod_call(ctx);
	}

	@Override
	public String visitElse_if_condition(HelloParser.Else_if_conditionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitElse_if_condition(ctx);
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
