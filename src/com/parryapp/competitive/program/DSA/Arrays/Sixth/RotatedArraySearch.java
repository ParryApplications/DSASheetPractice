package com.parryapp.competitive.program.DSA.Arrays.Sixth;

public class RotatedArraySearch {

    static int[] nums = {4, 5, 6, 7, 0, 1, 2};

    public static void main(String[] args) {
        int target = 0;
        System.out.println("INDEX Approach 1: " + approach1(target));
        System.out.println("INDEX Approach 2: " + approach2(0, nums.length - 1, target));
    }

    private static int approach1(int target) {
        int N = nums.length;
        for (int i = 0, j = N - 1; i <= j; i++, j--) {

            if (nums[i] == target)
                return i;
            if (nums[j] == target)
                return j;

        }

        return -1;
    }

    private static int approach2(int lb, int ub, int target) {
        if (lb > ub) {
            return -1;
        }

        int mid = (lb + ub) / 2;
        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] >= nums[lb]) {
            //left subarray is in ascending order

            if (target >= nums[lb] && target <= nums[mid]) {
                return approach2(lb, mid - 1, target);
            } else {
                return approach2(mid + 1, ub, target);
            }
        } else {
            //right subarray is in ascending order
            if (target >= nums[mid] && target <= nums[ub]) {
                return approach2(mid + 1, ub, target);
            } else {
                return approach2(lb, mid - 1, target);
            }
        }
    }
}
