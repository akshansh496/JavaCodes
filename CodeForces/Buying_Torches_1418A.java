
import java.util.*;

public class Buying_Torches_1418A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            long sticksRequired = ((long) k * y) + k - 1;
            System.out.println((sticksRequired + x - 2) / (x - 1) + k);
        }
    }
}
