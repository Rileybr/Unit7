/**
 * @author Brandon Riley
 * @since March 12 2020
 * Takes an array list of even numbers between 2-20 and another array list, it goes through the second array list and checks if the number appears in the even list and moves that number to the beginning on the list and if it does not appear it is added to the front of the list
 */
package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SelfAdjusting {
    private ArrayList<Integer> list;

    /**
     * Initiates the array list of the numbers that will be moved or added
     * @param arr the input numbers that will be moved or added
     */
    public SelfAdjusting(ArrayList<Integer> arr){
        list = arr;
    }

    /**
     * returns the list of numbers that will be moved or added
     * @return list of numbers that will be moved or added
     */
    public ArrayList<Integer> getList() {
        return list;
    }

    /**
     * Creates a array list of even numbers between 2-20 and uses the array list passed to this class to add the values to the beginning of the list and if it appears in the list, remove it
     */
    public void adjustList(){
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
