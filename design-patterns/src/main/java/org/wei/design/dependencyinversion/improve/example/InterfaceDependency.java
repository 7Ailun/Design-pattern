/*
package org.wei.design.dependencyinversion.improve.example;

*/
/**
 * 接口依赖
 *//*

public class InterfaceDependency {
    public static void main(String[] args) {
        IOpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(new ChangHong());
    }
}

*/
/**
 * 开关接口
 *//*

interface IOpenAndClose{
    void open(ITV itv);
}

*/
/**
 * 电视接口
 *//*

interface ITV {
    void play();
}

class OpenAndClose implements IOpenAndClose {

    @Override
    public void open(ITV itv) {
        itv.play();
    }
}

class ChangHong implements ITV {

    @Override
    public void play() {
        System.out.println("ChangHong TV is playing");
    }
}
*/
