package Tree.LeetCode_116;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public Node connect(Node root) {
        Deque<Node> stack = new ArrayDeque<>();
        Deque<Node> stack1 = new ArrayDeque<>();
        if (root == null) return root;
        stack.push(root);
        while (!stack.isEmpty()) {
            int size = stack.size();
            while (size > 0) {
                Node node = stack.pop();
                if (!stack.isEmpty())
                    node.next = stack.peek();
                else
                    node.next = null;

                if (node.left != null) stack1.push(node.left);
                if (node.right != null) stack1.push(node.right);
                size --;
            }
            if (!stack1.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack.push(stack1.pop());
                }
            }
        }
        return root;
    }

}
