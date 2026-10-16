
import java.util.*;

public class Riptide_2254A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(Math.min(Math.abs(a - b), Math.min(Math.abs(a - c), Math.abs(b - c))));
        }
    }
}
