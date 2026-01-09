public class Area extends Inheritance{
    double h,area;
    public Area(double x,double y,double z){
        super(x,y);
        h=z;
        area=0.0;
    }
    public void doarea(){
        area=b*h;
    }
    public void show(){
        super.show();
        System.out.println("height:"+h);
        System.out.println("area:"+area);
    }
}