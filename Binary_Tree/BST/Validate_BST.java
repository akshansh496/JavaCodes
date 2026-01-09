package Binary_Tree.BST;

public class Validate_BST {
    
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

    public static boolean validBST(Node root,Node min,Node max){
        if(root==null) return true;

        if(min!=null && root.data<=min.data) return false;
        if(max!=null && root.data>=max.data) return false;

        return validBST(root.left, min, root) && validBST(root.right, root, max);
    }
    
    public static void main(String[] args) {
        
        int values[]={8 , 8, 8};
        Node root =null;
       
        for(int val:values){
            root=insert(root, val);
        }

        inorder(root);
        System.out.println();
        System.out.println(validBST(root, null,null));
    }
        
}
