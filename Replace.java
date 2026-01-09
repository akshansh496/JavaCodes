import java.util.*;
public class Replace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String a=sc.nextLine();
        String result="";
        int i;
        char x;
        for(i=0;i<a.length();i++){
            x=a.charAt(i);
            if (x=='e'){
                result+="i";
            }
            else{
                result+=x;
            }
        }
        System.out.println(result);
    }
}
