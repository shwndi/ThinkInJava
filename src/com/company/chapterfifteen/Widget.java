package com.company.chapterfifteen;

/**
 * @author czy
 * @date 2021/1/31
 */
public class Widget {
    public static class Factory implements FactoryI<Widget0> {
        @Override
        public Widget0 create() {
            return new Widget0();
        }
    }
}
