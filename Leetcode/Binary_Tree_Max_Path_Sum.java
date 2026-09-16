package Leetcode;

public class Binary_Tree_Max_Path_Sum {

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
        System.out.println(maxPathSum(root));
    }

    static int max = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }

    public static int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        int best = Math.max(root.val, Math.max(Math.max(root.val + left, root.val + right), root.val + left + right));
        max = Math.max(max, best);
        return Math.max(root.val, Math.max(root.val + left, root.val + right));
    }
}
