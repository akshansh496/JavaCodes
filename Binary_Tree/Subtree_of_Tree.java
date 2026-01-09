// Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.
package Binary_Tree;

public class Subtree_of_Tree {
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

    public static boolean isSubTree(Node root,Node subroot){
        if(root==null) return false;

        if(root.data==subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }

        return isSubTree(root.left, subroot)||isSubTree(root.right, subroot);
    }

    public static boolean isIdentical(Node node,Node subRoot){
        if(node==null && subRoot==null) return true;
        else if(node==null || subRoot==null || node.data!=subRoot.data) return false; 
        if(!isIdentical(node.left, subRoot.left)) return false;
        if(!isIdentical(node.right, subRoot.right)) return false;
        return true;
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

        // child tree
        Node subRoot = new Node (2);
        subRoot.left = new Node (4);
        subRoot.right = new Node (5);

        System.out.println(isSubTree(root, subRoot));
    }

}
