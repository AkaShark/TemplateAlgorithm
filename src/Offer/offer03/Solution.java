package Offer.offer03;

import java.util.HashMap;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        if (nums  == null || nums.length == 0) return -1;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
               return nums[i];
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return -1;
    }
}
