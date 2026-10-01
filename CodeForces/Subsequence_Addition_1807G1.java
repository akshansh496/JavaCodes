
import java.util.*;

public class Subsequence_Addition_1807G1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int c[] = new int[n];
            for (int i = 0; i < n; i++) {
                c[i] = sc.nextInt();
            }
            Arrays.sort(c);
            if (c[0] != 1) {
                System.out.println("NO");
                continue;
            }
            long sum = 1;
            boolean flag = true;
            for (int i = 1; i < n; i++) {
                if (c[i] > sum) {
                    flag = false;
                    break;
                }
                sum += c[i];
            }
            if (!flag) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
