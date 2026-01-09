// import java.util.Arrays;
// import java.util.*;
// public class Bubble_sort {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter size of array");
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         System.out.println("Enter elements in the array");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<size;i++){
//             Boolean flag=false;
//             for(int j=0;j<size-i-1;j++){
//                 if(arr[j+1]<arr[j]){
//                     int temp=arr[j+1];
//                     arr[j+1]=arr[j];
//                     arr[j]=temp;
//                     flag=true;
//                 }
//             }
//             if(flag!=true)
//             break;
//         }
//             System.out.println(Arrays.toString(arr));

//     }
// }






// Descendind order sort




// import java.util.Arrays;
// import java.util.*;
// public class Bubble_sort {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter size of array");
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         System.out.println("Enter elements in the array");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<size;i++){
//             Boolean flag=false;
//             for(int j=0;j<size-i-1;j++){
//                 if(arr[j+1]>arr[j]){
//                     int temp=arr[j+1];
//                     arr[j+1]=arr[j];
//                     arr[j]=temp;
//                     flag=true;
//                 }
//             }
//             if(flag!=true)
//             break;
//         }
//             System.out.println(Arrays.toString(arr));

//     }
// }






// Implement bubble sort and count the total number of swaps required to sort the array.




// import java.util.Arrays;
// import java.util.*;
// public class Bubble_sort {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter size of array");
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         System.out.println("Enter elements in the array");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         int count=0;
//         for(int i=0;i<size;i++){
//             boolean flag=false;
//             for(int j=0;j<size-i-1;j++){
//                 if(arr[j+1]<arr[j]){
//                     int temp=arr[j+1];
//                     arr[j+1]=arr[j];
//                     arr[j]=temp;
//                     flag=true;
//                     count++;
//                 }
//             }
//             if(flag!=true)//(!flag)
//             break;
//         }
//             System.out.println(Arrays.toString(arr));
//             System.out.println("total number of swaps required to sort the array :"+count);
//     }
// }





// Write a program to sort an array of strings using bubble sort.





// import java.util.Arrays;
// import java.util.*;
// public class Bubble_sort {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter size of array");
//         int size=sc.nextInt();
//         String arr[]=new String[size];
//         System.out.println("Enter elements in the array");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.next();
//         }
//         for(int i=0;i<size;i++){
//             Boolean flag=false;
//             for(int j=0;j<size-i-1;j++){
//                 if(arr[j].compareTo(arr[j+1])>0)  
//                 // for descending if(arr[j+1].compareTo(arr[j])>0)
//                 {
//                     String temp=arr[j+1];
//                     arr[j+1]=arr[j];
//                     arr[j]=temp;
//                     flag=true;
//                 }
//             }
//             if(flag!=true)
//             break;
//         }
//             System.out.println(Arrays.toString(arr));

//     }
// }






// Sort only a specific portion of an array using bubble sort (e.g., from index 2 to index 6).





// import java.util.*;
// public class Bubble_sort {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter size of array");
//         int size=sc.nextInt();
//         System.out.println("Enter sort size of array");
//         int SortSizeStart=sc.nextInt();
//         int SortSizeEnd=sc.nextInt();
//         int arr[]=new int[size];
//         System.out.println("Enter elements in the array");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=SortSizeStart;i<SortSizeEnd;i++){
//             boolean flag=false;
//             for(int j=SortSizeStart;j<SortSizeEnd - (i - SortSizeStart);j++){
//                 if(arr[j+1]<arr[j]){
//                     int temp=arr[j+1];
//                     arr[j+1]=arr[j];
//                     arr[j]=temp;
//                     flag=true;
//                 }
//             }
//             if(flag!=true)
//             break;
//         }
//             System.out.println(Arrays.toString(arr));

//     }
// }
public class Bubble_sort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag!=true)
            break;
        }
        for (int idx = 0; idx < arr.length; idx++) { 
            System.out.println(arr[idx]);
        }
    }
}