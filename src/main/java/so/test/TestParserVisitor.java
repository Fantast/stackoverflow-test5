// Generated from so/test/TestParser.g4 by ANTLR 4.5
package so.test;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TestParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TestParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TestParser#rul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRul(TestParser.RulContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TestParser.BlockContext ctx);
}