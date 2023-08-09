package com.parryapp.competitive.program.DSA.String.First;

public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Approach 1: " + approach1(s));//Second best so far
        System.out.println("Approach 2: " + approach2(s));
        System.out.println("Approach 3: " + approach3(s));
        System.out.println("Approach 4: " + approach4(s));//best so far
    }

    private static boolean approach1(String s) {
        StringBuilder sb = new StringBuilder();

        //Removed all non-alphanumeric character, and make it in lower case
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        int i = 0, j = sb.length() - 1;
        while (i < j) {
            if (sb.charAt(i) != sb.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static boolean approach2(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""));

        for (int i = 0, j = sb.length() - 1; i <= j; i++, j--) {
            if (sb.charAt(i) != sb.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    private static boolean approach3(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""));
        return sb.toString().equals(sb.reverse().toString());
    }

    private static boolean approach4(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while (start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}
