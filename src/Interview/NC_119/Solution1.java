package Interview.NC_119;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution1 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        int[] vec = new int[k];
        ArrayList<Integer> ans = new ArrayList<>();
        if (k == 0) { // 排除0的情况
            for (int i = 0; i < k; i++) {
                ans.add(input[i]);
            }
            return ans;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1; // 大顶堆
            }
        });
        for (int i = 0; i < k; i++) {
            queue.offer(input[i]); // 将前k个数放进大顶堆中
        }
        for (int i = k; i < input.length; i++) {
            if (queue.peek() > input[i]) {
                queue.poll();
                queue.offer(input[i]);
            }
        }
        for (int i = 0; i < k; i++) {
            ans.add(queue.poll());
        }
        return ans;

    }

}
