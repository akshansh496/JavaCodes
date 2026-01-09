// You’re given a string s consisting only of the characters 'L' and 'R'.
// You need to split it into the maximum number of balanced substrings.

//  A balanced string is one where the number of 'L' and 'R' are equal.

// You must return the maximum number of balanced parts possible.

package Greedy;
public class PracticeQ1 {
    public static void main(String[] args) {
        String str="LRRRRLLRLLRL";
        int l=0;
        int r=0;
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='L') l++;
            else    r++;
            if(l==r){
            count++;
            }
        }
        System.out.println(count);
    }
}
