package org.questions.leetcode.linkedlists;

//LC - 141 - Detect loop/cycle in a linked list

public class LC_141 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(7);
        l1.next.next.next.next = l1;

        System.out.println(hasCycle(l1));
    }

    static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }
        }

        return false;
    }
}
