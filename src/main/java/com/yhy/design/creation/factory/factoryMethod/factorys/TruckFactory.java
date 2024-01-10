package com.yhy.design.creation.factory.factoryMethod.factorys;

import com.yhy.design.creation.factory.factoryMethod.cars.AbstractCar;
import com.yhy.design.creation.factory.factoryMethod.cars.Truck;

/**
 * 卡车工厂
 */
public class TruckFactory extends AbstractCarFactory {
    @Override
    public AbstractCar getCar() {
        return new Truck();
    }
}
