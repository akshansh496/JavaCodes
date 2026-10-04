
import java.util.*;

public class DIfference_Of_GCDs_1708B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans[] = new int[n];
            boolean flag = true;
            for (int i = 1; i <= n; i++) {
                int x = ((l + i - 1) / i) * i;
                if (x > r) {
                    flag = false;
                    break;
                }
                ans[i - 1] = x;
            }
            if (!flag) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
