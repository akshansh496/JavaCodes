
import java.util.*;

public class Little_Elphant_And_Rozdil_205A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        boolean duplicate = false;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == min) {
                duplicate = true;
            }
            if (x < min) {
                min = x;
                ans = i + 1;
                duplicate = false;
            }
        }
        if (duplicate) {
            System.out.println("Still Rozdil");
        } else {
            System.out.println(ans);
        }
    }
}
