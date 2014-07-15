package com.noveogroup.algorithm;
import com.noveogroup.device.Device;

public class Insertions implements Algorithm {

    @Override
    public void sort(Device[] devices, boolean ascendingSort) {
            for(int i = 1; i < devices.length; i++) {
                    Device curr = devices[i];
                    int last = i - 1;
                if(ascendingSort)
                    while(last >= 0 && devices[last].getPrice() > curr.getPrice()){
                        replace(devices,curr,last);
                        last--;
                    }
                else
                    while(last >= 0 && devices[last].getPrice() < curr.getPrice()){
                        replace(devices,curr,last);
                        last--;
                    }
            }
    }

    private void replace(Device[] devices, Device curr, int i) {
        devices[i + 1] = devices[i];
        devices[i] = curr;
    }
}
