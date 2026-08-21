package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Flatten_BinaryTree_To_LinkedList {

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

    static class Solution {

        int idx = -1;
        List<Integer> list = new ArrayList<>();

        public void flatten(TreeNode root) {
            helper(root);
            TreeNode curr = root;

            for (int i = 1; i < list.size(); i++) {
                curr.left = null;
                curr.right = new TreeNode(list.get(i));
                curr = curr.right;
            }
        }

        public void helper(TreeNode root) {
            if (root == null) {
                return;
            }
            list.add(root.val);
            helper(root.left);
            helper(root.right);
        }
    }
    public static void main(String[] args) {
        
    }
}
