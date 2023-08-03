package com.parryapp.competitive.program.DSA.Arrays.First;

//Q: https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
public class FindMaxNMin {
    static int arr[] = {22, 14, 8, 17, 35, 3};

    public static void main(String[] args) {
//        approach1();//Using two pointers

//        approach2(0, arr.length - 1);//Using Quick sort
//        System.out.println("Minimum element is: " + arr[0]);
//        System.out.println("Maximum element is: " + arr[arr.length - 1]);
    }

    private static void approach2(int lb, int ub) {
        if (lb < ub) {
            int pivotIndex = findingPivotElement(lb, ub);
            approach2(lb, pivotIndex - 1);
            approach2(pivotIndex + 1, ub);
        }
    }

    private static int findingPivotElement(int lb, int ub) {
        int p = ub;
        int i = lb - 1;
        for (int j = lb; j <= ub; j++) {
            if (arr[j] <= arr[p]) {
                i++;
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return i;
    }

    private static void approach1() {
        //Logic Begins:
        int N = arr.length;
        int min, max;

        // Initialize min and max using the first two elements
        if (arr[0] < arr[N - 1]) {
            min = arr[0];
            max = arr[N - 1];
        } else {
            min = arr[N - 1];
            max = arr[0];
        }

        for (int i = 1, j = N - 2; i <= j; i++, j--) {
            min = Math.min(min, Math.min(arr[i], arr[j]));
            max = Math.max(max, Math.max(arr[i], arr[j]));
        }

        System.out.println("Minimum element is: " + min);
        System.out.println("Maximum element is: " + max);
    }
}
