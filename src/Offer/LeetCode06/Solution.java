package Offer.LeetCode06;

import Util.ListNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Solution {
    public int[] reversePrint(ListNode head) {
        Deque<Integer> stack = new LinkedList<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] ans = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()) {
            ans[index] = stack.pop();
            index ++;
        }
        return ans;
    }
}
