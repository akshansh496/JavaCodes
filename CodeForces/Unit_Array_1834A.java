
import java.util.*;

public class Unit_Array_1834A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for (int j = 0; j < testcase; j++) {
            int n = sc.nextInt();
            int neg=0;
            int pos=0;
            for (int i = 0; i < n; i++) {
                if(sc.nextInt()==-1) neg++;
                else pos++;
            }

            int ops = 0;
            while (pos < neg) {
                pos++;
                neg--;
                ops++;
            }

            if (neg % 2 == 1) {
                ops++;
            }

            System.out.println(ops);
                    }
    }
}