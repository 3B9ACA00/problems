package com.leetcode.problem_9;

public class Main {
    public static void main(String[] args) {
        System.out.println("problem 2:");
        int number = 1034554301;
        Solution sol = new Solution();
        boolean result = sol.isPalindrome(number);
        System.out.println(result);
    }
}

/*
class Solution {
    public boolean isPalindrome(int x) {
        String a = String.valueOf(x);
        String b = new StringBuilder(a).reverse().toString();
        return a.equals(b);
    }
}
*/

class Solution {
    public boolean isPalindrome(int x) {
        int originalNumber = x;
        int reversedNumber = 0;

        while (x > 0) {
            int number = x % 10;
            reversedNumber = number + reversedNumber * 10;
            x /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
