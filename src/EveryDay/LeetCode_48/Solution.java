package EveryDay.LeetCode_48;
import java.util.HashSet;

public class Solution {
    static HashSet<Character> hashSet = new HashSet<>();
    static public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        if (chars.length == 0) return 0;
        int ans = 1;
        int startIndex = 0, endIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            startIndex = i;
            while (endIndex < chars.length) {
                if (hashSet.contains(chars[endIndex])) {
                    ans = Math.max(ans, hashSet.size());
                    hashSet.remove(chars[startIndex]);
                    break;
                } else {
                    hashSet.add(chars[endIndex]);
                    endIndex ++;
                }
            }
            ans = Math.max(ans, hashSet.size());
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("au"));
    }
}
