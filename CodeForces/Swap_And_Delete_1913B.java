
import java.util.Scanner;

public class Swap_And_Delete_1913B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String n=sc.next();
            int zero=0;
            int one=0;
            for(int i=0;i<n.length();i++){
                if(n.charAt(i)=='0')    zero++;
                else    one++;
            }
            int onePrefix=0,zeroPrefix=0,m=0;
            for(int i=0;i<n.length();i++){
                if(n.charAt(i)=='0')   zeroPrefix++;
                else    onePrefix++;
                if(zeroPrefix<=one && onePrefix<=zero)  m=i+1;
                else break;
            }
            System.out.println(n.length()-m);
        }
    }
}
