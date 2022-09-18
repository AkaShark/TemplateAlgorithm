package camp.LeetCode_235_1;

import Util.TreeNode;

import java.util.ArrayList;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> pathp = new ArrayList<>();
        ArrayList<TreeNode> pathq = new ArrayList<>();
        pathp = path(root, p);
        pathq = path(root, q);
        TreeNode result = null;
        for (int i = 0; i < pathp.size() && i < pathq.size(); i++) {
            if (pathp.get(i) == pathq.get(i)) {
                result = pathp.get(i);
            }
        }
        return result;
    }

    public ArrayList<TreeNode> path(TreeNode root, TreeNode node) {
        ArrayList<TreeNode> array = new ArrayList<>();
        if (root == null) return array;
        while (true) {
            if (root.val > node.val) {
                array.add(root);
                root = root.left;
            } else if (root.val < node.val) {
                array.add(root);
                root = root.right;
            } else {
                array.add(root);
                break;
            }
        }
        return array;
    }
}
