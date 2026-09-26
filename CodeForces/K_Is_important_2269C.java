
import java.util.*;

public class K_Is_important_2269C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            long total_sum = 0;
            while (list.size() >= k) {
                int first = list.get(k - 1);
                int second = list.get(list.size() - k);
                if (first > second) {
                    total_sum += first;
                    list.remove(k - 1);
                } else {
                    total_sum += second;
                    list.remove(list.size() - k);
                }
            }
            System.out.println(total_sum);
        }
    }
}
