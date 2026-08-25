
import java.util.Scanner;

public class Borze_32B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder str=new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(i!=s.length()-1 && s.charAt(i)=='-'){
                if(s.charAt(i+1)=='-')  str.append(2);
                else    str.append(1);
                i+=2;
            }
            else{
                str.append(0);
                i++;
            }    
        }
        System.out.println(str.toString());
    }
}
