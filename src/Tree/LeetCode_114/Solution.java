package Tree.LeetCode_114;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    // 存储一下
    List<TreeNode> preOrder = new ArrayList<>();
    public void flatten(TreeNode root) {
        // 构建前序路径
        buildPath(root);
        TreeNode newHead = preOrder.get(0);
        TreeNode node = newHead;
        for (int i = 1; i < preOrder.size(); i++) {
            node.right = preOrder.get(i);
            node.left = null;
            node = node.right;
        }
        root = newHead;
    }

    private void buildPath(TreeNode root) {
        if (root == null) return;
        preOrder.add(root);
        if (root.left != null) buildPath(root.left);
        if (root.right != null) buildPath(root.right);
    }

}
