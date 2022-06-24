package Offer.offer54;

import Util.TreeNode;

import java.util.PriorityQueue;

public class Solution2 {
    int size = 0;
    public int kthLargest(TreeNode root, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        this.size = k;
        dfs(root, queue);
        return queue.element();
    }

    public void dfs(TreeNode node, PriorityQueue<Integer> queue) {
        if (node == null) return;
        if (queue.size() < this.size) queue.offer(node.val);
        else if (queue.peek() < node.val) {
            queue.poll();
            queue.offer(node.val);
        }
        dfs(node.left, queue);
        dfs(node.right, queue);
    }
}
