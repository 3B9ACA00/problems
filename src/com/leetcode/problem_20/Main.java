package com.leetcode.problem_20;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("problem 20:");

        Solution sol = new Solution();
        System.out.println(sol.isValid("()"));
        System.out.println(sol.isValid("()[]{}"));
        System.out.println(sol.isValid("(]"));
        System.out.println(sol.isValid("{}}"));
        System.out.println(sol.isValid("{}[{]"));
        System.out.println(sol.isValid("{([])}"));
        System.out.println(sol.isValid("{([}])}"));
        System.out.println(sol.isValid("]"));
        System.out.println(sol.isValid("["));

    }
}

// Todo try HashMap

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        char ch, popCh;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == '}' || ch == ')' || ch == ']') {
                if (stack.empty()) {
                    return false;
                }
                popCh = stack.pop();
                if (
                    (ch == '}' && popCh != '{') ||
                    (ch == ')' && popCh != '(') ||
                    (ch == ']' && popCh != '[')
                ){
                    return false;
                }
            }
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            }
        }

        return stack.empty();
    }
}
