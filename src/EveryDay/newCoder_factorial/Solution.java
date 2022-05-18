package EveryDay.newCoder_factorial;

import java.math.BigInteger;

public class Solution {
    public int factorial(int n) {
        if (n >= 1 && n <= 200) {
            BigInteger[] dp = new BigInteger[n + 1];
            dp[0] = BigInteger.valueOf(0);
            dp[1] = BigInteger.valueOf(1);
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1].multiply(BigInteger.valueOf(i));
            }
            return dp[n].intValue();
        } else {
            return -1;
        }
    }
}
