import java.util.*;
public class inverted_alphabet_pattern {
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        char ch=sc.nextLine().charAt(0);
        for(char x=ch;x>='A';x--)
        {
            for(char z='A';z<=x;z++)
            {
                System.out.print(z);
            }
            System.out.println();;
            
        }
    }
}
