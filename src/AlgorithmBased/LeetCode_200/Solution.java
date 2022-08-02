package AlgorithmBased.LeetCode_200;

public class Solution {
    // DFS
    public int numIslands(char[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    ans ++;
                    dfs(grid, i, j);
                }
            }
        }
        return ans;
    }

    private void dfs(char[][] grid, int row, int col) {
        int rows = grid.length - 1, cols = grid[0].length - 1;
        if (row < 0 || row > rows || col < 0 || col > cols) return;
        if (grid[row][col] != '1') return; // 不是岛屿

        grid[row][col] = '2';
        dfs(grid, row - 1, col);
        dfs(grid, row + 1, col);
        dfs(grid, row, col - 1);
        dfs(grid, row, col + 1);
    }
}
