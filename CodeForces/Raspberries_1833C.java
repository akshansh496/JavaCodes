
import java.util.*;

public class Raspberries_1833C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (k != 4) {
                int max = Integer.MIN_VALUE;
                boolean flag = true;
                for (int i = 0; i < n; i++) {
                    if (arr[i] % k == 0) {
                        System.out.println(0);
                        flag = false;
                        break;
                    }
                    max = Math.max(max, arr[i] % k);
                }
                if (flag) {
                    System.out.println(k - max);
                }
            } else {
                boolean flag = true;
                int even = 0;
                int rem3 = 0;

                for (int i = 0; i < n; i++) {
                    if (arr[i] % 4 == 0) {
                        System.out.println(0);
                        flag = false;
                        break;
                    }

                    if (arr[i] % 2 == 0) {
                        even++;
                    }

                    if (arr[i] % 4 == 3) {
                        rem3++;
                    }
                }

                if (flag) {
                    if (even >= 2) {
                        System.out.println(0);
                    } else if (even == 1) {
                        System.out.println(1);
                    } else if (rem3 >= 1) {
                        System.out.println(1);
                    } else {
                        System.out.println(2);
                    }
                }
            }
        }
    }
}
