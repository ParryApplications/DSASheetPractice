package com.parryapp.competitive.program.DSA.String.Fifth;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};

        System.out.println("Approach1 : " + approach1(str));
    }

    private static String approach1(String[] v) {

        if (v.length == 1) {
            return v[0];
        }

        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}
