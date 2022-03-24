package com.leetcode.problem_53;

public class Main {
    public static void main(String[] args) {
        System.out.println("problem 53:");
        Solution sol = new Solution();

        System.out.println(sol.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(sol.maxSubArray(new int[]{1}));
        System.out.println(sol.maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }
}

// Todo Kadane algorithm
// https://leetcode.com/problems/maximum-subarray/discuss/1595186/Java-oror-Kadane-ororDivide-and-Conquer-oror-Dp

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}

