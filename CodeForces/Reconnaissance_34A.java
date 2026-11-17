
import java.util.*;

public class Reconnaissance_34A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int ans = -1;
        for (int i = 1; i < n; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) < min) {
                min = Math.abs(arr[i] - arr[i - 1]);
                ans = i;
            }
        }
        if (Math.abs(arr[0] - arr[n - 1]) < min) {
            System.out.println(1 + " " + n);
            return;
        }
        System.out.println((ans + 1) + " " + ans);
    }
}
