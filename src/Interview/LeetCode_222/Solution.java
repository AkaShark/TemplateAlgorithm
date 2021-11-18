package Interview.LeetCode_222;

import Util.TreeNode;

public class Solution {

    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int left = countLevel(root.left);
        int right = countLevel(root.right);
        int ans = 0;
        if (left == right) {
            ans = (int) (countNodes(root.right) + Math.pow(2, left));
        } else {
            ans = (int) (countNodes(root.left) + Math.pow(2, right));
        }
        return ans;

    }

    private int countLevel(TreeNode node) {
        if (node == null) return 0;
        int level = 0;
        while (node != null) {
            node = node.left;
            level ++;
        }
        return level;
    }
}
