import java.util.*;
public class Revere_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        int i=0;
        String temp=" ";
        for(i=0;i<str.length();i++){
            char ch=str.charAt(i);
            temp=ch+temp;
        }
        System.out.println(temp);
 }
}
