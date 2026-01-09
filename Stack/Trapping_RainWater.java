package Stack;
import java.util.*;
public class Trapping_RainWater {
    public static void main(String[] args) {
        int arr[] = {5,4,1,2};

        int len=arr.length;
        int water[]=new int[len];
        int lg[]=new int[len];
        lg=leftgreatest(arr);
        int rg[]=new int[len];
        rg=rightGreatest(arr);     
        int sum=0;
        for(int i=0;i<len;i++){
            water[i]= Math.min(lg[i], rg[i]) - arr[i];
            sum+=water[i];
        }
        System.out.println(sum);
        
    }
    public static int[] leftgreatest(int arr[]){
        int len=arr.length;
        Stack<Integer> s=new Stack<>();
        int lg[]=new int[len];
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[i]>arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
            lg[i]=arr[i];
            s.push(i);
            }
            else{
            lg[i]=arr[s.peek()];
            }
        }
        return lg;
    }
    public static int[] rightGreatest(int arr[]){
        int len=arr.length;
        Stack<Integer> s=new Stack<>();
        int rg[]=new int[len];
        for(int i=len-1;i>=0;i--){
            while(!s.isEmpty() && arr[i]>arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
            rg[i]=arr[i];
            s.push(i);
            }
            else{
            rg[i]=arr[s.peek()];
            }
        }
        return rg;
    }
}
