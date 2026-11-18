
import java.util.*;

public class Even_Odd_318A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long mid = -1;
        if ((n & 1) == 0) {
            mid = n / 2;
        } else {
            mid = n / 2 + 1;
        }
        if (k <= mid) {
            System.out.println(2 * k - 1);
        } else {
            System.out.println(2 * (k - mid));
        }
    }
}
