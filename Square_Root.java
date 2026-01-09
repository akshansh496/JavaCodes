//Square root with precision
public class Square_Root {
    public static void main(String[] args) {
        int n=26;
        int precision=3;
        int s=1;
        int e=26;
        double root=0;
        while(s<=e){ 
            int m=s+(e-s)/2;
            if(m*m==n){
            root=m;
            break;
            }
            else if(m*m>n)
            e=m-1;
            else{
            root=m;
            s=m+1;     
            } 
        }
        double inc=0.1;
        for(int i=0;i<precision;i++){
            while(root*root<=n){
                root+=inc;
            }
            root-=inc;
            inc/=10;
        }
        System.out.printf("%.3f",root);
    }
}
