
import java.util.*;

public class A_Perfectly_Balanced_String_1673B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
            }
            if (set.size() <= 1) {
                System.out.println("YES");
                continue;
            }
            boolean flag = true;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i - 1) == s.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            for (int i = set.size(); i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(i % set.size())) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("YES"); 
            }else {
                System.out.println("NO");
            }
        }
    }
}
