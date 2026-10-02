
import java.util.*;

public class Teleporters_1791G1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            PriorityQueue<Long> pq = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                pq.add((sc.nextLong()) + (i + 1));
            }
            int count = 0;
            while (c > 0 && !pq.isEmpty()) {
                long temp = pq.poll();
                if (temp > c) {
                    break;
                }
                c -= temp;
                count++;
            }
            System.out.println(count);
        }
    }
}
