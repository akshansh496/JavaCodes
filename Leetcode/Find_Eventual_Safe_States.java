package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Find_Eventual_Safe_States {

    public static List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            helper(graph, i, new boolean[n], ans);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (ans[i] == 1) {
                list.add(i);
            }
        }
        return list;
    }

    public static boolean helper(int[][] graph, int idx, boolean vis[], int ans[]) {
        if (ans[idx] == -1) {
            return false;
        }
        if (ans[idx] == 1) {
            return true;
        }
        boolean flag = true;
        for (int i = 0; i < graph[idx].length; i++) {
            boolean temp = helper(graph, graph[idx][i], vis, ans);
            if (!temp) {
                flag = false;
                break;
            }
        }
        if (flag) {
            ans[idx] = 1; 
        }else {
            ans[idx] = -1;
        }
        return flag;
    }

    public static void main(String[] args) {

    }
}
