package Grokking.Maximum_Sum_Subarray_of_Size_K;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;

import javax.management.Query;

/*
    * Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.
    * Input:
       N = 4, K = 2
       Arr = [100, 200, 300, 400]
       Output:
       700
       Explanation:
       Arr3  + Arr4 =700,
       which is maximum.

       Input:
       N = 4, K = 4
       Arr = [100, 200, 300, 400]
       Output:
       1000
       Explanation:
       Arr1 + Arr2 + Arr3  
       + Arr4 =1000,
       which is maximum.
   */
public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        soultion2(4, arrayList, 4);
    }

    private static long soultion1(int K, ArrayList<Integer> Arr, int N) {
        if (N < K)
            return 0;
        long res = 0;
        // first Window value
        for (int i = 0; i < K; i++) {
            res += Arr.get(i);
        }
        // current Window value
        long temp = res;
        for (int i = K; i < N; i++) {
            temp += Arr.get(i) - Arr.get(i - K);
            // find max
            res = Math.max(res, temp);
        }
        return res;
    }

    private static long soultion2(int K, ArrayList<Integer> Arr, int N) {
        if (N < K) return 0;
        long maxValue = 0;
        // how many windows
        for (int i = 0; i <= N - K; i++) {
            long temp = 0;
            // each window value add for each O(n)
            for (int j = i; j < i + K; j++) {
                temp += Arr.get(j);
            }
            maxValue = Math.max(maxValue, temp);
        }
        return maxValue;
    }
}
