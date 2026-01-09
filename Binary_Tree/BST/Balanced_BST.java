package Binary_Tree.BST;

public class Balanced_BST {
    
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

    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node balanced(int[] arr,int s,int e){
        if(s>e) return null;
        int mid=s+(e-s)/2;
        Node root=new Node(arr[mid]);
        root.left=balanced(arr, s, mid-1);
        root.right=balanced(arr, mid+1, e);
        return root;
    }

    
    public static void main(String[] args) {
        
        int values[]={3,5,6,8,10,11,12};
        Node root=balanced(values, 0, values.length-1);
        preorder(root );
    }
}
