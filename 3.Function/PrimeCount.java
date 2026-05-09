public class PrimeCount {
    public static Boolean prime(int a) {
       if (a <= 1) {
           return false;
       }
       Boolean p = true;
       for (int i = 2; i <= Math.sqrt(a); i++) {
           if (a % i == 0) {
               p = false;
               break;
           }
       }
       return p;
   }
   
   public static void p(int a) {
       for(int i = 2; i <= a; i++) {
           if(prime(i)) {
               System.out.print(i + " ");
           }
       }
       System.out.println();
   }
   
   public static void main(String[] args) {
       p(12);  // This will print all prime numbers up to 12
   }
}
