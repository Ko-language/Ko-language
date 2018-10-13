import java.util.List;

public interface ClassTable {
	public boolean isExistingClass(String className);
	public int getNumOfParams(String className);
	public boolean isExistingVariables(String variableName);
	public  <T> String getCurrentClassName(T ctx);
	public <T> String getCurrentMethodName(T ctx);
}
