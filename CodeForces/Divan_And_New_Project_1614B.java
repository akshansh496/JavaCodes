import java.util.*;

public class Divan_And_New_Project_1614B {
    static class Info implements Comparable<Info>{
        int num;
        int idx;
        
        public Info(int num,int idx){
            this.num=num;
            this.idx=idx;
        }
        public int compareTo(Info ob){
            if(this.num==ob.num)    return Integer.compare(this.idx, ob.idx);
            return Integer.compare(ob.num, this.num);
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){

            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            PriorityQueue<Info> pq=new PriorityQueue<>();
            for(int i=0;i<n;i++){
                pq.add(new Info(arr[i],i));
            }
            int pos[]=new int[n+1];
            int center = n / 2;
            pos[0] = center;
            int left = center - 1;
            int right = center + 1;

            while(!pq.isEmpty()){
                Info first=pq.poll();
                pos[first.idx+1]=left;
                if(!pq.isEmpty()){
                    Info second=pq.poll();
                    pos[second.idx+1]=right;
                }
                left--;
                right++;
            }
            long sum=0;
            for(int i=0;i<n;i++){
                sum += (2L * arr[i] * Math.abs(pos[0] - pos[i + 1]));
            }
            System.out.println(sum);
            for(int i=0;i<n+1;i++){
                System.out.print(pos[i]+" ");
            }
            System.out.println();
        }
    }
}



































// int n=sc.nextInt();
            // int arr[]=new int[n];
            // for(int i=0;i<n;i++){
            //     arr[i]=sc.nextInt();
            // }
            // int[] copy = Arrays.copyOf(arr, arr.length);
            // Arrays.sort(copy);
            // HashMap<Integer,Integer> map=new HashMap<>();
            // int flag=0;
            // for(int i=0;i<n;i++){
            //     if(i%2!=0){
            //         map.put(copy[i],flag++);
            //     }
            //     else{
            //         map.put(copy[i],n-flag);
            //     }
            // }
            // int ans[]=new int[n+1];
            // ans[0]=n/2;
            // for(int i=0;i<n;i++){
            //     ans[i+1]=map.get(arr[i]);
            // }
            // int sum=0;
            // for(int i=0;i<n;i++){
            //     sum+=(2*arr[i]*Math.abs(ans[0]-ans[i+1]));
            // }
            // System.out.println(sum);
            // System.out.println(Arrays.toString(ans));
