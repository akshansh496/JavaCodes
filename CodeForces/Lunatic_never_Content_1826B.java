
import java.util.*;

public class Lunatic_never_Content_1826B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int gcd[] = new int[n / 2];
            for (int i = 0; i < n / 2; i++) {
                gcd[i] = Math.abs(arr[i] - arr[n - i - 1]);
            }
            int ans = 0;

            for (int i = 0; i < n / 2; i++) {
                int diff = Math.abs(arr[i] - arr[n - i - 1]);
                ans = helper(ans, diff);
            }
            System.out.println(ans);
        }
    }

    public static int helper(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
