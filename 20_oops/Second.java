public class Second {
    public static void main(String[] args) {
        myPen p = new myPen(); // Creating a MyPen object
        p.setColor("Red");
        System.out.println(p.getColor()); // Output: Red
        p.setPrice(12);
        System.out.println(p.getPrice()); // Output: 12
    }
}

// MyPen class definition
class myPen {
    private String color;
    private int price;

    String getColor() { 
        return this.color;
    }

    int getPrice() { 
        return this.price;
    }

    void setColor(String color) { 
        this.color = color;
    }

    void setPrice(int price) { 
        this.price = price;
    }
}
