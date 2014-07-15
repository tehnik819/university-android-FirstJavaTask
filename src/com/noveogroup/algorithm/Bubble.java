package com.noveogroup.algorithm;
import com.noveogroup.device.Device;

public class Bubble implements Algorithm {

    @Override
    public void sort(Device[] devices, boolean ascendingSort) {
        if(ascendingSort)
        {
            for(int i = 0;i < devices.length;i++)
            {
                for(int j = 0;j < devices.length - i - 1;j++)
                        if(devices[j].getPrice() > devices[j + 1].getPrice())
                        {
                            Device tmp = devices[j];
                            devices[j] = devices[j + 1];
                            devices[j + 1] = tmp;
                        }
            }
        }
        else
        {
            for(int i = 0;i < devices.length;i++)
            {
                for(int j = 0;j < devices.length - i - 1;j++)
                    if(devices[j].getPrice() < devices[j + 1].getPrice())
                    {
                        Device tmp = devices[j];
                        devices[j] = devices[j + 1];
                        devices[j + 1] = tmp;
                    }
            }
        }
    }
}
