package org.wei.design.command;

public class InvokerCommand {
    private final Command[] turnOnCommands;
    private final Command[] turnOffCommands;
    private Command revokeCommand; // 撤销
    public InvokerCommand() {
        turnOnCommands = new Command[5];
        turnOffCommands = new Command[5];
    }
    public void setCommand(int index,Command onCommand,Command offCommand) {
        turnOnCommands[index] = onCommand;
        turnOffCommands[index] = offCommand;
    }

    /**
     * 打开
     * @param index
     */
    public void turnOn(int index) {
        Command onCommand = turnOnCommands[index];
        onCommand.execute();
        revokeCommand = turnOffCommands[index];
    }

    /**
     * 关闭
     * @param index
     */
    public void turnOff(int index) {
        Command onCommand = turnOffCommands[index];
        onCommand.execute();
        revokeCommand = turnOnCommands[index];
    }

    /**
     * 撤销
     */
    public void revoke() {
        revokeCommand.execute();
    }
}
