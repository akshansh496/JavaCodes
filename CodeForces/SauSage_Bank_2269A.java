
import java.util.*;

public class SauSage_Bank_2269A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long total_sum = 0;
            while (k-- > 1) {
                total_sum += 2;
                n--;
            }
            total_sum += (1 << n);
            System.out.println(total_sum);
        }
    }
}
