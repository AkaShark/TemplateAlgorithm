package Offer.offer_020;

public class Solution {
    static public int countSubstrings(String s) {
        int count = 0;
        // 枚举
        for (int i = 0; i < s.length(); i++) {
            count += count(s, i, i); // 子串是奇数的时候 中间值为1个
            count += count(s, i, i + 1); // 子串为偶数的时候 中间值为2个
        }
        return count;
    }

    static private int count(String s, int left, int right) {
        int sum = 0;
        while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left --;
            right ++;
            sum ++;
        }
        return sum;
    }

    public static void main(String[] args) {
        countSubstrings("aaaa");
    }
}
