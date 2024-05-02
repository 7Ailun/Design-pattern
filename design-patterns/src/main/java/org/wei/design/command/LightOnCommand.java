package org.wei.design.command;

/**
 * 开灯
 */
public class LightOnCommand implements Command{
    private final LightReceiver lightReceiver;
    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }
    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {

    }
}
