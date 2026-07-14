
import java.util.Scanner;

public class Nikita_And_Books_2244B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-- >0){
            int n=sc.nextInt();
            long prev=0;
            long carry=0;
            boolean flag=false;
            for(int i=0;i<n;i++){
                long curr=sc.nextLong()+carry;
                long need=prev+1;
                if(curr<need){
                    flag=true;
                }
                else{
                    carry=curr-need;
                    prev=need;
                }
            }
            System.out.println(flag ? "NO" : "YES");
        }
    }
}