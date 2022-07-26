package AlgorithmBased.LeetCode_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
   static public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length < 3) return new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break; // 第一个数大于 0，后面的数都比它大，肯定不成立了
            if (i > 0 && nums[i] == nums[i - 1]) continue; // 去掉重复情况
            int temp = nums[i];
            int left = i + 1 , right = nums.length - 1;
            while (right > left) {
                if (temp + nums[left] + nums[right] > 0) {
                    right --;
                } else if(temp + nums[left] + nums[right] < 0) {
                    left ++;
                } else {
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[left]);
                    res.add(nums[right]);
                    ans.add(res);
                    left ++;
                    right --;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        threeSum(new int[]{-2,0,0,2,2});
    }
}
