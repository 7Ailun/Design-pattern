package org.wei.design.singleresponsibility;


/**
 * 单一职责（类上实现）
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        AirRoadVehicle airRoadVehicle = new AirRoadVehicle();
        WaterVehicle waterVehicle = new WaterVehicle();
        airRoadVehicle.run("飞机");
        roadVehicle.run("汽车");
        waterVehicle.run("轮船");
    }
}


class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在陆地上跑");
    }

}

class AirRoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在天空中飞");
    }

}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在水中游行");
    }

}
