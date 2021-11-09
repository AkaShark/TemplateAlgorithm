package Tree.LeetCode_222;

import Util.TreeNode;

public class Solution {
    int sum = 0;
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        sum += 1;
        if (root.left != null) countNodes(root.left);
        if (root.right != null) countNodes(root.right);
        return sum;
    }
}
