package Tree.LeetCode_117;

import java.util.ArrayDeque;
import java.util.Queue;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;
}

public class Solution {
    Node last = null, nextStart = null;
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Node start = root;
        while (start != null) {
            last = null;
            nextStart = null; // 状态恢复
            // 遍历这层节点 同时设置下一层节点的next指针
            for (Node p = start; p != null; p = p.next) {
                if (p.left != null) {
                    handle(p.left);
                }
                if (p.right != null) {
                    handle(p.right);
                }
            }
            start = nextStart; // 设置下层节点的开始位置
        }
        return root;
    }

    public void handle(Node p) {
        if (last != null) {
            last.next = p; // 设置next指针
        }
        if (nextStart == null) { // 当nextStart为null的时候
            nextStart = p;  // 标记下一层的第一个节点
        }
        last = p;
    }


}
