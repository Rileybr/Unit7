package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOfRectangles {
    public static ArrayList<Rectangle> getRectangles() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("rectangle.txt"));

        ArrayList<Rectangle> list = new ArrayList<Rectangle>();
        while (scanner.hasNext()) {
            String temp = scanner.nextLine();
            double width = Double.parseDouble(temp.substring(0, temp.indexOf(" ")));
            double length = Double.parseDouble(temp.substring(temp.indexOf(" ")));
            list.add(new Rectangle(width, length));
        }
        return list;
    }
    public static double findAverage(ArrayList<Rectangle> rectangles){
        double total = 0;
        for (int i = 0; i < rectangles.size(); i++){
            total += rectangles.get(i).area();
        }
        double average = total/rectangles.size()*100;
        int reduce = (int)(average);
        average =(double) reduce/100;
        return average;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("The average area would be " + findAverage(getRectangles()));
    }
}
