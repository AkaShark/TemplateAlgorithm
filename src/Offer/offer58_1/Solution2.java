package Offer.offer58_1;

public class Solution2 {
    public String reverseWords(String s) {
        s = s.trim();
        int j = s.length() - 1, i = j;
        StringBuilder stringBuilder = new StringBuilder();
        while (i > 0) {
            while (i > 0 && s.charAt(i) != ' ') i --; // 找到头
            stringBuilder.append(s.substring(i + 1, j + 1));
            stringBuilder.append(" ");
            while (i > 0 && s.charAt(i) == ' ') i --; // 找到尾
            j = i + 1;
        }
        return stringBuilder.toString().trim();
    }
}
