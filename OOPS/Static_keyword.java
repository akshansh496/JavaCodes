package OOPS;

public class Static_keyword {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.schoolName="abc";
        Student1 s2=new Student1();
        System.out.println(s2.schoolName);
        s2.schoolName="xyz";
        System.out.println(s1.schoolName);
    }
}

class Student1{
    String name;
    int roll;

    static String schoolName;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
