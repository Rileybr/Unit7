package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
    public static Scanner scanner = new Scanner(System.in);

    public static ArrayList<Integer> numberList(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(-5);
        list.add(7);
        list.add(12);
        list.add(-1);
        System.out.println(list);
        list.set(2, 10);
        list.set(list.indexOf(-5), 9);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        return list;
    }

    public static ArrayList<Double> firstAndLast(){
        ArrayList<Double> list = new ArrayList<Double>();
        int yes = 1;

        while (yes != 0){
            System.out.println("Enter decimal numbers: ");
            double num_temp = scanner.nextDouble();
            if (num_temp == 0){
                yes = 0;
            }
            else{
                list.add(num_temp);
            }
        }

        list.set(2, list.get(list.size()-1));
        list.set(1, list.get(0));
        list.set(0, (double)list.size());
        while (list.size() != 3){
            list.remove(3);
        }
        System.out.println(list);
        return list;
    }
    public static ArrayList<Double> getNumbers(){
        ArrayList<Double> list = new ArrayList<Double>();
        for (int i = 0; i < 3; i++){
            System.out.println("Enter value: ");
            list.add(scanner.nextDouble());
        }
        return list;
    }

    public static ArrayList<Double> arrangeList(ArrayList<Double> numbers){
        double temp = 0;
        while (numbers.get(0) > numbers.get(1) || numbers.get(1) > numbers.get(2) || numbers.get(0) > numbers.get(2)){
            if (numbers.get(0) > numbers.get(1)){
                temp = numbers.get(0);
                numbers.set(0, numbers.get(1));
                numbers.set(1, temp);
            }
            if (numbers.get(0) > numbers.get(2)){
                temp = numbers.get(0);
                numbers.set(0, numbers.get(2));
                numbers.set(2, temp);
            }
            if (numbers.get(1) > numbers.get(2)){
                temp = numbers.get(1);
                numbers.set(1, numbers.get(2));
                numbers.set(2, temp);
            }
        }
        return numbers;
    }



    public static void main(String[] args){
       ArrayList<Double> list = getNumbers();
       System.out.println(arrangeList(list));
    }
}
