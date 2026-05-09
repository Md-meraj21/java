import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second number : ");
        int b = sc.nextInt();
        // Binary Arithmatics
        // int c = a + b;
        // System.out.println("Finally Ansawer is "+c);
        // Unary Operator
        int c = ++a;
        int d = --b;
        System.out.println("The Increment  operator is "+ c);
        System.out.println("The Decrement  operator is "+ d);
        sc.close();
    }
}
