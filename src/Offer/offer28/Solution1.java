package Offer.offer28;

import Util.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution1 {
    // 迭代
    public boolean isSymmetric(TreeNode root) {
        return checkSymmetric(root, root);
    }

    public boolean checkSymmetric(TreeNode left, TreeNode right) {
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(left);
        deque.offer(right);
        while (!deque.isEmpty()) {
            TreeNode node1 = deque.poll();
            TreeNode node2 = deque.poll();
            if (node1 == null && node2 == null) continue;
            if (node1 == null || node2 == null) return false;
            if (node1.val != node2.val) return false;

            deque.offer(node1.left);
            deque.offer(node2.right);

            deque.offer(node1.right);
            deque.offer(node2.left);
        }
        return true;
    }
}
