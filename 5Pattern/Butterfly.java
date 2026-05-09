public class Butterfly {
    public static void Pattern(int a) {
        // 1st Half
        for(int i=1; i<=a; i++) {
            // Stars
            for(int j=1; j<=i;j++) {
                System.out.print("*");
            }
            // Spaces
            for(int j=1;j<=2*(a-i);j++) {
                System.out.print(" ");
            }
            // Stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd Half
        for(int i = a;i>=1;i--) {
             // Stars
             for(int j=1; j<=i;j++) {
                System.out.print("*");
            }
            // Spaces
            for(int j=1;j<=2*(a-i);j++) {
                System.out.print(" ");
            }
            // Stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern(5  );
    }
}
