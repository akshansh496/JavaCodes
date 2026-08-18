
import java.util.*;

public class Creating_Abbreviations_2257A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            HashSet<String> words=new HashSet<>();
            boolean unlocked[]=new boolean[26];
            for(int i=0;i<n;i++){
                String s=sc.next().toLowerCase();
                words.add(s);
                unlocked[s.charAt(i)-'a']=true;
            }
            HashSet<String> abbreviations=new HashSet<>();
            for(int i=0;i<m;i++){
                abbreviations.add(sc.next().toLowerCase());
            }
            boolean flag=false;
            for(String item:abbreviations){
                boolean temp=false;
                for(int i=0;i<item.length();i++){
                    if(!unlocked[item.charAt(i)-'a']){
                        temp=true;
                        break;
                    }   
                }
                if(!temp)   flag=true; 
            }
        }
    }
}
