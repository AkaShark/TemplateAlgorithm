package labuladong_Algorithm.BinaryTree.LeetCode_105;

import Util.TreeNode;

import java.util.HashMap;

public class Solution {
    private HashMap<Integer, Integer> preOrderMap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            preOrderMap.put(inorder[i], i);
        }
        return constructBinaryTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }
    public TreeNode constructBinaryTree(int[] preorder, int[] inorder, int preLo, int preHi, int inLo, int inHi) {
        if (preLo > preHi) return null; // 递归出口
        int rootValue = preorder[preLo];
        // 找到root节点的位置 每次递归的时候都需要遍历下 直接将preorder变成一个hashmap来快速在每次递归中找到index
//        int rootIndex = -1;
//        for (int i = 0; i < inorder.length; i++) {
//            if (inorder[i] == rootValue) {
//                rootIndex = i;
//                break;
//            }
//        }
        int rootIndex = preOrderMap.get(rootValue);
        int leftSubTreeNodeCount = rootIndex - inLo; // 左子树长度

        // 构建根节点
        TreeNode root = new TreeNode(rootValue);
        root.left = constructBinaryTree(preorder, inorder, preLo + 1, preLo + leftSubTreeNodeCount, inLo, rootIndex -1);
        root.right = constructBinaryTree(preorder, inorder, preLo + 1 + leftSubTreeNodeCount, preHi, rootIndex + 1, inHi);
        return root;
    }
}
