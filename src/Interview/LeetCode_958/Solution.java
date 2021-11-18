package Interview.LeetCode_958;

import Util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode node;
        while ((node = queue.poll()) != null) {
                queue.offer(node.left);
                queue.offer(node.right);
        }

        // 发现null后还存在不为null的节点则 不是完全二叉树
        for (TreeNode tem : queue) {
            if (tem != null) {
                return false;
            }
        }
        return true;
    }
}
