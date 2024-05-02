/*
package org.wei.design.dependencyinversion.improve.example;

*/
/**
 * 构造器依赖
 *//*

public class ConstructorDependency {
    public static void main(String[] args) {
        IOpenAndClose openAndClose = new OpenAndClose(new ChangHong());
        openAndClose.open();
    }

}
*/
/**
 * 开关接口
 *//*

interface IOpenAndClose{
    void open();
}

*/
/**
 * 电视接口
 *//*

interface ITV {
    void play();
}

class OpenAndClose implements IOpenAndClose {

    private ITV tv;
    public OpenAndClose(ITV itv) {
        this.tv = itv;
    }
    @Override
    public void open() {
        tv.play();
    }
}

class ChangHong implements ITV {

    @Override
    public void play() {
        System.out.println("ChangHong TV is playing");
    }
}
*/
