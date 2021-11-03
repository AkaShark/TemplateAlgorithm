package Tree.LeetCode_112;

import Util.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution3 {
    // 广度优先搜索
    public boolean hasPathSum(TreeNode root, int targetSum) {
        Queue<TreeNode> treeQueue = new ArrayDeque<>();
        Queue<Integer> valQueue = new ArrayDeque<>();
        if (root != null) {
            treeQueue.add(root);
            valQueue.add(root.val);
        }
        while (!treeQueue.isEmpty()) {
            TreeNode node = treeQueue.poll();
            int val = valQueue.poll();
            if (node.left == null && node.right == null) {
                if (val == targetSum) return true;
            }
            if (node.left != null) {
                treeQueue.add(node.left);
                valQueue.add(val + node.left.val);
            }
            if (node.right != null) {
                treeQueue.add(node.right);
                valQueue.add(val + node.right.val);
            }
        }
        return false;
    }
}
