package Recursion;

public class Ntural {
    public static int Number(int n) {
        if(n==1) {
            return 1;
        }
        else {
            int r = n+Number(n-1);
            return r;
        }
    }
    public static void main(String[] args) {
        System.out.println(Number(5));
    }
}
