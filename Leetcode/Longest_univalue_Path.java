package Leetcode;

public class Longest_univalue_Path {

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
    static int max = 0;

    public static int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        helper(root);
        return max - 1;
    }

    public static int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        if (root.left == null || root.val != root.left.val) {
            left = 0;
        }
        if (root.right == null || root.val != root.right.val) {
            right = 0;
        }
        max = Math.max(max, 1 + left + right);
        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(4);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);

        root.right.left = null;
        root.right.right = new TreeNode(5);
        System.out.println(longestUnivaluePath(root));
    }
}
