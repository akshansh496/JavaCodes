
import java.util.*;

public class Fun_With_Even_Arrays_1631B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (n == 1) {
                System.out.println(0);
                continue;
            }
            int idx = n - 1;
            int temp = 0;
            int op = 0;
            int target = arr[n - 1];
            while (idx >= 0) {
                while (idx >= 0 && arr[idx] == target) {
                    temp++;
                    idx--;
                }
                if (idx < 0) {
                    break;
                }
                idx -= temp;
                temp = n - 1 - idx;
                op++;
            }
            System.out.println(op);
        }
    }
}
