package Tree.LeetCode_230;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> path = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) return -1;
        inorder(root);
        return path.get(k - 1);
    }

    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        path.add(root.val);
        inorder(root.right);
    }
}
