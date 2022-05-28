package Offer.offer35;

import Util.Node;

public class Solution1 {

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        // 赋值出来一个节点拼接上
        for (Node cur = head; cur != null; cur = cur.next.next) {
            Node newNode = new Node(cur.val);
            newNode.next = cur.next;
            cur.next = newNode;
        }
        // random节点处理
        for (Node cur = head; cur != null; cur = cur.next.next) {
            Node newNode = cur.next;
            newNode.random = cur.random != null? cur.random.next :null;
        }
        // 拆除新链
        Node newHead = head.next;
        for (Node cur = head; cur != null; cur = cur.next) {
            Node newNode = cur.next;
            cur.next = cur.next.next;
            newNode.next = newNode.next != null? newNode.next.next:null;
        }
        return newHead;
    }
}
