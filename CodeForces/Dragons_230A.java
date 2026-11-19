
import java.util.*;

public class Dragons_230A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) {
                return b[0] - a[0];
            }
            return a[0] - b[0];
        });
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (s <= arr[i][0]) {
                flag = false;
                break;
            }
            s += arr[i][1];
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
