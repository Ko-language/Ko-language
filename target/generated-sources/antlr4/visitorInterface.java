
public interface visitorInterface {
	public void printPackageDecl(HelloParser.Package_declContext ctx);
	public void printImportDecl(HelloParser.Import_declContext ctx);
	public void printInterfaceDecl(HelloParser.Interface_declContext ctx);
	public void printInterfaceMethod(HelloParser.Interface_methodContext ctx);
	public void addInterfaceToList(HelloParser.Interface_declContext ctx);
	public void storeAbstractMethodInfoToList(HelloParser.Interface_methodContext ctx);
	public boolean isExistingInterfaceOrClass(HelloParser.ExtendContext ctx);
}
