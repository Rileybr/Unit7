package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SelfAdjusting {
    private ArrayList<Integer> list;

    public SelfAdjusting(ArrayList<Integer> arr){
        list = arr;
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void adjustList() throws FileNotFoundException {
       ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2); arr.add(4); arr.add(6); arr.add(8); arr.add(10);
        arr.add(12); arr.add(14); arr.add(16); arr.add(18); arr.add(20);

        for (int x = 0; x < list.size(); x++) {
            int test = list.get(x);
            while (test != 0) {
                arr.add(0, test);
                for (int i = 1; i < arr.size(); i++) {
                    if (arr.get(i) == test) {
                        arr.remove(i);
                    }
                }
                break;
            }
        }
        System.out.println(arr);
    }
}
