package Tree.LeetCode_112;

import Util.TreeNode;

public class Solution2 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // 直接递归解决 优美极了 深度优先搜索
        if (root == null) return false;
        if (root.left == null && root.right == null)
            return root.val == targetSum;
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
