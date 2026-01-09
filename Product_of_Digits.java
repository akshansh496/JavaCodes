public class Product_of_Digits {
    public static void main(String[] args) {
        System.out.println(Prod_of_digits(1342));
    }
    static int Prod_of_digits(int n){
        if(n==0){
            return 1;
        }
        return n%10*Prod_of_digits(n/10);
    }
}
