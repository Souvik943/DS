package org.questions.workAtTech.LinkedList;

public class AddAtKthPosition {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(5);
        l1.next.next.next.next = new ListNode(6);

        ListNode result = new ListNode();
        ListNode newElement = new ListNode(45);
        result = addAtkthElement(l1,1,newElement);

        ListNode temp = result;
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    static ListNode addAtkthElement (ListNode head, int k, ListNode newElement) {
        ListNode temp = head;
        if(k == 1) {
           newElement.next = head;
           head = newElement;
           return head;
        }
        else {
            for(int i=0; i<k-2; i++) {
                temp = temp.next;
            }
            newElement.next = temp.next;
            temp.next = newElement;
        }
        return head;
    }
}
