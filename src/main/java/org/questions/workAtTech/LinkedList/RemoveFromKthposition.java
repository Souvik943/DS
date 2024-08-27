package org.questions.workAtTech.LinkedList;

public class RemoveFromKthposition {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(5);
        l1.next.next.next.next = new ListNode(6);

        ListNode result = new ListNode();
        result = removeKthElement(l1,2);

        ListNode temp = result;
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    static ListNode removeKthElement(ListNode head, int k) {
        ListNode temp = head;
        if(k == 1) {
            head = head.next;
            return head;
        }
        for(int i=0; i<k-2; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
