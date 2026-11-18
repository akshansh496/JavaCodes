
import java.util.*;

public class Airport_218B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        int min[] = new int[m];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            max.add(x);
            min[i] = x;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int temp = max.poll();
            sum += temp;
            if (temp-- != 0) {
                max.add(temp);
            }
        }
        System.out.print(sum + " ");
        sum = 0;
        Arrays.sort(min);
        int idx = 0;
        while (n-- > 0) {
            sum += min[idx]--;
            if (min[idx] == 0) {
                idx++;
            }

        }
        System.out.println(sum);
    }
}
