package Recursion;

public class Practice_Q2 {
    static String printNumber[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public static void main(String[] args) {
        System.out.println(number(1947,""));
    }
    static String number(int n,String str){
        if(n==0)
        return str;
        str=printNumber[n%10]+" "+str;
        return number(n/10,str);

    }
    
}