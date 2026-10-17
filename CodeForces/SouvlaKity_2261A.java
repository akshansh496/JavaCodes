
import java.util.*;

public class SouvlaKity_2261A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int countOnes = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    countOnes++;
                    max = Math.max(max, i + 1);
                    min = Math.min(min, i + 1);
                }
            }
            if (countOnes == 1) {
                System.out.println(0);
                continue;
            } else if (countOnes == 2) {
                System.out.println(1);
                continue;
            } else {
                System.out.println(max - min);
            }
        }
    }
}
