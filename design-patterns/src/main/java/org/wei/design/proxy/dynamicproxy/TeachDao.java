package org.wei.design.proxy.dynamicproxy;



public class TeachDao implements ITeachDao {
    @Override
    public void teach() {
        System.out.println("老师授课中~~~");
    }
}
