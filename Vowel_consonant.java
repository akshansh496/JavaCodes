import java.util.*;
public class Vowel_consonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.next().toLowerCase();
        int i=0;
        for(i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("vowles:"+ch);
            }
            else
            System.out.println("consonants:"+ch);
        }
    }
}
