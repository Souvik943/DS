package org.questions.leetcode.linkedlists;

//LC - 203 - Remove linkedlist elements

public class LC_203 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(7);

        ListNode temp = removeElements(l1,5);
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null) {
            if(fast.val == val) {
                slow.next = fast.next;
                fast = fast.next;
            }
        }

        return head;
    }
}
