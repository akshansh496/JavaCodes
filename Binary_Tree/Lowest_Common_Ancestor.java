package Binary_Tree;

import java.util.ArrayList;

public class Lowest_Common_Ancestor {
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
    // Approach 1
    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>(); 
        ArrayList<Node> path2=new ArrayList<>(); 

        getPath(root, path1, n1);
        getPath(root, path2, n2);
        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i))
            break;
        }
        return path1.get(i-1);

    }

    public static boolean getPath(Node root,ArrayList<Node> path,int n){
        if(root==null){
            return false;
        }
        path.add(root);

        if(root.data==n) return true;

        if(getPath(root.left, path, n) || getPath(root.right, path, n))
        return true;

        path.remove(path.size()-1);
        return false;
    }




    // Approach 2
    public static Node lca2(Node root,int n1,int n2){
        if(root == null || root.data==n1 || root.data==n2) return root;

        Node leftLCA=lca2(root.left, n1, n2);
        Node rightLCA=lca2(root.right, n1, n2);

        if(leftLCA==null) return rightLCA;
        if(rightLCA==null) return leftLCA;

        return root;
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

        int n1=4;int n2=7;
        System.out.println(lca(root, n1,n2).data);
        System.out.println(lca2(root, n1,n2).data);
    }
}
