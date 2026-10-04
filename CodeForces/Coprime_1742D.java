
import java.util.*;

public class Coprime_1742D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int lastSeen[] = new int[1001];
            Arrays.fill(lastSeen, -1);
            for (int i = 0; i < n; i++) {
                lastSeen[sc.nextInt()] = i + 1;
            }
            int ans = -1;
            for (int i = 1; i <= 1000; i++) {
                if (lastSeen[i] == -1) {
                    continue;
                }
                for (int j = 1; j <= 1000; j++) {
                    if (lastSeen[j] == -1) {
                        continue;
                    }
                    if (gcd(i, j) == 1) {
                        ans = Math.max(ans, lastSeen[i] + lastSeen[j]);
                    }
                }
            }
            System.out.println(ans);
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
