
import java.util.*;

public class Ollya_And_Game_With_Arrays_1859B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int min = Integer.MAX_VALUE;
            ArrayList<Integer>[] arr = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                arr[i] = new ArrayList<>();
                int m = sc.nextInt();
                for (int j = 0; j < m; j++) {
                    int x = sc.nextInt();
                    arr[i].add(x);
                    min = Math.min(x, min);
                }
                Collections.sort(arr[i]);
            }
            int temp[] = new int[n];
            for (int i = 0; i < n; i++) {
                temp[i] = arr[i].get(1);
            }
            Arrays.sort(temp);
            long ans = 0;
            for (int i = 1; i < n; i++) {
                ans += temp[i];
            }
            ans += min;
            System.out.println(ans);
        }
    }
}
