package Offer.offer13;

public class Solution {
    int ans = 0;
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        dfs(m - 1, n - 1, 0, 0, k, visited);
        return ans;
    }
    public void dfs (int rows, int cols, int row, int col, int k, boolean[][] visited) {
        if (row > rows || row < 0 || col > cols || col < 0 || !checkReach(row, col, k) || visited[row][col]) return;
        visited[row][col] = true;
        ans ++;
        dfs(rows, cols, row + 1, col, k, visited);
        dfs(rows, cols, row - 1, col, k, visited);
        dfs(rows, cols, row, col + 1, k, visited);
        dfs(rows, cols, row, col - 1, k, visited);
//        visited[row][col] = false;
    }
    public boolean checkReach(int row, int col, int k) {
        int sumRow = 0;
        int sumCol = 0;
        while (row > 0) {
            sumRow += row % 10;
            row /= 10;
        }
        while (col > 0) {
            sumCol += col % 10;
            col /= 10;
        }
        return sumCol + sumRow <= k;
    }
}
