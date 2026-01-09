package Stack;
import java.util.*;
public class Max_Area_In_Histogram {
    public static void main(String[] args) {
        int heights[]={2,1,5,6,2,3};
        int right[]=next_smaller_right(heights);
        int left[]=next_smaller_left(heights);
        int area[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            area[i]=heights[i]*(right[i]-1-left[i]);
        }
        int max=0;
        for(int i=0;i<heights.length;i++){
            max=Math.max(max,area[i]);
        }
        System.out.println(max);
    }
    public static int[] next_smaller_right(int heights[]){
        int n=heights.length;
        Stack<Integer> s=new Stack<>();
        int right[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.empty())
            right[i]=n;
            else
            right[i]=s.peek();
            s.push(i);
        }
        return right;
    }
    public static int[] next_smaller_left(int heights[]){
        int n=heights.length;
        Stack<Integer> s=new Stack<>();
        int left[]=new int[n];
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.empty())
            left[i]=-1;
            else
            left[i]=s.peek();
            s.push(i);
        }
        return left;
    }
}
