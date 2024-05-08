package org.wei.design.status;

/**
 * @Classname LiftState
 * @Description 抽象状态类
 * @Date 2021/3/31 10:50
 * @Created by dell
 */

public abstract class LiftState {
    //定义一个环境角色，也就是封装状态的变化引起的功能变化
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //电梯开门动作
    public abstract void open();

    //电梯关门动作
    public abstract void close();

    //电梯运行动作
    public abstract void run();

    //电梯停止动作
    public abstract void stop();
}