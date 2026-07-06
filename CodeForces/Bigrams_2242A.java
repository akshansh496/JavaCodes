
import java.util.Scanner;

public class Bigrams_2242A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            int k=sc.nextInt();
            int freq[]=new int[k];
            int count=0;
            boolean flag=false;
            for(int i=0;i<k;i++){
                freq[i]=sc.nextInt();
                if(freq[i]>2)   flag=true;
                if(freq[i]>1)   count++;
            }
            if(k==1 && freq[0]>2){
                System.out.println("YES");
                continue;
            }
            if(count>=2 || flag)    System.out.println("YES");
            else    System.out.println("NO");
        }
    }
}
