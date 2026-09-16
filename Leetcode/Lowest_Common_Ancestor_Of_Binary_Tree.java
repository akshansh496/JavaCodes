package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Lowest_Common_Ancestor_Of_Binary_Tree {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(lowestCommonAncestor(root, root.left.left, root.left.right).val);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathP = new ArrayList<>();
        List<TreeNode> pathQ = new ArrayList<>();
        helper(root, p, pathP);
        helper(root, q, pathQ);
        TreeNode lca = null;
        int i = 0;
        while (i < pathP.size() && i < pathQ.size() && pathP.get(i) == pathQ.get(i)) {
            lca = pathP.get(i);
            i++;
        }

        return lca;
    }

    public static boolean helper(TreeNode root, TreeNode target, List<TreeNode> list) {
        if (root == null) {
            return false;
        }
        list.add(root);
        if (root == target) {
            return true;
        }
        if (helper(root.left, target, list) || helper(root.right, target, list)) {
            return true;
        }
        list.remove(list.size() - 1);
        return false;
    }

}
