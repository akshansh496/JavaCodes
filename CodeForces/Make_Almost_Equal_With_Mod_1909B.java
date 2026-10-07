
import java.util.*;

public class Make_Almost_Equal_With_Mod_1909B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            boolean odd = false;
            boolean even = false;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                if ((arr[i] & 1) == 0) {
                    even = true;
                } else {
                    odd = true;
                }
            }
            if (n == 2) {
                long d = Math.abs(arr[0] - arr[1]);
                long k = 2;
                while (d % k == 0) {
                    k *= 2;
                }
                System.out.println(k);
                continue;
            }
            if (odd && even) {
                System.out.println(2);
                continue;
            }
            Arrays.sort(arr);
            HashSet<Long> possibles = new HashSet<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    possibles.add(arr[i] - arr[j]);
                }
            }
            possibles.remove(0);
            for (Long p : possibles) {
                HashSet<Long> ans = new HashSet<>();
                for (int i = 0; i < n; i++) {
                    ans.add(arr[i] % p);
                    if (ans.size() > 2) {
                        break;
                    }
                }
                if (ans.size() == 2) {
                    System.out.println(p);
                    break;
                }
            }
        }
    }
}
