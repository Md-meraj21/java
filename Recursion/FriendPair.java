package Recursion;

public class FriendPair {
    public static int Friend(int n) {
        if(n<=2) {
            return n;
        }
        //Single ke lia
        int a = Friend(n-1);
        //pair ke lia
        int b = Friend(n-2);
        int c = (n-1 ) * b;
        int d = a+c;
        return d;
    }
    public static void main(String[] args) {
        System.out.println(Friend(4));
    }
}
