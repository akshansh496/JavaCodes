package Binary_Tree;

public class Invert_Binary_tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void invert(Node root){
        if(root == null) return;
        Node left=root.left;
        Node right=root.right;
        root.left=right;
        root.right=left;
        invert(root.left);
        invert(root.right);
    }

    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        // parent tree
        Node root = new Node (1);
        root.left = new Node (2);
        root.right = new Node (3) ;
        root.left.left = new Node(4);
        root.left.right = new Node (5);
        root.right.left = new Node (6);
        root.right.right = new Node (7);
        preorder(root);
        invert(root);
        System.out.println();
        preorder(root);   
    }
}
