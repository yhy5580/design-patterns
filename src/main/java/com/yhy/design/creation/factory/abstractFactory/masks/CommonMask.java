package com.yhy.design.creation.factory.abstractFactory.masks;

public class CommonMask extends AbstractMask{

    public CommonMask() {
        this.type = "commonMask";
    }
    @Override
    public void effect() {
        System.out.println("普通口罩作用一般般。。。");
    }
}
