
import java.util.*;

public class Assembly_Via_Minimums_1857C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int bLength = n * (n - 1) / 2;
            int[] b = new int[bLength];
            for (int i = 0; i < bLength; i++) {
                b[i] = sc.nextInt();
            }
            Arrays.sort(b);
            int ans[] = new int[n];
            int idx = 0, i = 0;
            for (int step = n - 1; step >= 1; step--) {
                ans[idx++] = b[i];
                i += step;
            }
            ans[n - 1] = ans[n - 2];
            for (int j = 0; j < n; j++) {
                System.out.print(ans[j] + " ");
            }
            System.out.println();
        }
    }
}
