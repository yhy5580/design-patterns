package com.yhy.design.creation.factory.abstractFactory;

import com.yhy.design.creation.factory.abstractFactory.cars.AbstractCar;
import com.yhy.design.creation.factory.abstractFactory.factories.carFactories.AbstractCarFactory;
import com.yhy.design.creation.factory.abstractFactory.factories.carFactories.MotorcycleFactory;
import com.yhy.design.creation.factory.abstractFactory.factories.maskFactories.AbstractMaskFactory;
import com.yhy.design.creation.factory.abstractFactory.factories.maskFactories.CommonMaskFactory;
import com.yhy.design.creation.factory.abstractFactory.masks.AbstractMask;

/**
 * 抽象工厂模式
 */
public class MainTest {
    public static void main(String[] args) {

        AbstractMaskFactory abstractMaskFactory = new CommonMaskFactory();
        AbstractMask mask = abstractMaskFactory.getMask();
        System.out.println("CommonMaskFactory获取mask：" + mask);
        mask.effect();

        AbstractCarFactory abstractCarFactory = new MotorcycleFactory();
        AbstractCar car = abstractCarFactory.getCar();
        System.out.println("MotorcycleFactory 获取car：" + car);
        car.run();

    }
}
