package org.wei.design.status;

/**
 * @Classname RunningState
 * @Description 运行状态
 * @Date 2021/3/31 10:52
 * @Created by dell
 */

public class RunningState extends LiftState {

    @Override
    public void open() {
        //什么也不做
    }

    @Override
    public void close() {
        //什么也不做
    }

    @Override
    public void run() {
        System.out.println("电梯正在运行...");
    }

    @Override
    public void stop() {
        //停止
        super.context.setLiftState(Context.OPENNING_STATE);
        super.context.stop();
    }
}