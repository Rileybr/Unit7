package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithms {
    //public static Scanner scanner = new Scanner(System.in);

    public static ArrayList<Integer> largestAndSmallest() throws IOException {
        Scanner scanner = new Scanner(new File("numbers.txt"));
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (scanner.hasNext()){
            list.add (scanner.nextInt());
        }

        int temp = 0;
        int min = 0;
        int max = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) < list.get(min)){
                min = i;
            }
            if (list.get(i) > list.get(max)){
                max = i;
            }
        }
        temp = list.get(0);
        list.set(0, list.get(min));
        list.set(min, temp);

        temp = list.get(list.size()-1);
        list.set(list.size()-1, list.get(max));
        list.set(max, temp);
        return list;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(largestAndSmallest());
    }
}
