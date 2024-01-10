package com.yhy.design.creation.factory.abstractFactory.cars;

/**
 * 卡车
 */
public class Truck extends AbstractCar {

    public Truck() {
        this.type = "truck";
    }

    @Override
    public void run() {
        System.out.println("卡车跑起来！！！");
    }
}
