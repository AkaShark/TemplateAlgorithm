package Offer.offer27;

import Util.TreeNode;

public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode right = mirrorTree(root.right);
        TreeNode left = mirrorTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
}
