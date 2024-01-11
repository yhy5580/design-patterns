package com.yhy.design.creation.factory.abstractFactory.factories.carFactories;

import com.yhy.design.creation.factory.abstractFactory.cars.AbstractCar;
import com.yhy.design.creation.factory.abstractFactory.factories.AbstractGeneralFactory;
import com.yhy.design.creation.factory.abstractFactory.masks.AbstractMask;

/**
 * 抽象车工厂，只需要抽象getCar()供下层继承
 */
public abstract class AbstractCarFactory extends AbstractGeneralFactory {
    @Override
    public AbstractMask getMask() {
        return null;
    }

    public abstract AbstractCar getCar();
}
