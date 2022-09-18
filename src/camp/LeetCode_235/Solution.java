package camp.LeetCode_235;

import Util.TreeNode;

public class Solution {
    private TreeNode node;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return node;
    }

    public boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;
        boolean left = dfs(root.left, p, q);
        boolean right = dfs(root.right, p, q);
        if ((left && right) || ((left || right) && (p.val == root.val || q.val == root.val))) {
            node = root;
        }
        return left || right || (root.val == p.val || root.val == q.val);
    }
}

