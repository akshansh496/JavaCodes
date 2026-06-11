
import java.util.Scanner;

public class Goals_Of_Victory_1877A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            int n=sc.nextInt();
            int flag=0;
            for(int i=0;i<n-1;i++){
                flag+=sc.nextInt();
            }
            System.out.println(flag*-1);
        }
    }
}
