package org.wei.design.interpreter;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setInput("ABCD");
        AbstractExpression terminalExpression = new TerminalExpression();
        terminalExpression.interpret(context);
        AbstractExpression nonTerminalExpression = new NonTerminalExpression();
        nonTerminalExpression.interpret(context);
    }
}
