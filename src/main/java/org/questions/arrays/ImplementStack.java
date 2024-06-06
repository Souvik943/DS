package org.questions.arrays;

public class ImplementStack {

    int[] arr = new int[5];
    int top = -1;
    void push(int data) {
        System.out.println("Pushed : " + data);
        top++;
        arr[top] = data;
    }

    void pop() {
        int popped = arr[top];
        System.out.println("Popped : " + arr[top]);
        top--;
    }

    void top() {
        System.out.println("Top : " + arr[top]);
    }

    public static void main(String[] args) {
        ImplementStack stack = new ImplementStack();
        stack.push(3);
        stack.push(4);
        stack.push(23);
        stack.push(0);
        stack.top();
        stack.pop();
        stack.top();
    }
}
