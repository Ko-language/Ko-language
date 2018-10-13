import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcedureImpl implements Procedure{
	static Map<String, interfaceNode> interfaceList = new HashMap<>();
	static Map<String, classNode> classList = new HashMap<>();
	
	class interfaceNode {
		private Map<String, methodNode> abstractMethods;
		
		public interfaceNode() {
			this.abstractMethods = new HashMap<>();
		}
		
		public Map<String, methodNode> getAbstractMethods() {
			return this.abstractMethods;
		}
	}
	
	class classNode {
		private Map<String, String> classVariables;
		private Map<String, String> classStaticVariables;
		private Map<String, methodNode> classMethods;
		
		public classNode() {
			this.classMethods = new HashMap<>();
		}
		
		public Map<String, String> getClassVariables() {
			return this.classVariables;
		}
		
		public Map<String, methodNode> getClassMethods() {
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
	public boolean isExistingMethod(String currentClassName, String currentMethodName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> String getCurrentMethodName(T ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> String getCurrentClassName(T ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> boolean isExistingClass(T ctx) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> boolean getInterfaceNameIncludingMethod(T ctx) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> boolean isInterface(T ctx) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> boolean isClass(T ctx) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> boolean isExistingVariable(T varName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> boolean isVariableDeclWithValueAssignment(T ctx) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
