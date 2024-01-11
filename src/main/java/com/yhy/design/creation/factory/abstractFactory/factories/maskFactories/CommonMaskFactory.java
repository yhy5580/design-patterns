package com.yhy.design.creation.factory.abstractFactory.factories.maskFactories;

import com.yhy.design.creation.factory.abstractFactory.masks.AbstractMask;
import com.yhy.design.creation.factory.abstractFactory.masks.CommonMask;

/**
 * 普通口罩工厂
 */
public class CommonMaskFactory extends AbstractMaskFactory {
    @Override
    public AbstractMask getMask() {
        return new CommonMask();
    }
}
