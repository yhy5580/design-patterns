package com.yhy.design.structural.bridge;

public class XiaomiPhone extends AbstractPhone {
    @Override
    String getPhoneInfo() {
        return "XiaomiPhone：" + this.sale.getSaleInfo();
    }
}
