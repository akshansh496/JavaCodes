public class Solution {
    public static void main(String[] args) {
        String word1[]={"a","cb"};
        String word2[]={"ab","c"};
        String temp="";
        for(String x:word1){
            temp+=x;
        }
        String temp1="";
        for(String x:word2){
            temp1+=x;
        }
        if(temp.equals(temp1))
        System.out.println(true);
        else 
        System.out.println(false);
    }
}
