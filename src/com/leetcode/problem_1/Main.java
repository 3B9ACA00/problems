package com.leetcode.problem_1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("problem 1:");
        int[] nums = {5, 2, 7, 11, 15};
        int target = 18;

        Solution sol = new Solution();
        int[] result = sol.twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
