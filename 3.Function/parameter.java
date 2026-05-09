import java.util.Scanner;

public class parameter {
    public static void sum(int a , int b) {
        int sum = a + b;
        System.out.print("Sum is " + sum);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The First number : ");
        int a = s.nextInt();
        System.out.print("Enter the Second number : ");
        int b = s.nextInt();
        sum(a,b);
        s.close();
    }
}
