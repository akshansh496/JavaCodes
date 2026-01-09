public class recursion_5to1 {
    public static void main(String[] args) {
        int n=5;
        rec(n);
    }
    public static void rec(int x){
        if(x!=0){
            System.out.println(x);
            rec(--x);
        }
        else{
            return;
        }
}
}
