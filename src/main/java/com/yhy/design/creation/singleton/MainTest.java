package com.yhy.design.creation.singleton;

/**
 * 单例模式
 */
public class MainTest {

    public static void main(String[] args) {
        Person person1 = Person.getInstance();
        Person person2 = Person.getInstance();
        System.out.println(person2 == person1);
    }
}
