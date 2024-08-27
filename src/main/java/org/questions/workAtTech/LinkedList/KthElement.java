package org.questions.workAtTech.LinkedList;

public class KthElement {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(5);
        l1.next.next.next.next = new ListNode(6);

        System.out.println(kthElement(l1,2));
    }

    static int kthElement (ListNode head, int k) {
        ListNode temp = head;
        for(int i=1; i<k; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
}
