package EveryDay.newCoder_factorial;

import java.math.BigInteger;

public class Solution1 {
    public String factorial(int n) {
        if (n > 200) return "error";
        StringBuilder ans = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            multiply(ans, i);
        }
        return ans.toString();
    }
    // 字符串模拟乘法
    public void multiply(StringBuilder ans, int k) {
        int jw = 0;
        for (int i = 0; i < ans.length(); i++) {
            int tmp = (ans.charAt(ans.length() - i - 1) - '0') * k;
            ans.replace(ans.length() - i - 1, ans.length() - i, "" + ((tmp+jw)%10));
            if (jw + (tmp % 10) >= 10) {
                jw = tmp/10 + (jw + (tmp % 10)) / 10;
            } else {
                jw = tmp / 10;
            }
        }
        if (jw != 0) {
            ans.insert(0,""+jw);
        }
    }
}
