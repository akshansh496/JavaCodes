
import java.util.Scanner;

public class Odd_Queries_1807D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            int prefix[]=new int[n];
            prefix[0]=sc.nextInt();
            for(int i=1;i<n;i++){
                prefix[i]=sc.nextInt()+prefix[i-1];
            }
            for(int i=0;i<q;i++){
                int l=sc.nextInt()-1;
                int r=sc.nextInt()-1;
                int k=sc.nextInt();
                int segment;
                if (l == 0)
                    segment = prefix[r];
                else
                    segment = prefix[r] - prefix[l-1];
                if((prefix[n-1]-segment+(k*(r-l+1)))%2!=0)    System.out.println("YES");
                else    System.out.println("NO");
            }
        }
    }
}
