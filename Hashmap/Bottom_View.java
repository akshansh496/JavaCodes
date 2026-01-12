package Hashmap;

import java.util.HashMap;
import java.util.Set;

public class Bottom_View {
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
    static class Pair {
        int val, level;

        Pair(int val, int level) {
            this.val = val;
            this.level = level;
        }
    }
    static HashMap<Integer,Pair> map=new HashMap<>();
    public static void main(String[] args) {
        // parent tree
        Node root = new Node (20);
        root.left = new Node (8);
        root.right = new Node (22) ;
        root.left.left = new Node(5);
        root.left.right = new Node (3);
        root.right.right = new Node (25);
        root.left.right.left=new Node (10);
        root.left.right.right=new Node (14);

        helper(root,0,0);

        Set<Integer> keys=map.keySet();
        for (Integer key : keys) { 
            System.out.println(map.get(key).val);
        }

    }
    public static void helper(Node root,int idx, int level){
        if(root==null) return;
        if (!map.containsKey(idx) || level >= map.get(idx).level) {
            map.put(idx, new Pair(root.data, level));
        }
        helper(root.left,idx-1,level+1);
        helper(root.right,idx+1,level+1);
    }

}
