package Tree.LeetCode_104;

import Util.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution2 {
    // 广度优先实现
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        int ans = 0;
        if (root != null) queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                size --;
            }
            ans ++;
        }
        return ans;
    }
}
