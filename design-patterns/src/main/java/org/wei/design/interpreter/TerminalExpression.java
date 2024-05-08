package org.wei.design.interpreter;

public class TerminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        context.setOutput("终端" + context.getInput());
        System.out.println(context.getInput() + "经过终端解释器解释为：" + context.getOutput());
    }
}
