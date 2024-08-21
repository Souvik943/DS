package org.questions.linkedlists;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static int getlistLength(ListNode node) {
        int length = 0;
        while(node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}
