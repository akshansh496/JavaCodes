
import java.util.ArrayList;

public class Linear_search_recursion {
    public static void main(String[] args) {
        int arr[]={1,3,5,6,8,5,9};
        System.out.println(search1(arr, 9, 0));
        System.out.println(search2(arr, 1, arr.length-1));
        System.out.println(search3(arr, 11, 0));
        ArrayList<Integer> list=new ArrayList<>();
        searchAll(arr, 5, 0,list);
        System.out.println(list);
    }
    static int search1(int arr[],int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return search1(arr, target, ++index);
    }


    static int search2(int arr[],int target,int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return search2(arr, target, --index);
    }

    static boolean search3(int arr[],int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || search3(arr, target, ++index);
    }
    static ArrayList<Integer> searchAll(int arr[],int target,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return searchAll(arr, target, ++index,list);
    }
    
}
