package com.leetcode.problem_14;

public class Main {
    public static void main(String[] args) {
        System.out.println("problem 14:");

        Solution sol = new Solution();
        System.out.println(
                sol.longestCommonPrefix(new String[]{"flower", "flow", "flight"})
        );
        System.out.println(
                sol.longestCommonPrefix(new String[]{"dog", "racecar", "car"})
        );
        System.out.println(
                sol.longestCommonPrefix(new String[]{""})
        );
        System.out.println(
                sol.longestCommonPrefix(new String[]{"",""})
        );
        System.out.println(
                sol.longestCommonPrefix(new String[]{"ab","a"})
        );
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        char ch;
        short pos = 0;

        if (strs.length == 0) {
            return "";
        }

        while (strs[0].length() > pos) {
            ch = strs[0].charAt(pos);
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() <= pos) {
                    return prefix.toString();
                }
                if (strs[i].charAt(pos) != ch) {
                    return prefix.toString();
                }
            }
            prefix.append(ch);
            pos++;
        }

        return prefix.toString();
    }
}
