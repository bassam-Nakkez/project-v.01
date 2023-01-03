package antlr.Visitor;

import AST.IntNumber;
import AST.Operators.LogicalOperator;
import antlr.DartParser;
import antlr.DartParserBaseVisitor;

public class MyVisitor extends DartParserBaseVisitor {



    @Override
    public Object visitIntNumber(DartParser.IntNumberContext ctx) {

        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);
        return new IntNumber(num);
    }

}
