package Offer.offer35;

import Util.Node;

import java.util.HashMap;

public class Solution {
    HashMap<Node, Node> hashMap = new HashMap();
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        if (!hashMap.containsKey(head)) {
            Node newNode = new Node(head.val);
            hashMap.put(head, newNode);
            newNode.next = copyRandomList(head.next);
            newNode.random = copyRandomList(head.random);
        }
        return hashMap.get(head);
    }
}
