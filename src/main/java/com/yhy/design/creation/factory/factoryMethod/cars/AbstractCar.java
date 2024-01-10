package com.yhy.design.creation.factory.factoryMethod.cars;

/**
 * 抽象汽车类
 *
 * 怎么把一个功能提升一个层次：定义抽象（抽象类、接口）
 * 抽象类、接口 有多实现，自然就有多功能
 */
public abstract class AbstractCar {
    protected String type;

    /**
     * 由子类重写
     */
    public abstract void run();
}
