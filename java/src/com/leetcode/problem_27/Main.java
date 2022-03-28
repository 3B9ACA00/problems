package com.leetcode.problem_27;

public class Main {
    public static void main(String[] args) {
        System.out.println("problem 27:");
        Solution sol = new Solution();

        System.out.println(sol.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
        System.out.println(sol.removeElement(new int[]{}, 2));
        System.out.println(sol.removeElement(new int[]{2}, 3));
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        if (nums.length == 0) {
            return k;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

