package Recursion;

public class BinaryCheak {
    public static void Cheak(int n, int last , String str) {
        if(n == 0) {
            System.out.println(str);
            return;
        }
        Cheak(n-1, 0, str+"0");
        if(last == 0) {
            Cheak(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        Cheak(3, 0, "");
    }
}
