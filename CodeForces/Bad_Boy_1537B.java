
import java.util.Scanner;

public class Bad_Boy_1537B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int i=sc.nextInt();
            int j=sc.nextInt();
            if(n-i>=i)   System.out.print(n+" "+"1"+" ");
            else    System.out.print(i+" "+"1"+" ");
            if(m-j>=j)   System.out.print("1"+" "+m);
            else    System.out.print("1"+" "+j);
            System.out.println();
        }
    }
}
