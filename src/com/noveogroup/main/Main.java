package com.noveogroup.main;

import com.noveogroup.algorithm.Bubble;
import com.noveogroup.algorithm.Insertions;
import com.noveogroup.algorithm.Quicksort;
import com.noveogroup.device.Device;
import com.noveogroup.device.Notebook;
import com.noveogroup.device.Phone;
import com.noveogroup.device.Tablet;

public class Main {

    public static void main(String[] args) {
        Phone[] phones = new Phone[10];
        for(int i = 0;i < 10;i++)
        {
            phones[i] = new Phone(i % 5);
        }
        System.out.println("Unsorted array:");
        show(phones);
        /*
        System.out.println("Bubble sort");
        Bubble b = new Bubble();
        b.sort(phones,false);
        */
        /*
        System.out.println("Insertion sort");
        Insertions ins = new Insertions();
        ins.sort(phones,false);
        */
        /*
        System.out.println("QuickSort");
        Quicksort q = new Quicksort();
        q.sort(phones,true);
        */
        System.out.println("Sorted array");
        show(phones);


    }

    private static void show(Device[] devices)
    {
        for(int i = 0;i < devices.length;i++)
            System.out.print(devices[i].getPrice() + " ");
        System.out.println();
    }
}
