package Tree.LeetCode_129;

import Util.TreeNode;

import java.util.*;

// 广度优先计算
public class Solution {
    public int sumNumbers(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        Deque<Integer> path = new ArrayDeque<>();
        int sum = 0;
        if (root == null) return sum;
        queue.offer(root);
        path.offer(root.val);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            int num = path.poll();
            if (node.left == null && node.right == null) {
                sum += num;
            }
            if (node.left != null) {
                queue.offer(node.left);
                path.offer(num * 10 + node.left.val);
            }
            if (node.right != null) {
                queue.offer(node.right);
                path.offer(num * 10 + node.right.val);
            }

        }
        return sum;
    }
}
