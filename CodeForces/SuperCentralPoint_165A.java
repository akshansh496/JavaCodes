
import java.util.*;

public class SuperCentralPoint_165A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] p = new int[n][2];
        for (int i = 0; i < n; i++) {
            p[i][0] = sc.nextInt();
            p[i][1] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean left = false, right = false, up = false, down = false;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (p[j][1] == p[i][1]) {
                    if (p[j][0] < p[i][0]) {
                        left = true;
                    }
                    if (p[j][0] > p[i][0]) {
                        right = true;
                    }
                }
                if (p[j][0] == p[i][0]) {
                    if (p[j][1] > p[i][1]) {
                        up = true;
                    }
                    if (p[j][1] < p[i][1]) {
                        down = true;
                    }
                }
            }
            if (left && right && up && down) {
                count++;
            }
        }
        System.out.println(count);
    }
}
