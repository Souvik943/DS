package org.questions.leetcode.linkedlists;

// LC - 21 - Mere two sorted linked lists

public class LC_21 {


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(7);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        ListNode result = mergeTwoSortedLL(l1,l2);
        ListNode temp = result;
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }

    }

    public static ListNode mergeTwoSortedLL(ListNode l1, ListNode l2) {
        ListNode newNode = new ListNode(Integer.MIN_VALUE);
        ListNode headNode = newNode;

        while(l1!=null && l2!=null) {
            if (l1.val <= l2.val) {
                newNode.next = l1;
                l1 = l1.next;
            } else {
                newNode.next = l2;
                l2 = l2.next;
            }
            newNode = newNode.next;
        }

        if(l1==null) {
            newNode.next = l2;
        }
        else {
            newNode.next = l1;
        }

        return headNode.next;
    }

}
