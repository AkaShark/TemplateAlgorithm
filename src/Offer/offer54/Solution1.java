package Offer.offer54;

import Util.TreeNode;

public class Solution1 {
    int k = 0;
    int res = -1;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }

    public void dfs(TreeNode node) {
        if (node == null) return;
        dfs(node.right);
        if (k == 0)
            return;
        if (--k == 0) res = node.val;
        dfs(node.left);
    }
}
