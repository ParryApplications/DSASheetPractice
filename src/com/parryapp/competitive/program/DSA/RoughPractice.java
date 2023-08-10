package com.parryapp.competitive.program.DSA;

import java.util.regex.*;

public class RoughPractice {
    public static void main(String[] args) {
        //1 Way:
        String regex = "a{2,4}";
        String text = "aa";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Match found: " + matcher.group());
        } else {
            System.out.println("Match not found.");
        }

        //2 Way:
        String text2 = "Hello, World!";
        boolean matches = text2.matches("Hello.*");

        System.out.println("Alternative: " + matches);

        //3 way:
        String regex3 = "[A-Z][a-z]+"; // Matches a capitalized word
        String text3 = "hello";

        System.out.println("WAY 3: " + text3.matches(regex3));
    }
}