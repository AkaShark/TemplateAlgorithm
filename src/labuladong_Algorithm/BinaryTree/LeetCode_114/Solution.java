package labuladong_Algorithm.BinaryTree.LeetCode_114;

import Util.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    // 后续遍历 将左右子树拉直 拼接
    public void flatten_1(TreeNode root) {
        if (root == null) return;
        flatten_1(root.left);
        flatten_1(root.right);

        // 后序遍历 将左右子树拉直
        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = null;
        root.right = left;

        while (root.right != null) { // 最后一个节点
            root = root.right;
        }
        root.right = right; // 将拉直左子树和右子树对上
    }
    // 迭代
    public void flatten_2(TreeNode root) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left != null) {
                TreeNode next = cur.left;
                TreeNode last = next;
                while (last.right != null)
                    last = last.right; // 左子树的最右边的节点
                last.right = cur.right;
                cur.left = null;
                cur.right = next; // root的右节点变为左子树
            }
            cur = cur.right;
        }
    }
    // 使用Stack
    public void flatten(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        if (root == null) return;
        stack.push(root);
        TreeNode pre = null;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (pre != null) {
                pre.left = null;
                pre.right = node;
            }
            // 压栈的顺序 root的right是原先root的left所以应该将left先弹出来 于是后压入栈
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
            pre = node; // 记录前一个节点
        }
    }
}
