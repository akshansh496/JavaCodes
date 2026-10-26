
import java.util.*;

public class Playing_In_A_Casion_1808B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            long ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    for (int k = 0; k < m; k++) {
                        ans += Math.abs(arr[i][k] - arr[j][k]);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
