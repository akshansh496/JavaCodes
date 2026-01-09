//To check whether a number is prime or not
public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        int range=40;
        boolean arr[]=new boolean[range+1];
        for(int i=2;i*i<=range;i++){
            if(!arr[i]){
                for(int j=i*2;j<=range;j+=i){
                    arr[j]=true;
                }
            }
        }
        for (int index = 2; index < range; index++) {
            if(!arr[index])
            System.out.println(index);
        }
    }
}
