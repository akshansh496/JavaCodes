import java.util.*;

public class alphabet_triangle_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        for (char x = 'A'; x <= c; x++) {
            for (char z = 'A'; z <= x; z++) {
                System.out.print(z);
            }
            System.out.println();
        }
    }
}
