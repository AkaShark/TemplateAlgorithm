package Offer.offer10;

import java.util.HashMap;

public class Solution1 {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    public int fib(int n) {
        if (n < 2) return n;
        if (hashMap.get(n) != null) {
            return hashMap.get(n);
        }
        int sum = (fib(n - 1) + fib(n - 2)) % 1000000007;
        hashMap.put(n, sum);
        return sum;
    }
}
