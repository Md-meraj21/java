public class AbstraCt {
    public static void main(String[] args) {
        naruto n = new naruto();
        n.eat();
        n.CXrunchirool();
        Solo s = new Solo();
        s.eat();
        s.CXrunchirool();
    }
}
abstract class Anime {
    Anime() {
        System.out.println("Watching dealy");
    }
    void CXrunchirool() {
        System.out.println("Watch Every day");
    }
    abstract void eat();
}
class naruto extends Anime {
    void eat() {
        System.out.println("Eat Every person");
    }
}
class Solo extends Anime {
    void eat() {
        System.out.println("Eat just now");
    }
}