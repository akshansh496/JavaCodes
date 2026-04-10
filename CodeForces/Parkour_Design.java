
import java.util.*;
public class Parkour_Design {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String,String> dp=new HashMap<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            // System.out.println(helper(x, y));
            System.out.println(helper1(x, y,dp));
        }
    }    
    //recursion
    public static String helper(int x,int y){
        if(x<0) return "NO";
        if((x==0 && y==0)||(x==2 && y==1)||(x==3 && y==0)||(x==4 && y==-1))
        return "YES";
        if(helper(x-2,y-1).equals("YES") || helper(x-3,y).equals("YES") || helper(x-4,y+1).equals("YES"))
        return "YES";
        return "NO";
    }
    //memoization
    public static String helper1(int x,int y,HashMap<String,String> dp){
        if(x<0) return "NO";
        String str=x+","+y;
        if(dp.containsKey(str)) return dp.get(str);
        if((x==0 && y==0)||(x==2 && y==1)||(x==3 && y==0)||(x==4 && y==-1)){
            dp.put(str,"YES");
            return "YES";
        }
        if(helper1(x-2,y-1,dp).equals("YES") || helper1(x-3,y,dp).equals("YES") || helper1(x-4,y+1,dp).equals("YES")){
            dp.put(str,"YES");
            return "YES";
        }
        dp.put(str,"NO");
        return "NO";
    }
}
