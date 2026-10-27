package Leetcode;

import java.util.*;

public class Create_Grid_With_Exactly_One_Path {

    public static String[] createGrid(int m, int n) {
        String[] arr = new String[m];
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < n; i++) {
            temp.append('#');
        }
        for (int i = 0; i < m; i++) {
            StringBuilder temp2 = new StringBuilder(temp);
            if (i >= n - 1) {
                temp2.setCharAt(n - 1, '.');
                arr[i] = temp2.toString();
                continue;
            }
            if (i == m - 1) {
                for (int j = i; j < n; j++) {
                    temp2.setCharAt(j, '.');
                }
                arr[i] = temp2.toString();
                continue;
            }
            temp2.setCharAt(i, '.');
            temp2.setCharAt(i + 1, '.');
            arr[i] = temp2.toString();
        }
        return arr;
    }

    public static void main(String[] args) {
        int m = 6;
        int n = 16;
        String ans[] = createGrid(m, n);
        System.out.println(Arrays.toString(ans));
    }
}
