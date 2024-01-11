package com.yhy.design.creation.factory.abstractFactory.factories.carFactories;

import com.yhy.design.creation.factory.abstractFactory.cars.AbstractCar;
import com.yhy.design.creation.factory.abstractFactory.cars.Truck;

/**
 * 卡车工厂
 */
public class TruckFactory extends AbstractCarFactory {

    @Override
    public AbstractCar getCar() {
        return new Truck();
    }
}
