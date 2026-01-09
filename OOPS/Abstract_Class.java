package OOPS;

public class Abstract_Class {
    public static void main(String[] args) {
        Horse obj1=new Horse();
        obj1.walk();
        obj1.eat();
        Chicken obj2=new Chicken();
        obj2.walk();
        obj2.eat();
    }
}
abstract class Animal{

    public Animal() {
        System.out.println("Animal Constructor");
    }
    
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    public Horse() {
        System.out.println("Horse Constructor");
    }
    @Override
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    public Chicken() {
        System.out.println("Chicken Constructor");
    }
    @Override
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
