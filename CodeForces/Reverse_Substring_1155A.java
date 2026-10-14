
import java.util.*;

public class Reverse_Substring_1155A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int lastseen[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastseen[s.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - 'a';
            for (int j = 0; j < temp; j++) {
                if (lastseen[j] > i) {
                    System.out.println("YES");
                    System.out.print((i + 1) + " " + (lastseen[j] + 1));
                    System.out.println();
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
