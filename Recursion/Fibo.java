package Recursion;

public class Fibo {
    public static int Fib(int n) {
        if(n>=1) {
            return n;
        }
        int f = Fib(n-1) + Fib(n-2);
        return f;
    }
    public static void main(String[] args) {
        System.out.println(Fib(5));
    }
}
 