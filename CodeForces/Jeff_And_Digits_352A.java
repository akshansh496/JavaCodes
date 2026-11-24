
import java.util.Scanner;

public class Jeff_And_Digits_352A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int zero = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 0) {
                zero++;
            }
        }
        if (zero == 0) {
            System.out.println(-1);
            return;
        }
        int five = n - zero;
        int temp = five * 5;
        while (temp % 9 != 0 && five > 0) {
            temp -= 5;
            five--;
        }
        if (five == 0) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < five; i++) {
            System.out.print(5);
        }
        for (int i = 0; i < zero; i++) {
            System.out.print(0);
        }
    }
}
