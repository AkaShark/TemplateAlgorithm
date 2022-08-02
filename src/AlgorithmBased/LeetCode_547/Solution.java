package AlgorithmBased.LeetCode_547;

public class Solution {
    public int findCircleNum(int[][] isConnected) {
        int cities = isConnected.length;
        boolean[] visited = new boolean[cities];
        int ans = 0;
        for (int i = 0; i < cities; i++) {
            if (!visited[i]) {
                dfs(isConnected, cities, i, visited);
                ans ++;
            }
        }
        return ans;
    }

    private void dfs(int[][] isConnected, int cities, int i, boolean[] visited) {
        for (int j = 0; j < cities; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(isConnected, cities, j, visited);
            }
        }
    }
}
