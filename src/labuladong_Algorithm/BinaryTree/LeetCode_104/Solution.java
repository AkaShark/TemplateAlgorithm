package labuladong_Algorithm.BinaryTree.LeetCode_104;

import Util.TreeNode;

public class Solution {
    /*
     * 1. 遍历一遍二叉树得出结果
     * 2. 拆解子问题得到结果*/
    // 遍历二叉树
    int maxDepth = 0, curDepth = 0;

    public int maxDepth_1(TreeNode root) {
        if (root == null) return 0;
        traverseBinaryTree(root);
        return maxDepth;
    }

    public void traverseBinaryTree(TreeNode node) {
        if (node == null) return;
        // 前序遍历 加入一个节点的时候++
        curDepth++;
        // 判断当前的节点的深度和最大的深度
        maxDepth = Math.max(curDepth, maxDepth);
        traverseBinaryTree(node.left);
        traverseBinaryTree(node.right);
        curDepth--;
        // 移除一个节点的时候 --
    }

    // 2. 拆解子问题 将最大深度拆解为左右子树的高度问题
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        // 后序遍历获取到了函数的返回值(子树的信息) 需要设计返回值
        return Math.max(leftMax, rightMax) + 1; // 当前节点的深度
    }

    // 前序遍历是自顶向下的一个过程 后续遍历是一个自底向上的过程 所以可以获取到子树的相关信息

}
