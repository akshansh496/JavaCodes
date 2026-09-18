
import java.util.*;

public class Valerii_Against_Everyone_1438B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            long a[] = new long[n];
            HashSet<Integer> set = new HashSet<>();
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (set.contains(x)) {
                    flag = true;
                }
                a[i] = (long) Math.pow(2, x);
                set.add(x);
            }
            if (flag) {
                System.out.println("YES"); 
            }else {
                System.out.println("NO");
            }

        }
    }
}
