package org.wei.design.command;

/**
 * 命令
 */
public interface Command {
    void execute();
    void undo();
}
