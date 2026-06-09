
import java.util.Scanner;
public class How_Much_Does_Daytona_Cost_1878A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testacase=sc.nextInt();
        for(int j=0;j<testacase;j++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            boolean  flag=false;
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if(x==k)  flag=true;
            }
            if(flag)    System.out.println("YES");
            else    System.out.println("NO");
        }
    }
}
