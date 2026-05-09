package Recursion;

public class Easy {
    public static void printnumber(int n) {
        if(n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printnumber(n-1);
    }
    public static void main(String[] args) {
        printnumber(12);
    }

}
   
