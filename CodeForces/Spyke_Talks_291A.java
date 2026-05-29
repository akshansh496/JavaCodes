import java.util.*;
public class Spyke_Talks_291A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int id=sc.nextInt();
            map.put(id,map.getOrDefault(id, 0)+1);
        }
        Set<Integer> keySet=map.keySet();
        int count=0;
        for(Integer key:keySet){
            if(key!=0 && map.get(key)==2) count++;
            if(key!=0 && map.get(key)>2){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(count);
    }
}
