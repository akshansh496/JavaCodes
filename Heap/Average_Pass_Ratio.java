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
    class Info implements Comparable<Info>{
        double gain;
        int idx;
        public Info(double gain,int idx){
            this.gain=gain;
            this.idx=idx;
        }
        public int compareTo(Info b){
            return Double.compare(b.gain, this.gain);
        }
    }
    public static double getGain(int pass, int total) {
        return ((double)(pass + 1) / (total + 1)) - ((double)pass / total);
    }
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        int m=classes.length;
        int n=classes[0].length;
        PriorityQueue<Info> pq=new PriorityQueue<>();
        double gain[]=new double[m];
        for(int i=0;i<m;i++){
            gain[i]=getGain(classes[i][0], classes[i][1]);
            pq.add(new Info(gain[i],i));
        }
        while(extraStudents!=0){
            Info i=pq.poll();
            classes[i.idx][0]++;
            classes[i.idx][1]++;

            pq.add(new Info(getGain(classes[i.idx][0], classes[i.idx][1]),i.idx));
            extraStudents--;
        }
        double sum = 0.0;

        for (int i = 0; i < m; i++) {
            sum += (double)classes[i][0] / classes[i][1];
        }

        return sum/m;
    }
} 