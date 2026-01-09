// 🧩 Problem Statement

// You’re given:

// N → length of the string

// K → total sum of character values

// Each lowercase letter has a value:
// a = 1, b = 2, ..., z = 26

// You need to create the lexicographically smallest string of length N whose character sum = K.
package Greedy;
public class Lexicographically_Smallest_String {
    public static void main(String[] args) {
        int n=5;
        int k=42;
        int t=k-1;
        StringBuilder str=new StringBuilder("");
        for(int i=26;i>=1;i--){
            while(t>i){
                t-=i;
                str.append((char)('a'+i-1));
            }
        }
        System.out.println("a"+str.reverse().toString());
    }
}
