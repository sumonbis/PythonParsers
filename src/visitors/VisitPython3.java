package visitors;



import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import parsers.python35.Python3BaseListener;
import parsers.python35.Python3Lexer;
import parsers.python35.Python3Parser;
import parsers.python35.Python3Parser.AtomContext;
import parsers.python35.Python3Parser.Atom_exprContext;
import parsers.python35.Python3Parser.TrailerContext;




public class VisitPython3 extends Python3BaseListener{
	
	Python3Parser parser;
	Python3Lexer lexer;
	private static String readFile(File file, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, encoding);
    }

    public Python3Parser parsefile(File file) throws IOException {
        String code = readFile(file, Charset.forName("UTF-8"));
        return parse(code);
    }
    
    public Python3Parser parse(String code) {
    	lexer = new Python3Lexer(new ANTLRInputStream(code));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        parser = new Python3Parser(tokens);

        return parser;
    }
    
	public void visit(String source) {
        parser = parse(source);
		ParseTreeWalker.DEFAULT.walk(this, parser.file_input());
	}
	
	public void visit(File file) {
		try {
			parser = parsefile(file);
			ParseTreeWalker.DEFAULT.walk(this, parser.file_input());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Visting single input
	 */
	@Override
	public void enterSingle_input(Python3Parser.Single_inputContext ctx) {
		//System.out.println("Single Input="+ ctx.getText());
	}
	
	@Override 
	public void enterStmt(Python3Parser.StmtContext ctx) { 
	}
	
	@Override public void enterSimple_stmt(Python3Parser.Simple_stmtContext ctx) { 
	}
	
	@Override 
	public void enterSmall_stmt(Python3Parser.Small_stmtContext ctx) {
	}
	@Override 
	public void enterParameters(Python3Parser.ParametersContext ctx) { 
		//System.out.println("PARAMS = " + ctx.getText() );
	}
	
	@Override 
	public void enterVfpdef(Python3Parser.VfpdefContext ctx) { 
		//System.out.println("Vf = "+ctx.NAME().getText());
	}
	@Override public void enterIf_stmt(Python3Parser.If_stmtContext ctx) { 
		//System.out.println("IF = "+ctx.IF().getText());
	}
	
	@Override 
	public void enterArglist(Python3Parser.ArglistContext ctx) { 
		System.out.println("Args = "+ ctx.getText() + ctx.getParent().getText());
		if(!atomnames.isEmpty()) {
			System.out.println(atomnames.pop() +" is a method");
		}else {
			System.out.println("blank arglist?");
		}
	}
	
	@Override 
	public void enterArgument(Python3Parser.ArgumentContext ctx) { 
		System.out.println("Argument = "+ ctx.getText() + ctx.getParent().getText());
	}
	



	

	@Override
	public void enterTrailer(TrailerContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("Trailer "+ctx.getText());
	}

	@Override
	public void enterAtom_expr(Atom_exprContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("Atom expr "+ctx.getText() +" " );
	
		
	}

	@Override
	public void exitAtom_expr(Atom_exprContext ctx) {
		// TODO Auto-generated method stub
		
		
	}

	Stack<String> atomnames = new Stack<>();
	@Override
	public void enterAtom(AtomContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("Atom "+ ctx.NAME());
		atomnames.push(ctx.getText());
	}

	@Override
	public void exitAtom(AtomContext ctx) {
		
		//atom = null;
		// TODO Auto-generated method stub
		
	}


	

	@Override 
	public void visitErrorNode(ErrorNode node) { 
		System.out.println(node);
		String var = node.getText().toString();
		if(var.equals("print")) {
			System.out.println("Found print statement");
		}
		System.out.println("Not python 3 program");
	}

	
	
	int result = 0;
	boolean arithopfound = false;
	String op = null;
	@Override public void enterArith_expr(Python3Parser.Arith_exprContext ctx) { 
		System.out.println("Entered arithmetic exp");
		System.out.println(ctx.getText());
		System.out.println(ctx.getText().contains("+"));
		
	}
	
	@Override public void exitAnnassign(Python3Parser.AnnassignContext ctx) {
		System.out.println("entered assign");
	}
	
	@Override public void enterFactor(Python3Parser.FactorContext ctx) { 
		//System.out.println("Factor");
		//System.out.println(ctx.getText());
		if(arithopfound) {
			//result += Integer.parseInt(ctx.getText());
		}
		else {
			//result = Integer.parseInt(ctx.getText());
		}
	}
	
	@Override public void exitFactor(Python3Parser.FactorContext ctx) {
		System.out.println("result = "+result);
	}
	

	
	@Override public void enterPlus(Python3Parser.PlusContext ctx) {
		//System.out.println("inside plus");
		//System.out.println(ctx.getText());
		op = "+";
		arithopfound = true;
	}
	
}
