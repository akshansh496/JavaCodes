
import java.util.*;

public class Jojo_Incredible_Adventure_1820B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            int consecutiveOnes[] = new int[n];
            consecutiveOnes[0] = (s.charAt(0) == '1') ? 1 : 0;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == '1') {
                    consecutiveOnes[i] = 1 + consecutiveOnes[i - 1];
                }
            }
            int max = consecutiveOnes[0];
            for (int i = 1; i < n; i++) {
                max = Math.max(max, consecutiveOnes[i]);
            }
            if (max == n) {
                System.out.println((long) n * n);
                continue;
            }
            int prefix = 0;
            int suffix = 0;

            // Count 1s from beginning
            for (int i = 0; i < n && s.charAt(i) == '1'; i++) {
                prefix++;
            }

            // Count 1s from end
            for (int i = n - 1; i >= 0 && s.charAt(i) == '1'; i--) {
                suffix++;
            }
            max = Math.max(max, prefix + suffix);

            long ans = 0;
            for (int i = 0; i < max; i++) {
                ans = Math.max(ans, (long) (max - i) * (i + 1));
            }
            System.out.println(ans);
        }
    }
}
