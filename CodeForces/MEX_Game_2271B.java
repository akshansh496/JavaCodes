
import java.util.*;

public class MEX_Game_2271B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            boolean flag = true;
            int temp = 0;
            while (map.getOrDefault(temp, 0) >= 2 * k) {
                temp++;
            }
            if (map.getOrDefault(temp, 0) != 2 * k - 1) {
                flag = false;
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
