package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int n=arr.length;
        int nextGreater[]=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty())
            nextGreater[i]=-1;
            else
            nextGreater[i]=arr[s.peek()];
            s.push(i);
        }
        System.out.println(Arrays.toString(nextGreater));
    }
}
