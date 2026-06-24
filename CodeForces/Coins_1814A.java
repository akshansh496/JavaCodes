
import java.util.Scanner;

public class Coins_1814A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            long n=sc.nextLong();
            long k=sc.nextLong();
            if(n%2==0){
                System.out.println("YES");
                continue;   
            }
            else{
                if(k%2==0)  System.out.println("NO");
                else    System.out.println("YES");
            }
        }
    }
}
