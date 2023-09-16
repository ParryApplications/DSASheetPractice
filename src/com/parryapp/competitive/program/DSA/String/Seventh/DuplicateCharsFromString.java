package com.parryapp.competitive.program.DSA.String.Seventh;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharsFromString {
    public static void main(String[] args) {
        String inputString = "geeksforgeeks";
        System.out.println("Approach1: " + Approach1(inputString));
    }

    private static String Approach1(String gS) {
        if(gS.length() <= 1){
            return "No Duplicate Elements Found!";
        }

        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : gS.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> i : map.entrySet()) {
            if (i.getValue() > 1) {
                sb.append(i.getKey()+", count = "+i.getValue()+"\n");
            }
        }

        return sb.toString();
    }
}