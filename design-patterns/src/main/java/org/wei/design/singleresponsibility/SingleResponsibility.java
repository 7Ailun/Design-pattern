package org.wei.design.singleresponsibility;


/**
 * 单一职责（方法上的）
 */
public class SingleResponsibility {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles();
        vehicles.airRun("飞机");
        vehicles.roadRun("汽车");
        vehicles.waterRun("轮船");
    }
}

/**
 * 交通工具
 */
class Vehicles {
    public void roadRun(String vehicle) {
        System.out.println(vehicle + " 在陆地上跑");
    }

    public void airRun(String vehicle) {
        System.out.println(vehicle + " 在天空中飞");
    }

    public void waterRun(String vehicle) {
        System.out.println(vehicle + " 在水中游行");
    }
}
