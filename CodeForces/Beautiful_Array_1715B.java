
import java.util.Scanner;

public class Beautiful_Array_1715B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int b=sc.nextInt();
            int s=sc.nextInt();
            if(k*b>s){
                System.out.println(-1);
                break;
            }
        }
    }
}
