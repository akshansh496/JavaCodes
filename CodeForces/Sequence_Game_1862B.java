import java.util.*;
public class Sequence_Game_1862B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int t=0;t<testcase;t++){
            int n=sc.nextInt();
            int prev=0;
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                int curr=sc.nextInt();
                if(i==0){
                    list.add(curr);
                    prev=curr;
                    continue;
                }
                if(curr<prev){
                    list.add(1);
                }
                list.add(curr);
                prev=curr;
            }
            System.out.println(list.size());
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }
    }
}
