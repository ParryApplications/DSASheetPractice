package com.parryapp.competitive.program.DSA.String.Third;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "{";
        System.out.println("Is Approach 1 is Valid: " + approach1(s));//Best so far
        System.out.println("Is Approach 2 is Valid: " + approach2(s));
    }

    private static boolean approach2(String s) {
        Map<Character, Character> charMap = new HashMap<>(3);
        charMap.put(')', '(');
        charMap.put('}', '{');
        charMap.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (char e : s.toCharArray()) {
            if (charMap.containsKey(e)) {
                char tempOpenBracket = charMap.get(e);

                if (stack.isEmpty() || stack.pop() != tempOpenBracket)
                    return false;
            } else {
                stack.push(e);
            }
        }
        return stack.isEmpty();
    }

    private static boolean approach1(String s) {
        Stack<Character> stack = new Stack<>();

        for (char element : s.toCharArray()) {
            if (element == '{' || element == '(' || element == '[') {
                stack.push(element);
            } else {
                if (!stack.isEmpty()) {
                    char temp = stack.pop();
                    if (element == '}' && temp == '{') {

                    } else if (element == ']' && temp == '[') {

                    } else if (element == ')' && temp == '(') {

                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return (stack.isEmpty()) ? true : false;
    }
}
