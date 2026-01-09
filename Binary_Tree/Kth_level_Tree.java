package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Kth_level_Tree {
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

    public static void kth_recursively(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        kth_recursively(root.left, level+1, k);
        kth_recursively(root.right, level+1, k);
    }


    public static void kth_iteratively(Node root,int k){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int level=1;
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                level++;
                if(q.isEmpty()) break;
                else q.add(null);
            }
            else{
                if(level==k){
                System.out.print(curr.data+" ");
                continue;
                }
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }

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

        // kth_recursively(root, 1, 2);
        kth_iteratively(root, 2);
    }
}
