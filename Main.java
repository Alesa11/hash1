package com.company;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        CustomHashMap customHashMap = new CustomHashMap();
        customHashMap.put("тигр", 5);
        customHashMap.put("жираф", 8);
        customHashMap.put("лев", 12);
        customHashMap.put("зебра", 5);


        int value = (int) customHashMap.get("лев");
        customHashMap.put("лев", value + 3);
        System.out.println("лев" + customHashMap.get("лев"));

    }
}
