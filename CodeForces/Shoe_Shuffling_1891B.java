
import java.util.*;

public class Shoe_Shuffling_1891B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                arr[i] = x;
                map.putIfAbsent(x, new ArrayList<>());
                map.get(x).add(i + 1);
            }
            boolean flag = false;
            for (Integer key : map.keySet()) {
                if (map.get(key).size() == 1) {
                    System.out.println(-1);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                continue;
            }
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> list = map.get(arr[i]);
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    Integer item = it.next();
                    if ((i + 1) != item) {
                        System.out.print(item + " ");
                        it.remove();
                    }
                }
            }
        }
    }
}
