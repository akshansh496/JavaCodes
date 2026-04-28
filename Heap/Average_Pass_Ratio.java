import java.util.*;
class Average_Pass_Ratio{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int classes[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                classes[i][j]=sc.nextInt();
            }
        }
        int extraStudents=sc.nextInt();
        System.out.println(maxAverageRatio(classes,extraStudents));
        
    }
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        int m=classes.length;
        int n=classes[0].length;
        PriorityQueue<Double> pq=new PriorityQueue<>();
        double ratoio[]=new double[m];
        for(int i=0;i<m;i++){
            ratio[i]=classes[i][0]/classes[i][1];
            pq.add(ratio[i]);
        }
        
    }
}