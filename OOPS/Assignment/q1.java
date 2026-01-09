package OOPS.Assignment;
import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real part of 1st number");
        int r1=sc.nextInt();
        System.out.println("Enter imaginary part of 1st number");
        int i1=sc.nextInt();
        System.out.println("Enter real part of 2nd number");
        int r2=sc.nextInt();
        System.out.println("Enter imaginary part of 2nd number");
        int i2=sc.nextInt();
        Complex obj=new Complex();
        obj.assign(r1, r2, i1, i2);
        obj.sum();
        obj.diff();
        obj.prod();
    }
}
class Complex{
    int r1,r2,i1,i2;
    public void assign(int r1,int r2,int i1,int i2){
        this.r1=r1;
        this.r2=r2;
        this.i1=i1;
        this.i2=i2;
    }
    public void sum(){
        int real=r1+r2;
        int imaginary=i1+i2;
        System.out.println("SUM:"+real+"+"+imaginary+"i");
    }
    public void diff(){
        int real=r1-r2;
        int imaginary=i1-i2;
        System.out.println("DIFFERENCE:"+real+"+"+imaginary+"i");
    }
    public void prod(){
        int real=(r1*r2)-(i1*i2);
        int imaginary=(r1*i2)+(r2*i1);
        System.out.println(real+"+"+imaginary+"i");
    }
}
