package Recursion;

public class Practice_Q5 {
    public static void main(String[] args) {
        TowerOfHanoi(3, "A", "B", "C");
    }
    static void TowerOfHanoi(int n,String src,String dest,String helper){
        if(n==1){
            System.out.println("Move "+n+" plate from "+src+" to  "+dest);
            return;
        }
        TowerOfHanoi(n-1, src, helper, dest);
        System.out.println("Move "+n+" plate from "+src+" to "+dest);
        TowerOfHanoi(n-1, helper, dest, src);
    }
}
