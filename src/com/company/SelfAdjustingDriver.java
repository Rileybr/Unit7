package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SelfAdjustingDriver {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12); list.add(14);list.add(8);list.add(2);list.add(0);

        SelfAdjusting arr = new SelfAdjusting(list);
        arr.adjustList();
    }
}
