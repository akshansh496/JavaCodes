
import java.util.Scanner;

public class Kita3ara_Haruki_Gift_433A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            sum += temp;
            if (temp == 100) {
                c++;
            }
        }
        int target = sum / 2;
        if (target % 100 != 0) {
            System.out.println("NO");
            return;
        } else if (target % 200 == 0) {
            System.out.println("YES"); 
        }else if (c >= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
