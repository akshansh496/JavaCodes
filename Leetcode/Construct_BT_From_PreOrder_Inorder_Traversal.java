package Leetcode;

public class Construct_BT_From_PreOrder_Inorder_Traversal {

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
    static int preIndex = 0;

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0, inorder.length - 1);
    }

    public static TreeNode helper(int[] preorder, int[] inorder, int start, int end) {
        if (start > end) {
            return null;
        }
        int rootValue = preorder[preIndex++];
        TreeNode root = new TreeNode(rootValue);
        int rootIndex = 0;
        for (int i = start; i <= end; i++) {
            if (inorder[i] == rootValue) {
                rootIndex = i;
                break;
            }
        }
        root.left = helper(preorder, inorder, start, rootIndex - 1);
        root.right = helper(preorder, inorder, rootIndex + 1, end);
        return root;
    }

    public static void main(String[] args) {
        int preorder[] = {3, 9, 20, 15, 7};
        int inorder[] = {9, 3, 15, 20, 7};
        System.out.println(buildTree(preorder, inorder));
    }
}
