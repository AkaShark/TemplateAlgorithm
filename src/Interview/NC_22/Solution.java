package Interview.NC_22;

public class Solution {
        static public void merge(int A[], int m, int B[], int n) {
            int size = m + n;
            int[] ans = new int[size];
            int index_a = 0, index_b = 0;
            for (int i = 0; i < ans.length; i++) {
                if (index_a < A.length && index_b < B.length) {
                    int min = 0;
                    if (A[index_a] < B[index_b]) {
                        min = A[index_a];
                        index_a ++;
                    } else  {
                        min = B[index_b];
                        index_b ++;
                    }
                    ans[i] = min;
                } else if (index_a < A.length) {
                    ans[i] = A[index_a];
                    index_a ++;
                } else if (B.length > index_b) {
                    ans[i] = B[index_b];
                    index_b ++;
                }
            }
            for (int i = 0; i < size; i++) {
                A[i] = ans[i];
            }
        }

    public static void main(String[] args) {
        merge(new int[]{4,5,6,}, 3,new int[]{1,2,3}, 3);
    }
}
