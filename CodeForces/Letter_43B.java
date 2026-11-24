
import java.util.*;

public class Letter_43B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String heading = sc.nextLine();
        String text = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < heading.length(); i++) {
            char x = heading.charAt(i);
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        boolean flag = true;
        for (int i = 0; i < text.length(); i++) {
            char x = text.charAt(i);
            if (x == ' ') {
                continue;
            }
            if (map.getOrDefault(x, 0) > 0) {
                map.put(x, map.get(x) - 1);
            } else {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
