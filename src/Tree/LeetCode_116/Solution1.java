package Tree.LeetCode_116;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution1 {
    public Node connect(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        if (root == null) return root;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                Node node = queue.poll();
                Node pre = queue.peek();
                if (size - 1 == 0)
                    pre = null;
                node.next = pre;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                size --;
            }
        }
        return root;
    }
}
