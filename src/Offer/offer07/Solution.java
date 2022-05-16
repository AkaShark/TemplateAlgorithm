package Offer.offer07;

import Util.TreeNode;

import java.util.HashMap;

public class Solution {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) return null;
        // 构建hash表
        for (int i = 0; i < inorder.length; i++) {
            hashMap.put(inorder[i], i);
        }
        return builder(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    // 递归建立树
    public TreeNode builder(int[] preorder, int left_preorder, int right_preorder, int[] inorder, int left_inorder, int right_inorder) {
        if (left_preorder > right_preorder) {
            return null;
        }
        int rootValue = preorder[left_preorder];
        TreeNode root = new TreeNode(rootValue);
        int rootIndex = hashMap.get(rootValue);
        int leftTreeCount = rootIndex - left_inorder;
        // 先序遍历中「从 左边界+1 开始的 size_left_subtree」个元素就对应了中序遍历中「从 左边界 开始到 根节点定位-1」的元素
        root.left = builder(preorder, left_preorder + 1, left_preorder + leftTreeCount, inorder, left_inorder, left_inorder + leftTreeCount - 1);
        //  先序遍历中「从 左边界+1+左子树节点数目 开始到 右边界」的元素就对应了中序遍历中「从 根节点定位+1 到 右边界」的元素
        root.right = builder(preorder, left_preorder + leftTreeCount + 1, right_preorder, inorder, left_inorder + leftTreeCount + 1, right_inorder);
        return root;
    }
}
