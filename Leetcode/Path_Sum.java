package Leetcode;

public class Path_Sum {

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

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, targetSum, 0);
    }

    public static boolean helper(TreeNode root, int targetSum, int sum) {
        if (root == null) {
            return false;
        }
        sum += root.val;
        if (sum == targetSum && root.left == null && root.right == null) {
            return true;
        }
        return helper(root.left, targetSum, sum) || helper(root.right, targetSum, sum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);

        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.right.right = new TreeNode(1);
        System.out.println(hasPathSum(root, 22));

    }
}
