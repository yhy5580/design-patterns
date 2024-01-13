package com.yhy.design.creation.builder;

/**
 * 抽象建造者
 */
abstract class AbstractBuilder {
    Phone phone;

    Phone getProduct() {
        return phone;
    }

    abstract AbstractBuilder customCpu(String cpu);

    abstract AbstractBuilder customMemory(String memory);

    abstract AbstractBuilder customDisk(String disk);

    abstract AbstractBuilder customCamera(String camera);
}
