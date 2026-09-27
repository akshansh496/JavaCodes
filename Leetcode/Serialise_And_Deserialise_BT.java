package Leetcode;

public class Serialise_And_Deserialise_BT {

    // TreeNode class
    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Codec class
    static class Codec {

        int index = 0;

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder str = new StringBuilder();
            preorder(root, str);
            return str.toString();
        }

        public void preorder(TreeNode root, StringBuilder str) {

            if (root == null) {
                str.append("null,");
                return;
            }

            str.append(root.val).append(",");

            preorder(root.left, str);
            preorder(root.right, str);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {

            index = 0;

            String[] arr = data.split(",");

            return helper(arr);
        }

        public TreeNode helper(String[] arr) {

            if (arr[index].equals("null")) {
                index++;
                return null;
            }

            TreeNode root = new TreeNode(
                    Integer.parseInt(arr[index])
            );

            index++;

            root.left = helper(arr);
            root.right = helper(arr);

            return root;
        }
    }

    // Print tree in preorder
    public static void printPreorder(TreeNode root) {

        if (root == null) {
            System.out.print("null ");
            return;
        }

        System.out.print(root.val + " ");

        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
                  / \
                 4   5
         */
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        // Create Codec object
        Codec codec = new Codec();

        // Serialize
        String data = codec.serialize(root);

        System.out.println("Serialized:");
        System.out.println(data);

        // Deserialize
        TreeNode newRoot = codec.deserialize(data);

        System.out.println("Deserialized Preorder:");
        printPreorder(newRoot);
    }
}
