package com.yhy.design.creation.factory.simpleFactory.factorys;

import com.yhy.design.creation.factory.simpleFactory.cars.AbstractCar;
import com.yhy.design.creation.factory.simpleFactory.cars.Motorcycle;
import com.yhy.design.creation.factory.simpleFactory.cars.Truck;

/**
 * 汽车简单工厂
 */
public class CarSimpleFactory {

    public AbstractCar getCar(String type) {
        if ("truck".equals(type)) {
            return new Truck();
        } else if ("motorcycle".equals(type)) {
            return new Motorcycle();
        }
        //如果再有新类型的车加进来需要修改代码，违反开闭原则
        //else if...
        return null;
    }
}
