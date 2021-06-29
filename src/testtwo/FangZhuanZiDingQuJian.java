package testtwo;

import java.util.*;

public class FangZhuanZiDingQuJian {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        ListNode listNode = test(l1, 2, 3);
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

    static ListNode test(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode prev = dummyNode;
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
        return dummyNode.next;
    }


    static void first(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()||root!=null) {
            while (root != null) {
                list.add(root.val);
                root = root.left;
            }
            root = stack.pop().right;
            //list.add(root.val);
        }

        while (!stack.isEmpty()||root!=null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }

        TreeNode prev = null;
        while (!stack.isEmpty()||root!=null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || root.right == prev) {
                list.add(root.val);
                prev = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }
        }
    }


}
