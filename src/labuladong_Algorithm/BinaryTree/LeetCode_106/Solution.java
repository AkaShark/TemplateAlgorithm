package labuladong_Algorithm.BinaryTree.LeetCode_106;

import Util.TreeNode;

import java.util.HashMap;

public class Solution {
    private HashMap<Integer, Integer> indexMap = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        return constructTree(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }
    public TreeNode constructTree(int[] inorder, int[] postorder, int inLo, int inHi, int postLo, int postHi) {
        if (postLo > postHi) return null;
        int rootValue = postorder[postHi];
        int rootIndex = indexMap.get(rootValue);
        int leftSubTreeNodeCount = rootIndex - inLo;
        TreeNode root = new TreeNode(rootValue);
        root.left = constructTree(inorder, postorder, inLo, inLo - 1, postLo, postLo + leftSubTreeNodeCount - 1);
        root.right = constructTree(inorder, postorder, inLo + leftSubTreeNodeCount + 1, inHi, postLo + leftSubTreeNodeCount, postHi - 1);
        return root;
    }
}
