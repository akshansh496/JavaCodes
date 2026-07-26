
import java.util.*;

public class Threshold_Movement_2250A {

    static int copy[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (n == 1 || n % 2 != 0) {
                System.out.println("NO");
                continue;
            }
            if (helper2(arr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean helper2(int arr[]) {
        int n = arr.length;
        int minOdd = Integer.MAX_VALUE;
        int maxEven = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i += 2) {
            minOdd = Math.min(minOdd, arr[i]);
        }

        for (int i = 1; i < arr.length; i += 2) {
            maxEven = Math.max(maxEven, arr[i]);
        }
        if (minOdd - maxEven > 1) {
            return true;
        }
        return false;
    }

}
