import java.util.*;

public class Red_Versus_Blue_1659A {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){

            int n=sc.nextInt();
            int r=sc.nextInt();
            int b=sc.nextInt();
            StringBuilder s = new StringBuilder();
            int length_of_red=r/(b+1);
            int extra_red = r % (b + 1);
            for(int i=1;i<=b+1;i++){
                for (int j = 0; j < length_of_red; j++) {
					s.append('R');
				}
                if(extra_red>0){
					s.append('R');
					extra_red--;
				}
                if (i != b + 1) {
					s.append('B');
				}
            }
            System.out.println(s.toString());
        }
    }
}