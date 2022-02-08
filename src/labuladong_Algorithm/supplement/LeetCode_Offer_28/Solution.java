package labuladong_Algorithm.supplement.LeetCode_Offer_28;

import Util.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return symmetric(root.left, root.right);
    }

    public boolean symmetric(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;
        if (node1.val != node2.val) {
            return false;
        }
        return symmetric(node1.left, node2.right) && symmetric(node1.right, node2.left);
    }
}
