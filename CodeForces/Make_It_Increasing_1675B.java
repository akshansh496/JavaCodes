
import java.util.Scanner;

public class Make_It_Increasing_1675B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            if(n==1){
                System.out.println(0);
                continue;
            }
            if(arr[n-1]<n-1){
                System.out.println(-1);
                continue;
            }
            int count=0;
            for(int i=n-2;i>=0;i--){
                while(arr[i]>=arr[i+1] && arr[i] > 0){
                    arr[i]/=2;
                    count++;
                }
                if (arr[i] >= arr[i+1]) {
                    count = -1;
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
