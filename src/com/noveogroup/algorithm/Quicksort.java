package com.noveogroup.algorithm;
import com.noveogroup.device.Device;

public class Quicksort implements Algorithm {

    @Override
    public void sort(Device[] devices, boolean ascendingSort) {
        qSort(devices,ascendingSort,0,devices.length - 1);
    }

    private void qSort(Device[] devices, boolean ascendingSort, int start, int end) {
        if ( start >= end )
        {
            return;
        }
        int pivot = partition (devices, ascendingSort, start, end);
        qSort(devices, ascendingSort, start, pivot - 1);
        qSort(devices, ascendingSort, pivot + 1, end);
    }

    private int partition (Device[] devices, boolean ascendingSort, int start, int end)
    {
        if(ascendingSort)
        {
            int marker = start;
            for ( int i = start; i <= end; i++ )
            {
                    if ( devices[i].getPrice() <= devices[end].getPrice() )
                    {
                        Device tmp = devices[marker]; // swap
                        devices[marker] = devices[i];
                        devices[i] = tmp;
                        marker += 1;
                    }
            }
            return marker - 1;
        }
        else
        {
            int marker = start;
            for ( int i = start; i <= end; i++ )
            {
                if ( devices[i].getPrice() >= devices[end].getPrice() )
                {
                    Device tmp = devices[marker]; // swap
                    devices[marker] = devices[i];
                    devices[i] = tmp;
                    marker += 1;
                }
            }
            return marker - 1;
        }
    }
}
