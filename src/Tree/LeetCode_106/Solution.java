package Tree.LeetCode_106;

import Util.TreeNode;

import java.util.HashMap;

public class Solution {
    private HashMap<Integer, Integer> indexMap = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        return build(inorder, postorder, 0, n - 1, 0, n - 1);
    }

    private TreeNode build(int[] inorder, int[] postorder, int in_left, int in_right, int post_left, int post_right) {
        if (in_left > in_right) return null; // 叶子节点
        TreeNode node = new TreeNode(postorder[post_right]); // 根节点
        int index = indexMap.get(node.val); // 根节点在中序序列的位置
        int left_size = index - in_left; // 左子树的节点个数
        node.left = build(inorder, postorder, in_left, index - 1, post_left, post_left + left_size - 1);
        node.right = build(inorder, postorder, index + 1, in_right, post_left + left_size, post_right - 1); // 根节点 每次post_rigth - 1
        return node;
    }
}
