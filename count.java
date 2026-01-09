import java.util.*;
class count{
    public static void main(String[] args)
        {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter range");
        int range=scan.nextInt();
        int cp=0;
        int cn=0;
        int cz=0;
        System.out.println("Enter numbers");
        for(int i=1;i<=range;i++){
            int x=scan.nextInt();
            if(x>0)
            cp++;
            else if(x<0)
            cn++;
            else
            cz++;
        }
        System.out.println("count of positive:"+cp);
        System.out.println("count of negative:"+cn);
        System.out.println("count of zero:"+cz);
    }
}

 