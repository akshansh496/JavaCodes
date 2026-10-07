
import java.util.*;

public class Yet_Another_Card_Deck_1511C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            map.putIfAbsent(x, i + 1);
        }
        for (int i = 0; i < q; i++) {
            int query = sc.nextInt();
            int temp = map.get(query);
            System.out.print(temp + " ");
            for (Integer key : map.keySet()) {
                int x = map.get(key);
                if (x < temp) {
                    map.put(key, x + 1);
                }
            }
            map.put(query, 1);
        }
        System.out.println();

    }
}
