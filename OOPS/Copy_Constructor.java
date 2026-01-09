package OOPS;

public class Copy_Constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="akshansh";
        s1.roll=123;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s2=new Student(s1);
        s2.password="xyz";

        s1.marks[2]=100;//this also changes the marks for s2 if we use shallow constructor bcz only of reference of the array is copied
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];

    public Student() {
        marks=new int[3];
        System.out.println("Constructor created");
    }

    //Copy Constructor
    //Shallow constructor

    // public Student(Student s1) {
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    // }

    //Deep Constructor
    public Student(Student s1) {
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i]=s1.marks[i];
        }
        
    }
}
