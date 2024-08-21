package org.questions.linkedlists;

//LC - 160 - Intersection of two linked lists

public class LC_160 {
    public static void main(String[] args) {

    }

    static ListNode getIntersectionofNodes(ListNode l1, ListNode l2) {
        int lengthA = ListNode.getlistLength(l1);
        int lengthB = ListNode.getlistLength(l2);

        while(lengthA > lengthB) {
            lengthA --;
            l1 = l1.next;
        }

        while(lengthB > lengthA) {
            lengthB --;
            l2 = l2.next;
        }

        while(l1 != l2) {
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1;
    }
}
