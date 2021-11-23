package Review.BlanceTree;

import Util.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    static public boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode node = null;
        while ((node = queue.poll()) != null) {
            queue.offer(node.left);
            queue.offer(node.right);
        }
        for (TreeNode n : queue) {
            if (n != null) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        isCompleteTree(root);

    }
}
