package org.questions.workAtTech.LinkedList;

public class MergeSortedLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(7);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(11);

        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(8);
        l2.next.next.next = new ListNode(10);

        ListNode temp = mergeTwoSortedLists(l1, l2);
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    static ListNode mergeTwoSortedLists(ListNode firstList, ListNode secondList) {
        ListNode newList = new ListNode(Integer.MIN_VALUE);
        ListNode newListHead = newList;
        while(firstList != null && secondList != null) {
            if(firstList.val <= secondList.val) {
                newList.next = firstList;
                firstList = firstList.next;
            }
            else {
                newList.next = secondList;
                secondList = secondList.next;
            }
            newList = newList.next;
        }
        if(firstList == null) {
            newList.next = secondList;
        }
        else {
            newList.next = firstList;
        }
        return newListHead.next;
    }
}
