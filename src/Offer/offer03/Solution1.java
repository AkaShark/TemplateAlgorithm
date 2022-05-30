package Offer.offer03;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = -1;
        for (int i = 0; i <nums.length; i++) {
            if (!set.add(nums[i])) {
                return nums[i];
            }
        }
        return -1;
    }
}
