
import java.util.Scanner;

public class Sum_Of_Medians_1440B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n*k];
            for(int i=0;i<n*k;i++){
                arr[i]=sc.nextInt();
            }
            int skip = n - (n + 1) / 2 + 1;
            int idx = n * k - skip;

            long sum = 0;

            for (int i = 0; i < k; i++) {
                sum += arr[idx];
                idx -= skip;
            }

            System.out.println(sum);
        }
    }
}
