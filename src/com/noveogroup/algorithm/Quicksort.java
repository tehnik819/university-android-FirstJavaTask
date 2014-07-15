package com.noveogroup.algorithm;
import com.noveogroup.device.Device;

public class Quicksort implements Algorithm {

    @Override
    public void sort(Device[] devices, boolean ascendingSort) {
        qSort(devices,ascendingSort,0,devices.length - 1);
    }

    private void qSort(Device[] devices, boolean ascendingSort, int start, int end) {
        if ( start >= end ) { return;}
        int pivot = partition (devices, ascendingSort, start, end);
        qSort(devices, ascendingSort, start, pivot - 1);
        qSort(devices, ascendingSort, pivot + 1, end);
    }

    private int partition (Device[] devices, boolean ascendingSort, int start, int end)
    {
            int marker = start;
            for ( int i = start; i <= end; i++ ) {
                if(ascendingSort) {
                    if ( devices[i].getPrice() <= devices[end].getPrice() ) {
                        swap(devices,marker,i);
                        marker++;
                    }
                }
                else
                    if ( devices[i].getPrice() >= devices[end].getPrice() ) {
                        swap(devices,marker,i);
                        marker++;
                    }
            }
            return marker - 1;
    }

    private void swap(Device[] devices,int m,int i) {
        Device tmp = devices[m];
        devices[m] = devices[i];
        devices[i] = tmp;
    }
}
