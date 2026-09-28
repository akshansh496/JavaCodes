
import java.util.*;

public class Two_D_Travelling_1869B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            long arr[][] = new long[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextLong();
                arr[i][1] = sc.nextLong();
            }
            long min = Long.MAX_VALUE;
            min = Math.min(min, Math.abs(arr[a - 1][0] - arr[b - 1][0]) + Math.abs(arr[a - 1][1] - arr[b - 1][1]));
            long closestMajorCityToA = Long.MAX_VALUE;
            long closestMajorCityToB = Long.MAX_VALUE;
            for (int i = 0; i < k; i++) {
                closestMajorCityToA = Math.min(closestMajorCityToA, Math.abs(arr[a - 1][0] - arr[i][0]) + Math.abs(arr[a - 1][1] - arr[i][1]));
                closestMajorCityToB = Math.min(closestMajorCityToB, Math.abs(arr[b - 1][0] - arr[i][0]) + Math.abs(arr[b - 1][1] - arr[i][1]));
            }
            if (k > 0) {
                min = Math.min(min, closestMajorCityToA + closestMajorCityToB);
            }
            System.out.println(min);
        }
    }
}
