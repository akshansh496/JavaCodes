
import java.util.Scanner;

public class Dont_Try_To_Count_1881A {
    
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int testacase=sc.nextInt();
        for(int i=0;i<testacase;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String x=sc.next();
            String s=sc.next();
            int count=0;
            int ans=-1;
            while(count<=6){
                if(x.contains(s)){
                    ans=count;
                    break;
                }
                x+=x;
                count++;
            }
            System.out.println(ans);
        }
    }
}

