
import java.util.*;

public class Negatives_And_Positives_1791E {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int neg = 0;
            int zero = 0;
            long total_sum = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x < 0) {
                    neg++;
                }
                if (x == 0) {
                    zero++;
                }
                arr[i] = Math.abs(x);
                total_sum += arr[i];
            }
            if ((neg & 1) == 0) {
                System.out.println(total_sum);
                continue;
            } else {
                if (zero > 0) {
                    System.out.println(total_sum);
                    continue;
                }
            }
            Arrays.sort(arr);
            System.out.println(total_sum - 2 * arr[0]);
        }
    }
}
