package AlgorithmBased.LeetCode_463;

public class Solution {
    public int islandPerimeter(int[][] grid) {
        int len = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    len += dfs(grid, i, j);
                }
            }
        }
        return len;
    }

    private int dfs(int[][] grid, int row, int col) {
        if (row < 0 || row > grid.length - 1 || col < 0 || col > grid[0].length - 1) { // 到边界
            return 1;
        }
        if (grid[row][col] == 0) { // 到水边
            return 1;
        }
        if (grid[row][col] != 1) return 0; // 1 2
        grid[row][col] = 2; // 防止重复

        return  dfs(grid, row + 1, col) +
                dfs(grid, row - 1, col) +
                dfs(grid, row, col + 1) +
                dfs(grid, row, col - 1);
    }
}
