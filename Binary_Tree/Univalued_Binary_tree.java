package Binary_Tree;

public class Univalued_Binary_tree {
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
    public static boolean univalued(Node root,int val){
        if(root==null) return true;

        if(root.data!=val) return false;
        boolean left=univalued(root.left, val);
        boolean right=univalued(root.right, val);
       

        return left && right;
    }
    public static void main(String[] args) {
        Node root = new Node (1);
        root.left = new Node (1);
        root.right = new Node (1) ;
        root.left.left = new Node(1);
        root.left.right = new Node (1);
        root.right.left = new Node (1);
        root.right.right = new Node (3);


        System.out.println(univalued(root, root.data));
    }
}
