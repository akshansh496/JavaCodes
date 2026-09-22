
import java.util.*;

public class And_Or_Sort_2266C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String s = sc.next();
            if (s.charAt(0) == '1') {
                int ans = 0;
                for (int i = 1; i < n; i++) {
                    char c = s.charAt(i);
                    if (c == '0') {
                        ans++;
                    }
                }
                System.out.println(ans);
                continue;
            }
            int zeros = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    zeros++;
                }
            }

            int ones = 0;
            int ans = n;

            for (int i = 0; i < n; i++) {

                if (s.charAt(i) == '0') {
                    zeros--;
                } else {
                    ones++;
                }

                int operations = ones + zeros;

                ans = Math.min(ans, operations);
            }

            System.out.println(ans);
        }
    }
}
