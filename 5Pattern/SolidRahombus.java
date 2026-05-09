public class SolidRahombus {
    public static void Pattern(int a) {
        for(int i=1;i<=a;i++) {
            //spaces
            for(int k=1;k<=(a-i); k++) {
                System.out.print(" ");
            }
            //Stars
            for(int k=1;k<=a;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern(5);
    }
}
