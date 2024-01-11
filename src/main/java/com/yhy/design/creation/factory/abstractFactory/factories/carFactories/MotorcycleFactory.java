package com.yhy.design.creation.factory.abstractFactory.factories.carFactories;

import com.yhy.design.creation.factory.abstractFactory.cars.AbstractCar;
import com.yhy.design.creation.factory.abstractFactory.cars.Motorcycle;

public class MotorcycleFactory extends AbstractCarFactory {

    @Override
    public AbstractCar getCar() {
        return new Motorcycle();
    }
}
