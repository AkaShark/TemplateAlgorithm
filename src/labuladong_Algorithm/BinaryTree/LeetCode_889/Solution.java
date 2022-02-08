package labuladong_Algorithm.BinaryTree.LeetCode_889;

import Util.TreeNode;

import java.util.HashMap;

public class Solution {
    private HashMap<Integer, Integer> indexMap = new HashMap<>();
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        for (int i = 0; i < postorder.length; i++) {
            indexMap.put(postorder[i], i);
        }
        return buildTree(preorder, postorder, 0, preorder.length - 1, 0, postorder.length - 1);
    }
    // 前序后序推出二叉树 是一种前后往中间推的感觉 同时确定左子树的过程的需要确定root.left中的leftRoot的位置 根据左根确定左子树的长度
    public TreeNode buildTree(int[] preorder, int[] postorder, int preStart, int preEnd, int postStart, int postEnd) {
        if (preStart > preEnd) return null;
        if (preStart == preEnd) return new TreeNode(preorder[preStart]);
        int rootVal = preorder[preStart];
        // root.left 的值是前序遍历的第二个元素
        // 通过前序和后序遍历构造二叉树的关键在于通过左子树的根节点
        // 确定preorder和postorder中左右子树的元素区间
        int leftRootVal = preorder[preStart + 1];
        int leftRootIndex = indexMap.get(leftRootVal);
        int leftSize = leftRootIndex - postStart + 1; // 加1是leftRoot的个数
        TreeNode root = new TreeNode(rootVal);
        root.left = buildTree(preorder, postorder, preStart + 1, preStart + leftSize, postStart, leftRootIndex);
        root.right = buildTree(preorder, postorder, preStart + leftSize + 1, preEnd, leftRootIndex + 1, preEnd - 1);
        return root;
    }
}
