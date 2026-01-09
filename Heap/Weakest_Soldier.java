// We are given an mn binary matrix of 1's (soldiers) and O's (civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the O's in each row.
// A row i is weaker than a row j if one of the following is true:
// • The number of soldiers in row i is less than the number of soldiers in row j.
// • Both rows have the same number of soldiers and i < j.
// Find the K weakest rows.
package Heap;

import java.util.*;

public class Weakest_Soldier {
    static class Info implements Comparable<Info> {
        int soldiers;
        int row;

        public Info(int soldiers, int row) {
            this.soldiers = soldiers;
            this.row = row;
        }

        @Override
        public int compareTo(Info i) {
            if (this.soldiers == i.soldiers) {
                return this.row - i.row;
            }
            return this.soldiers - i.soldiers;
        }
    }

    public static void main(String[] args) {
        
        int matrix[][] ={   { 1, 0, 0, 0 },
                            { 1, 1, 1, 1 },
                            { 1, 0, 0, 0 },
                            { 1, 0, 0, 0 } 
                        };
        int k = 2;


        PriorityQueue<Info> pq = new PriorityQueue<>();
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1)
                    count++;
            }
            pq.add(new Info(count, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("Row " + pq.remove().row);
        }

    }
}
