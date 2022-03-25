package com.leetcode.problem_58;

public class Main {
    public static void main(String[] args) {
        System.out.println("problem 58:");
        Solution sol = new Solution();

        System.out.println(sol.lengthOfLastWord("Hello World"));
        System.out.println(sol.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(sol.lengthOfLastWord("luffy is still joyboy"));
        System.out.println(sol.lengthOfLastWord("         "));
        System.out.println(sol.lengthOfLastWord("hi"));
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        int lastLen = 0;
        boolean iaPrevSpace = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (iaPrevSpace) {
                    lastLen = 0;
                    iaPrevSpace = false;
                }
                lastLen++;
            } else {
                iaPrevSpace = true;
            }
        }
        return lastLen;
    }
}

