package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Traversing {
        public static ArrayList<String> getStates(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Enter the name of a state or \"Stop\" to quit: ");
        String state = scanner.nextLine();
        while (!state.toLowerCase().equals("stop")){
            list.add(state);
            System.out.println("Next state or \"Stop\": ");
            state = scanner.nextLine();
        }
        return list;
    }
    public static String createList(ArrayList<String> states){
        String trip = "";
        for (int i = 0; i < states.size()-1; i++){
            trip += states.get(i) + " -> ";
        }
        trip += states.get(states.size()-1);
        return trip;
    }

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

        temp = list.get(min);
        System.out.println(temp);
        for (int i = min; i > 0; i--){
            list.set(i, list.get(i-1));
        }
        list.set(0, temp);






        temp = list.get(max);
        list.remove(max);
        list.add(temp);
        return list;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(largestAndSmallest());
    }
}
