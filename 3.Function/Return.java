import java.util.Scanner;

public class Return {
    public static int r(int a , int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int x = v.nextInt();
        System.out.print("Enter second number : ");
        int y = v.nextInt();
        System.out.print("Multiply is "+r(x,y));
        v.close();
    }
}
