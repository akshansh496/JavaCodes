
import java.util.Scanner;

public class Traffic_Light_1744C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            char c=sc.next().charAt(0);
            String s=sc.next();
            int start=-1;
            int max=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)==c && start==-1)  start=i;
                if(start!=-1 && s.charAt(i)=='g'){
                    max=Math.max(max,i-start);
                    start=-1;
                } 
            }
            if(start!=-1)   max=Math.max(max,n-start+s.indexOf('g'));
            System.out.println(max);
        }
    }
}
