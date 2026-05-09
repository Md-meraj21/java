public class Overload {
    public static void main(String[] args) {
        Calcultor cal = new Calcultor();
        System.out.println(cal.sum(12, 34));
        System.out.println(cal.sum((float)3.6, (float)5.7));
        System.out.println(cal.sum(124, 645, 5));
    }
}
class Calcultor {
    int sum(int a, int b) {
        return a+b;
    }
    float sum(float a, float b) {
        return a+b;
    }
    int sum(int a, int b, int c) {
        return a+b+c;
    }
}