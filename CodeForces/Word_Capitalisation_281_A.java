
import java.util.Scanner;

public class Word_Capitalisation_281_A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        if(Character.isUpperCase(word.charAt(0)))
        System.out.println(word);
        else
        System.out.println((char)(word.charAt(0)-32)+""+word.substring(1));
    }
}
