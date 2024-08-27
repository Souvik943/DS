package org.questions.workAtTech.LinkedList;

public class RemoveOccurences {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(6);

        ListNode result = new ListNode();
        result = removeOccurences(l1,4);

        ListNode temp = result;
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    static ListNode removeOccurences(ListNode head, int key) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr = dummy;
        while(curr.next != null) {
            if(curr.next.val == key) {
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
