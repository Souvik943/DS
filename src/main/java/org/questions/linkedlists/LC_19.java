package org.questions.linkedlists;

//LC - 19 - Delete nth node from the end
public class LC_19 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);

        ListNode temp = removeNthFromEnd(l1,2);
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n){
        ListNode slow = head;
        ListNode fast = head;

        for(int i=0; i<n ; i++ ) {
            fast = fast.next;
        }
        if(fast == null) {
            return head.next;
        }
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
