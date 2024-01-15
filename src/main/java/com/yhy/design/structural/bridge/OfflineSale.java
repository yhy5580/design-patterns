package com.yhy.design.structural.bridge;

/**
 * 线下销售渠道
 */
public class OfflineSale extends AbstractSale {
    public OfflineSale(String type, Integer price) {
        super(type, price);
    }

    @Override
    String getSaleInfo() {
        return this.type + "促销大优惠，买手机送大米和食用油！！！仅限今日，价格" + this.price + "！！！走过路过不要错过！！！";
    }
}
