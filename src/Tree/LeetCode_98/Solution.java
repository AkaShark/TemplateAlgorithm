package Tree.LeetCode_98;

import Util.TreeNode;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return validy(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    // 前序遍历的过程
    private boolean validy(TreeNode node, long leftValue, long rightValue) {
        if (node == null) return true;
        if (node.val <= leftValue || node.val >= rightValue) return false;
        return validy(node.left, leftValue, node.val) && validy(node.right, node.val, rightValue);
    }
}
