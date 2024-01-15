package com.yhy.design.structural.decorator;

/**
 * 美颜装饰器
 * 装饰 ManTikTok
 */
public class BeautyDecorator implements TikTokDecorator{

    private ManTikTok manTikTok;

    public BeautyDecorator(ManTikTok manTikTok) {
        this.manTikTok = manTikTok;
    }

    @Override
    public void tikTok() {
        //开启美颜
        turnOnBeauty();
        //开启直播
        manTikTok.tikTok();
    }

    @Override
    public void turnOnBeauty() {
        System.out.println("开启美颜");
    }
}
