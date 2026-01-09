package Binary_Tree;
import java.util.*;
public class Build_Tree_Preorder {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;

        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                 return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }


        // preorder
        public static void preorder(Node root){
            if(root==null) return;
            System.out.print(root.data+ " ");
            preorder(root.left);
            preorder(root.right);
        }


        // inorder
        public static void inorder(Node root){
            if(root==null) return;

            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }


        // postorder
        public static void postorder(Node root){
            if(root==null) return;

            postorder(root.left);   
            postorder(root.right);
            System.out.print(root.data+" ");
        }


        // level-order traversal
        public static void levelOrderTraversal(Node root){
            if(root==null) return; 
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()) break;
                    else    q.add(null);
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null)     q.add(currNode.left);
                    if(currNode.right!=null)     q.add(currNode.right);
                }
            }
        }


        // height of a tree
        public static int height(Node root){
            if(root==null) return 0;
            int left=height(root.left);
            int right=height(root.right);
            int max=left>right?left+1:right+1;
            return max;
        }


        // count nodes
        public static int count(Node root){
            if(root==null) return 0;
            int left=count(root.left);
            int right=count(root.right);
            return left+right+1;
        }


        // sum of nodes
        public static int sum(Node root){
            if(root==null) return 0;
            int left=sum(root.left);
            int right=sum(root.right);
            return left+right+root.data;
        }


        // Diameter of a tree
        // Diameter : no. of nodes in the longest path b/w two leaves
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);

        System.out.println(root.data);
        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.levelOrderTraversal(root);
        System.out.println();
        System.out.println("height:"+tree.height(root));
        System.out.println();
        System.out.println("Count of nodes:"+tree.count(root));
        System.out.println();
        System.out.println("Sum of nodes:"+tree.sum(root));

    }
}
