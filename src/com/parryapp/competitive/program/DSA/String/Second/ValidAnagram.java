package com.parryapp.competitive.program.DSA.String.Second;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    //NOTE: An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println("Is Approach 1 is Anagram: " + approach1(s, t));
        System.out.println("Is Approach 2 is Anagram: " + approach2(s, t));
    }

    private static boolean approach2(String s, String t) {
        if (s.length() == 0 || t.length() == 0)
            return false;

        if (s.length() != t.length())
            return false;

        int[] arr = new int[26];

        for (char sChar : s.toCharArray()) {
            arr[sChar - 'a']++;
        }
        for (char tChar : t.toCharArray()) {
            arr[tChar - 'a']--;
        }

        for (int a : arr) {
            if (a != 0)
                return false;
        }
        return true;
    }

    private static boolean approach1(String s, String t) {

        if (s.length() == t.length()) {

            Map<Character, Integer> map = new HashMap<>(s.length());

            for (int i = 0; i < t.length(); i++) {
                if (map.containsKey(t.charAt(i)))
                    map.put(t.charAt(i), map.get(t.charAt(i)) + 1);
                else
                    map.put(t.charAt(i), 1);
            }

            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i)))
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                else
                    return false;
            }

            for (Integer i : map.values()) {
                if (i != 0)
                    return false;
            }

            return true;
        }
        return false;
    }
}
