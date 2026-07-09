
import java.util.Arrays;
import java.util.Scanner;

public class Balanced_Round_1850D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-- > 0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int k=sc.nextInt();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int max=1;
            int c=1;
            for(int i=1;i<n;i++){
                if(arr[i]-arr[i-1]<=k){
                    c++;
                    max=Math.max(max, c);
                }
                else    c=1;
            }
            System.out.println(n-max);
        }
    }
}
