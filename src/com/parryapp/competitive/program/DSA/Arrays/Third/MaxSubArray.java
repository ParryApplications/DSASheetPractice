package com.parryapp.competitive.program.DSA.Arrays.Third;

public class MaxSubArray {

    static int[] arr = {5, 4, -1, 7, 8};

    public static void main(String[] args) {
        approach1();
        approach2();//Kadane's Algo
    }

    private static void approach2() {//O(N)
        int sum = 0, max = arr[0];
        for (int e : arr) {
            sum += e;
            max = Math.max(sum, max);
            if (sum < 0)
                sum = 0;
        }
        System.out.println("Max (Through Kadane's Algo) : " + max);
    }

    private static void approach1() {//O(N^3)
        int N = arr.length;
        int max = 0, sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                sum = 0;
                for (int k = 0; k <= j; k++) {
                    sum += arr[k];
                }
                max = Math.max(sum, max);
            }
        }

        System.out.println("Max: " + max);
    }

}
