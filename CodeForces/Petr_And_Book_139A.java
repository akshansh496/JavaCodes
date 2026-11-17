
import java.util.*;

public class Petr_And_Book_139A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
        int day = 1;
        while (true) {
            n -= arr[day - 1];
            if (n <= 0) {
                System.out.println(day);
                break;
            }
            day++;
            if (day == 8) {
                day = 1;
            }
        }
    }
}
