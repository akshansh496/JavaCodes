import java.util.*;
public class DigitCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int count=0;
        while (n!=0){
            int r=n%10;
            if (r==x)
            count+=1;
            n=n/10;
        }
        System.out.println("Frequency:"+count);
    }
}
