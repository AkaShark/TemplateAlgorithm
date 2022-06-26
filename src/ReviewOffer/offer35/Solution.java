package ReviewOffer.offer35;

import Util.Node;

public class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        // 1. 赋值出新链表
        Node cur = head;
        while (cur != null) {
            Node newNode = new Node(cur.val);
            newNode.next = cur.next;
            cur.next = newNode;
            cur = cur.next.next;
        }
        // 2. 处理random
        cur = head;
        while (cur != null && cur.next != null) {
            Node newNode = cur.next;
            newNode.random = cur.random != null? cur.random.next : null;
            cur = cur.next.next;
        }
        // 3. 拆链表
        cur = head;
        Node newHead = cur.next;
        while (cur != null) {
            Node newCur = cur.next;
            newCur.next = newCur.next != null ? newCur.next.next : null;
            cur.next = cur.next.next;
            cur = cur.next;
        }
        return newHead;
    }
}
