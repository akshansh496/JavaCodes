
import java.util.*;

public class Dora_And_Search_1793C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int start = 0;
            int end = n - 1;
            int min = 1;
            int max = n;
            while (start < end) {
                if (arr[start] == min) {
                    start++;
                    min++;
                } else if (arr[start] == max) {
                    start++;
                    max--;
                } else if (arr[end] == max) {
                    end--;
                    max--;
                } else if (arr[end] == min) {
                    end--;
                    min++;
                } else {
                    break;
                }
            }
            if (start >= end) {
                System.out.println(-1);
            } else {
                System.out.println((start + 1) + " " + (end + 1));
            }
        }
    }
}
