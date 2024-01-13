package com.yhy.design.creation.builder;

/**
 * 建造者模式
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractBuilder builder = new XiaomiBuilder();

        //建造手机
//        builder.customCpu("晓龙999");
//        builder.customCamera("1亿像素");
//        builder.customDisk("512G");
//        builder.customMemory("12G");

        //链式调用
        Phone product = builder.customCpu("骁龙000")
                .customMemory("16G")
                .customDisk("1T")
                .customCamera("1千万像素")
                .getProduct();
        System.out.println(product);

        Phone build = Phone.builder().cpu("dd")
                .disk("sd")
                .camera("hk")
                .memory("ew")
                .build();
        System.out.println(build);

    }
}
