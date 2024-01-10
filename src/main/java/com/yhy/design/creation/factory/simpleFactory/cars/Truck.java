package com.yhy.design.creation.factory.simpleFactory.cars;

import com.yhy.design.creation.factory.simpleFactory.cars.AbstractCar;

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
