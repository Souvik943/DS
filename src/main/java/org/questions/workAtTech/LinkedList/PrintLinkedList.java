package org.questions.workAtTech.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class PrintLinkedList {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(5);
        l1.next.next.next.next = new ListNode(6);

        List<Integer> list = new ArrayList<>();
        list = printLinkedList(l1);
        for (Object o : list) {
            System.out.print(o + " ");
        }
    }

    static List<Integer> printLinkedList (ListNode head) {
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        int counter = 0;
        while(temp != null) {
            counter ++;
            temp = temp.next;
        }
        temp = head;
        for(int i=0;i<counter;i++) {
            list.add(temp.val);
            temp = temp.next;
        }
        return list;
    }
}
