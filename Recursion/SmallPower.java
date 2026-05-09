package Recursion;

public class SmallPower {
    public static int Power(int a , int n) {
        if(n==0) {
            return 1;
        }
        int pi = Power(a, n/2);
        int p = pi*pi;
        // n is odd
        if(n % 2 != 0) {
            p = a * p;
        }
        return p;
    }
    public static void main(String[] args) {
        System.out.println("Your power is  :-  "+ Power(3, 02));
    }
}
