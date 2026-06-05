import java.util.Scanner;

public class Jagged_Swaps_1896A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            int n=sc.nextInt();
            int first = sc.nextInt();

            for (int i = 1; i < n; i++) {
                sc.nextInt();
            }

            System.out.println(first == 1 ? "YES" : "NO");
            
        }
    }
}
