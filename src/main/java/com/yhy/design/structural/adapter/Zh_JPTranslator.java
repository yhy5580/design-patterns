package com.yhy.design.structural.adapter;

/**
 * 中文-日文翻译器
 */
public class Zh_JPTranslator implements Translator {
    @Override
    public String translate(String content) {
        if ("你好".equals(content)) {
            return "こんにちは";
        } else if ("什么".equals(content)) {
            return "何ですか";
        } else if ("今天是周一，早起吃过饭去搬砖嘞".equals(content)) {
            return "今日は月曜だから,早起きしてご飯食べて,れんが運びに行きますよ";
        }
        return "*******";
    }
}
