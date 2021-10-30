package EveryDay.LeetCode_647;

public class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                int left = i;
                int right = i + j;
                while (left >=0 && right < n && s.charAt(left--) == s.charAt(right ++)) ans++;
            }
        }
        return ans;
    }
}
