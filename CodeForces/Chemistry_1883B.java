
import java.util.Scanner;

public class Chemistry_1883B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int len=n-k;
            if(len<=1){
                System.out.println("YES");
                continue;
            }
            int freq[]=new int[26];
            for(int i=0;i<n;i++){
                freq[s.charAt(i)-'a']++;
            }
            int sum=0;
            for(int i=0;i<26;i++){
                if(freq[i]%2!=0)    sum++;
            }
            if(sum>k+1) System.out.println("NO");
            else    System.out.println("YES");
        }
    }
}
