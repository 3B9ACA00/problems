package com.leetcode.problem_35;

public class Main {
    public static void main(String[] args) {
        System.out.println("problem 35:");
        Solution sol = new Solution();

        System.out.println(sol.searchInsert(new int[] {1, 2, 3, 4, 5, 10}, 4));
        System.out.println(sol.searchInsert(new int[] {1, 3, 5, 6}, 5));
        System.out.println(sol.searchInsert(new int[] {1, 3, 5, 6}, 2));
        System.out.println(sol.searchInsert(new int[] {}, 2));
        System.out.println(sol.searchInsert(new int[] {1,3,5,6}, 7));
    }
}

// Binary search
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, mid;
        int high = nums.length - 1;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}

//class Solution {
//    public int searchInsert(int[] nums, int target) {
//        if (nums.length == 0) {
//            return 0;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target || nums[i] > target) {
//                return i;
//            }
//        }
//        return nums.length;
//    }
//}

