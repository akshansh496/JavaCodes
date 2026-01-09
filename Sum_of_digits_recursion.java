public class Sum_of_digits_recursion {
    public static void main(String[] args) {
        System.out.println(Sum_of_digits(1342));
    }
    static int Sum_of_digits(int n){
        if(n==0){
            return 0;
        }
        return n%10+Sum_of_digits(n/10);
    }
}
