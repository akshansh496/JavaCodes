import java.util.*;
public class practice3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=0;
        int n=-1;
        while(n!=0){
            n=sc.nextInt();
           if (n>max)
           max=n;
        }
        System.out.println(max);
    }
}
