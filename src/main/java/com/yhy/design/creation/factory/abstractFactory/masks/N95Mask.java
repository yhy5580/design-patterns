package com.yhy.design.creation.factory.abstractFactory.masks;

public class N95Mask extends AbstractMask{
    public N95Mask () {
        this.type = "N95Mask";
    }
    @Override
    public void effect() {
        System.out.println("N95口罩效果棒极了！！！");
    }
}
