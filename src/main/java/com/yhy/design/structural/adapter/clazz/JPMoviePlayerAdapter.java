package com.yhy.design.structural.adapter.clazz;

import com.yhy.design.structural.adapter.Player;
import com.yhy.design.structural.adapter.Zh_JPTranslator;

/**
 * 继承的方式：类结构型模式，适配转换到了翻译器的功能上
 * <p>
 * 继承翻译器
 */
public class JPMoviePlayerAdapter extends Zh_JPTranslator implements Player {

    private final Player target;//被适配对象

    public JPMoviePlayerAdapter(Player target) {
        this.target = target;
    }

    @Override
    public String play() {
        String content = target.play();
        String translateContent = super.translate(content);
        System.out.println("日文字幕：" + translateContent);
        return translateContent;
    }
}
