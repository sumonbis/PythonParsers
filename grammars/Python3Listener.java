// Generated from Python3.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Python3Parser}.
 */
public interface Python3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Python3Parser#single_input}.
	 * @param ctx the parse tree
	 */
	void enterSingle_input(Python3Parser.Single_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#single_input}.
	 * @param ctx the parse tree
	 */
	void exitSingle_input(Python3Parser.Single_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(Python3Parser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(Python3Parser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#eval_input}.
	 * @param ctx the parse tree
	 */
	void enterEval_input(Python3Parser.Eval_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#eval_input}.
	 * @param ctx the parse tree
	 */
	void exitEval_input(Python3Parser.Eval_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(Python3Parser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(Python3Parser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#decorators}.
	 * @param ctx the parse tree
	 */
	void enterDecorators(Python3Parser.DecoratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#decorators}.
	 * @param ctx the parse tree
	 */
	void exitDecorators(Python3Parser.DecoratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#decorated}.
	 * @param ctx the parse tree
	 */
	void enterDecorated(Python3Parser.DecoratedContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#decorated}.
	 * @param ctx the parse tree
	 */
	void exitDecorated(Python3Parser.DecoratedContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#async_funcdef}.
	 * @param ctx the parse tree
	 */
	void enterAsync_funcdef(Python3Parser.Async_funcdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#async_funcdef}.
	 * @param ctx the parse tree
	 */
	void exitAsync_funcdef(Python3Parser.Async_funcdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(Python3Parser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(Python3Parser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(Python3Parser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(Python3Parser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(Python3Parser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(Python3Parser.TypedargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void enterTfpdef(Python3Parser.TfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void exitTfpdef(Python3Parser.TfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#varargslist}.
	 * @param ctx the parse tree
	 */
	void enterVarargslist(Python3Parser.VarargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#varargslist}.
	 * @param ctx the parse tree
	 */
	void exitVarargslist(Python3Parser.VarargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void enterVfpdef(Python3Parser.VfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void exitVfpdef(Python3Parser.VfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#calldef}.
	 * @param ctx the parse tree
	 */
	void enterCalldef(Python3Parser.CalldefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#calldef}.
	 * @param ctx the parse tree
	 */
	void exitCalldef(Python3Parser.CalldefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(Python3Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(Python3Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(Python3Parser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(Python3Parser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(Python3Parser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(Python3Parser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(Python3Parser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(Python3Parser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#annassign}.
	 * @param ctx the parse tree
	 */
	void enterAnnassign(Python3Parser.AnnassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#annassign}.
	 * @param ctx the parse tree
	 */
	void exitAnnassign(Python3Parser.AnnassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(Python3Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(Python3Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(Python3Parser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(Python3Parser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(Python3Parser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(Python3Parser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPow(Python3Parser.PowContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPow(Python3Parser.PowContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#compl}.
	 * @param ctx the parse tree
	 */
	void enterCompl(Python3Parser.ComplContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#compl}.
	 * @param ctx the parse tree
	 */
	void exitCompl(Python3Parser.ComplContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(Python3Parser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(Python3Parser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#at}.
	 * @param ctx the parse tree
	 */
	void enterAt(Python3Parser.AtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#at}.
	 * @param ctx the parse tree
	 */
	void exitAt(Python3Parser.AtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(Python3Parser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(Python3Parser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#rem}.
	 * @param ctx the parse tree
	 */
	void enterRem(Python3Parser.RemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#rem}.
	 * @param ctx the parse tree
	 */
	void exitRem(Python3Parser.RemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#fdiv}.
	 * @param ctx the parse tree
	 */
	void enterFdiv(Python3Parser.FdivContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#fdiv}.
	 * @param ctx the parse tree
	 */
	void exitFdiv(Python3Parser.FdivContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#pluseq}.
	 * @param ctx the parse tree
	 */
	void enterPluseq(Python3Parser.PluseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#pluseq}.
	 * @param ctx the parse tree
	 */
	void exitPluseq(Python3Parser.PluseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#minuseq}.
	 * @param ctx the parse tree
	 */
	void enterMinuseq(Python3Parser.MinuseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#minuseq}.
	 * @param ctx the parse tree
	 */
	void exitMinuseq(Python3Parser.MinuseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#multeq}.
	 * @param ctx the parse tree
	 */
	void enterMulteq(Python3Parser.MulteqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#multeq}.
	 * @param ctx the parse tree
	 */
	void exitMulteq(Python3Parser.MulteqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#diveq}.
	 * @param ctx the parse tree
	 */
	void enterDiveq(Python3Parser.DiveqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#diveq}.
	 * @param ctx the parse tree
	 */
	void exitDiveq(Python3Parser.DiveqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#remeq}.
	 * @param ctx the parse tree
	 */
	void enterRemeq(Python3Parser.RemeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#remeq}.
	 * @param ctx the parse tree
	 */
	void exitRemeq(Python3Parser.RemeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#andeq}.
	 * @param ctx the parse tree
	 */
	void enterAndeq(Python3Parser.AndeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#andeq}.
	 * @param ctx the parse tree
	 */
	void exitAndeq(Python3Parser.AndeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#oreq}.
	 * @param ctx the parse tree
	 */
	void enterOreq(Python3Parser.OreqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#oreq}.
	 * @param ctx the parse tree
	 */
	void exitOreq(Python3Parser.OreqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#xoreq}.
	 * @param ctx the parse tree
	 */
	void enterXoreq(Python3Parser.XoreqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#xoreq}.
	 * @param ctx the parse tree
	 */
	void exitXoreq(Python3Parser.XoreqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#lshifteq}.
	 * @param ctx the parse tree
	 */
	void enterLshifteq(Python3Parser.LshifteqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#lshifteq}.
	 * @param ctx the parse tree
	 */
	void exitLshifteq(Python3Parser.LshifteqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#rshifteq}.
	 * @param ctx the parse tree
	 */
	void enterRshifteq(Python3Parser.RshifteqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#rshifteq}.
	 * @param ctx the parse tree
	 */
	void exitRshifteq(Python3Parser.RshifteqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#powereq}.
	 * @param ctx the parse tree
	 */
	void enterPowereq(Python3Parser.PowereqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#powereq}.
	 * @param ctx the parse tree
	 */
	void exitPowereq(Python3Parser.PowereqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#fdiveq}.
	 * @param ctx the parse tree
	 */
	void enterFdiveq(Python3Parser.FdiveqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#fdiveq}.
	 * @param ctx the parse tree
	 */
	void exitFdiveq(Python3Parser.FdiveqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_star_expr(Python3Parser.Testlist_star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_star_expr(Python3Parser.Testlist_star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugassign(Python3Parser.AugassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugassign(Python3Parser.AugassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(Python3Parser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(Python3Parser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPass_stmt(Python3Parser.Pass_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPass_stmt(Python3Parser.Pass_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(Python3Parser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(Python3Parser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(Python3Parser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(Python3Parser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(Python3Parser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(Python3Parser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(Python3Parser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(Python3Parser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void enterYield_stmt(Python3Parser.Yield_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void exitYield_stmt(Python3Parser.Yield_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(Python3Parser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(Python3Parser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(Python3Parser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(Python3Parser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(Python3Parser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(Python3Parser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(Python3Parser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(Python3Parser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(Python3Parser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(Python3Parser.Import_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_name(Python3Parser.Dotted_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_name(Python3Parser.Dotted_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(Python3Parser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(Python3Parser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_names(Python3Parser.Dotted_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_names(Python3Parser.Dotted_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(Python3Parser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(Python3Parser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(Python3Parser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(Python3Parser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_stmt(Python3Parser.Nonlocal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_stmt(Python3Parser.Nonlocal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssert_stmt(Python3Parser.Assert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssert_stmt(Python3Parser.Assert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(Python3Parser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(Python3Parser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAsync_stmt(Python3Parser.Async_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAsync_stmt(Python3Parser.Async_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(Python3Parser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(Python3Parser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(Python3Parser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(Python3Parser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(Python3Parser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(Python3Parser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmt(Python3Parser.Try_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmt(Python3Parser.Try_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWith_stmt(Python3Parser.With_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWith_stmt(Python3Parser.With_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWith_item(Python3Parser.With_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWith_item(Python3Parser.With_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#except_clause}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clause(Python3Parser.Except_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#except_clause}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clause(Python3Parser.Except_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(Python3Parser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(Python3Parser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#lor}.
	 * @param ctx the parse tree
	 */
	void enterLor(Python3Parser.LorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#lor}.
	 * @param ctx the parse tree
	 */
	void exitLor(Python3Parser.LorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#land}.
	 * @param ctx the parse tree
	 */
	void enterLand(Python3Parser.LandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#land}.
	 * @param ctx the parse tree
	 */
	void exitLand(Python3Parser.LandContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#lnot}.
	 * @param ctx the parse tree
	 */
	void enterLnot(Python3Parser.LnotContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#lnot}.
	 * @param ctx the parse tree
	 */
	void exitLnot(Python3Parser.LnotContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(Python3Parser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(Python3Parser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void enterTest_nocond(Python3Parser.Test_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void exitTest_nocond(Python3Parser.Test_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#lambdef}.
	 * @param ctx the parse tree
	 */
	void enterLambdef(Python3Parser.LambdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#lambdef}.
	 * @param ctx the parse tree
	 */
	void exitLambdef(Python3Parser.LambdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void enterLambdef_nocond(Python3Parser.Lambdef_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void exitLambdef_nocond(Python3Parser.Lambdef_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(Python3Parser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(Python3Parser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(Python3Parser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(Python3Parser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNot_test(Python3Parser.Not_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNot_test(Python3Parser.Not_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(Python3Parser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(Python3Parser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(Python3Parser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(Python3Parser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#star_expr}.
	 * @param ctx the parse tree
	 */
	void enterStar_expr(Python3Parser.Star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#star_expr}.
	 * @param ctx the parse tree
	 */
	void exitStar_expr(Python3Parser.Star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Python3Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Python3Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void enterXor_expr(Python3Parser.Xor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void exitXor_expr(Python3Parser.Xor_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(Python3Parser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(Python3Parser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(Python3Parser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(Python3Parser.Shift_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(Python3Parser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(Python3Parser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Python3Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Python3Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(Python3Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(Python3Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(Python3Parser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(Python3Parser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_expr(Python3Parser.Atom_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_expr(Python3Parser.Atom_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#tuple_start}.
	 * @param ctx the parse tree
	 */
	void enterTuple_start(Python3Parser.Tuple_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#tuple_start}.
	 * @param ctx the parse tree
	 */
	void exitTuple_start(Python3Parser.Tuple_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#tuple_end}.
	 * @param ctx the parse tree
	 */
	void enterTuple_end(Python3Parser.Tuple_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#tuple_end}.
	 * @param ctx the parse tree
	 */
	void exitTuple_end(Python3Parser.Tuple_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(Python3Parser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(Python3Parser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_comp(Python3Parser.Testlist_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_comp(Python3Parser.Testlist_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(Python3Parser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(Python3Parser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlist(Python3Parser.SubscriptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlist(Python3Parser.SubscriptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(Python3Parser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(Python3Parser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#sliceop}.
	 * @param ctx the parse tree
	 */
	void enterSliceop(Python3Parser.SliceopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#sliceop}.
	 * @param ctx the parse tree
	 */
	void exitSliceop(Python3Parser.SliceopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(Python3Parser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(Python3Parser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#testlist}.
	 * @param ctx the parse tree
	 */
	void enterTestlist(Python3Parser.TestlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#testlist}.
	 * @param ctx the parse tree
	 */
	void exitTestlist(Python3Parser.TestlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void enterDictorsetmaker(Python3Parser.DictorsetmakerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void exitDictorsetmaker(Python3Parser.DictorsetmakerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(Python3Parser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(Python3Parser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(Python3Parser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(Python3Parser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#argeq}.
	 * @param ctx the parse tree
	 */
	void enterArgeq(Python3Parser.ArgeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#argeq}.
	 * @param ctx the parse tree
	 */
	void exitArgeq(Python3Parser.ArgeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(Python3Parser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(Python3Parser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void enterComp_iter(Python3Parser.Comp_iterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void exitComp_iter(Python3Parser.Comp_iterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(Python3Parser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(Python3Parser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#comp_if}.
	 * @param ctx the parse tree
	 */
	void enterComp_if(Python3Parser.Comp_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#comp_if}.
	 * @param ctx the parse tree
	 */
	void exitComp_if(Python3Parser.Comp_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#encoding_decl}.
	 * @param ctx the parse tree
	 */
	void enterEncoding_decl(Python3Parser.Encoding_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#encoding_decl}.
	 * @param ctx the parse tree
	 */
	void exitEncoding_decl(Python3Parser.Encoding_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void enterYield_expr(Python3Parser.Yield_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void exitYield_expr(Python3Parser.Yield_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void enterYield_arg(Python3Parser.Yield_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void exitYield_arg(Python3Parser.Yield_argContext ctx);
}