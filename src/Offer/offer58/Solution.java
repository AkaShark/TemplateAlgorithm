package Offer.offer58;

public class Solution {
    public String reverseLeftWords(String s, int n) {
        if (s == null || s.length() == 0 || n == 0) return s;
        char[] ans = s.toCharArray();
        reverse(ans, 0, s.toCharArray().length - 1);
        reverse(ans, 0, s.toCharArray().length - n);
        reverse(ans, n, s.toCharArray().length - 1);
        return String.valueOf(ans);
    }

    // 翻转字符串
    public void reverse(char[] chars, int left, int right) {
        int length = chars.length;
        if (length == 0) return;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}
