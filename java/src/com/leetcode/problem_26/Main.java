package com.leetcode.problem_26;

public class Main {
    public static void main(String[] args) {
        System.out.println("problem 26:");
        Solution sol = new Solution();

        int[] nums = {1, 1, 1, 1, 2, 2, 3, 3, 4, 4};
        int[] expectedNums = {1, 2, 3, 4, 4, 0, 0, 0};
//        int[] nums = {1, 1, 2};
//        int[] expectedNums = {1, 2, 0};

        int k = sol.removeDuplicates(nums);

        System.out.println("k = " + k);
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
    }
}


class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[k] < nums[i]) {
                nums[++k] = nums[i];
            }
        }
        return ++k;
    }
}

