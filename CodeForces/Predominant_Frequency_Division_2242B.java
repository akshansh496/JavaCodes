
import java.util.Scanner;

public class Predominant_Frequency_Division_2242B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int one=0;
            int two=0;
            int three=0;
            if(arr[0]==1)   one++;
            else if(arr[0]==2)   two++;
            else if(arr[0]==3)  three++;
            int i=1;
            while(i<n){
                if(arr[i]==3 && one>=(two+three+1)){
                    i++;
                    continue;
                } 
                if(one>=(two+three))   break;
                if(arr[i]==1)   one++;
                else if(arr[i]==2)   two++;
                else if(arr[i]==3)  three++;
                i++;
            }
            if(i>=n-1){
                System.out.println("No");
                continue;
            }
            one=0;
            two=0;
            three=0;
            if(arr[i]==1)   one++;
            else if(arr[i]==2)   two++;
            else if(arr[i]==3)  three++;
            i++;
            while(i<n){
                if((one+two)>=three)   break;
                if(arr[i]==1)   one++;
                else if(arr[i]==2)   two++;
                else if(arr[i]==3)  three++;
                i++;
            }
            if(i<n-1)  System.out.println("YES");
            else    System.out.println("NO");
        }
    }
}
