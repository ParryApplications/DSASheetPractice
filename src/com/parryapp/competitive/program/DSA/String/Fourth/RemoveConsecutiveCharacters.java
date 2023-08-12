package com.parryapp.competitive.program.DSA.String.Fourth;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class RemoveConsecutiveCharacters {

    public static void main(String[] args) {
        String s = "ababb";//ans: abab

        System.out.println("Approach 1 : " + approach1(s));//Best So Far
        System.out.println("Approach 2 : " + approach2(s));
    }

    private static String approach2(String s) {//TC: 43ms
        Stack<Character> stack = new Stack();

        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }

    private static String approach1(String s) {//TC: 31ms
        StringBuilder sb = new StringBuilder();

        sb.append(s.charAt(0));
        for (int i = 0, j = 1; i < s.length() - 1; i++, j++) {
            if (s.charAt(i) != s.charAt(j)) {
                sb.append(s.charAt(j));
            }
        }

        return sb.toString();
    }


}
