import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a = s.nextInt();
        System.out.print("Enter second Number : ");
        int b = s.nextInt();
        System.out.print("Enter Third Number : ");
        int c = s.nextInt();
        int d = (a+b+c)/3;
        System.out.println("The Average of this number is " + d);
        s.close();
    }
}
