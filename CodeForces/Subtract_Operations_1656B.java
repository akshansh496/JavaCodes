
import java.util.*;

public class Subtract_Operations_1656B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            HashSet<Long> set = new HashSet<>();
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                if (set.contains(x - k) || set.contains(x + k)) {
                    flag = true;
                }
                set.add(x);
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
