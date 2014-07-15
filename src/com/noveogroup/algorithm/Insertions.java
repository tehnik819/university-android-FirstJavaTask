package com.noveogroup.algorithm;
import com.noveogroup.device.Device;

public class Insertions implements Algorithm {

    @Override
    public void sort(Device[] devices, boolean ascendingSort) {
        if(ascendingSort)
        {
            for(int i = 1; i < devices.length; i++){
                    Device curr = devices[i];
                    int last = i - 1;
                    while(last >= 0 && devices[last].getPrice() > curr.getPrice()){
                        devices[last + 1] = devices[last];
                        devices[last] = curr;
                        last--;
                    }
            }
        }
        else
        {
            for(int i = 1; i < devices.length; i++){
                Device curr = devices[i];
                int last = i - 1;
                while(last >= 0 && devices[last].getPrice() < curr.getPrice()){
                    devices[last + 1] = devices[last];
                    devices[last] = curr;
                    last--;
                }
            }
        }
    }
}
