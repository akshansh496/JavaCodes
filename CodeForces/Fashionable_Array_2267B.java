
import java.util.*;

public class Fashionable_Array_2267B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
                if (map.get(x) == 1) {
                    pq.add(x);
                }
            }
            while (map.size() != 0) {
                while (pq.size() != 0) {
                    int temp = pq.poll();
                    System.out.print(temp + " ");
                    map.put(temp, map.get(temp) - 1);
                    if (map.get(temp) == 0) {
                        map.remove(temp);
                    }
                }
                for (Integer key : map.keySet()) {
                    pq.add(key);
                }
            }
            System.out.println();
        }
    }
}
