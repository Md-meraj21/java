public class Isprime {
    public static Boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        Boolean p = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                p = false;
                break;
            }
        }
        return p;
    }
    public static void main(String[] args) {
        System.out.println(prime(2));  
        
    }
}
