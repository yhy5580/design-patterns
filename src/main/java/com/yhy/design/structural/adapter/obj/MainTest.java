package com.yhy.design.structural.adapter.obj;

import com.yhy.design.structural.adapter.MoviePlayer;

/**
 * 对象结构型适配器
 */
public class MainTest {
    public static void main(String[] args) {
        JPMoviePlayerAdapter jpMoviePlayerAdapter = new JPMoviePlayerAdapter(new MoviePlayer());
        jpMoviePlayerAdapter.play();
    }
}
