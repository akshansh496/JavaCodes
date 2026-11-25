
import java.util.*;

public class Comparing_Strings_186A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.length() != s2.length()) {
            System.out.println("NO");
            return;
        }

        int count = 0;
        int first = -1, second = -1;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;

                if (first == -1) {
                    first = i;
                } else {
                    second = i;
                }
            }
        }

        if (count == 2
                && s1.charAt(first) == s2.charAt(second)
                && s1.charAt(second) == s2.charAt(first)) {

            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
