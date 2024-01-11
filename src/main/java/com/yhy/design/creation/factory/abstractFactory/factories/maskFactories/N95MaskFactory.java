package com.yhy.design.creation.factory.abstractFactory.factories.maskFactories;

import com.yhy.design.creation.factory.abstractFactory.masks.AbstractMask;
import com.yhy.design.creation.factory.abstractFactory.masks.N95Mask;

public class N95MaskFactory extends AbstractMaskFactory {
    @Override
    public AbstractMask getMask() {
        return new N95Mask();
    }
}
