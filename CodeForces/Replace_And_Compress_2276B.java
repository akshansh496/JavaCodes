
import java.util.*;

public class Replace_And_Compress_2276B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            boolean hasTriple = false;
            boolean hasSingle = false;

            for (int i = 1; i < n - 1; i++) {
                char a = s.charAt(i - 1), b = s.charAt(i), c = s.charAt(i + 1);
                if (a == b && b == c) {
                    hasTriple = true;
                }
                if (a != b && b != c) {
                    hasSingle = true;
                }
            }

            int ans = 1 + (hasTriple ? 1 : 0) + (hasSingle ? 1 : 0);
            System.out.println(ans);
        }
    }
}
