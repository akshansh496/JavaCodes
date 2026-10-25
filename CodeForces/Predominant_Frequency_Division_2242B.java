
import java.util.*;

public class Predominant_Frequency_Division_2242B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int one = 0;
            int two = 0;
            int three = 0;
            int idx = 0;
            boolean flag = false;
            while (true) {
                if (idx == n - 1) {
                    break;
                }
                int temp = arr[idx];
                if (temp == 1) {
                    one++;
                }
                if (temp == 2) {
                    two++;
                }
                if (temp == 3) {
                    three++;
                }
                if (!flag && one >= (two + three)) {
                    flag = true;
                }
                if ((flag == true && one < (two + three))) {
                    break;
                }
                idx++;
            }
            if (flag == false) {
                System.out.println("NO");
                continue;
            }
            flag = false;
            one = 0;
            two = 0;
            three = 0;
            while (true) {
                int temp = arr[idx];
                if (temp == 1) {
                    one++;
                }
                if (temp == 2) {
                    two++;
                }
                if (temp == 3) {
                    three++;
                }
                if (!flag && three <= (two + one)) {
                    flag = true;
                }
                if ((flag == true && three > (two + one)) || idx == n - 1) {
                    break;
                }
                idx++;
            }
            if (flag == false) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
        }
    }
}
