package ReviewOffer.offer30;

import java.util.Stack;

public class Solution {
    /** initialize your data structure here. */
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> secondaryStack = new Stack<>();
    public void MinStack() {

    }

    public void push(int x) {
        mainStack.push(x);
        if (secondaryStack.isEmpty()) secondaryStack.push(x);
        else if (x < secondaryStack.peek())
            secondaryStack.push(x);
        else
            secondaryStack.push(secondaryStack.peek());

    }

    public void pop() {
        mainStack.pop();
        secondaryStack.pop();
    }

    public int top() {
        return mainStack.peek();
    }

    public int min() {
        return secondaryStack.peek();
    }
}
