
import java.util.*;

public class DejaVu_1891B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int arr[] = new int[n];
            int query[] = new int[q];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                max = Math.max(arr[i], max);
            }
            for (int i = 0; i < q; i++) {
                query[i] = sc.nextInt();
            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < q; i++) {
                if (query[i] >= min) {
                    continue;
                }
                min = query[i];
                int xi = 1 << query[i];
                if (xi > max) {
                    continue;
                }
                for (int j = 0; j < n; j++) {
                    if (arr[j] % xi == 0) {
                        arr[j] += (1 << query[i] - 1);
                        max = Math.max(max, arr[j]);
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
