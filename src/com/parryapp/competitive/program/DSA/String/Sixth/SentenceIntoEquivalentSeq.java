package com.parryapp.competitive.program.DSA.String.Sixth;

import com.parryapp.competitive.program.DSA.Utility.TimeComplexityCalc;

import java.util.HashMap;
import java.util.Map;

public class SentenceIntoEquivalentSeq {

    public static void main(String[] args) {
        String givenStringInput = "GEEKSFORGEEKS";

        long startTime1 = System.currentTimeMillis();
        System.out.println("Approach 1 :: " + Approach1(givenStringInput));
        long endTime1 = System.currentTimeMillis();
        System.out.println(TimeComplexityCalc.timeComplexity(startTime1, endTime1));

        //Alternative of 1st Approach can be using Array instead of Map.
        long startTime2 = System.currentTimeMillis();
        System.out.println("Approach 2 :: " + Approach2(givenStringInput));
        long endTime2 = System.currentTimeMillis();
        System.out.println(TimeComplexityCalc.timeComplexity(startTime2, endTime2));
    }

    private static String Approach2(String inputString) {
        String[] arr = mappingArray();

        StringBuilder sb = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (c == ' ') {
                sb.append("0");
            } else {
                sb.append(arr[c - 'A']);
            }
        }

        return sb.toString();
    }

    private static String Approach1(String inputString) {
        Map<Character, String> keyMaps = (mappingKeys(new HashMap<Character, String>()));

        StringBuilder sb = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            sb.append(keyMaps.get(c));
        }

        return sb.toString();
    }

    private static String[] mappingArray() {
        // storing the sequence in array
        String[] arr = new String[]{"2", "22", "222", "3", "33", "333",
                "4", "44", "444", "5", "55", "555",
                "6", "66", "666", "7", "77", "777",
                "7777", "8", "88", "888", "9", "99",
                "999", "9999"};

        return arr;
    }

    private static Map<Character, String> mappingKeys(HashMap<Character, String> keyMap) {
        keyMap.put('A', "2");
        keyMap.put('B', "22");
        keyMap.put('C', "222");

        keyMap.put('D', "3");
        keyMap.put('E', "33");
        keyMap.put('F', "333");

        keyMap.put('G', "4");
        keyMap.put('H', "44");
        keyMap.put('I', "444");

        keyMap.put('J', "5");
        keyMap.put('K', "55");
        keyMap.put('L', "555");

        keyMap.put('M', "6");
        keyMap.put('N', "66");
        keyMap.put('O', "666");

        keyMap.put('P', "7");
        keyMap.put('Q', "77");
        keyMap.put('R', "777");
        keyMap.put('S', "7777");

        keyMap.put('T', "8");
        keyMap.put('U', "88");
        keyMap.put('V', "888");

        keyMap.put('W', "9");
        keyMap.put('X', "99");
        keyMap.put('Y', "999");
        keyMap.put('Z', "9999");

        keyMap.put(' ', "0");

        return keyMap;
    }

}
