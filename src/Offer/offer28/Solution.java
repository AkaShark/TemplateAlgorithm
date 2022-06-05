package Offer.offer28;

import Util.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return checkSymmetric(root, root);
    }

    public boolean checkSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return  checkSymmetric(left.right, right.left) &&
                checkSymmetric(left.left, right.right) &&
                left.val == right.val;
    }
}
