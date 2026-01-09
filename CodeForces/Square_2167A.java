package CodeForces;
import java.util.*;
public class Square_2167A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            t--;
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(a==b && b==c && c==d) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
