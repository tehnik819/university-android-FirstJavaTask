package com.noveogroup.device;

public final class Notebook extends AbstractDevice {

    public Notebook(int p) {
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
