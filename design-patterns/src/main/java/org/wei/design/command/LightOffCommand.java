package org.wei.design.command;

/**
 * 关灯
 */
public class LightOffCommand implements Command{
    private final LightReceiver lightReceiver;
    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }
    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {

    }
}
