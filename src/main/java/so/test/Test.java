package so.test;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String input = "[hellošorld][helloŠ]";
//        String input = "[hellošorld][helloŠ]";
//        TestLexer lexer = new TestLexer(new ANTLRInputStream(input));
//        TestLexer lexer = new TestLexer(new ANTLRFileStream("/downloads/input.txt", "ISO-8859-15"));
        TestLexer lexer = new TestLexer(new ANTLRFileStream("/downloads/input.txt", "ISO-8859-15"));
        TestParser parser = new TestParser(new CommonTokenStream(lexer));

        TestParser.RulContext rul = parser.rul();
        rul.accept(new TestParserBaseVisitor<Object>() {
            @Override
            public Object visitBlock(@NotNull TestParser.BlockContext ctx) {
                System.out.println(ctx.getText());
                return super.visitBlock(ctx);
            }
        });
    }
}
