
import java.util.*;

public class Johnny_And_Ancient_Computer_1362A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a > b) {
                helper(a, b);
            } else {
                helper(b, a);
            }
        }
    }

    public static void helper(long a, long b) {
        long num = 0;
        if (a % b != 0) {
            System.out.println(-1);
            return;
        }
        num = a / b;
        if (num > 0 && (num & (num - 1)) == 0) {
            double x = Math.log(num) / Math.log(2);
            System.out.println(((int) x + 2) / 3);
        } else {
            System.out.println(-1);
        }
        return;
    }
}
