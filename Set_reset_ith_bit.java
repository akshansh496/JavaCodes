public class Set_reset_ith_bit {
    public static void main(String[] args) {
        set(19,4);
        reset(19, 4);
    }
    public static void set(int n, int i){
        System.out.println(n|(1<<(i-1)));
    }
    public static void reset(int n, int i){
        System.out.println(n&~(1<<(i-1)));
    }
}
