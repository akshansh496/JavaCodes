public class Rotated_BS_Recursion {
    public static void main(String[] args) {
        int [] arr={4,5,6,7,1,2,3};
        System.out.println(Rotated_BS(arr,0, arr.length-1, 3));
    }
    public static int Rotated_BS(int [] arr,int start,int end,int target){
            int mid=start+(end-start)/2;
            if(start>end)
            return -1;
            if(arr[mid]==target)
                return mid;
            if(arr[start]<arr[mid]) {
                if(target<arr[mid] && target>=arr[start])
                    return Rotated_BS(arr,start, mid, target);
                else
                    return Rotated_BS(arr,mid+1, end, target);
            }
            else {
                if (target > arr[mid] && target <= arr[end])
                    return Rotated_BS(arr,mid+1, end, target);
                else
                    return Rotated_BS(arr,start, mid, target);
            }
    }
}

