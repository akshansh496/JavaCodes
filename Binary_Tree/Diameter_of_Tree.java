package Binary_Tree;

public class Diameter_of_Tree {
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
    public static int height(Node root){
        if(root==null) return 0;
        int left=height(root.left);
        int right=height(root.right);
        int max=left>right?left+1:right+1;
        return max;
    }

    // diameter O(N^2)
    public static int diameter(Node root){
        if(root==null) return 0;
        int ld=diameter(root.left);//left diameter
        int rd=diameter(root.right);//right diameter
        int lf=height(root.left);//left height
        int rf=height(root.right);//right height
        int self=lf+rf+1;//diameter including root
        int Max=Math.max(Math.max(ld,rd),self);
        return Max;
    }

    // diameter O(N)
    public static Info diameter2(Node root){
        if(root==null) return new Info(0,0);
        Info leftInfo=diameter2(root.left);
        Info rightInfo=diameter2(root.right);

        int diam=Math.max(leftInfo.diam, Math.max(rightInfo.diam,leftInfo.h+rightInfo.h+1));
        int ht=Math.max(leftInfo.h,rightInfo.h)+1;
        return new Info(diam,ht);
    }
    static class Info{
        int diam;
        int h;
        public Info(int diam,int h){
            this.diam=diam;
            this.h=h;
        }
    }

    public static void main(String[] args) {
        Node root = new Node (1);
        root.left = new Node (2);
        root.right = new Node (3) ;
        root.left.left = new Node(4);
        root.left.right = new Node (5);
        root.right.left = new Node (6);
        root.right.right = new Node (7);

        System.out.println(diameter(root));
        System.out.println(diameter2(root).diam);
        System.out.println(diameter2(root).h);

    }
}
