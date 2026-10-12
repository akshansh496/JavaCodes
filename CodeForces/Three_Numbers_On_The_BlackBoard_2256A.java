
import java.util.*;

public class Three_Numbers_On_The_BlackBoard_2256A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int min = Math.max(Math.abs(a - c), Math.max(Math.abs(a - b), Math.abs(b - c)));
            if (min == 0) {
                System.out.println(0);
                continue;
            }
            min = Math.min(min, a + b - Math.min(a, b));
            min = Math.min(min, a + c - Math.min(a, c));
            min = Math.min(min, b + c - Math.min(b, c));
            System.out.println(min);
        }
    }
}
