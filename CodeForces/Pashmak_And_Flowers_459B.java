
import java.util.*;

public class Pashmak_And_Flowers_459B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];
        System.out.print(ans + " ");
        HashMap<Integer, Integer> map = new HashMap<>();
        long ways = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i] - ans)) {
                ways += map.get(arr[i] - ans);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(ways);
    }
}
