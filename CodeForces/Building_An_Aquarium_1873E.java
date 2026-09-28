
import java.util.*;

public class Building_An_Aquarium_1873E {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int arr[] = new int[n];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                max = Math.max(max, arr[i]);
            }
            System.out.println(binarySearch(arr, 1, max + x, x));
        }
    }

    public static int binarySearch(int arr[], int start, int end, int target) {

        while (start < end) {
            int mid = start + (end - start + 1) / 2;
            long sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < mid) {
                    sum += mid - arr[i];
                }
            }
            if (sum <= target) {
                start = mid;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
