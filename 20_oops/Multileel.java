public class Multileel {
    public static void main(String[] args) {
        Dog Kukur = new Dog();
        Kukur.Baby = "Kutta";
        Kukur.Live();
        Kukur.run = 123344;
        System.out.println(Kukur.Baby);
        System.out.println( Kukur.run);
    }
}
//base class
class MyAnimal {
    String Baby;
    void Live() {
        System.out.println("Is a Living things");
    }

}
//derived class
class Mammle extends MyAnimal {
    int run;
}
class Dog extends Mammle {
    String name;
}