package com.leetcode.problem_28;

public class Main {
    public static void main(String[] args) {
        System.out.println("problem 28:");
        Solution sol = new Solution();

        System.out.println(sol.strStr("mississippi", "pi"));
        System.out.println(sol.strStr("mississippi", "issi"));
        System.out.println(sol.strStr("mississippi", "issipi"));
        System.out.println(sol.strStr("mississippi", "issip"));
    }
}

// Todo fix Time Limit Exceeded error
// Todo check solution
/*
public int strStr(String haystack, String needle) {
  for (int i = 0; ; i++) {
    for (int j = 0; ; j++) {
      if (j == needle.length()) return i;
      if (i + j == haystack.length()) return -1;
      if (needle.charAt(j) != haystack.charAt(i + j)) break;
    }
  }
}
*/

class Solution {
    public int strStr(String haystack, String needle) {
        int pos = 0;

        if (haystack.equals(needle) || needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i < haystack.length() ; i++) {
            if (haystack.charAt(i) == needle.charAt(pos)) {
                if (pos == needle.length() - 1) {
                    return i - pos;
                }
                pos++;
            } else {
                i = i - pos;
                pos = 0;
            }
        }

        return -1;
    }
}

