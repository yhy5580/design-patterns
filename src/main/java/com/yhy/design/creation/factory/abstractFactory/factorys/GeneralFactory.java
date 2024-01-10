package com.yhy.design.creation.factory.abstractFactory.factorys;

import com.yhy.design.creation.factory.abstractFactory.cars.AbstractCar;
import com.yhy.design.creation.factory.abstractFactory.masks.AbstractMask;

/**
 * 总工厂抽象类
 */
public abstract class GeneralFactory {
    public abstract AbstractMask getMask();

    public abstract AbstractCar getCar();
}
