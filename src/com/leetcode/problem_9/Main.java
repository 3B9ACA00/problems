package com.leetcode.problem_9;

public class Main {
    public static void main(String[] args) {
        System.out.println("problem 9:");

        Solution sol = new Solution();
        System.out.println(sol.isPalindrome(12321));
        System.out.println(sol.isPalindrome(123451));
        System.out.println(sol.isPalindrome(0));
        System.out.println(sol.isPalindrome(10));
        System.out.println(sol.isPalindrome(101));
        System.out.println(sol.isPalindrome(1010));
        System.out.println(sol.isPalindrome(-1));
        System.out.println(sol.isPalindrome(10000001));
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

/*
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
*/

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversedNumber = 0;
        while (x > reversedNumber) {
            reversedNumber = reversedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == reversedNumber || x == reversedNumber / 10;
    }
}
