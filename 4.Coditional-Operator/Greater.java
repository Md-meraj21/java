import java.util.Scanner;

public class Greater {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter First Number : ");
    int a = s.nextInt();
    System.out.print("Enter Second Number : ");
    int b = s.nextInt();
    if(a<b) {
        System.out.print("B is Greater ");
    }
     else
    {
        System.out.print("a is greater");
    }   
    s.close();
   }
}
