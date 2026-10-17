
import java.util.*;

public class Capital_Of_France_2261B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            HashSet<Integer> set = new HashSet<>();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                set.add(arr[i]);
                max = Math.max(max, arr[i]);
            }
            if (n == 1) {
                System.out.println(arr[0]);
                continue;
            }
            if (set.size() == 1) {
                System.out.println(arr[0]);
                continue;
            }
            int bits = 0;
            while (max > 0) {
                bits++;
                max >>= 1;
            }
            System.out.println((1 << bits) - 1);
        }
    }
}
