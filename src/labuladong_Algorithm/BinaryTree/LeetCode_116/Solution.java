package labuladong_Algorithm.BinaryTree.LeetCode_116;
import Util.Node;

public class Solution {
    public Node connect_1(Node root) {
        if (root == null) return null;
        connectTowNode(root.left, root.right);
        return root;
    }
    public void connectTowNode(Node leftNode, Node rightNode) {
        if (leftNode == null && rightNode == null) return;
        leftNode.next = rightNode;
        connectTowNode(leftNode.left, leftNode.right);
        connectTowNode(rightNode.left, rightNode.right);
        connectTowNode(leftNode.right, rightNode.left);
    }

    public Node connect(Node root) {
        if (root == null) return null;
        Node node = root;
        while (node.left != null) { // 从上到下遍历
            Node cur = node; // 当前节点
            while (cur != null) { // 遍历当前层
                cur.left.next = cur.right;
                if (cur.next != null) {
                    cur.right.next = cur.next.left;
                }
                cur = cur.next;
            }
            node = node.left; // 下一层节点
        }
        return root;
    }

}
