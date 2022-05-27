package Offer.offer09;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    Deque<Integer> stackA = new LinkedList<>();
    Deque<Integer> stackB = new LinkedList<>();
    public void appendTail(int value) {
        while (!stackB.isEmpty()) {
            stackA.push(stackB.pop());
        }
        stackA.push(value);
    }

    public int deleteHead() {
        while (!stackA.isEmpty()) {
            stackB.push(stackA.pop());
        }
        return stackB.isEmpty() ? -1 : stackB.pop();
    }

}
