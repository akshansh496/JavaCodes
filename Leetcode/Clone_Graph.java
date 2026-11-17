package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Clone_Graph {

    static class Node {

        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<>();
        }
    }
    static Node[] cloned = new Node[101];

    public static Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        return dfs(node);
    }

    public static Node dfs(Node node) {
        if (cloned[node.val] != null) {
            return cloned[node.val];
        }
        Node copy = new Node(node.val);
        cloned[node.val] = copy;
        for (Node neighbor : node.neighbors) {
            copy.neighbors.add(dfs(neighbor));
        }
        return copy;
    }

    public static void main(String[] args) {
        // 1 - 2, 2 - 3, 3 - 4, 4 - 1 (square)
        Node n1 = new Node(1), n2 = new Node(2), n3 = new Node(3), n4 = new Node(4);
        n1.neighbors.add(n2);
        n1.neighbors.add(n4);
        n2.neighbors.add(n1);
        n2.neighbors.add(n3);
        n3.neighbors.add(n2);
        n3.neighbors.add(n4);
        n4.neighbors.add(n1);
        n4.neighbors.add(n3);

        Node copy = new Clone_Graph().cloneGraph(n1);
        System.out.println(copy != n1);                       // true: different object
        System.out.println(copy.val);                         // 1
        System.out.println(copy.neighbors.get(0).val);        // 2
        System.out.println(copy.neighbors.get(0) != n2);      // true: neighbors are clones too
    }
}
