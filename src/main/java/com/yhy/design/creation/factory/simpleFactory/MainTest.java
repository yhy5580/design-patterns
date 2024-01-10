package com.yhy.design.creation.factory.simpleFactory;

import com.yhy.design.creation.factory.simpleFactory.cars.AbstractCar;
import com.yhy.design.creation.factory.simpleFactory.factorys.CarSimpleFactory;

/**
 * 简单工厂模式
 */
public class MainTest {
    public static void main(String[] args) {
        CarSimpleFactory carSimpleFactory = new CarSimpleFactory();
        AbstractCar truck = carSimpleFactory.getCar("truck");
        System.out.println("truck:" + truck);
        truck.run();
        AbstractCar motorcycle = carSimpleFactory.getCar("motorcycle");
        System.out.println("motorcycle:" + motorcycle);
        motorcycle.run();
        AbstractCar car = carSimpleFactory.getCar("car");
        System.out.println("car:" + car);

    }
}
