package com.lmch.FactoryMethod.idcard;

import com.lmch.FactoryMethod.framework.Product;

public class IDCard extends Product {
    private String owner;
    IDCard(String owner) {
        this.owner = owner;
        System.out.println("制作" + owner + "的ID卡");
    }
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }
    public String getOwner() {
        return owner;
    }
}
