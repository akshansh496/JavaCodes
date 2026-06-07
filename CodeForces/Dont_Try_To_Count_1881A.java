
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
            boolean flag=true;
            int count=0;
            while(x.length()<=25){
                if(x.contains(s)){
                    System.out.println(count);
                    flag=false;
                    break;
                }
                x+=x;
                count++;
            }
            if(flag)    System.out.println(-1);
        }
    }
}
