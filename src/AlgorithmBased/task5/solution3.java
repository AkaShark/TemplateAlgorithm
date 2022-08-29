package AlgorithmBased.task5;

public class solution3 {
    public void main(String[] args) {
        dfs(100);
    }

    private int dfs(int n) {
        if (n < 0) {
            return 0;
        }
        return dfs(n-1) + n;
    }
}
