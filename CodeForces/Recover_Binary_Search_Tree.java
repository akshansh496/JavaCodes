
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
    }

    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = null;

    public void recoverTree(TreeNode root) {

        helper(root);

        // Swap the values of the two incorrect nodes
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    public void helper(TreeNode root) {

        if (root == null) {
            return;
        }

        // Inorder: Left
        helper(root.left);

        // Check for violation
        if (prev != null && root.val < prev.val) {

            if (first == null) {
                first = prev;
            }

            second = root;
        }

        // Current node becomes previous node
        prev = root;

        // Inorder: Right
        helper(root.right);
    }

    // Helper method to print inorder
    public void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Recover_Binary_Search_Tree obj
                = new Recover_Binary_Search_Tree();

        /*
                 3
                / \
               1   4
                  /
                 2

            Inorder = 1 3 2 4

            3 and 2 are swapped.
         */
        TreeNode root = obj.new TreeNode(3);

        root.left = obj.new TreeNode(1);
        root.right = obj.new TreeNode(4);
        root.right.left = obj.new TreeNode(2);

        System.out.println("Before recovery:");
        obj.inorder(root);

        obj.recoverTree(root);

        System.out.println("\nAfter recovery:");
        obj.inorder(root);
    }
}
