import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First : ");
        int a = s.nextInt();
        System.out.print("Enter Second : ");
        int b = s.nextInt();
        System.out.print("Enter Strings : ");
        char o = s.next().charAt(0);

        switch(o) {
            case '+':   System.out.print("The Addition is " + (a+b));   break;
            case '-' : System.out.print("Subtraction is : "+ (a-b));    break;
            case '*' :  System.out.print("Multiplication is :" + (a*b));    break;
            case '/' : System.out.print("Division is : " + (a/b));  break;
        }
        
        s.close();

    }
}
