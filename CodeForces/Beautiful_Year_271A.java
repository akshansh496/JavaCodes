
import java.util.HashSet;
import java.util.Scanner;

public class Beautiful_Year_271A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        while(true){
            year++;
            HashSet<Integer> set=new HashSet<>();
            int temp=year;
            boolean flag=false;
            while(temp!=0){
                if(set.contains(temp%10)){
                    flag=true;
                    break;
                }   
                set.add(temp%10);
                temp/=10;
            }
            if(!flag){
                System.out.println(year);
                break;
            }
        }
    }
}
