
import java.util.Scanner;

public class Cover_In_Water_1900A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            int n=sc.nextInt();
            String s=sc.next();
            int count=0;
            int continuousEmpty=0;
            boolean flag=true;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='.')    continuousEmpty++;
                if(s.charAt(i)=='#' || i==n-1){
                    if(continuousEmpty==0){
                        continue;
                    }
                    else if(continuousEmpty==1 || continuousEmpty==2)   count+=continuousEmpty;
                    else if(continuousEmpty>=3)  {
                        System.out.println(2);
                        flag=false;
                        break;
                    }
                    continuousEmpty=0;
                }
            }
            if(flag)
            System.out.println(count);
        }
    }
}
