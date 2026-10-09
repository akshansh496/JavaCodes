
import java.util.*;

public class Distinct_Split_1791D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(s.charAt(i), i);
            }
            int total = map.size();
            int temp = total;
            HashSet<Character> set = new HashSet<>();
            int ans = map.size();
            for (int i = 0; i < n; i++) {
                for (Character key : map.keySet()) {
                    if (map.get(key) == i) {
                        total--;
                    }
                }
                set.add(s.charAt(i));
                ans = Math.max(ans, set.size() + total);
            }
            System.out.println(ans);
        }
    }
}
