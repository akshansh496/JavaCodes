import java.util.*;
public class BinarySearchP1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter size of array.");
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         System.out.println("Enter elements in the array in sorted manner.");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Enter the element to be searched");
//         int x=sc.nextInt();
//         int start=0;
//         int end=size-1;
//         while(start<=end){
//             int mid=start+((end-start)/2);
//             if(arr[mid]==x){
//                 System.out.println("Founded");
//                 break;
//             }
//             else if(x>arr[mid])
//                 start=mid+1;
//             else
//                 end=mid-1;
//         }
//         System.out.println("program ends");
//     }
// }







//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter size of array.");
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         System.out.println("Enter elements in the array in sorted manner.");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Enter the element to be searched");
//         int x=sc.nextInt();
//         int start=0;
//         int end=size-1;
//         System.out.println(search(arr,start,end,x));
//     }
//     public static int search(int arr[],int start,int end,int x){
//         int mid=start+((end-start)/2);
//         if(start>end)
//             return -1;
//         else if(arr[mid]==x)
//             return mid;
//         else if(x>arr[mid])
//             return search(arr, mid+1, end, x);
//         else
//             return search(arr, start, mid-1, x);
//     }
// }







// Given a sorted array with duplicate elements, find the first occurrence of a target value using binary search.


//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter size of array.");
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         System.out.println("Enter elements in the array in sorted manner.");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Enter the element to be searched");
//         int x=sc.nextInt();
//         int start=0;
//         int end=size-1;
//         while(start<=end){
//             int mid=start+((end-start)/2);
//             if(arr[mid]==x){
//                 if( mid!=0 && arr[mid-1]==x )
//                 end=mid-1;
//                 else{
//                 System.out.println("Founded at index "+mid);
//                 break;
//             }
//             }
//             else if(x>arr[mid])
//                 start=mid+1;
//             else
//                 end=mid-1;
//         }
//     }
// }








// Modify binary search to return the last occurrence of a target value in a sorted array with duplicates.




//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter size of array.");
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         System.out.println("Enter elements in the array in sorted manner.");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Enter the element to be searched");
//         int x=sc.nextInt();
//         int start=0;
//         int end=size-1;
//         while(start<=end){
//             int mid=start+((end-start)/2);
//             if(arr[mid]==x){
//                 if( mid!=(size-1) && arr[mid+1]==x )
//                 start=mid+1;
//                 else{
//                 System.out.println("Founded at index "+mid);
//                 break;
//             }
//             }
//             else if(x>arr[mid])
//                 start=mid+1;
//             else
//                 end=mid-1;
//         }
//     }
// }






// Given a sorted array, count the number of times a given element appears using binary search.


//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter size of array.");
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         System.out.println("Enter elements in the array in sorted manner.");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Enter the element to be searched");
//         int x=sc.nextInt();
//         int start=0;
//         int end=size-1;
//         int count=0;
//         int first=FirstOccurence(arr,start,end,x);
//         int last=LastOccurence(arr,start,end,x);
//         if (first == -1 || last == -1) {
//             System.out.println("No. of occurrences: 0");
//         } else {
//             System.out.println("No. of occurrences: " + (last - first + 1));
//         }
//     }
//     public static int FirstOccurence(int arr[],int start,int end,int x){
//         while(start<=end){
//             int mid=start+((end-start)/2);
//             if(arr[mid]==x){
//                 if( mid!=0 && arr[mid-1]==x )
//                 end=mid-1;
//                 else{
//                 return mid;
//             }
//             }
//             else if(x>arr[mid])
//                 start=mid+1;
//             else
//                 end=mid-1;
//         }
//         return -1;
//     }
//     public static int LastOccurence(int arr[],int start,int end,int x){
//           while(start<=end){
//             int mid=start+((end-start)/2);
//             if(arr[mid]==x){
//                 if( mid!=(arr.length-1) && arr[mid+1]==x )
//                 start=mid+1;
//                 else{
//                 System.out.println("Founded at index "+mid);
//                 return mid;
//             }
//             }
//             else if(x>arr[mid])
//                 start=mid+1;
//             else
//                 end=mid-1;
//         }      
//         return -1;
//     }
// }






// Find the Missing Number: Given a sorted array of n-1 distinct integers from 1 to n with one missing number, find the missing number using binary search.




    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter size of array.");
    //     int size=sc.nextInt();
    //     int arr[]=new int[size];
    //     System.out.println("Enter elements in the array in sorted manner.");
    //     for(int i=0;i<size;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     int start=0;
    //     int end=size-1;
    //     System.out.println("Missing number: "+missing(arr, start, end,size));
    // }
    //     public static int missing(int arr[],int start,int end,int size){
    //         if(arr[0]!=1)
    //             return 1;
    //         else if(arr[end]!=size)
    //             return size;
    //         while(start<=end){
    //             int mid=start+((end-start)/2);
    //             if(mid!=end && arr[mid]!=(arr[mid+1]-1))
    //                 return (arr[mid]+1);
    //             else if(mid!=0 && arr[mid]!=(arr[mid-1]+1))
    //                 return (arr[mid-1]+1);
    //             // else if(arr[mid]==(arr[mid-1]+1) && arr[mid]==(arr[mid+1]-1))
    //             //     start=mid+1;
    //             else if (arr[mid] == mid + 1) 
    //                 start = mid + 1;
    //             else 
    //                 end = mid - 1;
            
    //         }
    //         return -1;
    //     }



//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of array.");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         System.out.println("Enter elements in the array in sorted manner.");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int start = 0;
//         int end = size - 1;
//         System.out.println("Missing number: " + missing(arr, start, end));
//     }

//     public static int missing(int arr[], int start, int end) {
//         if (arr[0] != 1)
//             return 1;
//         else if (arr[end] != end+2)
//             return end+2;
//         while (start <= end) {
//             int mid = start + (end - start) / 2;
//             if (mid != end && (arr[mid]+1) != arr[mid + 1])
//                 return (arr[mid] + 1);
//             else if (mid != 0 && arr[mid] != (arr[mid - 1] + 1))
//                 return (arr[mid - 1] + 1);
//             else if (arr[mid] == mid+1)
//                 start = mid + 1;
//             else
//                 end = mid - 1;
//         }
//         return -1;
//     }
// }
      





//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input: Array size (n-1 elements)
//         System.out.println("Enter the size of array (n-1): ");
//         int size = sc.nextInt();
//         int[] arr = new int[size];

//         System.out.println("Enter " + size + " sorted elements from 1 to " + (size + 1) + " with one missing: ");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Find and print the missing number
//         System.out.println("Missing number: " + findMissing(arr, 0, size - 1));
//     }

//     public static int findMissing(int arr[], int start, int end) {
//         // If the first element is not 1, then 1 is missing
//         if (arr[0] != 1) return 1;

//         // If the last element is not n, then n is missing
//         if (arr[end] != end + 2) return end + 2;

//         // Binary Search for the missing number
//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             // If the missing number is between mid and mid+1
//             if (arr[mid] != mid + 1) {
//                 if (arr[mid - 1] == mid) {
//                     return mid + 1; // Missing number found
//                 }
//                 end = mid - 1;
//             } else {
//                 start = mid + 1;
//             }
//         }
//         return -1; // Should never reach here
//     }
// }








// Find Square Root: Implement a function that finds the square root of a number using binary search (without using built-in functions).


// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the element whose sqrt is to be searched");
//     int x=sc.nextInt();
//     int size=x/2;
//     int arr[] = new int[size];
//     int c=1;
//     for (int i = 0; i < size; i++) {
//         arr[i] =c++;
//     }
//     int start = 0;
//     int end = size - 1;
//     int sqrt=SquareRoot(arr,start,end,x);
//     System.out.println(sqrt);
// }
// public static int SquareRoot(int arr[],int start,int end,int x){
//     if(x==1)
//     return 1;
//     if(x==0)
//     return 0;
//     while(start<=end){
//         int mid=start + (end - start) / 2;
//         if(arr[mid]*arr[mid]==x)
//         return arr[mid];
//         else if(arr[mid]*arr[mid]>x)
//         end=mid-1;
//         else if(arr[mid]*arr[mid]<x)
//         start=mid+1;
//     }
//     return arr[end];
// }
// }








// Find Rotation Count in Rotated Sorted Array: A sorted array is rotated at some pivot. Find the number of times it was rotated using binary search.







//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter size of array.");
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         System.out.println("Enter elements in the array in rotated sorted manner.");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         int start=0;
//         int end=size-1;
//         System.out.println("Ans: "+search(arr,start,end,size));
//     }
//     public static int search(int arr[],int start,int end,int size){
//         if (arr[start] <= arr[end]) {
//             return 0;
//         }
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(mid>0 && arr[mid]<arr[mid-1]) 
//             return mid;
//             if(mid!=(size-1) && arr[mid]>arr[mid+1])
//             return mid+1;
//             else if( mid!=0 && arr[mid]>arr[mid-1]){
//                 if(arr[mid]<arr[size-1])
//                 end=mid;
//                 else 
//                 start=mid+1;
//             } 
//         }
//         return 0;
//     }
// }




// Find Peak Element: Given an array where elements are in increasing order and then decreasing order, find the peak element using binary search.







//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter size of array.");
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         System.out.println("Enter elements in the array in mountain array manner.");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         int start=0;
//         int end=size-1;
//         System.out.println("Ans: "+search(arr,start,end));
//     }
//     public static int search(int arr[],int start,int end){
//         while(start<end){
//             int mid=start+(end-start)/2;
//             if (arr[mid]<arr[mid+1])
//             start=mid+1;
//             else
//             end=mid;
//     }
//     return end;
//     }
// }







// Search in Rotated Sorted Array: A sorted array is rotated at some pivot. Find a given target in this rotated array using binary search.



 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array.");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements in the array in rotated sorted manner.");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int x=sc.nextInt();
        int start=0;
        int end=size-1;
        int pivot=searching(arr,start,end,size);
        System.out.println(pivot);
        if (pivot == 0)
        System.out.println(BinarySearch1(arr, start, end, x));
        else if(x>=arr[0])
        System.out.println(BinarySearch1(arr,start,pivot-1,x));
        else
        System.out.println(BinarySearch1(arr,pivot,end,x));
    }
    public static int searching(int arr[],int start,int end,int size){
        if (arr[start] <= arr[end]) {
            return 0;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid>0 && arr[mid]<arr[mid-1]) 
            return mid;
            if(mid!=(size-1) && arr[mid]>arr[mid+1])
            return mid+1;
            else if( mid!=0 && arr[mid]>arr[mid-1]){
                if(arr[mid]<arr[size-1])
                end=mid;
                else 
                start=mid+1;
            } 
        }
        return 0;
    }
    public static int BinarySearch1(int a[],int start,int end,int t){
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
}