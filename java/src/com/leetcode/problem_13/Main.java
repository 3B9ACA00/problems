package com.leetcode.problem_13;

public class Main {
    public static void main(String[] args) {
        System.out.println("problem 13:");

        Solution sol = new Solution();
        System.out.println(sol.romanToInt("III"));
        System.out.println(sol.romanToInt("LVIII"));
        System.out.println(sol.romanToInt("MCMXCIV"));
        System.out.println(sol.romanToInt("DCXXI"));
        System.out.println(sol.romanToInt("IV"));
    }
}

// Todo hashMap
// Todo make readable

class Solution {
    public int romanToInt(String s) {
        char[] charArr = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] values = {1, 5, 10, 50, 100, 500, 1000};
        int result = 0;
        int nextPos, pos;
        char ch, nextCh;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            pos = new String(charArr).indexOf(ch);

            if (i + 1 < s.length()) {
                if (ch == 'I' || ch == 'X' || ch == 'C') {
                    nextCh = s.charAt(i + 1);
                    if (nextCh != 'I') {
                        nextPos = new String(charArr).indexOf(nextCh);
                        if (values[nextPos] > values[pos]) {
                            result += values[nextPos] - values[pos];
                            i++;
                            continue;
                        }
                    }
                }
            }

            result += values[pos];
        }

        return result;
    }
}
