package labuladong_Algorithm.LeetCode_23;

import Util.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        // 小顶堆
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        // 遍历头结点
        for (ListNode head :
                lists) {
            if (head != null) {
                priorityQueue.add(head);
            }
        }
        while (!priorityQueue.isEmpty()) {
            ListNode node = priorityQueue.poll(); // 堆顶
            cur.next = node;
            if (node.next != null) {
                priorityQueue.add(node.next);
            }
            cur = cur.next; // 工作指针向下移动
        }
        return dummy.next;
    }

}
