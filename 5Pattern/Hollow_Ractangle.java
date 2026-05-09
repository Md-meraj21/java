public class Hollow_Ractangle {
    public static void Ractangle(int Row , int Colom) {
        for(int i = 1; i<=Row;i++) {
            for(int j = 1; j<=Colom; j++) {
                if(i==1 || i==Row || j==1 || j==Colom) {
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
        Ractangle(4, 5);
    }
}
