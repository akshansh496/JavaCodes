public class recursion_SumOf_N_Numbers {
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
        
    }
    public static int sum(int x){
        if(x>0){
        return x+sum(x-1);
        }
        else 
        return 0;
    }
}
