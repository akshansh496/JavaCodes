import java.util.*;
public class HCF_LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int HCF=hcf(a,b);
        System.out.println("HCF="+HCF);
        int LCM=(a*b)/HCF;
        System.out.println("LCM="+LCM);
    }
    public static int hcf(int x,int y){
        if (x==y)
        return x;
        else if(x>y){
            return hcf(x-y,y);
        }
        else{
            return hcf(x,y-x);
        }
    }
    }
