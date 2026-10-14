
import java.util.*;

public class Subarrays_2276C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            HashMap<Integer, List<Integer>> map = new HashMap<>();
            map.put(0, new ArrayList<>());
            List<Integer> list = map.get(0);
            list.add(-1);
            int sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
                int rem = ((sum % k) + k) % k;
                if (map.containsKey(rem)) {
                    List<Integer> l = map.get(rem);
                    for (Integer x : l) {
                        if (i - x > k) {
                            count++;
                        }
                    }
                }
                map.putIfAbsent(rem, new ArrayList<>());
                map.get(rem).add(i);
            }
            System.out.println(count);
        }
    }
}
