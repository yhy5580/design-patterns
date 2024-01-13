package com.yhy.design.creation.builder;

public class XiaomiBuilder extends AbstractBuilder {

    public XiaomiBuilder() {
        phone = Phone.builder().build();
    }

    @Override
    AbstractBuilder customCpu(String cpu) {
        phone.cpu = cpu;
        return this;
    }

    @Override
    AbstractBuilder customMemory(String memory) {
        phone.memory = memory;
        return this;
    }

    @Override
    AbstractBuilder customDisk(String disk) {
        phone.disk = disk;
        return this;
    }

    @Override
    AbstractBuilder customCamera(String camera) {
        phone.camera = camera;
        return this;
    }
}
