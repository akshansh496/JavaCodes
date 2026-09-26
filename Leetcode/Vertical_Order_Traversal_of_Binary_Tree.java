package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Vertical_Order_Traversal_of_Binary_Tree {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Info {

        int num;
        int row;

        public Info(int num, int row) {
            this.num = num;
            this.row = row;
        }
    }

    Map<Integer, List<Info>> map = new TreeMap<>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        helper(root, 0, 0);
        for (Integer key : map.keySet()) {
            List<Info> list = map.get(key);
            Collections.sort(list, (a, b) -> {
                if (a.row != b.row) {
                    return Integer.compare(a.row, b.row);
                }
                return Integer.compare(a.num, b.num);
            });
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                temp.add(list.get(i).num);
            }
            ans.add(temp);
        }
        return ans;
    }

    public void helper(TreeNode root, int col, int row) {
        if (root == null) {
            return;
        }
        if (!map.containsKey(col)) {
            map.put(col, new ArrayList<>());
        }
        List<Info> list = map.get(col);
        list.add(new Info(root.val, row));
        helper(root.left, col - 1, row + 1);
        helper(root.right, col + 1, row + 1);
    }

    public static void main(String[] args) {

        Vertical_Order_Traversal_of_Binary_Tree obj
                = new Vertical_Order_Traversal_of_Binary_Tree();

        /*
                  3
                 / \
                9   20
                   /  \
                  15   7
         */
        TreeNode root = obj.new TreeNode(3);

        root.left = obj.new TreeNode(9);
        root.right = obj.new TreeNode(20);

        root.right.left = obj.new TreeNode(15);
        root.right.right = obj.new TreeNode(7);

        List<List<Integer>> result = obj.verticalTraversal(root);

        System.out.println(result);
    }
}
