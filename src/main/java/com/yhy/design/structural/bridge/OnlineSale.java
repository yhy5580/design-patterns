package com.yhy.design.structural.bridge;

/**
 * 线上销售渠道
 */
public class OnlineSale extends AbstractSale {
    public OnlineSale(String type, Integer price) {
        super(type, price);
    }

    @Override
    String getSaleInfo() {
        return this.type + "送满5000减50优惠券！！！今日价格仅要" + this.price + "！！！";
    }
}
