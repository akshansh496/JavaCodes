
import java.util.*;

public class AND_Sorting_1682B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            List<Integer> list = new ArrayList<>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (i != x) {
                    list.add(x);
                }
            }
            int ans = list.get(0);
            for (Integer i : list) {
                ans = ans & i;
            }
            System.out.println(ans);
        }
    }
}
