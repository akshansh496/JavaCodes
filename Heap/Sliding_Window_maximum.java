package Heap;
import java.util.*;
public class Sliding_Window_maximum {
    static class Info{
        int val;
        int idx;
        public Info(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
    }
    public static void main(String[] args) {
        int nums[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        PriorityQueue<Info> pq = new PriorityQueue<>(
            (a, b) -> b.val - a.val
        );
        for(int i=0;i<k;i++){
            pq.add(new Info(nums[i], i));
        }
        list.add(pq.peek().val);
        int start=1;
        int end=k;
        for(int i=k;i<n;i++){
            while(pq.size()>0 && pq.peek().idx<=(end-k)){
                pq.remove();
            }
            pq.add(new Info(nums[end], end));
            list.add(pq.peek().val);
            start++;
            end++;
        }

        System.out.println(list);
    }
}
