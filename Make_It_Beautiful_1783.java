import java.util.*;
public class Make_It_Beautiful_1783 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int i=0;i<testcase;i++){
            int n=sc.nextInt();
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=0;j<n;j++){
                int x=sc.nextInt();
                map.put(x,map.getOrDefault(x, 0)+1);
            }
            int ans[]=new int[n];
            int sum=0;
            while(!map.isEmpty()){
                
            }
        }
    }
}
