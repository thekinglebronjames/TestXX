package testtwo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SumOnTree {
    static LinkedList<Integer> path = new LinkedList<>();
    static LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();

    public static void main(String[] args) {
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(3);
        t1.left=t2;
        t2.right=t3;
        t1(t1, 6);
        for (List<Integer> list : res) {
            for (Integer integer : list) {
                System.out.println(integer);
            }        }
    }

    static LinkedList<List<Integer>> t1(TreeNode root, int target) {
        f(root, target);
        return res;
    }
    static void f(TreeNode root, int target) {
        if (root == null) {
            return;
        }
        target -= root.val;
        path.add(root.val);
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<>(path));
        }
        f(root.left, target);
        f(root.right, target);
        path.removeLast();
    }
}
