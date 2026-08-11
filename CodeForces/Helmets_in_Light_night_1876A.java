
import java.util.Arrays;
import java.util.Scanner;

public class Helmets_in_Light_night_1876A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            int people[] = new int[n];
            int cost[] = new int[n];
            for (int i = 0; i < n; i++) {
                people[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                cost[i] = sc.nextInt();
            }
            int arr[][] = new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = people[i];
            }
            for (int i = 0; i < n; i++) {
                arr[i][1] = cost[i];
            }
            Arrays.sort(arr, (a, b) -> {
                if (a[1] != b[1]) {
                    return Integer.compare(a[1], b[1]);
                }
                return Integer.compare(b[0], a[0]);
            });
            long ans = p;
            int size = 1;
            int idx = 0;
            while (size < n) {
                if (arr[idx][1] >=p) {
                    ans += (long) (n - size) * p;
                    size = n;
                } else {
                    int take = Math.min(arr[idx][0], n - size);

                    ans += (long) arr[idx][1] * take;
                    size += take;
                    idx++;
                }
            }
            System.out.println(ans);
        }
    }
}
