package ArrayList;

import java.util.ArrayList;

public class PairSum_Rotated {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(check(list, 16));
    }
    public static boolean check(ArrayList<Integer> list,int target){
        int leftpointer=0;
        int rightpointer=0;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                leftpointer=i+1;
                rightpointer=i;
            }
        }
        while(leftpointer!=rightpointer){
            if(list.get(rightpointer)+list.get(leftpointer)==target){
                System.out.println(leftpointer+" "+rightpointer);
            return true;
            }
            if(list.get(rightpointer)+list.get(leftpointer)>target)
            rightpointer=(rightpointer-1)%list.size();
            else
            leftpointer=(leftpointer+1)%list.size();
        }
        return false;
    }
}
