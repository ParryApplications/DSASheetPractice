package com.parryapp.competitive.program.DSA.Arrays.Second;

import java.util.Arrays;

public class ReverseAnArray {

    static int[] arr = {4, 5, 1, 2};

    public static void main(String[] args) {
        System.out.println("Given Array: " + Arrays.toString(arr));
        approach1();
    }

    private static void approach1() {
        int N = arr.length;
        for (int i = 0, j = N - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println("Reverse Array: " + Arrays.toString(arr));
    }
}
