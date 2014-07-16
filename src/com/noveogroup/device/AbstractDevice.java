package com.noveogroup.device;

public abstract class AbstractDevice implements Device {

    protected int price;

    AbstractDevice(int p) {
        this.price = p;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
