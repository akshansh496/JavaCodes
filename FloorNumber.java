public class FloorNumber {
        public static void main(String[] args) {
            int arr[]={5,10,15,20,25,30};
            int target=4;
            int ans=sort(arr,target,0,arr.length-1);
            System.out.println(ans);
        }
        public static int sort(int a[],int t,int start,int end){
            if(t<a[0])
            return -1;
            while(start<=end){
                int mid=(start+end)/2;
                if(a[mid]==t)
                return mid;
                else if(a[mid]<t)
                    start=mid+1;
                else 
                    end=mid-1;
            }
            return a[end];
    }
    }

