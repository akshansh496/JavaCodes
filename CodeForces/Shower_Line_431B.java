
import java.util.*;

public class Shower_Line_431B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        StringBuilder str = new StringBuilder();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            str.append(i);
            for (int j = 0; j < 5; j++) {
                if (j == i) {
                    continue;
                }
                str.append(j);
                for (int k = 0; k < 5; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    str.append(k);
                    for (int l = 0; l < 5; l++) {
                        if (l == i || l == j || l == k) {
                            continue;
                        }
                        str.append(l);
                        for (int m = 0; m < 5; m++) {
                            if (m == i || m == j || m == k || m == l) {
                                continue;
                            }
                            str.append(m);
                            int solve = arr[i][j] + arr[j][i] + arr[j][k] + arr[k][j] + 2 * arr[k][l] + 2 * arr[l][k] + 2 * arr[l][m] + 2 * arr[m][l];
                            if (solve > max) {
                                max = solve;
                            }
                            str = new StringBuilder();
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}
