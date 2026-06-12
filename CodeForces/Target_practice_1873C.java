import java.util.Scanner;
public class Target_practice_1873C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int t=0;t<testcase;t++){
            int score=0;
            for(int i = 0; i < 10; i++) {
                String s = sc.next();
                for(int j = 0; j < 10; j++) {
                    char x = s.charAt(j);
                    if(x=='X'){
                        if(i==0 || i==9 || j==0 || j==9)    score+=1;
                        else if(i==1 || i==8 || j==1 || j==8)    score+=2;
                        else if(i==2 || i==7 || j==2 || j==7)    score+=3;
                        else if(i==3 || i==6 || j==3 || j==6)    score+=4;
                        else if(i==4 || i==5 || j==4 || j==5)    score+=5;
                    }
                }
            }
            System.out.println(score);
        }
    }
}
