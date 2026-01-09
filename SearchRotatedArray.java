public class SearchRotatedArray {
    public static void main(String[] args) {
        int a[]={4,5,6,7,0,1,2};
        int target=1;
        int start=0;
        int end=a.length-1;
        int p=peak(a,start,end);
        int y=search(a, start, p, target);
        int z=search(a, p+1, end, target);
        if(y!=-1)
        System.out.println(y);
        else if(z!=-1)
        System.out.println(z);
        else
        System.out.println(-1);
    }
    public static int peak(int a[],int start,int end){
        while(start<end){
            int mid=(start+end)/2;
            if(a[mid]<a[mid+1])
            start=mid+1;
            else
            end=mid;
        }
    return end;
    }
    public static int search(int a[],int start,int end,int t){
        if(a[start]<a[end]){
            while(start<=end){
                int mid=(start+end)/2;
                if(a[mid]==t)
                return mid;
                else if(a[mid]<t)
                    start=mid+1;
                else 
                    end=mid-1;
            }
            return -1;
        }
        else{
            while(start<=end){
                int mid=(start+end)/2;
                if(a[mid]==t)
                return mid;
                else if(a[mid]>t)
                    start=mid+1;
                else 
                    end=mid-1;
            }
            return -1;
        }
    }       
}
