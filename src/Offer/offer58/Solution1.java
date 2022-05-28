package Offer.offer58;

public class Solution1 {
    public String reverseLeftWords(String s, int n) {
        if (s == null || n == 0) return s;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n; i < s.length() + n; i++) {
            stringBuilder.append(s.charAt(i % s.length()));
        }
        return stringBuilder.toString();
    }
}
