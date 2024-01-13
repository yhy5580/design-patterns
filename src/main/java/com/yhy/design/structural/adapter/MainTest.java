package com.yhy.design.structural.adapter;

/**
 * 适配器模式：
 * 系统原有两个已存在接口 Player 和 Translator，这两个接口没有任何关系
 * <p>
 * 需求：现有一个小日本友人看中文电影需要日文字幕，
 * 我们在不改变原有系统的基础上实现这个功能就需要一个适配器
 * <p>
 * 系统原有的接口不做任何修改，扩展一个新的类来连接两个没有联系的接口
 */
public class MainTest {
    public static void main(String[] args) {

        MoviePlayer moviePlayer = new MoviePlayer();
        moviePlayer.play();

    }
}
