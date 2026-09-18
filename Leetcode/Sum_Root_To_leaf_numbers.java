package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Sum_Root_To_leaf_numbers {

    public static class TreeNode {

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
    static List<String> list = new ArrayList<>();

    public static int sumNumbers(TreeNode root) {
        helper(root, new StringBuilder());
        int sum = 0;
        for (String str : list) {
            sum += Integer.parseInt(str);
        }
        return sum;
    }

    public static void helper(TreeNode root, StringBuilder str) {
        if (root == null) {
            return;
        }
        str.append(root.val);
        if (root.left == null && root.right == null) {
            list.add(str.toString());
            str.deleteCharAt(str.length() - 1);
            return;
        }
        helper(root.left, str);
        helper(root.right, str);
        str.deleteCharAt(str.length() - 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(9);
        root.right = new TreeNode(0);

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);
        System.out.println(sumNumbers(root));
    }
}
