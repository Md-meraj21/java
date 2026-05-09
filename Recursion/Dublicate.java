package Recursion;

public class Dublicate {
    public static void Dublicated(String str, int idx,StringBuilder newstr, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        char CurrChar = str.charAt(idx);
        if(map[CurrChar-'a']== true) {
            Dublicated(str, idx+1, newstr, map);
        }
        else {
            map[CurrChar-'a'] = true;
            Dublicated(str, idx+1, newstr.append(CurrChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        Dublicated(str, 0, new StringBuilder(""),new boolean[26]);
    }
}
