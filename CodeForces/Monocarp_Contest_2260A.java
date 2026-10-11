
import java.util.*;

public class Monocarp_Contest_2260A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) {
                    count++;
                }
            }
            if (count < 2) {
                System.out.println(-1);
                continue;
            }
            int op = 0;
            if (arr[0] != 0) {
                op++;
            }
            if (arr[n - 1] != 0) {
                op++;
            }
            System.out.println(op);
        }
    }
}
