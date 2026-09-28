
import java.util.*;

public class CardBoard_For_Pictures_1850E {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            long start = 1;
            long end = 1000000000L;
            while (start <= end) {
                long mid = start + (end - start) / 2;
                long sum = 0;
                for (int i = 0; i < n; i++) {
                    long side = arr[i] + 2 * mid;
                    sum += side * side;
                    if (sum > c) {
                        break;
                    }
                }
                if (sum > c) {
                    end = mid - 1;
                } else if (sum < c) {
                    start = mid + 1;
                } else {
                    System.out.println(mid);
                    break;
                }
            }
        }
    }
}
