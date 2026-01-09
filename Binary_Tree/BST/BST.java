package Binary_Tree.BST;

public class BST {
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

    public static boolean search(Node root,int val){
        if (root == null) return false;  

        if(root.data==val) return true;

        if(root.data>val) return search(root.left, val);

        else return search(root.right, val);
    }


    public static Node delete(Node root,int val){
         if(root.data>val) 
         root.left= delete(root.left, val);
         else if(root.data<val) 
         root.right=delete(root.right,val);
         else
         {
            // case 1:leaf node
            if(root.left==null && root.right==null){
                return null;
            }

            // case 2:single child
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;

            // case 3:both children
            Node IS=findInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);
         }
         return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        
        int values[]={3,2,1,6,0,5};
        Node root =null;
       
        for(int val:values){
            root=insert(root, val);
        }

        inorder(root);
        System.out.println();
        System.out.println(search(root, 9));
        System.out.println();
        delete(root, 5);
        inorder(root);
    }
}
