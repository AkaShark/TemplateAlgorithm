package EveryDay.LeetCode_575;

import java.util.HashSet;

public class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < candyType.length; i++) {
            set.add(candyType[i]);
        }
        return Math.min(n / 2, set.size());
    }
}
