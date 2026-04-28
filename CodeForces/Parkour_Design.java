
import java.util.*;

public class Parkour_Design {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if ((x - 4*y) % 3 == 0 && x >= 2*y) {
                System.out.println("No");
            } else {
                System.out.println("YES");
            }
        }
    }
}