public class Samename {
    public static void main(String[] args) {
        STatic s = new STatic();
        s.Schoolname = "Gku";
        STatic s1 = new STatic();
        System.out.println(s1.Schoolname);
    }
}
class STatic {
    String name;
    int roll;
    static String Schoolname;
    void setname(String name) {
        this.name = name;
    }
    String getname() {
        return this.name;
    }
}