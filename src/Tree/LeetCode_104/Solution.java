package Tree.LeetCode_104;

import Util.TreeNode;

import java.util.Map;

public class Solution {
    // 递归实现 深度优先实现
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1; // 每遍历一层 层数 + 1
    }

}
