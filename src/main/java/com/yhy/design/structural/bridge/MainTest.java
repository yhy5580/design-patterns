package com.yhy.design.structural.bridge;

/**
 * 桥接模式
 * 减少类的创建
 */
public class MainTest {
    public static void main(String[] args) {
        XiaomiPhone xiaomiPhone = new XiaomiPhone();
        xiaomiPhone.setSale(new OfflineSale("线下",3999));
        System.out.println(xiaomiPhone.getPhoneInfo());
        xiaomiPhone.setSale(new OnlineSale("线上",3889));
        System.out.println(xiaomiPhone.getPhoneInfo());
    }
}
