package Offer.offer09;

import java.util.Deque;
import java.util.LinkedList;

public class Solution1 {
    // LeetCode 优化代码
    Deque<Integer> stackA = new LinkedList<>();
    Deque<Integer> stackB = new LinkedList<>();
    // 输入 直接入输入栈 不用输出栈再次压入
    public void appendTail(int value) {
        stackA.push(value);
    }

    // 这里不用再把输入栈压过来
    public int deleteHead() {
        if (stackB.isEmpty()) {
            if (stackA.isEmpty()) {
                return -1;
            } else {
                while (!stackA.isEmpty()) {
                    stackB.push(stackA.pop());
                }
            }
        }
        return stackB.pop();
    }
}
