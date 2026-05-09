package Recursion;

public class TillingProblem {
    public static int till(int n) {
        // Base Class
        if(n==0 ||n==1) {
            return 1;
        }
        //Kaam
        // Horizental
        int H = till(n-1);
        //Vertical
        int V = till(n-2);
        int S = H + V;
        return S;
    }
    public static void main(String[] args) {
        System.out.println(till(4));
    }
}
