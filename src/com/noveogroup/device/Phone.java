package com.noveogroup.device;

public final class Phone extends AbstractDevice {

    public Phone(int p) {
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
