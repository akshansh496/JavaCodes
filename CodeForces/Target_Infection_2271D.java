
import java.util.*;

public class Target_Infection_2271D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            int n = sc.nextInt();
            long m = sc.nextLong();
            long k = sc.nextLong();
            long arr[][] = new long[n][2];
            boolean flag = false;
            long ans = -1;
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextLong();
                arr[i][1] = sc.nextLong();
                if (arr[i][1] - arr[i][0] + 1 == k) {
                    ans = arr[i][0];
                    flag = true;
                }
            }
            if (flag) {
                System.out.println(ans);
                break;
            }
            for (int i = 0; i < n; i++) {
                for (long j = arr[i][0]; j <= Math.min(arr[i + 1][1], j + k); j++) {
                    long infected = arr[i][1] - j + 1;
                    if (arr[i + 1][1] <= arr[i][0] + k)
                }
            }
        }
    }
}
