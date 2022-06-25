package Offer.offer36;

import Util.Node;

import java.util.Stack;

public class Solution1 {
    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        Stack<Node> stack = new Stack<>();
        Node pre = null, head = null;
        Node node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            if (!stack.isEmpty()) {
                node = stack.pop();
                if (pre != null) {
                    pre.right = node;
                } else {
                    head = node;
                }
                node.left = pre;
                pre = node;
                node = node.right;
            }
        }
        head.left = pre;
        pre.right = head;
        return head;
    }
}
