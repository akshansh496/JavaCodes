
import java.util.Scanner;

public class Zero_One_Game_1373B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int len=s.length();
            int zero=0;
            for(int i=0;i<len;i++){
                if(s.charAt(i)!='0')  zero++;
            }
            int one=len-zero;
            int moves=Math.min(one, zero);
            if((moves & 1)!=0)  System.out.println("DA");
            else System.out.println("NET");
        }
    }
}
