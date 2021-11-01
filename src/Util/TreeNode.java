package Util;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int val;

    public TreeNode(TreeNode left, TreeNode right, int val) {
        this.left = left;
        this.right = right;
        this.val = val;
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode() {
    }
}

