package org.wei.design.interpreter;

public class NonTerminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        context.setOutput("非终端" + context.getInput());
        System.out.println(context.getInput() + "经过非终端解释器解释为：" + context.getOutput());
    }
}
