package org.wei.design.proxy.staticproxy;

public class TeachDao implements ITeachDao {
    @Override
    public void teach() {
        System.out.println("老师授课中~~~");
    }
}
