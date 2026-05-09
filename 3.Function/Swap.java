import java.util.*;
public class Swap {
    public static void swap(int a , int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a =" + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int x = s.nextInt();
        System.out.print("Enter the second number : ");
        int y = s.nextInt();
        swap(x,y);
        s.close();
    }
}
