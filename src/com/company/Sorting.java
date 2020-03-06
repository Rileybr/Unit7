package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {
    public static ArrayList<Integer> getUnsorted() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("sortedData1.txt"));
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        while (count != 8){
            list.add(scanner.nextInt());
            count++;
        }
        return list;
    }
    public static boolean isSorted(ArrayList<Integer> arr){
        for (int i = 0; i <= 8; i++){

        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(getUnsorted());
    }
}
