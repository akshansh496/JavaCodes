package Leetcode;

public class Sum_And_Multiply {
    public static long sumAndMultiply(int n) {
        
        long num=n;
        long sum=0;
        StringBuilder str=new StringBuilder();
        while(num!=0){
            if(num%10!=0){
                sum+=num%10;
                str.append((char)('0'+num%10));
            }  
            num/=10;
        }
        if(str.length()==0) return 0;
        long x = Long.parseLong(str.reverse().toString());
        return x*sum;
    }
    public static void main(String[] args) {
        System.out.println(sumAndMultiply(1020022));
    }
}
