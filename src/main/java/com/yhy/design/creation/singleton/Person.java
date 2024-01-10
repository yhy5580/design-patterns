package com.yhy.design.creation.singleton;

public class Person {
    private String name;
    private String age;

    //懒汉、饿汉
    private volatile static Person instance;

    //构造器私有化，外部不能实例化
    private Person() {
        System.out.println("Person构造方法执行");
    }

    //提供给外部的方法
    //1、public static synchronized Person getInstance() 锁太大
    //2、双重检查锁+内存可见性（volatile） if (instance == null) {
    //            synchronized (Person.class) {
    //                if (instance == null) {
    //                    instance = new Person();
    //                }
    //            }
    //        }

    public static Person getInstance() {
        if (instance == null) {
            synchronized (Person.class) {
                if (instance == null) {
                    instance = new Person();
                }
            }
        }
        return instance;
    }
}
