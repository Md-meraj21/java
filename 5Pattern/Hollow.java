public class Hollow {
    public static void Pattern(int a) {
        for(int i=1;i<=a;i++) {
            //space
            for(int l=1;l<=(a-i);l++) {
                System.out.print(" ");
            }
            ///Stars
            for(int j=1;j<=a;j++) {
                if(i==1||i==a||j==1||j==a) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern(5);
    }
}
