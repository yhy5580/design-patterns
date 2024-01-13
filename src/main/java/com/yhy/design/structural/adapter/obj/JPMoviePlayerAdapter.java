package com.yhy.design.structural.adapter.obj;

import com.yhy.design.structural.adapter.Player;
import com.yhy.design.structural.adapter.Translator;
import com.yhy.design.structural.adapter.Zh_JPTranslator;

/**
 * 组合的方式：对象结构型模式，适配转换到了翻译器的功能上
 */
public class JPMoviePlayerAdapter implements Player {

    private final Translator translator = new Zh_JPTranslator();//注入翻译器
    private final Player target;//被适配对象

    public JPMoviePlayerAdapter(Player target) {
        this.target = target;
    }

    @Override
    public String play() {
        String content = target.play();
        String translateContent = translator.translate(content);
        System.out.println("日文字幕：" + translateContent);
        return translateContent;
    }
}
