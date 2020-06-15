package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SimpleHashMap simpleHashMap = new SimpleHashMap(16);


        simpleHashMap.put("тигр", 5);
        simpleHashMap.put("жираф", 8);
        simpleHashMap.put("лев", 12);
        simpleHashMap.put("зебра", 5);


        int value = (int) simpleHashMap.get("лев");
        simpleHashMap.put("лев", value + 3);
        System.out.println("лев" + simpleHashMap.get("лев"));


    }
}

