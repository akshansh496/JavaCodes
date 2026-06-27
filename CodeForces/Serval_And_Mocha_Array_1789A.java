import java.util.*;
public class Serval_And_Mocha_Array_1789A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for (int j = 0; j < testcase; j++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean flag = false;
            outer:
            for (int i = 0; i < n; i++) {
                for (int k = i + 1; k < n; k++) {
                    if (gcd(arr[i], arr[k]) <= 2) {
                        flag = true;
                        break outer;
                    }
                }
            }
            System.out.println(flag ? "Yes" : "No");  
        }
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}