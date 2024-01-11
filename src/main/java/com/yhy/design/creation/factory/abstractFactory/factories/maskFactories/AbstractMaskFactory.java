package com.yhy.design.creation.factory.abstractFactory.factories.maskFactories;

import com.yhy.design.creation.factory.abstractFactory.cars.AbstractCar;
import com.yhy.design.creation.factory.abstractFactory.factories.AbstractGeneralFactory;
import com.yhy.design.creation.factory.abstractFactory.masks.AbstractMask;

/**
 * 抽象口罩工厂，只需要抽象getMask()供下层继承
 */
public abstract class AbstractMaskFactory extends AbstractGeneralFactory {
    @Override
    public abstract AbstractMask getMask();

    @Override
    public AbstractCar getCar() {
        return null;
    }

}
