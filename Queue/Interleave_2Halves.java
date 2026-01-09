package Queue;
import java.util.*;
public class Interleave_2Halves {
    public static void main(String[] args) {
        Queue<Integer> original=new LinkedList<>();
        for(int i=1;i<=10;i++){
            original.add(i);
        }
        interleave(original);
    }
    public static void interleave(Queue<Integer> original){
        int size = original.size();
        int idx=0;
        Queue<Integer> first=new LinkedList<>();
        while(idx<size/2){
            first.add(original.remove());
            idx++;
        }
        while(!first.isEmpty()){
            original.add(first.remove());
            original.add(original.remove());
        }
        for(int i:original){
            System.out.print(i+" ");
        }
    }
}
