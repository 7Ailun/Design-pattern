package org.wei.design.dependencyinversion.improve.example;

public class SetterDependency {
    /**
     * Setter 依赖
     */
    public static void main(String[] args) {
        IOpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(new ChangHong());
        openAndClose.open();
    }

}

/**
 * 开关接口
 */
interface IOpenAndClose {
    void open();

    void setTv(ITV tv);
}

/**
 * 电视接口
 */
interface ITV {
    void play();
}

class OpenAndClose implements IOpenAndClose {

    private ITV tv;

    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }

    public void setItv(ITV itv) {
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

