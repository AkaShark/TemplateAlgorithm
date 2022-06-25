package ReviewOffer.offer09;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    Deque<Integer> firstQueue = new ArrayDeque<>();
    Deque<Integer> secondQueue = new ArrayDeque<>();
    public void CQueue() {

    }

    public void appendTail(int value) {
        firstQueue.push(value);
    }

    public int deleteHead() {
        if (!secondQueue.isEmpty()) {
            return secondQueue.pop();
        }
        while (!firstQueue.isEmpty()) {
            secondQueue.push(firstQueue.pop());
        }
        return secondQueue.isEmpty() ? -1: secondQueue.pop();
    }
}
