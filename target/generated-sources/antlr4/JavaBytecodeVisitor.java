import java.util.HashMap;
import java.util.List;
import java.util.Stack;


public class JavaBytecodeVisitor extends HelloBaseVisitor<String>{
   
   HashMap<String, Integer> simpleManager = new HashMap<String, Integer>();
   boolean isInterface = false;
   //VariableInterface manager = new VariableInterface();
   String currentClass = "";
   String currentMethod = "";
   //Stack<Field> localVariables = new Stack<Field>();
   
   boolean static_option = false;
   
   @Override
   public String visitProgram(HelloParser.ProgramContext ctx) {
      System.out.println();
      return super.visitProgram(ctx);
   }
   
   @Override
   public String visitPackage_decl(HelloParser.Package_declContext ctx) {
      System.out.print("package ");
      super.visitPackage_decl(ctx);
      System.out.println(";");
      return "";
   }
   
   @Override
   public String visitImport_decl(HelloParser.Import_declContext ctx) {
      
      System.out.print("import ");
      super.visitImport_decl(ctx);
      System.out.println(";");
      return "";
   }
   
   @Override
   public String visitInterface_decl(HelloParser.Interface_declContext ctx) {
      // TODO Auto-generated method stub
      //System.out.println("\nInterface decl");\
      System.out.print("public interface ");
      isInterface = true;
      super.visitInterface_decl(ctx);
      isInterface = false;
      return "";
   }
   
   @Override
   public String visitInterface_compound(HelloParser.Interface_compoundContext ctx) {
      // TODO Auto-generated method stub
      System.out.println("{");
      for(int i = 0; i < ctx.interface_method().size(); i++){
         visit(ctx.interface_method().get(i));
         System.out.println();
      }
      System.out.println("}");
      return "";
   }
   
   @Override
   public String visitInterface_method(HelloParser.Interface_methodContext ctx) {
      System.out.print("public Object ");
      visit(ctx.getChild(0));
      System.out.print("(");
      if(ctx.params() != null){
         visit(ctx.getChild(2));
      }
      System.out.print(");");
      return "";
   }

   @Override
   public String visitExtend(HelloParser.ExtendContext ctx) {
      // TODO Auto-generated method stub
      System.out.print(" extends ");
      return super.visitExtend(ctx);
   }
   
   @Override
   public String visitParams(HelloParser.ParamsContext ctx) {
      // TODO Auto-generated method stub
      for(int i = 0; i < ctx.param().size(); i++){
         System.out.print("Object ");
         visit(ctx.param(i));
         if(i < ctx.param().size()-1) System.out.print(", ");
      }
      return "";
      
   }
   @Override
   public String visitDot(HelloParser.DotContext ctx) {
      System.out.print(".");
      return super.visitDot(ctx);
   }

   @Override
   public String visitComma(HelloParser.CommaContext ctx) {
      return super.visitComma(ctx);
   }

   @Override
   public String visitParam(HelloParser.ParamContext ctx) {
      
      return super.visitParam(ctx);
   }
   
   @Override
   public String visitClass_decl(HelloParser.Class_declContext ctx) {
            
      System.out.print("public class ");
      
      //classNode classNode = new classNode(ctx.ident().getText());
      //manager.getClassTree().add(classNode);
      //Method defaultConstructor = new Method(ctx.ident().getText());
      //classNode.getMethod().add(defaultConstructor);
      currentClass = ctx.ident().getText();
      
      return super.visitClass_decl(ctx);
   }
   
   @Override
   public String visitImplement(HelloParser.ImplementContext ctx) {
      System.out.print(" implements ");
      super.visitImplement(ctx);
      System.out.println("");
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
      System.out.println("{");
      super.visitClass_compound(ctx);
      System.out.println("}");
      return "";
   }
   
   @Override
   public String visitClass_field(HelloParser.Class_fieldContext ctx) {
      // TODO Auto-generated method stub
      /**
      System.out.print(ctx.getChild(0).getText());
      super.visitClass_field(ctx);
      System.out.print(ctx.getChild((ctx.getChildCount()-1)).getText());
      */
      String str_static = "";
      
//      classNode nowMethod = manager.classSearch(currentClass);
//      for(int i = 0; i < ctx.class_field_decl().size(); i++){
//         List a = ctx.class_field_decl().get(i).assignment_stmt().expression();
//         if(a.size() == 1){
//            String varName = ctx.class_field_decl().get(i).assignment_stmt().expression(0).getText();
//            Field variable = new Field(varName);
//            nowMethod.getVariable().add(variable);
//         } else if(a.size() == 2){
//            String varName = ctx.class_field_decl().get(i).assignment_stmt().expression(0).getText();
//            Object varVar = ctx.class_field_decl().get(i).assignment_stmt().expression(1).getText();
//            Field variable = new Field(varName, static_option, 0, varVar);
//            nowMethod.getVariable().add(variable);
//         }
//      }
      
      // if(static_option) str_static = "static ";
      // System.out.print("public " + str_static + "Object ");
      super.visitClass_field(ctx);
      System.out.println();
      return "";
   }
   
   @Override
   public String visitClass_field_decl(HelloParser.Class_field_declContext ctx) {
      // TODO Auto-generated method stub
      
      return super.visitClass_field_decl(ctx);
   }
   
   public boolean classHasMultipleVar(HelloParser.Class_field_declContext ctx){
      return (ctx.getParent().getChildCount() > 3);
   }
   @Override
   public String visitAssignment_stmt(HelloParser.Assignment_stmtContext ctx) {
      // TODO Auto-generated method stub
      if(simpleManager.get(ctx.expression(0).getText()) == null){
         if(static_option){
            System.out.print("public static Object ");
         } else {
            System.out.print("public Object ");
         }
         simpleManager.put(ctx.expression(0).getText(), 0);
      } 
      visit(ctx.expression(0));
      if(ctx.assign_symbol() != null){
         visit(ctx.assign_symbol());
         visit(ctx.expression(1));
      }
      
      System.out.println(";");
      return "";
   }
   
   public boolean assignsVal(HelloParser.Assignment_stmtContext ctx) {
      return (ctx.getChildCount() > 3);
   }
   @Override
   public String visitExpression(HelloParser.ExpressionContext ctx) {
      
      if(ctx.STR() != null){
         System.out.print(ctx.STR().getText());
         return "";
      } else if(ctx.expression(0) != null & ctx.getChild(0).getText().equals("(")){
         System.out.print("(");
         visit(ctx.expression(0));
         System.out.print(")");
         return "";
      } else if(ctx.getChildCount() == 4 && ctx.getChild(1).getText().equals("[")){
         visit(ctx.expression(0));
         System.out.print("[");
         visit(ctx.expression(1));
         System.out.print("]");
         return "";
      } else if(ctx.getChildCount() == 3 && ctx.getChild(0).getText().equals("[")){
         System.out.print("[");
         visit(ctx.expression(0));
         System.out.print("]");
         return "";
      }
      return super.visitExpression(ctx);
   }
   
   @Override
   public String visitPostfixUnaryOP(HelloParser.PostfixUnaryOPContext ctx) {
      System.out.print(ctx.getText());
      return super.visitPostfixUnaryOP(ctx);
   }
   @Override
   public String visitIf_stmt(HelloParser.If_stmtContext ctx) {
      
      return super.visitIf_stmt(ctx);
   }

   @Override
   public String visitBoolean_literal(HelloParser.Boolean_literalContext ctx) {
      if(ctx.getText().equals("참")){
         System.out.print("true");
      } else if(ctx.getText().equals("거짓")){
         System.out.print("false");
      }
      return super.visitBoolean_literal(ctx);
   }

   

   @Override
   public String visitMethod_call(HelloParser.Method_callContext ctx) {
      
      System.out.print(ctx.expression().getText());
      if(ctx.args().getText() == null){ 
         System.out.print("()");
      } else {
         visit(ctx.args());
         System.out.print(";");
      }
      return "";
   }

   @Override
   public String visitClass_method(HelloParser.Class_methodContext ctx) {
      // TODO Auto-generated method stub
      
      // ident '(' params? ')' compound
      
//      classNode classNode = manager.classSearch(currentClass);
//      
//      if(manager.methodSearch(currentClass, ctx.ident().getText()) != null){
//         // System.err.println("Warning) Try to override");
//      } else {
//         Method method = new Method(ctx.ident().getText());
//         classNode.getMethod().add(method);
//      }
      currentMethod = ctx.ident().getText();
      if(currentClass.equals(currentMethod)){
         System.out.print("public ");
      } else {
         System.out.print("public Object ");
      }
      if(ctx.getChildCount() >= 5){
         visit(ctx.getChild(0));
         System.out.print("(");
         visit(ctx.getChild(2));
         System.out.print(")");
         visit(ctx.getChild(4));
      } else {
         visit(ctx.getChild(0));
         System.out.println("()");
         visit(ctx.getChild(3));
      }
      return "";
   }

   @Override
   public String visitElse_if_condition(HelloParser.Else_if_conditionContext ctx) {
      System.out.print("else ");
      return super.visitElse_if_condition(ctx);
   }

   @Override
   public String visitReturn_stmt(HelloParser.Return_stmtContext ctx) {
      if(ctx.getChildCount() == 1){
         System.out.print("return");
      } else {
         System.out.print("return " + ctx.expression().getText());
      }
      System.out.print(";");
      return "";
   }
   @Override
   public String visitIdent(HelloParser.IdentContext ctx) {
      System.out.print(ctx.getText());
      return super.visitIdent(ctx);
   }

   @Override
   public String visitNum(HelloParser.NumContext ctx) {
      // TODO Auto-generated method stub
      System.out.print(ctx.getText());
      return super.visitNum(ctx);
   }

   @Override
   public String visitReturn_symbol(HelloParser.Return_symbolContext ctx) {
      
      return super.visitReturn_symbol(ctx);
   }

   @Override
   public String visitIf_condition(HelloParser.If_conditionContext ctx) {
      System.out.print("if(");
      visit(ctx.expression());
      System.out.print(")");
      return "";
   }

   @Override
   public String visitWhile_stmt(HelloParser.While_stmtContext ctx) {
      System.out.print("while(");
      visit(ctx.if_condition().expression());
      System.out.print(")");
      visit(ctx.compound());
      return "";
   }

   @Override
   public String visitOp(HelloParser.OpContext ctx) {
      if(ctx.getText().equals("그리고")){
         System.out.print(" && ");
      } else if(ctx.getText().equals("또는")){
         System.out.print(" || ");
      } else if(ctx.getText().equals("=")){
         System.out.print(" == ");
      } else {
         System.out.print(" " + ctx.getText() + " ");
      }
      return super.visitOp(ctx);
   }

   @Override
   public String visitPrefixUnaryOP(HelloParser.PrefixUnaryOPContext ctx) {
      System.out.print(ctx.getText());
      return super.visitPrefixUnaryOP(ctx);
   }

   

   @Override
   public String visitElse_condition(HelloParser.Else_conditionContext ctx) {
      System.out.print("else");
      return "";
   }

   @Override
   public String visitCompound(HelloParser.CompoundContext ctx) {
      // TODO Auto-generated method stub
      System.out.println("{");
      for(int i = 0; i < ctx.getChildCount(); i++){
         visit(ctx.getChild(i));
      }
      System.out.println("\n}");
      return "";
   }
   @Override
   public String visitClass_static_field(HelloParser.Class_static_fieldContext ctx) {
      // TODO Auto-generated method stub
      static_option = true;
      super.visitClass_static_field(ctx);
      static_option = false;
      return "";
   }

   @Override
   public String visitArgs(HelloParser.ArgsContext ctx) {
      System.out.print("(");
      for(int i = 0; i < ctx.expression().size(); i++){
         visit(ctx.expression(i));
         if(i != ctx.expression().size() - 1){
            System.out.print(",");
         }
      }
      System.out.print(")");
      return "";
   }

   @Override
   public String visitContinue_stmt(HelloParser.Continue_stmtContext ctx) {
      System.out.println("continue;");
      return super.visitContinue_stmt(ctx);
   }

   
   @Override
   public String visitBreak_stmt(HelloParser.Break_stmtContext ctx) {
      // TODO Auto-generated method stub
      System.out.println("break;");
      return super.visitBreak_stmt(ctx);
   }

   @Override
   public String visitStmt(HelloParser.StmtContext ctx) {
      // TODO Auto-generated method stub
      return super.visitStmt(ctx);
   }
   
   @Override
   public String visitAssign_symbol(HelloParser.Assign_symbolContext ctx) { 
      System.out.print(" = ");
      return super.visitAssign_symbol(ctx); 
   }
   
   @Override
   public String visitClassSymbol(HelloParser.ClassSymbolContext ctx) { 
      if(ctx.args() == null){
         System.out.print("new " + ctx.IDENT().getText() + "()");
      } else {
         System.out.print("new ");
         System.out.print(ctx.IDENT().getText());
         visit(ctx.args());
      }
      return ""; 
   }
}