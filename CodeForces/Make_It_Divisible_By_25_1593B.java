import java.util.*;

public class Make_It_Divisible_By_25_1593B {

    static int solve(String s, char first, char second) {
        int secondPos = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == second) {
                secondPos = i;
                break;
            }
        }
        if (secondPos == -1)
            return Integer.MAX_VALUE;
        for (int i = secondPos - 1; i >= 0; i--) {
            if (s.charAt(i) == first) {
                return (s.length() - 1 - secondPos) + (secondPos - 1 - i);
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int ans = Math.min(
                    Math.min(solve(s, '0', '0'), solve(s, '2', '5')),
                    Math.min(solve(s, '5', '0'), solve(s, '7', '5'))
            );
            System.out.println(ans);
        }
    }
}