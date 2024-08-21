package org.questions.linkedlists;

import java.util.Stack;

// LC - 206 - Reverse a linked list
public class LC_206 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(7);

        ListNode result = reverseLinkedList(l1);
        ListNode temp = result;
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }

    }

    static ListNode reverseLinkedList(ListNode head) {
        ListNode traveser = head;
        Stack<Integer> stack = new Stack<>();
        while(traveser != null) {
            stack.add(traveser.val);
            traveser = traveser.next;
        }

        ListNode reversedLL = new ListNode(Integer.MIN_VALUE);
        ListNode traverser2 = reversedLL;

        while(!stack.isEmpty()) {
            traverser2.next = new ListNode(stack.pop());
            traverser2 = traverser2.next;
        }

        return reversedLL;
    }
}
