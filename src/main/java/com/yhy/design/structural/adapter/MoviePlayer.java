package com.yhy.design.structural.adapter;

/**
 * 电影播放器
 */
public class MoviePlayer implements Player{
    @Override
    public String play() {
        System.out.println("正在播放：今天我要努力搬砖.avi");
        String content = "今天是周一，早起吃过饭去搬砖嘞";
        System.out.println("中文字幕：" + content); //打印字幕
        return content;
    }
}
