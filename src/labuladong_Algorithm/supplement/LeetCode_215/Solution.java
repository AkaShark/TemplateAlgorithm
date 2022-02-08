package labuladong_Algorithm.supplement.LeetCode_215;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest_1(int[] nums, int k) {
        if (nums.length < k || k <=0) return -1;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < nums.length; i++) {
            priorityQueue.add(nums[i]);
        }
        for (int i = 0; i < k - 1; i++) {
            priorityQueue.poll();
        }
        return priorityQueue.poll();
    }

    public int findKthLargest(int[] nums, int k) {
        if (nums.length < k || k <= 0) return -1;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k);
        for (int i = 0; i < nums.length; i++) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(nums[i]);
            } else {
                if (nums[i] > priorityQueue.peek()) {
                    priorityQueue.poll();
                    priorityQueue.add(nums[i]);
                }
            }
        }
        return priorityQueue.poll();
    }



}
