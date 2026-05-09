

public class Frst {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Blue"; // Directly accessing the field
        System.out.println(p1.color); // Directly accessing the field
    }
}

// The Pen class
class Pen {
    String color; // Public field
    int price;
}
