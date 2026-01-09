import java.util.*;
public class Peak_rotated_sorted_array {
    public static void main(String[] args){
        int a[]={9,10,12,24,2,4,5,7,8};
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid+1]<a[mid]){
            System.out.println(mid);
            break;
            }
            else if(a[mid-1]>a[mid]){
                System.out.println(mid);
                break;
            }
            else if(a[mid]>=a[start])
            start=mid+1;
            else if(a[mid]<a[start])
            end=mid-1;
        }
    }
}
