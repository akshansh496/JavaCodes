
import java.util.*;

public class Erase_First_Or_Second_Letter_1917B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            HashMap<String, Integer> map = new HashMap<>();
            System.out.println(helper(new StringBuilder(s), map));
        }
    }

    public static int helper(StringBuilder str, HashMap<String, Integer> map) {
        if (map.containsKey(str.toString())) {
            return 0;
        }
        if (str.length() == 1) {
            map.put(str.toString(), 1);
            return 1;
        }
        int second = helper(new StringBuilder(str.substring(1)), map);
        StringBuilder newSb = new StringBuilder(str);
        newSb.deleteCharAt(1);
        int first = helper(newSb, map);
        map.put(str.toString(), 1 + first + second);
        return 1 + first + second;
    }
}
