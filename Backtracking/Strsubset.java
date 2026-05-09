package Backtracking;

public class Strsubset {
    public static void Findsubset(String str, String ans ,  int i) {
        //base class
        if (i == str.length()) {
            System.out.println(ans);
            return;
            
        }
        //Choice yes
        Findsubset(str, ans+str.charAt(i), i+1);
        //choice no
        Findsubset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        Findsubset(str, "", 0);

    }
}
