package Binary_Tree.BST;

import java.util.ArrayList;

public class Print_In_Range {
    
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

    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }

        if(root.data>val){
            root.left=insert(root.left, val);
        }
        else{
            root.right=insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static ArrayList<Integer> list=new ArrayList<>();
    public static void printRoot2leaf(Node root){
        if (root == null) return;
        list.add(root.data);
        if(root.left==null && root.right==null){
            System.out.println(list);
        }
            printRoot2leaf(root.left);
            printRoot2leaf(root.right);

        list.remove(list.size() - 1);
    }

    public static void printInRange(Node root,int k1,int k2){
        if(root==null) return ;
        else if(root.data>=k1 && root.data<=k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);  
        }
        else if(root.data<k1)
        printInRange(root.right, k1, k2);
        else if(root.data>k2)
        printInRange(root.left, k1, k2);
    }
    
    public static void main(String[] args) {
        
        int values[]={8 ,5 ,3 ,6 ,10 ,11 ,14};
        Node root =null;
       
        for(int val:values){
            root=insert(root, val);
        }

        inorder(root);
        System.out.println();
        printInRange(root, 5, 12);
        System.out.println();
        printRoot2leaf(root);   
    }
        
}
