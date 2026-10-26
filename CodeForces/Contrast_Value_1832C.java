
import java.util.*;

public class Contrast_Value_1832C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] c = new int[n];
            int m = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (m == 0 || c[m - 1] != x) {
                    c[m++] = x;
                }
            }
            int ans;
            if (m == 1) {
                ans = 1;
            } else {
                ans = 2;                 // both endpoints are always kept
                for (int i = 1; i < m - 1; i++) {
                    boolean up = c[i] > c[i - 1];
                    boolean upNext = c[i + 1] > c[i];
                    if (up != upNext) {
                        ans++;   // peak or valley
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
