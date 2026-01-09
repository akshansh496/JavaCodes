package ArrayList;

import java.util.ArrayList;

public class Monotonic {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println(Monotonic_increasing(list));
        System.out.println(Monotonic_decreasing(list));
    }
    public static boolean Monotonic_increasing(ArrayList<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1))
            return false;
        }
        return true;
    }
    public static boolean Monotonic_decreasing(ArrayList<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)<=list.get(i+1))
            return false;
        }
        return true;
    }
}
