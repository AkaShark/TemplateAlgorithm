package Tree.LeetCode_235;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathP = new ArrayList<>();
        List<TreeNode> pathQ = new ArrayList<>();
        findPath(root, p, pathP);
        findPath(root, q, pathQ);
        TreeNode ans = null;
        for (int i = 0; i < pathP.size() && i < pathQ.size(); ++i) {
            if (pathP.get(i) == pathQ.get(i)) {
                ans = pathP.get(i);
            } else {
                break;
            }
        }
        return ans;

    }

    private void findPath(TreeNode root, TreeNode node, List<TreeNode> path) {
        while (root != node && root != null) {
            path.add(root);
            if (root.val > node.val) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        path.add(node);
    }



}
