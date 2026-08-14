
import java.util.Scanner;

public class Ski_Resort_1840C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int q=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]>q)    arr[i]=0;
                else    arr[i]=1;
            }
            int ones=0;
            long ways=0;
            for(int i=0;i<n;i++){
                if(arr[i]==1)   ones++;
                else{
                    long diff=ones-k+1;
                    if(diff>0)  ways += (diff * (diff + 1)) / 2;
                    ones=0;
                }
            }    
            long diff=ones-k+1;
            if(diff>0)  ways += (diff * (diff + 1)) / 2;   
            System.out.println(ways);
        }
    }
}
