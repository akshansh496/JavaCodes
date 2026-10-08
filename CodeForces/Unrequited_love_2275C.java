
import java.util.*;

public class Unrequited_love_2275C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
            int count = 0;
            int[] lv = new int[Math.max(0, n - 4)];   // CHANGED: store love values
            for (int i = 0; i < n - 4; i++) {
                int love = arr[i] + arr[i + 2] - arr[i + 4];
                lv[i] = love;                          // CHANGED
                map.putIfAbsent(love, new ArrayList<>());
                map.get(love).add(i);
            }
            long ans = 0;

            for (ArrayList<Integer> list : map.values()) {
                long c = list.size();
                ans += c * (c - 1) / 2;
            }

            // CHANGED: subtract pairs whose index difference is exactly 2 or 4
            for (int i = 0; i < lv.length; i++) {
                if (i + 2 < lv.length && lv[i] == lv[i + 2]) {
                    ans--;
                }
                if (i + 4 < lv.length && lv[i] == lv[i + 4]) {
                    ans--;
                }
            }

            System.out.println(ans);
        }
    }
}
