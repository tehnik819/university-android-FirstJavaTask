package com.noveogroup.algorithm;
import com.noveogroup.device.Device;

public class Bubble implements Algorithm {

    @Override
    public void sort(Device[] devices, boolean ascendingSort) {
            for(int i = 0;i < devices.length;i++) {
                for(int j = 0;j < devices.length - i - 1;j++)
                    if(ascendingSort) {
                        if(devices[j].getPrice() > devices[j + 1].getPrice())
                            swap(devices,j);
                    }
                    else
                        if(devices[j].getPrice() < devices[j + 1].getPrice())
                            swap(devices,j);
            }
    }

    private void swap(Device[] devices, int j) {
        Device tmp = devices[j];
        devices[j] = devices[j + 1];
        devices[j + 1] = tmp;
    }
}
