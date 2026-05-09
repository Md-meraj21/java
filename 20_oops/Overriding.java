public class Overriding {
    public static void main(String[] args) {
        full f = new full();
        f.low();
    }
}
class Over {
    void low() {
        System.out.println("Eat Ragularry");
    }
}
class full extends Over {
    void low() {
        System.out.println("Eat Fast");
    }
}