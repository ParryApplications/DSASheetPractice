package com.parryapp.competitive.program.DSA.Arrays.Fifth;

import java.util.Arrays;

public class ChocolateDistributionProb {

    static int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
    static int m = 5;//Number of Students

    public static void main(String[] args) {
        System.out.println("Minimum Difference is : " + approach1());
    }

    private static int approach1() {
        int min = 0, max = 0, fin = Integer.MAX_VALUE;

        Arrays.sort(arr);//You can replace this by Quick Sort, but if you are implementing then implement with MedianOfTree for efficient pivot summoned

        for (int i = 0, j = m - 1; j < arr.length; j++, i++) {
            min = arr[i];
            max = arr[j];

            fin = Math.min(fin, Math.subtractExact(max, min));
        }

        return fin;
    }
}
