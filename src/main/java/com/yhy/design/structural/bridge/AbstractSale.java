package com.yhy.design.structural.bridge;

/**
 * 抽象销售渠道类
 */
public abstract class AbstractSale {
    String type;
    Integer price;

    public AbstractSale(String type, Integer price) {
        this.type = type;
        this.price = price;
    }

    abstract String getSaleInfo();
}
