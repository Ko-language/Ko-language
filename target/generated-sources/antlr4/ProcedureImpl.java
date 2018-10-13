import java.util.List;

public class ProcedureImpl implements Procedure{
	ClassTable classTable = new ClassTableImpl();
	InterfaceTable interfaceTable = new InterfaceTableImpl();
	
	@Override
	public void storeCodesImported() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initInterfaceInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getNumOfParamsOfAbstractMethod(HelloParser.Interface_methodContext ctx) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getAbstractMethodName(HelloParser.Interface_methodContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveAbstractMethodInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean check_the_existence_of_class_Interface_to_be_extended(HelloParser.ExtendContext ctx) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void initClassInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> getImplementationClassList(HelloParser.ImplementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean check_the_existence_of_Interface_to_be_implemented(List<String> interfaceList) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void saveStaticVariables(HelloParser.Class_static_fieldContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveClassVariables() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getNumOfParamsOfClassMethod(HelloParser.Class_methodContext ctx) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCurrentMethodName(HelloParser.Class_methodContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveClassMethodInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValidAssignment(HelloParser.Assignment_stmtContext ctx) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean returnTargetIsValid(HelloParser.Return_stmtContext ctx) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean conditionIsBooleanValue(HelloParser.If_conditionContext ctx) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getCurrentMethodoName(HelloParser.Method_callContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCurrentMethodName(HelloParser.Method_callContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isExistingMethod(String currentClassName, String currentMethodName) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
