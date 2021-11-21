package Interview.LeetCode_503;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    /*可以遍历一次数组，如果元素是单调递减的我们将把这些元素保存，直到找到一个较大的元素，把该较大元素逐一跟保存了
    * 的元素比较，如果该元素更大则他就是前面的元素下一个更大的元素
    * 使用单调栈来解决这个问题
    * 1. 如果栈为空，则把当前元素放入栈内
    * 2. 如果栈不为空，则把需要判断当前元素和栈顶的元素的大小
    *    1. 如果当前元素比栈顶元素大，说明当前元素是前面一些元素的下一个更大的元素，逐个弹出栈顶元素
    *       直到当前元素比栈顶元素小为止
    *    2. 如果当前元素比栈顶元素小, 说明当前元素的下一个更大元素与栈顶元素相同，则把当前元素入栈*/
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        // 结果集
        int[] ret = new int[n];
        Arrays.fill(ret, -1);
        // 单调栈
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < n * 2 - 1; i++) { // 对数组遍历两次
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) { // 栈顶元素小于当前元素
                // 当前元素是栈内一些数字的下一个更大的元素 弹栈
                ret[stack.pop()] = nums[i % n];
            }
            // 栈为空 或者 当前元素小于栈顶 入栈
            stack.push(i % n);
        }
        return ret;
    }
}
