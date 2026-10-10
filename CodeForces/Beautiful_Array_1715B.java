
import java.util.ArrayList;
import java.util.Scanner;

public class Beautiful_Array_1715B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long b = sc.nextLong();
            long s = sc.nextLong();
            long kb = k * b;
            if (s < kb || s > kb + n * (k - 1)) {
                System.out.println(-1);
                continue;
            }
            ArrayList<Long> list = new ArrayList<>();
            list.add(k * b + Math.min(s - (k * b), k - 1));
            s -= k * b + Math.min(s - (k * b), k - 1);
            while (list.size() != n) {
                if (s <= 0) {
                    list.add(0L);
                } else {
                    list.add(Math.min(k - 1, s));
                    s -= Math.min(k - 1, s);
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }
}
