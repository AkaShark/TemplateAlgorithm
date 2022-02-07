package labuladong_Algorithm.BinaryTree.LeetCode_226;

import Util.ListNode;
import Util.TreeNode;


public class Solution {
    public TreeNode invertTree_1(TreeNode root) {
        if (root == null) return root;
        // swap
        TreeNode node = root.right;
        root.right = root.left;
        root.left = node;
        // 递归
        invertTree_1(root.left);
        invertTree_1(root.right);
        return root;
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
