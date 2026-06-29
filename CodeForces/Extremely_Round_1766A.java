
import java.util.Scanner;

public class Extremely_Round_1766A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            int n=sc.nextInt();
            int digits=digits(n);
            int count=9*(digits-1);
            int temp=(int)Math.pow(10,digits-1);
            int c=0;
            for(int i=temp;i<=n;i+=temp){
                count+=1;
            }
            System.out.println(count);
        }
    }
    public static int digits(int n){
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }
}
