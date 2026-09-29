
import java.util.*;

public class Sort_The_Subarray_1821B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            int l = -1, r = -1;
            for (int i = 0; i < n; i++) {
                if ((a[i] != b[i]) && l == -1) {
                    l = i;
                    continue;
                } else if (a[i] != b[i]) {
                    r = i;
                }
            }
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = l; i <= r; i++) {
                min = Math.min(min, a[i]);
                max = Math.max(max, a[i]);
            }
            while (l - 1 >= 0 && a[l - 1] <= min) {
                min = Math.min(min, a[l - 1]);
                l--;
            }
            while (r + 1 < n && a[r + 1] >= max) {
                max = Math.max(max, a[r + 1]);
                r++;
            }
            System.out.println((l + 1) + " " + (r + 1));
        }
    }
}
