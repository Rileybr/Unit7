package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SelfAdjustingDriver {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(11); list.add(14);list.add(11);list.add(8);list.add(13);list.add(0);

        SelfAdjusting arr = new SelfAdjusting(list);
        arr.adjustList();
    }
}
