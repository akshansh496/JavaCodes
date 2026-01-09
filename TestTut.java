class Animal{
    int age;
    Animal() {
    	System.out.println("Animal");
        age = 20;
    }
    public void display(int x) {
        System.out.println(age);
    }
}

class Mammal extends Animal{
    Mammal() {
    	System.out.println("Mammal");
        age = 30;
    }
}

class Cow extends Mammal{
    Cow() {
    	System.out.println("Cow");
        age = 40;
    }
    public void display() {
        super.display(super.age);
        System.out.println(this.age);
    }
}

class TestTut {
    public static void main(String[] args) {
        Cow ob = new Cow();
        ob.display();
    }
}
