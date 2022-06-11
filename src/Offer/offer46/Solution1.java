package Offer.offer46;

public class Solution1 {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int a = 1, b = 1;
        int c = 0;
        for (int i = 2; i <= s.length() ; i++) {
            String temp = s.substring(i - 2, i);
            c = temp.compareTo("10") >= 0 && temp.compareTo("25") <= 0 ? a + b: b;
            a = b;
            b = c;
        }
        return c;
    }
}
