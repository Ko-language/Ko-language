import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class main {

	public static void main(String[] args) {
		try{
		HelloLexer lexer = new HelloLexer( new ANTLRFileStream("test.c"));
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		HelloParser parser = new HelloParser( tokens );
		ParseTree tree = parser.program();
		
		new HelloBaseVisitor().visit(tree);
		
		/*
		MiniCAstVisitor visitor = new MiniCAstVisitor();
		UcodeGenVisitor v = new UcodeGenVisitor();
		visitor.visit(tree).accept(v);
		
		String path = Paths.get(".").toAbsolutePath().normalize().toString();
		BufferedWriter fw = new BufferedWriter(new FileWriter(path+"\\test.txt", false));
		fw.write(v.code);
		fw.flush();
		System.out.println(path+"\\test.txt");
		*/
		} catch (IOException e){
			e.printStackTrace();
		}
	}

}
