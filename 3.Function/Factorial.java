public class Factorial {
    public static int Fact(int a) {
        if (a == 0) {
            return 1;
        }
        return a * Fact(a - 1);
    }
    public static void main(String[] args) {
        System.out.println(Fact(4));  
    }
}
