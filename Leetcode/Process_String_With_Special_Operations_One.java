package Leetcode;

public class Process_String_With_Special_Operations_One {
    public static String processStr(String s) {
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='*'){
                if(result.length()!=0)  result.deleteCharAt(result.length()-1);
            }
            else if(x=='#')
            result.append(result.toString());
            else if(x=='%')
            result=result.reverse();
            else
            result.append(x);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(processStr("a#b%*"));
    }
}
