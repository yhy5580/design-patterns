package com.yhy.design.structural.bridge;

/**
 * 抽象手机类
 * 手机有各种销售渠道，价格不同
 */
public abstract class AbstractPhone {

    //桥接在此处，系统一开始就要设计好
    //【真正会引起此类变化的一个维度直接抽取出来，通过组合的方式连接起来】
    //桥接可以与适配器联合
    AbstractSale sale;//分离渠道【桥接的关注点】

//    abstract int getPrice();//如果这样写需要很多个实现

    abstract String getPhoneInfo();

    public void setSale(AbstractSale sale) {
        this.sale = sale;
    }
}
