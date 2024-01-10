package com.yhy.design.creation.factory.factoryMethod.cars;

/**
 * 摩托车
 */
public class Motorcycle extends AbstractCar {

    public Motorcycle() {
        this.type = "motorcycle";
    }

    @Override
    public void run() {
        System.out.println("摩托车呜呜呜！！！！");
    }
}