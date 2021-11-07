package Tree.LeetCode_129;

import Util.TreeNode;

public class Solution1 {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int sum) {
        if (node == null) return 0;
        int cur = sum * 10 + node.val; // 计算路径和
        if (node.left == null && node.right == null) return cur; // 叶子结点
        return dfs(node.left, cur) + dfs(node.right, cur);
    }

}
