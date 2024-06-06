package org.questions.linkedlists;

import java.util.Stack;

public class ReverseLL {

    public ReverseLL(int head) {
    }

    static Node reverseLL(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        Node middleNode = reverseLL(head);
        System.out.println("Middle element is --> " + middleNode.data);
    }
}
