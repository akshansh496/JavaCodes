import java.util.*;
public class Construct_An_Array_2231 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            int n=sc.nextInt();
            HashSet<Integer> set=new HashSet<>();
            int prev=0;
            int count=0;
            for(int i=1;i<=n*2;i++){
                if(count==n) break;
                if(!set.contains(i) && !set.contains(prev+i)){
                    System.out.println(i);
                    set.add(i);
                    set.add(prev+i);
                    prev=i;
                    count++;
                }
            }
        }
    }
}
