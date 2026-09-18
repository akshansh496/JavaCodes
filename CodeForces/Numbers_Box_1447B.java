
import java.util.*;

public class Numbers_Box_1447B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int min = Integer.MAX_VALUE;
            int totalSum = 0;
            int neg = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int x = sc.nextInt();
                    if (x < 0) {
                        neg++;
                    }
                    min = Math.min(min, Math.abs(x));
                    totalSum += Math.abs(x);
                }
            }
            if (neg % 2 == 0) {
                System.out.println(totalSum); 
            }else {
                System.out.println(totalSum - (2 * min));
            }
        }
    }
}
