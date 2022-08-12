package com.lmch.FactoryMethod.idcard;

import java.util.ArrayList;
import java.util.List;

import com.lmch.FactoryMethod.framework.Factory;
import com.lmch.FactoryMethod.framework.Product;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList<Object>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
    
    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
    public List getOwners() {
        return owners;
    }
}
