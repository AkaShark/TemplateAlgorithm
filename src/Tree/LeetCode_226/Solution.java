package Tree.LeetCode_226;

import Util.TreeNode;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        dfs(root, root.left, root.right);
        return root;
    }
    private void dfs (TreeNode root, TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) return;
        root.left = rightNode;
        root.right = leftNode;
        if (leftNode != null)
            dfs(leftNode, leftNode.left, leftNode.right);
        if (rightNode != null)
            dfs(rightNode, rightNode.left, rightNode.right);
    }
}
