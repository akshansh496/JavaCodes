
import java.util.*;

public class Capital_Of_France_2261B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            HashSet<Integer> set = new HashSet<>();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                set.add(arr[i]);
                max = Math.max(max, arr[i]);
            }
            int maxCopy = max;
            if (n == 1) {
                System.out.println(arr[0]);
                continue;
            }
            if (set.size() == 1) {
                System.out.println(arr[0]);
                continue;
            }
            int bits = 0;
            while (max > 0) {
                bits++;
                max >>= 1;
            }
            System.out.println(bits);
            int temp = (maxCopy - (1 << (bits - 1)) + 1) / 2;
            StringBuilder str = new StringBuilder();
            str.append(1);
            for (int i = 0; i < n; i++) {
                str.append(0);
            }
            System.out.println(str.toString());
            int idx = str.length() - 1;
            while (temp-- > 0 || idx >= 0) {
                str.setCharAt(idx, '1');
                idx--;
                temp--;
            }
            System.out.println(str.toString());
        }
    }
}
