
import java.util.*;

public class Vika_And_The_Bridge_1848B {

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
            if (k == 1) {
                System.out.println(0);
                continue;
            }
            for (int i = 0; i <= n / 2; i++) {
                boolean flag = true;
                HashMap<Integer, Integer> map = new HashMap<>();
                for (int j = i; j < n; j += (i + 1)) {
                    map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
                    if (map.size() > 2) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    int count = 0;
                    for (Integer key : map.keySet()) {
                        if (map.get(key) > 1) {
                            count++;
                        }
                    }
                    if (count >= 2) {
                        continue; 
                    }else {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}
