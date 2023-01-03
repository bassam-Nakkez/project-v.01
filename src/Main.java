import AST.IntNumber;
import AST.Parse;
import antlr.DartLexer;
import antlr.DartParser;
import antlr.Visitor.MyVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException
    {
        String fileSource = "Files/test.txt";
        CharStream charStream = fromFileName(fileSource);
        DartLexer lex = new DartLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream((TokenSource) lex);
        DartParser parser = new DartParser(tokens);
        ParseTree ast = parser.parse();
        MyVisitor myVisitor = new MyVisitor();
        IntNumber in = (IntNumber) myVisitor.visit(ast);
        System.out.println( in);
    }



}