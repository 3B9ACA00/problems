package com.leetcode.problem_3;

public class Main {
    public static void main(String[] args) {
        System.out.println("problem 3:");

        Solution sol = new Solution();
        System.out.println(sol.lengthOfLongestSubstring("abcabcbb"));
    }
}


class Solution {
    public int lengthOfLongestSubstring(String s) {

        int from = 0;
        int to = 0;

        int tempFrom = 0;
        int tempTo = 0;

        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == ch) {

                }
            }
        }
        return 0;
    }
}
