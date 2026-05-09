import java.util.Stack;

public class Parentheses {
    public static boolean valid(String str) {
        Stack<Character>s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '['||ch == '{' || ch== '(') {
                s.push(ch);
                
            }
            else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek()== '[' && ch ==']')|| (s.peek()== '(' && ch ==')')||
                (s.peek()== '{' && ch =='}')) {
                    s.pop();
                }
                else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    // Duplicate parentheses.
    public static boolean Duplicate(String str) {
        Stack<Character>s =new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //closing.
            if (ch == ')') {
                int count =0; 
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count > 1) {
                    return true;  //Exist duplicate
                }
                else { // opening pair
                    s.pop();
                }
            }
            else { // else opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "(((a+f)))";
        // System.out.print(valid(str));
        System.out.println(Duplicate(str));
    }
}
