
import java.util.*;

public class BasketBall_Together_1725B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int d=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int lastIdx=n-1;
            int firstIdx=0;
            int count=0;
            while(firstIdx<=lastIdx){
                int need=d/arr[lastIdx];
                if(lastIdx-firstIdx>=need){
                    count++;
                    firstIdx+=need;
                    lastIdx--;
                }
                else    lastIdx--;
            }
            System.out.println(count);
        
    }
}
