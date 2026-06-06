import java.util.*;
public class Doremys_Paint_3_1890A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            int n=sc.nextInt();
            int arr[]=new int[n];
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
            }
            if(map.size()>2){
                System.out.println("No");
                continue;
            }
            if(map.size()==1){
                System.out.println("yes");
                continue;
            }
            Iterator<Integer> it = map.values().iterator();
            int freq1 = it.next();
            int freq2 = it.next();
            if(Math.abs(freq1-freq2)>1) System.out.println("No");
            else    System.out.println("Yes");
        }
    }
}