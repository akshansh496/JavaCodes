
import java.util.Scanner;

public class Ambitious_Kid_1866A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int num=Math.abs(sc.nextInt());
            int diff=num-0;
            min=Math.min(min,diff);
        }
        System.out.println(min);
    }
}
