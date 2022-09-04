package Tree.LeetCode_105;

import Util.TreeNode;

import java.util.HashMap;

public class Solution {
    private HashMap<Integer, Integer> indexMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return build(preorder, inorder, 0, n - 1, 0, n - 1);
    }

    // 不传入子数组 传入数组和对应的left right 来控制数组的范围 实现子数组
    private TreeNode build(int[] preorder, int[] inorder, int pre_left, int pre_right, int in_left, int in_right) {
        if (pre_left > pre_right) return null;
        // 根节点
        TreeNode node = new TreeNode(preorder[pre_left]);
        int index = indexMap.get(node.val); // 根节点的位置
        int size_left = index - in_left;
        node.left = build(preorder, inorder, pre_left + 1, pre_left + size_left, in_left, index - 1);
        node.right = build(preorder, inorder, pre_left + size_left + 1, pre_right, index + 1, in_right);
        return node;
    }


}
