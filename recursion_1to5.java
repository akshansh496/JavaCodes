public class recursion_1to5 {
    public static void main(String[] args) {
        int n=5;
        rec(5);
    }
    public static void rec(int x){
        if(x>0){
            rec(x-1);
            System.out.println(x);
        }
        else
        return;
    }
}

