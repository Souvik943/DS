package org.questions.workAtTech.LinkedList;

public class GetIntersection {

    static ListNode getIntersectionNode(ListNode A, ListNode B) {
        // add your logic here
        int length1 = ListNode.getlistLength(A);
        int length2 = ListNode.getlistLength(B);

        while(length1 < length2) {
            length1-- ;
            A = A.next;
        }

        while(length2 < length1) {
            length2-- ;
            B = B.next;
        }

        while(A != B) {
            A = A.next;
            B = B.next;
        }
        return A;
    }
}
