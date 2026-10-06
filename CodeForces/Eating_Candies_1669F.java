
import java.util.*;

public class Eating_Candies_1669F {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int prefixSum[] = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                prefixSum[i] = sum + arr[i];
                sum = prefixSum[i];
            }
            sum = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[n - i - 1];
                int idx = binarySearch(prefixSum, 0, n - 1, sum);
                if (idx == -1) {
                    continue;
                }
                if (idx < n - i - 1) {
                    max = Math.max(max, i + idx + 2);
                }
            }
            System.out.println(max);
        }
    }

    public static int binarySearch(int arr[], int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
