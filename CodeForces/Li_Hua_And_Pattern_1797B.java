
import java.util.*;

public class Li_Hua_And_Pattern_1797B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int count = 0;
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] != arr[n - i - 1][n - j - 1]) {
                        count++;
                    }
                }
            }
            if (n % 2 == 1) {
                int mid = n / 2;

                for (int j = 0; j < n / 2; j++) {
                    if (arr[mid][j] != arr[mid][n - j - 1]) {
                        count++;
                    }
                }
            }
            if (count > k) {
                System.out.println("NO");
            } else if (n % 2 == 1) {
                System.out.println("YES");
            } else if ((k - count) % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
