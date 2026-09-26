package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Amount_Of_Time_For_Binary_Tree_To_Be_Infected {

    // TreeNode class
    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    Map<Integer, List<Integer>> graph = new HashMap<>();

    public void createGraph(TreeNode root) {
        if (root == null) {
            return;
        }

        graph.putIfAbsent(root.val, new ArrayList<>());

        if (root.left != null) {
            graph.putIfAbsent(root.left.val, new ArrayList<>());

            graph.get(root.val).add(root.left.val);
            graph.get(root.left.val).add(root.val);

            createGraph(root.left);
        }

        if (root.right != null) {
            graph.putIfAbsent(root.right.val, new ArrayList<>());

            graph.get(root.val).add(root.right.val);
            graph.get(root.right.val).add(root.val);

            createGraph(root.right);
        }
    }

    public int amountOfTime(TreeNode root, int start) {

        createGraph(root);

        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer, Boolean> vis = new HashMap<>();

        for (Integer key : graph.keySet()) {
            vis.put(key, false);
        }

        q.add(start);
        vis.put(start, true);

        int count = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                int curr = q.remove();

                for (int x : graph.get(curr)) {

                    if (!vis.get(x)) {
                        vis.put(x, true);
                        q.add(x);
                    }
                }
            }

            count++;
        }

        return count - 1;
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               5   3
                  / \
                 10  6
                    / \
                   7   4
         */
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(5);

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(6);

        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(4);

        int start = 3;

        Amount_Of_Time_For_Binary_Tree_To_Be_Infected obj
                = new Amount_Of_Time_For_Binary_Tree_To_Be_Infected();

        int result = obj.amountOfTime(root, start);

        System.out.println("Time required: " + result);
    }
}
