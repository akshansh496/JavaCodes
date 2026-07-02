
import java.util.Scanner;
// here we will denote xor with ^
// Let a={a1,a2,.....an}
// so,b={b1,b2,.....bn}={a1^x,a2^x,.....an^x}
// and we want to prove that b1^b2^....bn=0
// i.e. a1^x^a2^x^.....^an^x=0
// for even no. of elements, x^x....^x=0 so it will be a1^a2^....^an=0 but if a1^a2^...^an doesn't give zero then x will be -1
// for odd no. of elements, x^x^....^x=x so it will be a1^a2^....^an^x=0
public class We_Need_the_Zero_1805A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            int n=sc.nextInt();
            int total=0;
            for(int i=0;i<n;i++){
                total^=sc.nextInt();
            }
            if(n%2==0){
                if(total==0){
                    System.out.println(0);
                    continue;
                }   
                else{
                    System.out.println(-1);
                    continue;
                }
            }
            else{
                System.out.println(total);
            }
        }
    }
}
