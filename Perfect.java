import java.util.*;
public class Perfect {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i;
        int sum=0;
        for(i=1;i<n;i++){
            if(n%i==0)
            sum+=i;
        }
        System.out.println(sum);
        if (sum==n)
        System.out.println(n+" is a perfect number");
        else
        System.out.println(n+" isn't a perfect number");
    }
}
