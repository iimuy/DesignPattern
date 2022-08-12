package com.lmch.FactoryMethod;

import com.lmch.FactoryMethod.framework.Factory;
import com.lmch.FactoryMethod.framework.Product;
import com.lmch.FactoryMethod.idcard.IDCardFactory;

public class Test {
    public static void doTest() {
        Factory factory = new IDCardFactory();
        Product idcard01 = factory.create("小明");
        Product idcard02 = factory.create("小红");
        Product idcard03 = factory.create("小刚");

        idcard01.use();
        idcard02.use();
        idcard03.use();
    }
}
