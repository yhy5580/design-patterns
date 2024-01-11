package com.yhy.design.creation.factory.factoryMethod.factories;

import com.yhy.design.creation.factory.factoryMethod.cars.AbstractCar;
import com.yhy.design.creation.factory.factoryMethod.cars.Motorcycle;

/**
 * 摩托车工厂
 */
public class MotorcycleFactory extends AbstractCarFactory {
    @Override
    public AbstractCar getCar() {
        return new Motorcycle();
    }
}
