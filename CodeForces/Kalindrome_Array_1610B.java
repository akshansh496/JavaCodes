
import java.util.*;

public class Kalindrome_Array_1610B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int left = 0;
            int right = n - 1;
            boolean flag = true;
            while (left <= right) {
                if (arr[left] == arr[right]) {
                    left++;
                    right--;
                } else {
                    flag = false;
                    if (helper(arr, left, right, arr[left]) || helper(arr, left, right, arr[right])) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                    break;
                }
            }
            if (flag) {
                System.out.println("YES");
            }
        }
    }

    public static boolean helper(int arr[], int start, int end, int x) {
        while (start <= end) {
            if (arr[start] == x) {
                start++;
            } else if (arr[end] == x) {
                end--;
            } else {
                if (arr[start] != arr[end]) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
