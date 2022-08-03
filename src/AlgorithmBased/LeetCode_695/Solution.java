package AlgorithmBased.LeetCode_695;

public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int rows = grid.length, cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    int ans = dfs(grid, i, j);
                    max = Math.max(ans, max);
                }
            }
        }
        return max;
    }

    private int dfs(int[][] grid, int row, int col) {
        if (row < 0 || row > grid.length - 1 || col < 0 || col > grid[0].length - 1) {
            return 0;
        }
        if (grid[row][col] != 1) return 0;

        grid[row][col] = 2; // 防止重复
        return  dfs(grid, row - 1, col) +
                dfs(grid, row + 1, col) +
                dfs(grid, row, col + 1) +
                dfs(grid, row, col - 1) + 1;
    }


}
