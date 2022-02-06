package labuladong_Algorithm.BinaryTree.LeetCode_144;

import Util.ListNode;
import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /*两种思路:
    * 1. 遍历二叉树得出结果
    * 2. 拆解子问题得到结果*/
    List<Integer> res = new ArrayList();
    public List<Integer> preorderTraversal_1(TreeNode root) {
        traverseBinaryTree(root);
        return res;
    }

    // 遍历二叉树
    public void traverseBinaryTree(TreeNode root) {
        if (root == null) return;
        res.add(root.val);
        traverseBinaryTree(root.left);
        traverseBinaryTree(root.right);
    }

    // 拆解子问题 将子问题分解 二叉树前序遍历为根 + 左子树 + 右子树
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return null;
        List<Integer> res = new ArrayList<>();
        res.add(root.val);
        res.addAll(preorderTraversal(root.left));
        res.addAll(preorderTraversal(root.right));
        return res;
    }


}
