package Offer.offer34;

import Util.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        recur(root, target);
        return res;
    }
    void recur(TreeNode root, int tar) {
        if (root == null) return;
        path.add(root.val);
        tar -= root.val;
        if (tar == 0 && root.left == null && root.right == null)
            res.add(new LinkedList<>(path));
        recur(root.left, tar);
        recur(root.right, tar);
        path.removeLast();
    }
}
