public class butterfly_pattern {
    public static void main(){
        int n=4;
        for(int i=1; i<=n; i++) {
            //1st part
            for (int j=1; j<=i; j++) {
            System.out.print ("*");
            }
            
            // spaces
            int spaces = 2 * (n-i);
            for (int j=1; j<=spaces; j++) {
            System.out.print(" ");
            }
            //2nd part
            for (int j=0; j<i; j++) {
            System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=0; i--) {
            //1st part
            for (int j=1; j<=i; j++) {
            System.out.print("*");
            }
            
            // spaces
            int spaces = 2 * (n-i);
            for (int j=1; j<=spaces; j++) {
            System.out.print(" ");
            }
            //2nd part
            for (int j=0; j<i; j++) {
            System.out.print("*");
            }
            System.out.println();
    }
}
    
}
