package Tree.LeetCode_111;

import Util.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution1 {
    public int minDepth(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root == null) return 0;
        queue.offer(root);
        int level = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                // 广度优先保证了找到的第一个子节点一定是 深度最小的
                if (node.left == null && node.right == null) return level;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                size --;
            }
            level ++;
        }
        return -1;
    }
}
