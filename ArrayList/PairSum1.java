package ArrayList;

import java.util.ArrayList;

public class PairSum1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(check(list, 8));
    }
    public static boolean check(ArrayList<Integer> list,int target){
        int left=0;
        int right=list.size()-1;
        while(left!=right){
            if(list.get(right)+list.get(left)==target){
                System.out.println(left+" "+right);
            return true;
            }
            if(list.get(right)+list.get(left)>target)
            right--;
            else
            left++;
        }
        return false;
    }
}
