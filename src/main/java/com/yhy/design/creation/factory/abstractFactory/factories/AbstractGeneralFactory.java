package com.yhy.design.creation.factory.abstractFactory.factories;

import com.yhy.design.creation.factory.abstractFactory.cars.AbstractCar;
import com.yhy.design.creation.factory.abstractFactory.masks.AbstractMask;

/**
 * 总工厂抽象类
 * 可以是抽象接口（只有方法），也可以是抽象类（有属性和方法）
 *
 */
public abstract class AbstractGeneralFactory {
    public abstract AbstractMask getMask();

    public abstract AbstractCar getCar();

    //如果此处新增一个抽象方法，那么其所有非抽象子类也只能重写该方法吗？
}
