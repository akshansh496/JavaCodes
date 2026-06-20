
import java.util.Scanner;

public class GrassHopper_On_A_Line_1837A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(n%k!=0){
                System.out.println(1);
                System.out.println(n);
            }
            else{
                System.out.println(2);
                System.out.print(n-1+" "+1);
                System.out.println();
            }
        }
    }
}
