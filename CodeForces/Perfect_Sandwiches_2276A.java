
import java.util.*;

public class Perfect_Sandwiches_2276A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b >= a) {
                System.out.println(-1);
                continue;
            }
            System.out.println(Math.min(b, a - b));
        }
    }
}
