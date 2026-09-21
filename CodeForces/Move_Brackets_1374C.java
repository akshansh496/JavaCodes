
import java.util.*;

public class Move_Brackets_1374C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String s = sc.next();
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char x = s.charAt(i);
                if (x == '(') {
                    st.push(x); 
                }else {
                    if (st.isEmpty()) {
                        st.push(x); 
                    }else if (st.peek() == '(') {
                        st.pop(); 
                    }else {
                        st.push(x);
                    }
                }
            }
            System.out.println(st.size() / 2);
        }
    }
}
