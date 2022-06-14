package Offer.offer12;

public class Solution1 {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word.toCharArray(), 0, i, j, visited))
                    return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, char[] words, int k, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= board.length || j < 0 ||
                  j >= board[0].length || board[i][j] != words[k]
                                       || visited[i][j])
            return false;
        if (k == words.length - 1) return true;
        visited[i][j] = true;
        boolean res = dfs(board, words, k + 1, i + 1, j, visited) ||
                      dfs(board, words, k + 1, i - 1, j, visited) ||
                      dfs(board, words, k + 1, i, j + 1, visited) ||
                      dfs(board, words, k + 1, i, j - 1, visited);
        visited[i][j] = false;
        return res;
    }
}
