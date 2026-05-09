public class Inheritance {
    public static void main(String[] args) {
        Fish Shark = new Fish();
        Shark.eat();
        Shark.Water();
    }
    
}
//Base Class 
class Animal {
    String color;
    void eat() {
        System.out.println("Hunger eater");
    }
    void breathes() {
        System.out.println("Living things breathes dealy");
    }
}
//Derived Class 
class Fish extends Animal {
    int Choose;
    void Water() {
        System.out.println("Swim in Water");

    }
    void run() {
        System.out.println("Fish Can't run in Field");
    }
}
