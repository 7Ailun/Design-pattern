package org.wei.design.adapter.objectadapter;

public class Phone {
    public void charging(Voltage5V voltage5V){
        if(voltage5V.output5V() == 5){
            System.out.println("电压为5V，可以充电");
        }else{
            System.out.println("电压不为5V，不能充电");
        }
    }
}
