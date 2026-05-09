import java.util.Stack;

public class RevString {
    public static String ReverseString(String str) {
        Stack<Character>S = new Stack<>();
        int idx=0;
        while (idx <str.length()) {
            S.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while (! S.isEmpty()) {
            char curr = S.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "Hello";
        String r = ReverseString(str);
        System.out.println(r);
        
    }
}
