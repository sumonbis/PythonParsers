package visitors;

import parsers.python3.Python3Lexer;
import parsers.python3.Python3Listener;
import parsers.python2.Python2Parser;
import parsers.python3.Python3BaseListener;
import parsers.python3.Python3Parser;
import parsers.python3.Python3Parser.And_exprContext;
import parsers.python3.Python3Parser.And_testContext;
import parsers.python3.Python3Parser.AnnassignContext;
import parsers.python3.Python3Parser.ArglistContext;
import parsers.python3.Python3Parser.ArgumentContext;
import parsers.python3.Python3Parser.Arith_exprContext;
import parsers.python3.Python3Parser.Assert_stmtContext;
import parsers.python3.Python3Parser.Async_funcdefContext;
import parsers.python3.Python3Parser.Async_stmtContext;
import parsers.python3.Python3Parser.AtomContext;
import parsers.python3.Python3Parser.Atom_exprContext;
import parsers.python3.Python3Parser.AugassignContext;
import parsers.python3.Python3Parser.Break_stmtContext;
import parsers.python3.Python3Parser.ClassdefContext;
import parsers.python3.Python3Parser.Comp_forContext;
import parsers.python3.Python3Parser.Comp_ifContext;
import parsers.python3.Python3Parser.Comp_iterContext;
import parsers.python3.Python3Parser.Comp_opContext;
import parsers.python3.Python3Parser.ComparisonContext;
import parsers.python3.Python3Parser.Compound_stmtContext;
import parsers.python3.Python3Parser.Continue_stmtContext;
import parsers.python3.Python3Parser.DecoratedContext;
import parsers.python3.Python3Parser.DecoratorContext;
import parsers.python3.Python3Parser.DecoratorsContext;
import parsers.python3.Python3Parser.Del_stmtContext;
import parsers.python3.Python3Parser.DictorsetmakerContext;
import parsers.python3.Python3Parser.Dotted_as_nameContext;
import parsers.python3.Python3Parser.Dotted_as_namesContext;
import parsers.python3.Python3Parser.Dotted_nameContext;
import parsers.python3.Python3Parser.Encoding_declContext;
import parsers.python3.Python3Parser.Eval_inputContext;
import parsers.python3.Python3Parser.Except_clauseContext;
import parsers.python3.Python3Parser.ExprContext;
import parsers.python3.Python3Parser.Expr_stmtContext;
import parsers.python3.Python3Parser.ExprlistContext;
import parsers.python3.Python3Parser.FactorContext;
import parsers.python3.Python3Parser.File_inputContext;
import parsers.python3.Python3Parser.Flow_stmtContext;
import parsers.python3.Python3Parser.For_stmtContext;
import parsers.python3.Python3Parser.FuncdefContext;
import parsers.python3.Python3Parser.Global_stmtContext;
import parsers.python3.Python3Parser.If_stmtContext;
import parsers.python3.Python3Parser.Import_as_nameContext;
import parsers.python3.Python3Parser.Import_as_namesContext;
import parsers.python3.Python3Parser.Import_fromContext;
import parsers.python3.Python3Parser.Import_nameContext;
import parsers.python3.Python3Parser.Import_stmtContext;
import parsers.python3.Python3Parser.LambdefContext;
import parsers.python3.Python3Parser.Lambdef_nocondContext;
import parsers.python3.Python3Parser.Nonlocal_stmtContext;
import parsers.python3.Python3Parser.Not_testContext;
import parsers.python3.Python3Parser.Or_testContext;
import parsers.python3.Python3Parser.ParametersContext;
import parsers.python3.Python3Parser.Pass_stmtContext;
import parsers.python3.Python3Parser.PowerContext;
import parsers.python3.Python3Parser.Raise_stmtContext;
import parsers.python3.Python3Parser.Return_stmtContext;
import parsers.python3.Python3Parser.Shift_exprContext;
import parsers.python3.Python3Parser.Simple_stmtContext;
import parsers.python3.Python3Parser.Single_inputContext;
import parsers.python3.Python3Parser.SliceopContext;
import parsers.python3.Python3Parser.Small_stmtContext;
import parsers.python3.Python3Parser.Star_exprContext;
import parsers.python3.Python3Parser.StmtContext;
import parsers.python3.Python3Parser.SubscriptContext;
import parsers.python3.Python3Parser.SubscriptlistContext;
import parsers.python3.Python3Parser.SuiteContext;
import parsers.python3.Python3Parser.TermContext;
import parsers.python3.Python3Parser.TestContext;
import parsers.python3.Python3Parser.Test_nocondContext;
import parsers.python3.Python3Parser.TestlistContext;
import parsers.python3.Python3Parser.Testlist_compContext;
import parsers.python3.Python3Parser.Testlist_star_exprContext;
import parsers.python3.Python3Parser.TfpdefContext;
import parsers.python3.Python3Parser.TrailerContext;
import parsers.python3.Python3Parser.Try_stmtContext;
import parsers.python3.Python3Parser.TypedargslistContext;
import parsers.python3.Python3Parser.VarargslistContext;
import parsers.python3.Python3Parser.VfpdefContext;
import parsers.python3.Python3Parser.While_stmtContext;
import parsers.python3.Python3Parser.With_itemContext;
import parsers.python3.Python3Parser.With_stmtContext;
import parsers.python3.Python3Parser.Xor_exprContext;
import parsers.python3.Python3Parser.Yield_argContext;
import parsers.python3.Python3Parser.Yield_exprContext;
import parsers.python3.Python3Parser.Yield_stmtContext;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;



public class VisitPython3 implements Python3Listener {
	
	private static String readFile(File file, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, encoding);
    }

    public Python3Parser parsefile(File file) throws IOException {
        String code = readFile(file, Charset.forName("UTF-8"));
        return parse(code);
    }
    
    public Python3Parser parse(String code) {
    	Python3Lexer lexer = new Python3Lexer(new ANTLRInputStream(code));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        Python3Parser parser = new Python3Parser(tokens);

        return parser;
    }
    
	public void visit(String source) {
        Python3Parser parser = parse(source);
		ParseTreeWalker.DEFAULT.walk(this, parser.file_input());
	}
	
	public void visit(File file) {
		try {
			Python3Parser parser = parsefile(file);
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
		System.out.println("Single Input="+ ctx.getText());
	}
	
	@Override 
	public void enterStmt(Python3Parser.StmtContext ctx) { 
		System.out.println("Stmt = "+ ctx.getText());
	}
	
	@Override public void enterSimple_stmt(Python3Parser.Simple_stmtContext ctx) { 
		System.out.println("Simple_stmt = "+ ctx.getText());
	}
	
	@Override 
	public void enterSmall_stmt(Python3Parser.Small_stmtContext ctx) {
		System.out.println("Small_stmt = "+ctx.getText());
	}
	@Override 
	public void enterParameters(Python3Parser.ParametersContext ctx) { 
		System.out.println("PARAMS = " + ctx.getText());
	}
	
	@Override 
	public void enterVfpdef(Python3Parser.VfpdefContext ctx) { 
		System.out.println("Vf = "+ctx.NAME().getText());
	}
	@Override public void enterIf_stmt(Python3Parser.If_stmtContext ctx) { 
		System.out.println("IF = "+ctx.IF().getText());
	}
	
	@Override 
	public void enterArglist(Python3Parser.ArglistContext ctx) { 
		System.out.println("Args = "+ ctx.getText());
	}
	
	@Override 
	public void enterArgument(Python3Parser.ArgumentContext ctx) { 
		System.out.println("Argument = "+ ctx.getText());
	}
	
	@Override 
	public void enterEncoding_decl(Python3Parser.Encoding_declContext ctx) { 
		System.out.println("Encodig_decl = "+ctx.getText());
	}
	/**
	 * Visting Funcdef
	 */
	@Override
    public void enterFuncdef(Python3Parser.FuncdefContext ctx) {
        System.out.println("Function NAME=" + ctx.NAME().getText());
    }

	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSingle_input(Single_inputContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFile_input(File_inputContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFile_input(File_inputContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEval_input(Eval_inputContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEval_input(Eval_inputContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDecorator(DecoratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDecorator(DecoratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDecorators(DecoratorsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDecorators(DecoratorsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDecorated(DecoratedContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDecorated(DecoratedContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAsync_funcdef(Async_funcdefContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAsync_funcdef(Async_funcdefContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFuncdef(FuncdefContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitParameters(ParametersContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypedargslist(TypedargslistContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypedargslist(TypedargslistContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTfpdef(TfpdefContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTfpdef(TfpdefContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVarargslist(VarargslistContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVarargslist(VarargslistContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVfpdef(VfpdefContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStmt(StmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSimple_stmt(Simple_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSmall_stmt(Small_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterExpr_stmt(Expr_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExpr_stmt(Expr_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAnnassign(AnnassignContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAnnassign(AnnassignContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTestlist_star_expr(Testlist_star_exprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTestlist_star_expr(Testlist_star_exprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAugassign(AugassignContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAugassign(AugassignContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDel_stmt(Del_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDel_stmt(Del_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPass_stmt(Pass_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPass_stmt(Pass_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFlow_stmt(Flow_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFlow_stmt(Flow_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterBreak_stmt(Break_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitBreak_stmt(Break_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterContinue_stmt(Continue_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitContinue_stmt(Continue_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterReturn_stmt(Return_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitReturn_stmt(Return_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterYield_stmt(Yield_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitYield_stmt(Yield_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterRaise_stmt(Raise_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitRaise_stmt(Raise_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterImport_stmt(Import_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitImport_stmt(Import_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterImport_name(Import_nameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitImport_name(Import_nameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterImport_from(Import_fromContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitImport_from(Import_fromContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterImport_as_name(Import_as_nameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitImport_as_name(Import_as_nameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDotted_as_name(Dotted_as_nameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDotted_as_name(Dotted_as_nameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterImport_as_names(Import_as_namesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitImport_as_names(Import_as_namesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDotted_as_names(Dotted_as_namesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDotted_as_names(Dotted_as_namesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDotted_name(Dotted_nameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDotted_name(Dotted_nameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterGlobal_stmt(Global_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitGlobal_stmt(Global_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNonlocal_stmt(Nonlocal_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNonlocal_stmt(Nonlocal_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAssert_stmt(Assert_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAssert_stmt(Assert_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCompound_stmt(Compound_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCompound_stmt(Compound_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAsync_stmt(Async_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAsync_stmt(Async_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitIf_stmt(If_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterWhile_stmt(While_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitWhile_stmt(While_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFor_stmt(For_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFor_stmt(For_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTry_stmt(Try_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTry_stmt(Try_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterWith_stmt(With_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitWith_stmt(With_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterWith_item(With_itemContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitWith_item(With_itemContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterExcept_clause(Except_clauseContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExcept_clause(Except_clauseContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSuite(SuiteContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSuite(SuiteContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTest(TestContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTest(TestContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTest_nocond(Test_nocondContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTest_nocond(Test_nocondContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLambdef(LambdefContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLambdef(LambdefContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLambdef_nocond(Lambdef_nocondContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLambdef_nocond(Lambdef_nocondContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterOr_test(Or_testContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitOr_test(Or_testContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAnd_test(And_testContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAnd_test(And_testContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNot_test(Not_testContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNot_test(Not_testContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterComparison(ComparisonContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitComparison(ComparisonContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterComp_op(Comp_opContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitComp_op(Comp_opContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStar_expr(Star_exprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStar_expr(Star_exprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterExpr(ExprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExpr(ExprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterXor_expr(Xor_exprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitXor_expr(Xor_exprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAnd_expr(And_exprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAnd_expr(And_exprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterShift_expr(Shift_exprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitShift_expr(Shift_exprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterArith_expr(Arith_exprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitArith_expr(Arith_exprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTerm(TermContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTerm(TermContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFactor(FactorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFactor(FactorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPower(PowerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPower(PowerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAtom_expr(Atom_exprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAtom_expr(Atom_exprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAtom(AtomContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAtom(AtomContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTestlist_comp(Testlist_compContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTestlist_comp(Testlist_compContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTrailer(TrailerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTrailer(TrailerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSubscriptlist(SubscriptlistContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSubscriptlist(SubscriptlistContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSubscript(SubscriptContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSubscript(SubscriptContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSliceop(SliceopContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSliceop(SliceopContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterExprlist(ExprlistContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExprlist(ExprlistContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTestlist(TestlistContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTestlist(TestlistContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDictorsetmaker(DictorsetmakerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDictorsetmaker(DictorsetmakerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassdef(ClassdefContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitClassdef(ClassdefContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitArglist(ArglistContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitArgument(ArgumentContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterComp_iter(Comp_iterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitComp_iter(Comp_iterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterComp_for(Comp_forContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitComp_for(Comp_forContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterComp_if(Comp_ifContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitComp_if(Comp_ifContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEncoding_decl(Encoding_declContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterYield_expr(Yield_exprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitYield_expr(Yield_exprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterYield_arg(Yield_argContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitYield_arg(Yield_argContext ctx) {
		// TODO Auto-generated method stub
		
	}
	
	
}
