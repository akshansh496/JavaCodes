package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Same_Tree {

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
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> list1 = preorder(p, new ArrayList<>());
        List<Integer> list2 = preorder(q, new ArrayList<>());

        return list1.equals(list2);
    }

    public List<Integer> preorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            list.add(Integer.MIN_VALUE);
            return list;
        }
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);

        return list;
    }

    public static void main(String[] args) {
        Same_Tree obj = new Same_Tree();

        // Creating first tree
        TreeNode root1 = obj.new TreeNode(1);
        root1.left = obj.new TreeNode(2);
        root1.right = obj.new TreeNode(3);

        // Creating second tree
        TreeNode root2 = obj.new TreeNode(1);
        root2.left = obj.new TreeNode(2);
        root2.right = obj.new TreeNode(3);

        // Check
        boolean result = obj.isSameTree(root1, root2);

        System.out.println("Are the trees same? " + result);

        // Print preorder lists
        List<Integer> list1 = obj.preorder(root1, new ArrayList<>());
        List<Integer> list2 = obj.preorder(root2, new ArrayList<>());

        System.out.println("Tree 1: " + list1);
        System.out.println("Tree 2: " + list2);
    }
}
