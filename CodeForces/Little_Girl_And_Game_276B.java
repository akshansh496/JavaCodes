
import java.util.*;

public class Little_Girl_And_Game_276B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int k = 0;
        for (int v : map.values()) {
            if (v % 2 == 1) {
                k++;
            }
        }
        if (k == 0 || k % 2 == 1) {
            System.out.println("First"); 
        }else {
            System.out.println("Second");
        }
    }
}
