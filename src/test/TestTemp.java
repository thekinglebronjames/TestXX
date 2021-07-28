package test;

import testtwo.ListNode;

public class TestTemp {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        l1.next=l2;
        l2.next=l3;
        ListNode test = test(l1);
        System.out.println(test.val);
    }

    static ListNode test(ListNode head) {
        ListNode fast = head, slow = head;
        if (head == null) {
            return null;
        }
        while (true) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == null || fast.next == null) {
                return null;
            }
            if (fast == slow) {
                break;
            }
        }
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
