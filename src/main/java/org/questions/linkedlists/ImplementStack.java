package org.questions.linkedlists;

public class ImplementStack {

    Node head;

    public ImplementStack() {
        head=null;
    }

    public static void main(String[] args) {
        ImplementStack stack = new ImplementStack();
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push(47);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

    void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
    int pop() {
        int poppedNumber = head.data;
        head = head.next;
        return poppedNumber;
    }

    int peek() {
        return head.data;
    }
}
