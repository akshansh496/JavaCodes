
import java.util.HashSet;
import java.util.Scanner;

public class Forked_1904A {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int Kx=sc.nextInt();
            int Ky=sc.nextInt();
            int Qx=sc.nextInt();
            int Qy=sc.nextInt();
            HashSet<String> kSet = new HashSet<>();
            HashSet<String> qSet = new HashSet<>();
            kSet.add((Kx-a)+" "+(Ky-b));
            kSet.add((Kx-a)+" "+(Ky+b));
            kSet.add((Kx+a)+" "+(Ky-b));
            kSet.add((Kx+a)+" "+(Ky+b));
            kSet.add((Kx-b)+" "+(Ky+a));
            kSet.add((Kx-b)+" "+(Ky-a));
            kSet.add((Kx+b)+" "+(Ky+a));
            kSet.add((Kx+b)+" "+(Ky-a));
            int count=0;
            qSet.add((Qx-a)+" "+(Qy-b));
            qSet.add((Qx-a)+" "+(Qy+b));
            qSet.add((Qx+a)+" "+(Qy-b));
            qSet.add((Qx+a)+" "+(Qy+b));
            qSet.add((Qx-b)+" "+(Qy+a));
            qSet.add((Qx-b)+" "+(Qy-a));
            qSet.add((Qx+b)+" "+(Qy+a));
            qSet.add((Qx+b)+" "+(Qy-a));
            kSet.retainAll(qSet);

            System.out.println(kSet.size());
        }
    }
}
