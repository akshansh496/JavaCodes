import java.util.*;
public class sum_odd_numbers {
    public static int sum_odd(int n){
        int s=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0)
            s=s+i;
        }
        return s;
    }
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit");
        int x=sc.nextInt();
        System.out.println(sum_odd(x));
    }
}
