package com.leetcode.problem_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("problem 2:");
        Solution sol = new Solution();

        // Input: list1 = [1,2,4], list2 = [1,3,4]
//        ListNode list1 = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(5))));
//        ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode list1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode list2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        ListNode list = sol.addTwoNumbers(list1, list2);

        while (list != null) {
            System.out.println(list.val);
            list = list.next;
        }
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode((l1.val + l2.val) % 10);
        int tens =  (l1.val + l2.val) / 10;

        if (l1.next == null && l2.next != null) {
            l2.next.val += tens;
            result.next = this.addTwoNumbers(l2.next, new ListNode());
        } else if (l1.next != null && l2.next == null) {
            l1.next.val += tens;
            result.next = this.addTwoNumbers(l1.next, new ListNode());
        } else if (l1.next != null && l2.next != null) {
            l1.next.val += tens;
            result.next = this.addTwoNumbers(l1.next, l2.next);
        } else if (tens > 0) {
            result.next = this.addTwoNumbers(new ListNode(tens), new ListNode());
        }

        return result;
    }
}

