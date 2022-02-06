package labuladong_Algorithm.BinaryTree.LeetCode_543;

import Util.TreeNode;

public class Solution {
    /*
    * 遇到二叉树子树相关的问题 思考返回值&在后序遍历的时候做一些事情*/
    // 前序遍历
    int max = 0;
    public int diameterOfBinaryTree_1(TreeNode root) {
        if (root == null) return 0;
        int leftMax = maxDepth_1(root.left);
        int rightMax = maxDepth_1(root.right);
        max = Math.max(leftMax + rightMax, max);
        diameterOfBinaryTree_1(root.left);
        diameterOfBinaryTree_1(root.right);
        return max;
    }

    public int maxDepth_1(TreeNode node) {
        if (node == null) return 0;
        int left = maxDepth_1(node.left);
        int right = maxDepth_1(node.right);
        return left > right? left + 1: right + 1;
    }

    // 在后序遍历获取到子树信息在做处理
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        maxDiameter(root);
        return max;
    }

    public int maxDiameter(TreeNode node) {
        if (node == null) return 0;
        int left = maxDiameter(node.left);
        int right = maxDiameter(node.right);
        max = Math.max(left + right, max);
        return Math.max(left, right) + 1;
    }


}
