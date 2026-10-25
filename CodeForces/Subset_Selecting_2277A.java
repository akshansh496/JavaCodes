
import java.util.*;

public class Subset_Selecting_2277A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int freq[] = new int[n + 1];
            for (int i = 0; i < n; i++) {
                freq[sc.nextInt()]++;
            }
            int pool = 0;
            int ans = 0;
            for (int v = 0; v <= n; v++) {
                if (freq[v] == 0) {
                    break;
                }
                pool += freq[v];
                if (pool < k) {
                    break;
                }
                pool -= k;
                ans = v + 1;
            }
            System.out.println(ans);
        }
    }
}
