
import java.util.*;

public class Counting_Orders_1827A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int aPointer = 0;
            int bPointer = 0;
            int count = 0;
            long mod = 1000000007;
            long ans = 1;
            while (aPointer < n) {
                while (bPointer < n && b[bPointer] < a[aPointer]) {
                    count++;
                    bPointer++;
                }
                ans = (ans * (count - aPointer)) % 1000000007;
                aPointer++;
            }
            System.out.println(ans);
        }
    }
}
