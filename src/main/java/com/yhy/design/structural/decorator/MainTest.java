package com.yhy.design.structural.decorator;

/**
 * 装饰器模式（decorator/wrapper）
 * 核心：不改变原来接口方法的情况下扩展新功能或者增强方法
 */
public class MainTest {
    public static void main(String[] args) {
        ManTikTok yhyTikTok = new YhyTikTok();
        yhyTikTok.tikTok();

        BeautyDecorator beautyDecorator = new BeautyDecorator(new YhyTikTok());
        beautyDecorator.tikTok();

    }
}
