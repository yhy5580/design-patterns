package com.yhy.design.creation.factory.factoryMethod;

import com.yhy.design.creation.factory.factoryMethod.cars.AbstractCar;
import com.yhy.design.creation.factory.factoryMethod.factorys.AbstractCarFactory;
import com.yhy.design.creation.factory.factoryMethod.factorys.MotorcycleFactory;
import com.yhy.design.creation.factory.factoryMethod.factorys.TruckFactory;

/**
 * 工厂方法模式
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractCarFactory abstractCarFactory;
        abstractCarFactory = new TruckFactory();
        AbstractCar truck = abstractCarFactory.getCar();
        System.out.println("truck:" + truck);
        truck.run();

        abstractCarFactory = new MotorcycleFactory();
        AbstractCar motorCycle = abstractCarFactory.getCar();
        System.out.println("motorCycle:" + motorCycle);
        motorCycle.run();

    }
}
