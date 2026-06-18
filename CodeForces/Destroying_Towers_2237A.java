import java.util.*;
public class Destroying_Towers_2237A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            int n=sc.nextInt();
            if(n==1){
                System.out.println(sc.nextInt());
                continue;
            }
            ArrayList<Integer> list=new ArrayList<>();
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            boolean flag=true;
            int sum=0;
            for(int i=0;i<n;i++){
                list.add(sc.nextInt());
                pq.add(list.get(i));
                sum+=list.get(i);
                if(i==0) continue;
                if(list.get(i)>list.get(i-1))   flag=false;
            }
            if(flag){
                System.out.println(sum);
                continue;
            }
            while(!pq.isEmpty()){
                int val=pq.poll();
                int idx=list.indexOf(val);
                for(int i=idx+1;i<n;i++){
                    if(list.get(i)>list.get(idx)){
                        pq.remove(list.get(i));
                        pq.add(list.get(idx));
                        list.set(i, list.get(idx));
                    }
                }
            }
            sum=0;
            for(int i=0;i<n;i++){
                sum+=list.get(i);
            }
            System.out.println(sum);
        }
    }
}
