package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Task number One
        List<Integer> arrayListOfNumber = new ArrayList<>();
        arrayListOfNumber.add(3);
        arrayListOfNumber.add(9);
        arrayListOfNumber.add(11);
        arrayListOfNumber.add(18);
        arrayListOfNumber.add(20);
        arrayListOfNumber.add(22);
        for (int i = 0; i < arrayListOfNumber.size(); i++) {
            if (arrayListOfNumber.get(i) % 3 == 0) {
                arrayListOfNumber.remove(i--);
            }
        }
        System.out.println(arrayListOfNumber);

        // Task number Two
        List<String> arrayListOfFruits = new ArrayList<>();
        boolean checkFruits = false;
        arrayListOfFruits.add("Orange");
        arrayListOfFruits.add("Banana");
        arrayListOfFruits.add("Grapefruit");
        arrayListOfFruits.add("Apple");
        System.out.println("List:" + arrayListOfFruits);

        for (int i = 0; i < arrayListOfFruits.size(); i++) {
            if (arrayListOfFruits.get(i).contains("Orange")) {
                arrayListOfFruits.set(i, "Grapefruit");
                checkFruits = true;
            }
        }
        if (checkFruits == false) {
            System.out.println("Value not present");
        } else {
            System.out.println("ListOfReplace:" + arrayListOfFruits);
        }
        // Task number Three

        List<Integer> listNumberOne = new ArrayList<>();
        List<Integer> listNumberTwo = new ArrayList<>();
        boolean similar = false;
        int count = 0;

        listNumberOne.add(1);
        listNumberOne.add(2);
        listNumberOne.add(3);
        listNumberOne.add(4);
        listNumberOne.add(5);
        listNumberOne.add(6);

        listNumberTwo.add(1);
        listNumberTwo.add(70);
        listNumberTwo.add(45);
        listNumberTwo.add(90);
        listNumberTwo.add(5);
        listNumberTwo.add(6);
        System.out.println(listNumberOne);
        System.out.println(listNumberTwo);
        for (int i = 0; i < listNumberOne.size(); i++) {
            for (int j = 0; j < listNumberTwo.size(); j++) {
                if (listNumberOne.get(i).equals(listNumberTwo.get(j))) {
                    similar = true;
                    count++;
                }
            }

        }
        if (similar == true) {
            System.out.println("Number of identical elements: " + count);
        } else {
            System.out.println("no identical elements");
        }
    }
}



