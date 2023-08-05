package com.parryapp.competitive.program.DSA.Arrays.Fourth;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    static int[] nums = {1, 2, 3};

    public static void main(String[] args) {
        System.out.println("Array Contains Duplicate Elements? : " + approach1());//Best One, So far

        System.out.println("Array Contains Duplicate Elements? : " + approach2());
    }

    private static boolean approach2() {
        return Arrays.stream(nums).distinct().count() != nums.length;
    }

    private static boolean approach1() {
        int N = nums.length;
        if (N == 1)
            return false;

        Set<Integer> set = new HashSet<>();
        for (int e : nums) {
            if (set.contains(e)) {
                return true;
            } else {
                set.add(e);
            }
        }
        return false;
    }
}
