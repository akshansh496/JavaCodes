package Binary_Tree;

public class Delete_leaf_Node {
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
    public static Node delete(Node root, int val) {
        if (root == null) return null;
    
        root.left = delete(root.left, val);
        root.right = delete(root.right, val);
    
        if (root.left == null && root.right == null && root.data == val) {
            return null;
        }
    
        return root;
    }
    
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        
        Node root = new Node (1);
        root.left = new Node (3);
        root.right = new Node (3) ;
        root.left.left = new Node(3);
        root.left.right = new Node (2);

        preorder(root);
        delete(root, 3);
        System.out.println();
        preorder(root);
    }
}