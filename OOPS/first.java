package OOPS;
public class first {
    public static void main(String[] args) {
        //PEN
        Pen p1=new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        //BANK ACCOUNT 
        BankAccount myAcc= new BankAccount();
        myAcc.username="akshanshGupta";
        myAcc.setPassword("Akshansh@04");
    }
}
class BankAccount{
    public String username;
    private String password;//can't be accessed outside this classs
    public void setPassword(String newPassword){
        password=newPassword;
    }
}
class Pen{
    private String color;
    private int tip;

    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}