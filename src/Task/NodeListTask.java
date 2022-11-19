package Task;

import Util.ListNode;

import java.util.List;

public class NodeListTask {
    static public ListNode deleteMultipleOf3(ListNode head) {
        if (head == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        ListNode pre = dummy;
        while (cur != null) {
            if (cur.val % 3 == 0) {
                pre.next = cur.next;
                cur = pre.next;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        // 2315463
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(3);

//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//        node6.next = node7;

        deleteMultipleOf3(node1);


    }
}
