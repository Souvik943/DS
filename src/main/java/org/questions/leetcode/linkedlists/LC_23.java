package org.questions.leetcode.linkedlists;

public class LC_23 {

    static ListNode mergeSortedLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode ptr = dummy;

        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                ptr.next = l1;
                l1 = l1.next;
            }
            else {
                ptr.next = l2;
                l2 = l2.next;
            }
            ptr = ptr.next;
        }

        if(l1 == null) {
            ptr.next = l2;
        }
        else {
            ptr.next = l1;
        }

        return dummy.next;
    }

    static ListNode mergeKSortedList(ListNode[] lists) {
        if(lists.length == 0) {
            return null;
        }
        else if (lists.length == 1) {
            return lists[0];
        }
        else if (lists.length == 2) {
            return mergeSortedLists(lists[0],lists[1]);
        }

        ListNode ans = mergeSortedLists(lists[0],lists[1]);
        for(int i=0; i<lists.length; i++) {
            ListNode dummy = lists[i];

            ans = mergeSortedLists(ans,dummy);
        }
        return ans;
    }
}
