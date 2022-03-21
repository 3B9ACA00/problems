package com.leetcode.problem_4;

public class Main {
    public static void main(String[] args) {
        System.out.println("problem 4:");
        Solution sol = new Solution();

//        int[] m = {1, 2};
//        int[] n = {3, 4};

//        int[] m = {1, 3};
//        int[] n = {2};

        int[] m = {1,  2,  3, 14, 15, 20, 24, 25, 30, 41};
        int[] n = {2,  8,  9, 12, 13, 14, 19, 24, 36, 38};

        System.out.println(sol.findMedianSortedArrays(m, n));
    }
}


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = nums1.length / 2 - 1;
        int j = nums2.length / 2 - 1;

        int a = nums1[i];
        int b = nums2[j];

        if (a > b) {
            j =  j + (nums2.length - j) / 2 - 1;
            if (nums2[j] < a) {
                b = nums2[j];
            }
        }

        System.out.println(a);
        System.out.println(b);

        return 1 / 2;
    }
}

