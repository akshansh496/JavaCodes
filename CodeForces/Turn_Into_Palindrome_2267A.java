
import java.util.*;

public class Turn_Into_Palindrome_2267A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();
            int left = 0;
            int right = n - 1;
            int coin = 0;
            while (left <= right) {
                if (s.charAt(left) != s.charAt(right)) {
                    if (s.charAt(left) == c || s.charAt(right) == c) {
                        coin++;
                    } else {
                        coin += 2;
                    }
                }
                left++;
                right--;
            }
            System.out.println(coin);
        }
    }
}
