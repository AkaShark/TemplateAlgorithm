package Offer.LeetCode30;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    // 保证辅助栈和原栈个数一直
    Deque<Integer> stack = new ArrayDeque<>();
    Deque<Integer> minStack = new ArrayDeque<>();
    public void push(int x) {
        stack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
