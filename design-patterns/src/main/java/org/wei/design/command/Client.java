package org.wei.design.command;

public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        InvokerCommand invokerCommand = new InvokerCommand();
        invokerCommand.setCommand(0,new LightOnCommand(lightReceiver),new LightOffCommand(lightReceiver));
        System.out.println("-------按下开灯按钮-------");
        invokerCommand.turnOn(0);
        System.out.println("-------按下关灯按钮-------");
        invokerCommand.turnOff(0);
        System.out.println("-------按下撤销按钮-------");
        invokerCommand.revoke();
    }
}
