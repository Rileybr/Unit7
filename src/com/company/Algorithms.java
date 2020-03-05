package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithms {
    public static ArrayList<Integer> fileDuplicates() throws FileNotFoundException {
        Scanner scanner1 = new Scanner(new File("file1.txt"));
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        Scanner scanner2 = new Scanner(new File("file2.txt"));
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        while (scanner1.hasNext()){
            list1.add(scanner1.nextInt());
        }
        while (scanner2.hasNext()){
            list2.add(scanner2.nextInt());
        }

        ArrayList<Integer> output = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++){
            for (int x = 0; x < 20; x++){
                if (list1.get(i)==list2.get(x)){
                    output.add(list1.get(i));
                }
            }
        }
        return output;
    }

    public static ArrayList<String> fileDuplicatesTwo() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("names.txt"));
        ArrayList<String> list = new ArrayList<String>();
        String name_list = scanner.nextLine();

        int count = 0;
        int temp1 = 0;
        int temp2 = 0;
        String temp = "";
        boolean check = true;
        while (count < name_list.length()){

            temp2 = name_list.indexOf(" ", temp1+1);
            if (temp2 <= 0){
                break;
            }

            list.add(name_list.substring(temp1+1, temp2));
            while (check) {
                list.set(0, name_list.substring(temp1, temp2));
                check = false;
            }
            count += name_list.substring(temp1, temp2).length();
            temp1 = temp2;
        }
        list.add(name_list.substring(temp1+1));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++){
            for (int x = i+1; x< list.size(); x++){
                if (list.get(i).equals(list.get(x))){
                    list.remove(x);
                }
            }
        }


        return list;
    }





   public static ArrayList<Integer> orderedList() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("file1.txt"));
        ArrayList<Integer> list = new ArrayList<Integer>();
        int temp;
        int check_value;

        list.add(scanner.nextInt());
        while (scanner.hasNext()){
            check_value = scanner.nextInt();
            for (int i = list.size()-1; i >= 0; i--){
                if (check_value > list.get(i)){
                    list.add(i+1, check_value);
                    break;
                }
                else if (check_value < list.get(0)){
                    list.add(0, check_value);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(orderedList());
    }
}
