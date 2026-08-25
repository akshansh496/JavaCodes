
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
            if(i==1 && j==1){
                if(m>1) System.out.println(1+" "+2+" "+n+" "+m);
                else if(n>1)    System.out.println(2+" "+1+" "+n+" "+m);
                else    System.out.println(1+" "+1+" "+1+" "+1);
            }
            else if(i==n && j==m){
                if(m>1) System.out.println(1+" "+1+" "+n+" "+(m-1));
                else if(n>1)    System.out.println(1+" "+1+" "+(n-1)+" "+m);
                else    System.out.println(1+" "+1+" "+1+" "+1);
            }
            else{
                System.out.println(1+" "+1+" "+n+" "+m);
            }
        }
    }
}
