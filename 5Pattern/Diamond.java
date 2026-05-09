public class Diamond {
    public static void Pattern(int a) {
        //First Half
        for(int i=1; i<=a;i++) {
            //Spaces
            for(int j=1;j<=(a-i);j++) {
                System.out.print(" "); 
            }
            //Stars
            for(int j=1;j<=((2*i)-1);j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Second Half
        for(int i=a;i>=1;i--) {
              //Spaces
              for(int j=1;j<=(a-i);j++) {
                System.out.print(" "); 
            }
            //Stars
            for(int j=1;j<=((2*i)-1);j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern(5);
    }
}
