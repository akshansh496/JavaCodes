import java.util.*;

public class Add_And_Divide_1485A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b>a){
                System.out.println(1);
                continue;
            }
            int ans = Integer.MAX_VALUE;

            for (int i = b; i <= b + 10 && i<=a; i++) {

                if (i == 1)
                    continue;

                int temp = a;
                int op = i - b;

                while (temp != 0) {
                    temp /= i;
                    op++;
                }

                ans = Math.min(ans, op);
            }
            if(ans!=Integer.MAX_VALUE)  System.out.println(ans);
            else System.out.println(2);
        }
    }
}