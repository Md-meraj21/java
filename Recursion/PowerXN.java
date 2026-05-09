package Recursion;

public class PowerXN {
    public static int Power(int x , int n) {
        if(n==0) {
            return 1;
        }
        return x*Power(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println("The power of X and N is equal to :- "+Power(2, 02));
    }
}
