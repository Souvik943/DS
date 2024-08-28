package org.questions.leetcode.linkedlists;

//LC - 2 - Add two numbers represented by linked lists
public class LC_2 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(7);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode temp = addTwoNumbers(l1,l2);

        while(temp != null) {
            System.out.print(temp.val);
            temp = temp.next;
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum;

        ListNode dummy = new ListNode(0);
        ListNode ptr = dummy;

        while(l1 != null || l2 != null) {

            sum = carry;

            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum/10;
            sum %= 10;
            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }

        if(carry == 1) {
            ptr.next = new ListNode(1);
        }
        return dummy.next;
    }
}
