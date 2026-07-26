package Leetcode;

import java.util.HashSet;
import java.util.Objects;

public class Maximum_Area_Rectangle_With_Point_Constraints {
    static int max = -1;

    public static class Info {
        int x;
        int y;

        public Info(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (!(o instanceof Info))
                return false;
            Info p = (Info) o;
            return x == p.x && y == p.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static int maxRectangleArea(int[][] points) {
        HashSet<Info> set = new HashSet<>();
        for (int[] point : points) {
            set.add(new Info(point[0], point[1]));
        }
        for (int t = 0; t < points.length; t++) {
            int x1 = points[t][0];
            int y1 = points[t][1];
            for (int j = t + 1; j < points.length; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];
                if (x1 != x2 && y1 != y2) {
                    if (set.contains(new Info(x1, y2)) && set.contains(new Info(x2, y1))) {
                        int left = Math.min(x1, x2);
                        int right = Math.max(x1, x2);
                        int bottom = Math.min(y1, y2);
                        int top = Math.max(y1, y2);
                        boolean flag = false;
                        for (int i = bottom; i <= top; i++) {
                            for (int k = left; k <= right; k++) {
                                if ((i == bottom && k == left) ||
                                    (i == top && k == left) ||
                                    (i == bottom && k == right) ||
                                    (i == top && k == right))
                                    continue;
                                if (set.contains(new Info(k, i))) {
                                    flag = true;
                                    break;
                                }
                            }
                            if (flag)
                                break;
                        }
                        if (!flag)  max = Math.max(max, (right - left) * (top - bottom));
                    }
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] points={{1,1},{1,3},{3,1},{3,3},{1,2},{3,2}};
        System.out.println(maxRectangleArea(points));
    }
}
