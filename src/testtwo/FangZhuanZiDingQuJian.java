package testtwo;

public class FangZhuanZiDingQuJian {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        ListNode listNode = t3(l1, 2, 3);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }
    static ListNode t1(ListNode head, int left, int right) {

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode front = dummyHead, tail = dummyHead;

        while (left > 1) {
            left--;
            front = front.next;
        }
        while (right > 0) {
            right--;
            tail = tail.next;
        }
        ListNode tailx = tail.next;
        ListNode[] listNodes = t2(front.next, tail);
        front.next = listNodes[0];
        listNodes[1] = tailx;
        return dummyHead.next;
    }

    static ListNode[] t2(ListNode head, ListNode tail) {
        ListNode p = head, prev = tail.next;
        while (prev != tail) {
            ListNode nex = p.next;
            p.next = prev;
            prev = p;
            p = nex;
        }
        return new ListNode[]{tail, head};
    }

    static ListNode t3(ListNode head, int left, int right) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }


        ListNode fixedNode = prev.next;
        for (int i = 0; i < right - left; i++) {
            ListNode p = fixedNode.next;
            fixedNode.next = p.next;
            p.next = prev.next;
            prev.next = p;
        }
        return dummyHead.next;
    }

    static void test(int[] arr) {

    }
}
