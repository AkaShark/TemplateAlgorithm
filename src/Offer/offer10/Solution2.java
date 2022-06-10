package Offer.offer10;

public class Solution2 {
    public int fib(int n) {
        if (n < 2) return n;
        int i = 0;
        int j = 1;
        int m = 0;
        for (int k = 2; k <= n; k++) {
            m = (i + j) % 1000000007;
            i = j;
            j = m;
        }
        return m;
    }
}
