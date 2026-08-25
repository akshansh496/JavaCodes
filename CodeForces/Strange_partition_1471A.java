
import java.util.Scanner;

public class Strange_partition_1471A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            long min=0;
            int i=0;
            long sum=0;
            while(i<n){
                sum+=arr[i++];
            }
            min=(sum + x - 1)/x;
            long max=0;
            i=0;
            while(i<n){
                max+=(arr[i] + x - 1) / x;
                i++;
            }
            System.out.println(min+" "+max);
        }
    }
}
