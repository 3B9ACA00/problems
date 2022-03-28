package com.leetcode.problem_66;

public class Main {
    public static void main(String[] args) {
        System.out.println("problem 66:");
        Solution sol = new Solution();

        System.out.println();

        int[] nums = sol.plusOne(new int[]{1, 2, 3});
        for (int num : nums) {
            System.out.println(num);
        }

    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        int pos = digits.length - 1;
        while (digits[pos] == 9) {
            digits[pos] = 0;
            if (pos == 0) {
                int[] temp = new int[digits.length + 1];
                System.arraycopy(digits, 0, temp, 1, digits.length);
                digits = temp;
            } else {
                pos--;
            }
        }
        digits[pos]++;

        return digits;
    }
}
