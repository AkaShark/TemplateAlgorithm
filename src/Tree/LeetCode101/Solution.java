package Tree.LeetCode101;

import Util.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return mirror(root.left, root.right);
    }

    private boolean mirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;
        return mirror(left.left, right.right) && mirror(left.right, right.left);
    }

}
