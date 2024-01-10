package com.yhy.design.creation.factory.simpleFactory.cars;

/**
 * 抽象汽车类
 */
public abstract class AbstractCar {
    protected String type;

    /**
     * 由子类重写
     */
    public abstract void run();
}
