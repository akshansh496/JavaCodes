
import java.util.*;

public class Did_Not_Go_To_Pront_2275B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            HashSet<Integer> list = new HashSet<>();
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    st.push(i + 1);
                } else if (s.charAt(i) == '2') {
                    if (!st.isEmpty()) {
                        list.add(st.pop());
                    } else {
                        list.add(i + 1);
                    }
                } else {
                    list.add(i + 1);
                }
            }
            int count = 0;
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = 1; i <= n; i++) {
                if (!list.contains(i)) {
                    count++;
                    pq.add(i);
                }
            }
            System.out.println(count);
            while (!pq.isEmpty()) {
                System.out.print(pq.poll() + " ");
            }
            System.out.println();
        }
    }
}
