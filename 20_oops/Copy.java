public class Copy {
    public static void main(String[] args) {
        Constructor q = new Constructor(0);
        System.out.println(q.name = "meraj");
        System.out.println(q.roll = 124);
    }
}
class Constructor {
     String name;
     int roll;

    Constructor() {
        System.out.println("Hello");
    }
    Constructor(String name) {
        this.name = name;
    }
    Constructor(int roll) {
        this.roll = roll;

    }
   
}
