
import java.util.*;

public class Removing_Smallest_Multiples_1734C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    set.add(i + 1);
                }
            }
            long cost = 0;
            for (int i = 1; i <= n; i++) {
                int temp = i;
                while (temp <= n && s.charAt(temp - 1) == '0') {
                    if (set.contains(temp)) {
                        cost += i;
                        set.remove(temp);
                    }
                    temp += i;
                }
            }
            System.out.println(cost);
        }
    }
}
