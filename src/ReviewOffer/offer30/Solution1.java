package ReviewOffer.offer30;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1 {
    Deque<Integer> stack = new ArrayDeque<>();
    Deque<Integer> minStack = new ArrayDeque<>();

    public void MinStack() {
        minStack.push(Integer.MAX_VALUE);
    }
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
