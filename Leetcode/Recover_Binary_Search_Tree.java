package Leetcode;

public class Recover_Binary_Search_Tree {

    public class TreeNode {

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
        TreeNode first = null;
        TreeNode second = null;
        TreeNode prev = null;

        public void recoverTree(TreeNode root) {
            helper(root);
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }

        public void helper(TreeNode root) {
            if (root == null) {
                return;
            }
            helper(root.left);
            if (prev != null && root.val < prev.val) {
                if (first == null) {
                    first = prev;
                }
                second = root;
            }
            prev = root;
            helper(root.right);
        }

        public static void main(String[] args) {

        }
    }
