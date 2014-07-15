package com.noveogroup.device;

public final class Tablet extends AbstractDevice {

    public Tablet(int p) {
        super(p);
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Device o) {
        return 0;
    }
}
