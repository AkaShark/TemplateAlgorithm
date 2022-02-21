package labuladong_Algorithm.Graph.LeetCode_797;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    private List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        // 维护递归过程中经过的路径
        LinkedList<Integer> path = new LinkedList<>();
        traverse(graph, 0, path);
        return res;
    }
    void  traverse(int[][] graph, int s, LinkedList<Integer> path) {
        path.add(s);
        int n = graph.length;
        if (s == n - 1) { // 到终点
            res.add(new LinkedList<>(path));
            path.removeLast();
            return;
        }
        for (int v : graph[s]) {
            traverse(graph, v, path);
        }
        path.removeLast();
    }
}
